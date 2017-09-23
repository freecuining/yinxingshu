<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath%>">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/admin.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<table cellspacing=0 cellpadding=0 width="100%"
		background="img/header_bg.jpg" border=0>
		<tr height=56>
			<td width=520 style="font-size: 28px; color: white">
				银杏树信息技术服务(北京)有限公司</td>
			<td style="font-weight: bold; color: #fff; padding-top: 20px"
				align=middle>当前用户：${sessionScope.ub.userName } &nbsp;&nbsp; &nbsp;&nbsp;  <a
				style="color: #fff" href="login.html" target=_top>退出系统</a>
			</td>
			<td align=right width=268><a href="index.html"> <img
					height=56 src="img/header_right.jpg" width=268></a></td>
		</tr>
	</table>
	<table cellspacing=0 cellpadding=0 width="100%" border=0>
		<tr bgcolor=#1c5db6 height=4>
			<td></td>
		</tr>
	</table>
</body>
</html>