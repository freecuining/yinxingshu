package com.yxs.controller;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.yxs.bean.UserBean;
import com.yxs.service.UserService;
import com.yxs.util.State;

@Controller
@SessionAttributes({ "ub", "ipAddress" })
public class LoginController {

	@Autowired
	private UserService us;
	/**
	 * 登录展现
	 * @param loginName
	 * @param password
	 * @param m
	 * @param request
	 * @return
	 */
	@RequestMapping("/login")
	public String login(String loginName, String password, Model m, HttpServletRequest request) {
		UserBean ub = us.login(loginName, password);
		if (ub != null) {
			if (ub.getDel() == State.DELETE) {
				m.addAttribute("msg", "您的账号已禁用!");
				return "/login.jsp";
			} else {
				String ipAddress = request.getHeader("x-forwarded-for");
				if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
					ipAddress = request.getHeader("Proxy-Client-IP");
				}
				if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
					ipAddress = request.getHeader("WL-Proxy-Client-IP");
				}
				if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
					ipAddress = request.getRemoteAddr();
					if (ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")) {
						InetAddress inet = null;
						try {
							inet = InetAddress.getLocalHost();
						} catch (UnknownHostException e) {
							e.printStackTrace();
						}
						ipAddress = inet.getHostAddress();
					}
				}
				if (ipAddress != null && ipAddress.length() > 15) { // "***.***.***.***".length()
																	// = 15
					if (ipAddress.indexOf(",") > 0) {
						ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
					}
				}
				m.addAttribute("ipAddress", ipAddress);
				
				ServletContext sc=request.getSession().getServletContext();
	            List<UserBean> l=null;
	            Object obj = sc.getAttribute("uon");
	            if(obj != null){
	            	l=(List)obj;
	            }else{
	            	l=new ArrayList<UserBean>();
	            }
	            boolean is=true;
	            for (int i = 0; i < l.size(); i++) {
					UserBean u=l.get(i);
					if(u !=null && u.getUserId() == ub.getUserId()){
						is=false;
						break;
					}
				}
	            if(is){
	            	l.add(ub);
	            	// 成功以后当前登录人的登录次数+1
					us.updateLoginNum(ub.getUserId());
					m.addAttribute("ub", ub);
	            	sc.setAttribute("uon", l);
	            	return "/index.jsp";
	            }else{
	            	m.addAttribute("msg","该帐号已登录");
	    			return "/login.jsp";
	            }

			}
		} else {
			m.addAttribute("msg", "账号或密码错误");
			return "/login.jsp";
		}
	}

	/**
	 * 修改个人信息 图片上传下载
	 * @param ub
	 * @param m
	 * @param file
	 * @param request
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping("/updatemsg")
	public String updateInfo(UserBean ub, Model m, @RequestParam("touxiang") MultipartFile file,
			HttpServletRequest request) throws IllegalStateException, IOException {
		// 保存文件路径
		String path = request.getSession().getServletContext().getRealPath("/touxiang/");
		// 上传文件名
		long time = new Date().getTime();
		String filename = file.getOriginalFilename()+time;
		// 将上传文件保存到一个目标文件当中
		file.transferTo(new File(path + File.separator +  filename));
		//修改个人信息
		ub.setImg(filename);
		us.updateInfo(ub);
		return "/index.jsp";
	}

}