package ly.base.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ly.base.po.domain.Activity;
import ly.base.po.domain.Message;
import ly.base.po.domain.Scenic;
import ly.base.po.domain.User;
import ly.base.po.domain.Video;
import ly.base.po.domain.Ways;
import ly.base.services.ActivityService;
import ly.base.services.MessageService;
import ly.base.services.ScenicService;
import ly.base.services.UserService;
import ly.base.services.VideoService;
import ly.base.services.WaysService;
import ly.base.tools.MD5;
import ly.base.tools.PageBean;

@Controller
@RequestMapping("admin")
public class AdmionIndexs {
	@Resource
	private  UserService userSservice;
	//????????????????留言拦截????????????????????
	// 在线留言tomessage.do
		@RequestMapping("/tomessage.do")
		public String tomessage(HttpSession session,Model model) {
			String userName=(String) session.getAttribute("userName");
			if(userName !=null) {
				return "index/message";
			}
			model.addAttribute("message1", "false");
			return "forward:/admin/toadmin_login.do";
			
		}
		
		// 处理留言功能todeal_message.do
		@RequestMapping("/todeal_message.do")
		public String todeal_message(String mesTitle, String mesContent, String userName, Model model) {
			System.out.println("前台留言：" + mesTitle + mesContent + userName);
			Message message = new Message();
			message.setMesTitle(mesTitle);
			message.setMesContent(mesContent);
			Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			message.setMesTime(dateFormat.format(date));
			message.setUserName(userName);
			
			  messageSservice.insertMessage(message);
			Integer updateMessage=1;
			if (updateMessage == 1) {
				model.addAttribute("message", "ok");
			}

			return "index/message";
		}
	
//######################登录##########################
	
