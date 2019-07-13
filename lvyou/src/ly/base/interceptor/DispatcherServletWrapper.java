package ly.base.interceptor;

import java.lang.annotation.Annotation;

import javax.servlet.http.HttpServletRequest;

import org.springframework.messaging.handler.HandlerMethod;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.mvc.Controller;

/*@SuppressWarnings("serial")
public class DispatcherServletWrapper extends DispatcherServlet {
	
	@Override
	protected HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception {
		HandlerExecutionChain chain = super.getHandler(request);
		Object handler = chain.getHandler();
        if (!(handler instanceof HandlerMethod)) {
            return chain;
        }
		
        HandlerMethod hm = (HandlerMethod)handler;
        if (!hm.getBeanType().isAnnotationPresent((Class<? extends Annotation>) Controller.class)) {
        	return chain;
        }
        
        //本扩展仅处理@Controller注解的Bean
		return new HandlerExecutionChainWrapper(chain,request,getWebApplicationContext());
	}
	
}*/
