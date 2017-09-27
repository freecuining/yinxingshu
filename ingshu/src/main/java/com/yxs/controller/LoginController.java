package com.yxs.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yxs.bean.UserBean;
import com.yxs.service.UserService;
import com.yxs.util.State;

@Controller
@SessionAttributes({ "ub","ipAddress" })
public class LoginController {

	@Autowired
	private UserService us;

	@RequestMapping("/login")
	public String login(String loginName, String password, Model m, HttpServletRequest request) {
		UserBean ub = us.login(loginName, password);
		if (ub != null) {
			if (ub.getDel() == State.DELETE) {
				m.addAttribute("msg", "您的账号已禁用!");
				return "/login.jsp";
			} else {
				String ipAddress = request.getHeader("x-forwarded-for");  
	            if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {  
	                ipAddress = request.getHeader("Proxy-Client-IP");  
	            }  
	            if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {  
	                ipAddress = request.getHeader("WL-Proxy-Client-IP");  
	            }  
	            if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {  
	                ipAddress = request.getRemoteAddr();  
	                if(ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")){  
	                    InetAddress inet=null;  
	                    try {  
	                        inet = InetAddress.getLocalHost();  
	                    } catch (UnknownHostException e) {  
	                        e.printStackTrace();  
	                    }  
	                    ipAddress= inet.getHostAddress();  
	                }  
	            }  
	            if(ipAddress!=null && ipAddress.length()>15){ //"***.***.***.***".length() = 15  
	                if(ipAddress.indexOf(",")>0){  
	                    ipAddress = ipAddress.substring(0,ipAddress.indexOf(","));  
	                }  
	            }  
				m.addAttribute("ipAddress", ipAddress);
				//成功以后当前登录人的登录次数+1
				us.updateLoginNum(ub.getUserId());
				m.addAttribute("ub", ub);
				return "/index.jsp";
			}
		} else {
			m.addAttribute("msg", "账号或密码错误");
			return "/login.jsp";
		}
	}
}