	//跳转登录页面  localhost:8080/lvyou/admin/toadmin_login.do
		@RequestMapping("/toadmin_login.do")
		public String  toadmin_login() {
			
			return "admin/admin_login";
		}
//#######################登录验证####################################		
	//登录验证toadmin3_1_login.do
		@RequestMapping("/toadmin3_1_login.do")
		public String  toadmin3_1_login(String userName,String userPwd,HttpSession session,Model model) {
			User user=null;
			if (userName == null) {
				model.addAttribute("login", "用户名不能为空");
				return "forward:/admin/toadmin_login.do";
			}
			user=userSservice.selectByUsername(userName);
			if (user == null) {
				model.addAttribute("login1", "用户名不存在");
				return "forward:/admin/toadmin_login.do";
			}
			else if(user.getUserPwd().equals(userPwd)){
				//userState;//激活状态 0-未激活 1-已经激活  //typeId;//权限1-用户；2-管理员
				//判断用户权限
				if(user.getUserState()==1 &&user.getTypeId()==1) {
					System.err.println("用户登录成功");					
					session.setAttribute("userName", userName);
					
					return "redirect:/index/toindex_index.do";	}
				//判断管理员权限
				if(user.getUserState()==1 &&user.getTypeId()==2) {
					System.err.println("管理员登录成功");					
					session.setAttribute("userName", userName);
					
					return "redirect:/admin/toadmin.do";//重定向，地址发生变化，防止刷新网页又重新登录
				}
				if(user.getUserState()==0) {
					model.addAttribute("login2", "你的账户没激活，请联系管理员");
				}
				if(user.getTypeId()==1) {
					model.addAttribute("login3", "你没有访问权限");
				}
			 
			}else {
				model.addAttribute("login4", "用户名或密码不正确");
			}
			
			return "forward:/admin/toadmin_login.do";//转发，地址不变
		}
//########################################################
//############################注册######################
		//注册页面
		@RequestMapping("/toadmin_register.do")
		public String  toadmin_register() {
			return "admin/admin_register";
		}
        //处理用户注册页面
		@RequestMapping(value="/toadmin_registeradd.do", method = RequestMethod.POST)
		public String  toadmin_registeradd(	String userName,String userPwd,Integer userAge,
				String userEmail,long userPhone,Integer typeId,Integer userState,String userPic
				,HttpSession session) { 
		   System.out.println("添加的用户信息"+userName+userPwd+userAge+userEmail+userPhone+typeId+userState+userPic);
		   userPwd=MD5.MD5(userPwd);
		   User user=new User();
		   user.setUserName(userName);
		   user.setUserPwd(userPwd);
		   user.setUserAge(userAge);
		   if(userState==null ) userState=1;
		   user.setUserState(userState);
		  
		   Date date = new Date();
		   SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		   user.setUserTime(dateFormat.format(date));
		   System.out.println("用户添加时间UserTime:  "+dateFormat.format(date));
		   user.setUserEmail(userEmail);
		   user.setUserPhone(userPhone);
		   user.setUserPic(userPic);
		   user.setTypeId(typeId);
		   
		   userSservice.insertUser(user);//注册数据
		   // 在session中保存用户身份信息
		 session.setAttribute("userName", userName);
		  //默认跳转管理员页面  用户跳转到首页
		 
		 if(user.getTypeId()==1) { 
			 
			 return "redirect:/index/toindex_index.do";}
		return "redirect:/admin/toadmin.do";
		}
//########################退出################################		
		//quitadmin_register.do退出
		@RequestMapping("/quitadmin_register.do")
		public String  quitadmin_register(HttpSession session) {
			
			// 清除session
			session.invalidate();
			return "forward:/admin/toadmin_login.do";//重定向
		}
//#######################开始计页面#################################	
//localhost:8080/lvyou/admin/toadmin.do		
		//跳转页面的方法
		@RequestMapping("/toadmin.do")
		public String  toadmin() {
			return "admin/admin";
		}
		//上
		@RequestMapping("/toadmin2_top.do")
		public String  toadmin2_top(HttpServletRequest request) {
			request.getSession().getAttribute("userName");
			return "admin/admin2_top";
		}
		//admin2_left左
		@RequestMapping("/toadmin2_left.do")
		public String  toadmin2_left() {
			return "admin/admin2_left";
		}
		//底部
		@RequestMapping("/toadmin2_bottom.do")
		public String  toadmin2_bottom() {
			return "admin/admin2_bottom";
		}
		
		//初始化时右页面
		@RequestMapping("/admin3_0_right.do")
		public String  toadmin3_0_right() {
			return "admin/admin3_0_right";
		}
		//1-1  用户管理-展示添加
		@RequestMapping(value="/toadmin3_1_right1.do")
		public String  toadmin3_1_right1() {
					
			return "admin/admin3_1_right1";
		}
		
//########################################################		
		
		//用户管理-展示查询
		/*@RequestMapping(value="/toadmin3_1_right2.do")
		public String  toadmin3_1_right2(Model model) {
          
			return "admin/admin3_1_right2";
		}*/
		//1-2   用户管理-展示查询---在数据库分页查询
		@RequestMapping(value="/toadmin3_1_right2.do")
		public String showUserList(Model model,HttpServletRequest request) throws ServletException, IOException{

	        
	    	//获取用户点击的页
	    			String page = request.getParameter("page");
	    			if(page == null)
	    				page = "1";
	    	 		int currentPage = Integer.parseInt(page);//当前页数
	    			
	    	 		PageBean<User> pageBean = null;
	    			
	    				pageBean = userSservice.findPageBean(currentPage);
	    			/*request.setAttribute("usersList", pageBean);*/
	    			model.addAttribute("pageBean", pageBean);
	    		return "admin/admin3_1_right2";
	    }

		
		//1-3   显示用户管理-展示修改
		@RequestMapping("/toadmin3_1_right3.do")
		public String  toadmin3_1_right3() {
			
				return "admin/admin3_1_right3";
			}
		
