package ly.base.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * <p>Description:登陆认证拦截器 </p>
 */
public class LoginInterceptor implements HandlerInterceptor {

	String username;
	//进入 Handler方法之前执行
	//用于身份认证、身份授权
	//比如身份认证，如果认证通过表示当前用户没有登陆，需要此方法拦截不再向下执行
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		 //获取请求的url
		String url = request.getRequestURI();
		//判断url是否是公开 地址（实际使用时将公开 地址配置配置文件中）
		System.err.println("拦截的url是:"+url);
		//这里公开地址是登陆提交的地址
		
		if(url.indexOf("admin/toadmin_login.do")>=0){
			//如果进行跳转登陆，放行
					return true;
		}
		if(url.indexOf("admin/toadmin3_1_login.do")>=0){
			//如果进行登陆提交，放行
					return true;
		}
		if(url.indexOf("admin/toadmin_register.do")>=0){
			//如果进行注册，放行
					return true;
		}
		if(url.indexOf("admin/toadmin_registeradd.do")>=0){
			//如果进行注册添加，放行
					return true;
		}
		
			if(url.indexOf("upload/uploadPic.do")>=0){
				//如果进行上传，放行
						return true;
			}
			
		//判断session
		HttpSession session  = request.getSession();
		//从session中取出用户身份信息
	      username = (String) session.getAttribute("userName");
		System.err.println("session的数据1:"+username);	
		if(username != null){
			//身份存在，放行
			System.err.println("session的数据2:"+username);	
			return true;
			
				}
		
		
		
		
		System.out.println("表示用户身份需要认证");
		//执行这里表示用户身份需要认证，跳转登陆页面
		request.getRequestDispatcher("/WEB-INF/jsps/admin/admin_login.jsp").forward(request, response);		
		//return false表示拦截，不向下执行
		//return true表示放行
		return false;
		
		
	}

	//进入Handler方法之后，返回modelAndView之前执行
	//应用场景从modelAndView出发：将公用的模型数据(比如菜单导航)在这里传到视图，也可以在这里统一指定视图
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("HandlerInterceptor1...postHandle");
		
	}

	//执行Handler完成执行此方法
	//应用场景：统一异常处理，统一日志处理
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		System.out.println("HandlerInterceptor1...afterCompletion");
	}

}
