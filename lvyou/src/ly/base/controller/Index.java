package ly.base.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
import ly.base.tools.PageBean;

@Controller
@RequestMapping("index")
public class Index {
	@Resource
	private UserService userService;
	@Resource
	private ActivityService activityService;
	@Resource
	private ScenicService scenicService;
	@Resource
	private WaysService waysService;
	@Resource
	private VideoService videoService;

	@Resource
	private MessageService messageService;

	//点击修改用户资料torevise.do
	@RequestMapping(value = "/torevise.do")
	public String torevise(Model model, HttpServletRequest request) throws ServletException, IOException {
     System.out.println("修改用户资料");
		String userName= (String) request.getSession().getAttribute("userName");
     System.out.println("拿到的session ： "+userName);
		if(userName==null) {
			return "index/index_login";//没有session就到登录页面
		}
	User user=	userService.selectByUsername(userName);
		model.addAttribute("user", user);
     return "index/yonghu_register";//跳转到修改用户信息界面
	}
		//toaindex_updata.do真正修改用户的信息
	@RequestMapping(value="/toaindex_updata.do", method = RequestMethod.POST)
	public String  toaindex_updata(Integer userId,String userName,String userPwd,Integer userAge,
			String userEmail,long userPhone,Integer typeId,Integer userState,String userPic
			,Model model) { 
	   System.out.println("用户自己更新自己信息: "+userId+userName+userPwd+userAge+userEmail+userPhone+typeId+userState+userPic);
	   User user=new User();
	   user.setUserName(userName);
	   user.setUserPwd(userPwd);
	   user.setUserAge(userAge);
	   user.setUserId(userId);
	   if(userState==null ) userState=1;
	   user.setUserState(userState);	  
	   user.setUserEmail(userEmail);
	   user.setUserPhone(userPhone);
	   user.setUserPic(userPic);
	   user.setTypeId(typeId);
	   
	 userService.updateUser(user);//更新数据
	 
	   return "index/index_login";//修改成功后跳转到登录页面
	}
	/*//checkName.do检查注册名字是否重复
	@RequestMapping(value = "/checkName.do")
	public String checkName(Model model, HttpServletRequest request,HttpServletResponse response) throws IOException, InterruptedException {
		// 获取用户的名字
		String userName = request.getParameter("userName");
		System.out.println("获取注册用户"+userName);
		User user=	userService.selectByUsername(userName);
		PrintWriter out = response.getWriter();
		if(user==null) {
			response.getWriter().write(0);
			//out.wait(0);//没有查到就是没有注册
			System.out.println("没有查到就是没有注册");
			return "admin/admin_register";
		}
		response.getWriter().write(1);
		//out.wait(1);//不为空说明注册过
		System.out.println("不为空说明注册过");
		return "admin/admin_register";
		
	}
	*/
	// 旅游首页
	// 首页分页显示景点信息
	@RequestMapping(value = "/toindex_index.do")
	public String toindex_index(Model model, HttpServletRequest request) throws ServletException, IOException {

		// 获取用户点击的页
		String page = request.getParameter("page");
		if (page == null)
			page = "1";
		int currentPage = Integer.parseInt(page);// 当前页数

		PageBean<Scenic> pageBean = null;

		pageBean = scenicService.findPageBean(currentPage);

		model.addAttribute("pageBean", pageBean);
		return "index/index";
	}

	// 进入点击的景点信息页面tointroduce.do
	@RequestMapping("/tointroduce.do")
	public String tointroduce(Integer sceId, Model model) {
		System.out.println("需要查询的景点信息id:"+sceId);
		Scenic scenic = scenicService.selectScenicID(sceId);
		System.out.println("前台页面展示景点信息"+scenic.getScePicture()+scenic.getSceName()+scenic.getSceId());
		model.addAttribute("scenic", scenic);
		return "index/introduce";
	}
	//toviewshow进入视频详细展示界面
	@RequestMapping("/toviewshow.do")
	public String toviewshow(Integer vidId, Model model) {
		System.out.println("需要查询的视频信息id:"+vidId);
		Video video = videoService.selectVideoID(vidId);
		System.out.println("前台页面展示视频信息"+video.getVidName()+video.getVidCount());
		model.addAttribute("video", video);
		return "index/videoshow";
	}
	// 旅游登录toindex_login.do
	@RequestMapping("/toindex_login.do")
	public String toindex_login() {
		return "index/index_login";
	}

	// 景点信息 toscenic.do
	@RequestMapping("/toscenic.do")
	public String toscenic(Model model, HttpServletRequest request) {
		// 获取用户点击的页
		String page = request.getParameter("page");
		if (page == null)
			page = "1";
		int currentPage = Integer.parseInt(page);// 当前页数

		PageBean<Scenic> pageBean = null;

		pageBean = scenicService.findPageBean6(currentPage);

		model.addAttribute("pageBean", pageBean);
		return "index/scenic";
	}

	// 景点活动toactivity.do
	@RequestMapping("/toactivity.do")
	public String toactivity(Model model, HttpServletRequest request) {
		// 获取用户点击的页
		String page = request.getParameter("page");
		if (page == null)
			page = "1";
		int currentPage = Integer.parseInt(page);// 当前页数

		PageBean<Activity> pageBean = null;

		pageBean = activityService.findPageBean(currentPage);
		model.addAttribute("pageBean", pageBean);
		return "index/activity";
	}
	//展示活动详细信息
	@RequestMapping("/toactivityshow.do")
	public String toactivityshow(Integer actId,Model model) {
		System.out.println("需要展示信息的id"+actId);
		Activity activity=activityService.selectActivityID(actId);
		System.out.println("前台需要展示活动的详细信息： "+activity.getActContent()+activity.getActTime()+activity.hashCode());
		model.addAttribute("activity", activity);
		return "index/activityshow";
		
	}

	// 智能路线toways.do
	@RequestMapping("/toways.do")
	public String toways(Model model, HttpServletRequest request) {
		// 获取用户点击的页
		String page = request.getParameter("page");
		if (page == null)
			page = "1";
		int currentPage = Integer.parseInt(page);// 当前页数

		PageBean<Ways> pageBean = null;

		pageBean = waysService.findPageBean(currentPage);

		model.addAttribute("pageBean", pageBean);
		return "index/ways";
	}
	//展示智能路线细信息
		@RequestMapping("/towaysshow.do")
		public String towaysshow(Integer wayId,Model model) {
			System.out.println("需要展示智能路线信息的id "+wayId);
			Ways ways=waysService.selectWaysID(wayId);
			System.out.println("前台需要展示活动的详细信息： "+ways.getWayContent()+ways.getWayName()+ways.hashCode());
			model.addAttribute("ways", ways);
			return "index/waysshow";
			
		}

	// 直播平台tovideo.do
	@RequestMapping("/tovideo.do")
	public String tovideo(Model model, HttpServletRequest request) {

		// 获取用户点击的页
		String page = request.getParameter("page");
		if (page == null)
			page = "1";
		int currentPage = Integer.parseInt(page);// 当前页数

		PageBean<Video> pageBean = null;

		pageBean = videoService.findPageBeanqiantai(currentPage);

		model.addAttribute("pageBean", pageBean);
		return "index/video";
	}

	
	

//***********静态界面**************************	
	// 联系我们toconnection.do
	@RequestMapping("/toconnection.do")
	public String toconnection() {
		return "index/connection";
	}
	// *************************************
}