	//2-1	显示活动管理-展示添加
		@RequestMapping(value="/toadmin3_2_right1.do")
		public String  toadmin3_2_right1() {
					
			return "admin/admin3_2_right1";
		}
		@Resource
		private ActivityService activitySservice;
	//2-2  活动管理-展示查询
	@RequestMapping(value="/toadmin3_2_right2.do")
	public String showActivity(Model model,HttpServletRequest request) throws ServletException, IOException{

       
    	//获取用户点击的页
    			String page = request.getParameter("page");
    			if(page == null)
    				page = "1";
    	 		int currentPage = Integer.parseInt(page);//当前页数
    			
    	 		PageBean<Activity> pageBean = null;
    			
    				pageBean = activitySservice.findPageBean(currentPage);
    			
    			model.addAttribute("pageBean", pageBean);
    		return "admin/admin3_2_right2";
    }
	//2 -3   显示活动管理-活动修改
		@RequestMapping("/toadmin3_2_right3.do")
		public String  toadmin3_2_right3() {
			
				return "admin/admin3_2_right3";
		}
		
		
		
		
		
//	3-1	显示景点管理-展示景点添加
			@RequestMapping(value="/toadmin3_3_right1.do")
			public String  toadmin3_3_right1() {
						
				return "admin/admin3_3_right1";
			}
			@Resource
			private  ScenicService scenicSservice;
//TODO景点管理----分页查询	
			//3-2     景点管理-展示景点查询
		@RequestMapping(value="/toadmin3_3_right2.do")
		public String showScenic(Model model,HttpServletRequest request) throws ServletException, IOException{

	       
	    	//获取用户点击的页
	    			String page = request.getParameter("page");
	    			if(page == null)
	    				page = "1";
	    	 		int currentPage = Integer.parseInt(page);//当前页数
	    			
	    	 		PageBean<Scenic> pageBean = null;
	    			
	    				pageBean = scenicSservice.findPageBean(currentPage);
	    			
	    			model.addAttribute("pageBean", pageBean);
	    		return "admin/admin3_3_right2";
	    }
		//3-3      显示景点管理-景点修改
				@RequestMapping("/toadmin3_3_right3.do")
				public String  toadmin3_3_right3() {
					
						return "admin/admin3_3_right3";
				}
//	4-1 	显示智能路线管理-展示智能路线添加
			@RequestMapping(value="/toadmin3_4_right1.do")
			public String  toadmin3_4_right1() {
						
				return "admin/admin3_4_right1";
			}
			@Resource
			private  WaysService waysSservice;
		//4-2    智能路线管理-展示智能路线查询
		@RequestMapping(value="/toadmin3_4_right2.do")
		public String showWays(Model model,HttpServletRequest request) throws ServletException, IOException{

	       
	    	//获取用户点击的页
	    			String page = request.getParameter("page");
	    			if(page == null)
	    				page = "1";
	    	 		int currentPage = Integer.parseInt(page);//当前页数
	    			
	    	 		PageBean<Ways> pageBean = null;
	    			
	    				pageBean = waysSservice.findPageBean(currentPage);
	    			
	    			model.addAttribute("pageBean", pageBean);
	    		return "admin/admin3_4_right2";
	    }
		//4-3     显示智能路线管理-智能路线修改
		@RequestMapping("/toadmin3_4_right3.do")
		public String  toadmin3_4_right3() {
			
				return "admin/admin3_4_right3";
		}
//5-1		显示直播管理-展示直播添加
			@RequestMapping(value="/toadmin3_5_right1.do")
			public String  toadmin3_5_right1() {
						
				return "admin/admin3_5_right1";
			}
			@Resource
			private  VideoService videoSservice;
		//5-2      直播管理-展示直播查询
		@RequestMapping(value="/toadmin3_5_right2.do")
		public String showVideo(Model model,HttpServletRequest request) throws ServletException, IOException{

	       
	    	//获取用户点击的页
	    			String page = request.getParameter("page");
	    			if(page == null)
	    				page = "1";
	    	 		int currentPage = Integer.parseInt(page);//当前页数
	    			
	    	 		PageBean<Video> pageBean = null;
	    			
	    				pageBean = videoSservice.findPageBean(currentPage);
	    			
	    			model.addAttribute("pageBean", pageBean);
	    		return "admin/admin3_5_right2";
	    }
		//5-3   显示直播管理-直播修改
				@RequestMapping("/toadmin3_5_right3.do")
				public String  toadmin3_5_right3() {
					
						return "admin/admin3_5_right3";
				}

//6-1		显示留言管理-展示留言添加
			@RequestMapping(value="/toadmin3_6_right1.do")
			public String  toadmin3_6_right1() {
						
				return "admin/admin3_6_right1";
			}
			@Resource
			private  MessageService messageSservice;
		//6-2     留言管理-展示留言查询
		@RequestMapping(value="/toadmin3_6_right2.do")
		public String showMessage(Model model,HttpServletRequest request) throws ServletException, IOException{

	       
	    	//获取用户点击的页
	    			String page = request.getParameter("page");
	    			if(page == null)
	    				page = "1";
	    	 		int currentPage = Integer.parseInt(page);//当前页数
	    			
	    	 		PageBean<Message> pageBean = null;
	    			
	    				pageBean = messageSservice.findPageBean(currentPage);
	    			
	    			model.addAttribute("pageBean", pageBean);
	    		return "admin/admin3_6_right2";
	    }
		//6-3   显示留言管理-留言修改
		@RequestMapping("/toadmin3_6_right3.do")
		public String  toadmin3_6_right3() {
			
				return "admin/admin3_6_right3";
		}
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@		
//@T#######################实现功能区################################
		         
