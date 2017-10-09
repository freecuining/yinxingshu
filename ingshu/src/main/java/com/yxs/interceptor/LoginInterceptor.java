package com.yxs.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.yxs.bean.UserBean;


/***
 * 登陆拦截器
 * @author asdcuining
 *
 */
public class LoginInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		String uri = request.getRequestURI();//获得请求路径
		String path = request.getContextPath();//获得当前项目路径

		if(uri.equals(path+"/login.jsp")  ||  uri.equals(path+"/login")){
			return true;
		}else{
			//判断session中是否有当前登录人
			HttpSession session  = request.getSession();
			UserBean ub  = (UserBean)session.getAttribute("ub");
			if(ub != null){
				return true;
			}else{
				//判断cookie
				response.sendRedirect("/login.jsp");
				return false;
			}
		}
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