	//1留言管理-展示留言查询
		//用户管理-表单提交添加
		@RequestMapping(value="/toadmin3_1_rightadd.do", method = RequestMethod.POST)
		public String  toadmin3_1_right1(	String userName,String userPwd,Integer userAge,
				String userEmail,long userPhone,Integer typeId,Integer userState,String userPic
				,Model model) { 
		   System.out.println("添加的用户信息"+userName+userPwd+userAge+userEmail+userPhone+typeId+userState+userPic);
		   userPwd=MD5.MD5(userPwd);
		   User user=new User();
		   user.setUserName(userName);
		   user.setUserPwd(userPwd);
		   user.setUserAge(userAge);
		   if(userState==null ) userState=1;
		   user.setUserState(userState);
		  
		   Date date = new Date();
		   SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		   user.setUserTime(dateFormat.format(date));
		   System.out.println("用户添加时间UserTime:  "+dateFormat.format(date));
		   user.setUserEmail(userEmail);
		   user.setUserPhone(userPhone);
		   user.setUserPic(userPic);
		   user.setTypeId(typeId);
		   
		   userSservice.insertUser(user);//添加数据
		   Integer updateMessage=1;
			if (updateMessage == 1) {
				model.addAttribute("message", "ok");
			}	
		   return "admin/admin3_1_right1";
		}
		//1用户管理-展示所有查询   ——--去除--数据量大时不适用   
	    @RequestMapping(value="/queryussers.do")
		public String  toadmin3_1_right2(Model model){
			List<User> list = userSservice.selectUsers();
			
		   if(list.size()!=0){ 
			for(int i = 0; i < list.size(); i++) {
				//测试显示；list数据
				System.out.println("list中第"+i+"个元素 "+list.get(i).toString());
			}
			 }
			 
			 model.addAttribute("usersList", list);
			return "admin/admin3_1_right2";
		}
	   
	  //1用户管理-删除
	    @RequestMapping(value="/delUserId.do",method=RequestMethod.GET)
	    public String delUser(@RequestParam(value="id", required=true) Integer userId) {
	    	System.out.println("要删除的ID:  "+userId);
	    	userSservice.delByUserlist(userId);
	    	return "forward:/admin/toadmin3_1_right2.do";
	    }
	   //*****************包含 数据  跳转到界面********************
	    //1用户管理-修改  跳转到修改
	    @RequestMapping(value="/admin3_1_right3_revise.do")
	    public String  admin3_1_right3_revise(@RequestParam(value="id", required=true) Integer userId,Model model) {
		System.out.println("修改     "+userId+"    用户号");
		
		User user=	userSservice.selectUserID(userId);
		System.out.println("修改  用户名："+user.getUserName());
		
		model.addAttribute("user", user);
			return "admin/admin3_1_right3";
		}

	   //1 修改后       根据ID修改用户数据
	    @RequestMapping(value="/toadmin3_1_rightupdata.do", method = RequestMethod.POST)
		public String  toadmin3_1_rightupdata(Integer userId,String userName,String userPwd,Integer userAge,
				String userEmail,long userPhone,Integer typeId,Integer userState,String userPic
				,Model model) { 
		   System.out.println("更新用户信息:"+userId+userName+userPwd+userAge+userEmail+userPhone+typeId+userState+userPic);
		   User user=new User();
		   user.setUserId(userId);
		   user.setUserName(userName);
		   user.setUserPwd(userPwd);
		   user.setUserAge(userAge);
		   if(userState==null ) userState=1;
		   user.setUserState(userState);	  
		   user.setUserEmail(userEmail);
		   user.setUserPhone(userPhone);
		   user.setUserPic(userPic);
		   user.setTypeId(typeId);
		   
		  Integer ok= userSservice.updateUser(user);//更新数据
		  if (ok == 1) {
				model.addAttribute("message", "ok");
			}
		   return "admin/admin3_1_right3";
		}
	    //2活动管理--添加活动
	    @RequestMapping(value="/toadmin3_2_rightadd.do")
	    public String admin3_2_rightadd(String actContent,
	                       Integer actIspush,    Integer actCount,String actTime
	                       ,Model model) {
	    	System.out.println("添加的活动"+actContent+actIspush+actCount+actTime);
	    	Activity activity=new Activity();
	    	 Date date = new Date();
	  	   SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd ");
	  	   if(actTime==null || actTime=="") actTime=dateFormat.format(date);
	  	   activity.setActTime(actTime);
	  	 System.out.println("活动添加时间UserTime:  "+dateFormat.format(date));
	  	 activity.setActContent(actContent);
	  	 activity.setActIspush(actIspush);
	  	 activity.setActCount(actCount);
	  	activitySservice.insertActivity(activity);//添加数据
	  	Integer ok=1;
	  	if (ok == 1) {
			model.addAttribute("message", "ok");
		}
		  return "admin/admin3_2_right1";
	    }//ActivitySservice

	  //2活动管理--删除活动
	    @RequestMapping(value="/delactivityId.do",method=RequestMethod.GET)
	    public String delactivityId(@RequestParam(value="id", required=true) Integer actId) {
	    	System.out.println("要删除的活动ID:  "+actId);
	    	activitySservice.delByActivitylist(actId);
	    	return "forward:/admin/toadmin3_2_right2.do";
	    }  

	    //2活动管理--修改活动  跳转到修改
	    @RequestMapping(value="/admin3_2_right3_revise.do")
	    public String  admin3_2_right3_revise(@RequestParam(value="id", required=true) Integer actId,Model model) {
		System.out.println("修改     "+actId+"   活动号");
		
		Activity activity=	activitySservice.selectActivityID(actId);
		System.out.println("修改  活动名："+activity.getActContent());
		
		model.addAttribute("activity", activity);
			return "admin/admin3_2_right3";
		} 
	    
	  //2活动管理- 修改后       根据ID修改活动数据
	    @RequestMapping(value="/toadmin3_2_rightupdata.do", method = RequestMethod.POST)
		public String  toadmin3_2_rightupdata(Integer actId,String actContent,
	            Integer actIspush,    Integer actCount,String actTime 
	            ,Model model ) {
				System.out.println("修改的活动"+actId+actContent+actIspush+actCount+actTime);
				Activity activity=new Activity();
				Date date = new Date();
				SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd ");
				if(actTime==null || actTime=="") actTime=dateFormat.format(date);
				activity.setActTime(actTime);
				System.out.println("活动修改时间UserTime:  "+actTime);
				activity.setActId(actId);
				activity.setActContent(actContent);
				activity.setActIspush(actIspush);
				activity.setActCount(actCount);
			Integer ok=	activitySservice.updateActivity(activity);//更新数据
			if (ok == 1) {
				model.addAttribute("message", "ok");
			}
		   return "admin/admin3_2_right3";
		}
	    //3景点管理--添加景点
	    @RequestMapping(value="/toadmin3_3_rightadd.do")
	    public String admin3_3_rightadd(String sceName,  String scePicture,String sceContent,
	             Float scePrice,  Float sceVprice,Integer sceCount, Integer sceIspush 
	             ,Model model) {
	    	System.out.println("添加的景点:"+sceName+scePicture+sceContent+scePrice+sceVprice+sceCount+sceIspush);
	    	Scenic scenic=new Scenic();
	    	scenic.setSceName(sceName);
	    	scenic.setScePicture(scePicture);
	    	scenic.setSceContent(sceContent);
	    	scenic.setScePrice(scePrice);
	    	scenic.setSceVprice(sceVprice);
	    	scenic.setSceCount(sceCount);
	    	scenic.setSceIspush(sceIspush);	 
	  	scenicSservice.insertScenic(scenic);
	  	Integer ok=1;
	  	if (ok == 1) {
			model.addAttribute("message", "ok");
		}
		  return "admin/admin3_3_right1";
	    }

	  //3景点管理--删除景点
	    @RequestMapping(value="/delScenicId.do",method=RequestMethod.GET)
	    public String delScenicId(@RequestParam(value="id", required=true) Integer sceId) {
	    	System.out.println("要删除的景点ID:  "+sceId);
	    	scenicSservice.delBySceniclist(sceId);
	    	return "forward:/admin/toadmin3_3_right2.do";
	    }  

	    //3景点管理--修改景点  跳转到修改
	    @RequestMapping(value="/admin3_3_right3_revise.do")
	    public String  admin3_3_right3_revise(@RequestParam(value="id", required=true) Integer sceId,Model model) {
		System.out.println("修改     "+sceId+"   景点号");
		
		Scenic scenic=	scenicSservice.selectScenicID(sceId);
		System.out.println("修改  景点名："+scenic.getSceName());
		
		model.addAttribute("scenic", scenic);
			return "admin/admin3_3_right3";
		} 
	  //3景点管理- 修改后       根据ID修改景点数据
	    @RequestMapping(value="/toadmin3_3_rightupdata.do", method = RequestMethod.POST)
		public String  toadmin3_3_rightupdata(Integer sceId,String sceName,String scePicture,String sceContent,
	            Float scePrice,  Float sceVprice,Integer sceCount, Integer sceIspush
	            ,Model model) {
	  
	    	System.out.println("修改的景点:"+sceId+", "+sceName+", "+scePicture
	   			+", "+sceContent+", "+scePrice+", "+sceVprice+", "
	   			+sceCount+", "+sceIspush);
	   	Scenic scenic=new Scenic();
	   	scenic.setSceId(sceId);
	   	scenic.setSceName(sceName);
	   	scenic.setScePicture(scePicture);
	   	scenic.setSceContent(sceContent);
	   	scenic.setScePrice(scePrice);
	   	scenic.setSceVprice(sceVprice);
	   	scenic.setSceCount(sceCount);
	   	scenic.setSceIspush(sceIspush);
	   Integer ok=	scenicSservice.updateScenic(scenic);//更新数据
	   if (ok == 1) {
			model.addAttribute("message", "ok");
		}
		   return "admin/admin3_3_right3";
		}
	  //4智能路线管理--添加智能路线
	    @RequestMapping(value="/toadmin3_4_rightadd.do")
	    public String admin3_4_rightadd(String wayName,String wayContent ,Model model ) {
	    	System.out.println("添加的智能路线:"+wayName+wayContent);
	    	Ways ways=new Ways();
	    	ways.setWayName(wayName);
	    	ways.setWayContent(wayContent);
	    	waysSservice.insertWays(ways);
	    	Integer ok=1;
	    	if (ok == 1) {
				model.addAttribute("message", "ok");
			}
		  return "admin/admin3_4_right1";
	    }

	  //4智能路线管理--删除智能路线
	    @RequestMapping(value="/delWaysId.do",method=RequestMethod.GET)
	    public String delWaysId(@RequestParam(value="id", required=true) Integer sceId) {
	    	System.out.println("要删除的智能路线ID:  "+sceId);
	    	waysSservice.delByWayslist(sceId);
	    	return "forward:/admin/toadmin3_4_right2.do";
	    }  

	    //4智能路线管理--修改智能路线  跳转到修改
	    @RequestMapping(value="/admin3_4_right3_revise.do")
	    public String  admin3_4_right3_revise(@RequestParam(value="id", required=true) Integer sceId,Model model) {
		System.out.println("修改     "+sceId+"   智能路线号");
		
		Ways ways=	waysSservice.selectWaysID(sceId);
		System.out.println("修改  智能路线名："+ways.getWayName());
		
		model.addAttribute("ways", ways);
			return "admin/admin3_4_right3";
		} 
	  //4智能路线管理- 修改后       根据ID修改智能路线数据
	    @RequestMapping(value="/toadmin3_4_rightupdata.do", method = RequestMethod.POST)
		public String  toadmin3_4_rightupdata(Integer wayId,String wayName,String wayContent 
				,Model model) {
	    	System.out.println("修改的智能路线:"+wayId+wayName+wayContent);
	    	Ways ways=new Ways();
	    	ways.setWayId(wayId);
	    	ways.setWayName(wayName);
	    	ways.setWayContent(wayContent);
	    	Integer updateWays = waysSservice.updateWays(ways);//更新数据
	    	
	    	if (updateWays == 1) {
				model.addAttribute("message", "ok");
			}
		   return "admin/admin3_4_right3";
		}
	    //5直播管理--添加直播
	    @RequestMapping(value="/toadmin3_5_rightadd.do")
	    public String admin3_5_rightadd(String vidName, String vidLive, 
	    		Integer vidIspush, Integer vidCount,Model model ) {
	    	System.out.println("添加的直播"+vidName+vidLive+vidIspush+vidCount);
	    	Video video=new Video();
	    	video.setVidName(vidName);
	    	video.setVidLive(vidLive);
	    	video.setVidIspush(vidIspush);
	    	video.setVidCount(vidCount);
	    	videoSservice.insertVideo(video);
	    	Integer ok=1;
	    	if (ok == 1) {
				model.addAttribute("message", "ok");
			}
		  return "admin/admin3_5_right1";
	    }

	  //5直播管理--删除直播
	    @RequestMapping(value="/delVideoId.do",method=RequestMethod.GET)
	    public String delVideoId(@RequestParam(value="id", required=true) Integer sceId) {
	    	System.out.println("要删除的直播ID:  "+sceId);
	    	videoSservice.delByVideolist(sceId);
	    	return "forward:/admin/toadmin3_5_right2.do";
	    }  

	    //5直播管理--修改直播  跳转到修改
	    @RequestMapping(value="/admin3_5_right3_revise.do")
	    public String  admin3_5_right3_revise(@RequestParam(value="id", required=true) Integer sceId,Model model) {
		System.out.println("修改     "+sceId+"   直播号");
		
		Video video=	videoSservice.selectVideoID(sceId);
		System.out.println("修改  直播名："+video.getVidName());
		
		model.addAttribute("video", video);
			return "admin/admin3_5_right3";
		} 
	  //5直播管理- 修改后       根据ID修改直播数据
	    @RequestMapping(value="/toadmin3_5_rightupdata.do", method = RequestMethod.POST)
		public String  toadmin3_5_rightupdata(Integer vidId,String vidName, String vidLive, 
	    		Integer vidIspush, Integer vidCount,Model model ) {
	    	System.out.println("修改更新的直播:"+"#"+vidId+"#"+vidName+"#"+vidLive+"#"+vidIspush+"#"+vidCount);
	    	Video video=new Video();
	    	video.setVidId(vidId);
	    	video.setVidName(vidName);
	    	if(vidLive!=null || vidLive!="")  video.setVidLive(vidLive);
	    	video.setVidIspush(vidIspush);
	    	video.setVidCount(vidCount);
	    	Integer updateVideo = videoSservice.updateVideo(video);//更新数据
	    	if (updateVideo == 1) {
				model.addAttribute("message", "ok");
			}
		   return "admin/admin3_5_right3";
		}
	    //6留言板管理--添加留言板
	    @RequestMapping(value="/toadmin3_6_rightadd.do")
	    public String admin3_6_rightadd(String mesTitle, String mesContent, 
	    		String mesTime, String userName ,Model model) {
	    	System.out.println("添加的留言板："+mesTitle+mesContent+userName);
	    	Message message=new Message();
	    	message.setMesTitle(mesTitle);
	    	message.setMesContent(mesContent);
	    	Date date=new Date();
	    	 SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	    	   if(mesTime==null || mesTime=="") mesTime=dateFormat.format(date);
	    	message.setMesTime(mesTime);
	    	message.setUserName(userName);
	    	messageSservice.insertMessage(message);
	    	Integer ok=1;
	    	if (ok == 1) {
				model.addAttribute("message", "ok");
			}
		  return "admin/admin3_6_right1";
	    }

	  //6留言板管理--删除留言板
	    @RequestMapping(value="/delMessageId.do",method=RequestMethod.GET)
	    public String delMessageId(@RequestParam(value="id", required=true) Integer sceId) {
	    	System.out.println("要删除的留言板ID:  "+sceId);
	    	messageSservice.delByMessagelist(sceId);
	    	return "forward:/admin/toadmin3_6_right2.do";
	    }  

	    //6留言板管理--修改留言板  跳转到修改
	    @RequestMapping(value="/admin3_6_right3_revise.do")
	    public String  admin3_6_right3_revise(@RequestParam(value="id", required=true) Integer sceId,Model model) {
		System.out.println("修改     "+sceId+"   留言板号");
		
		Message message=	messageSservice.selectMessageID(sceId);
		System.out.println("修改  留言板名："+message.getMesTitle());
		
		model.addAttribute("message", message);
			return "admin/admin3_6_right3";
		} 

	  //6留言板管理- 修改后       根据ID修改直播数据
	    @RequestMapping(value="/toadmin3_6_rightupdata.do", method = RequestMethod.POST)
		public String  toadmin3_6_rightupdata(Integer mesId,String mesTitle, String mesContent, 
	    		String mesTime, String userName ,Model model) {
	    	System.out.println("修改的留言板："+mesId+mesTitle+mesContent+userName);
	    	Message message=new Message();
	    	message.setMesId(mesId);
	    	message.setMesTitle(mesTitle);
	    	message.setMesContent(mesContent);
	    	Date date=new Date();
	    	 SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	    	   if(mesTime==null || mesTime=="") mesTime=dateFormat.format(date);
	    	message.setMesTime(mesTime);
	    	message.setUserName(userName);
	    	Integer updateMessage = messageSservice.updateMessage(message);//更新数据
	    	System.out.println("更新数据后返回"+updateMessage);
	    	if (updateMessage == 1) {
				model.addAttribute("message1", "ok");
			}
	    	return "admin/admin3_6_right3";
		}		
}
