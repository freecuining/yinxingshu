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
<title>启明星辰人力资源管理V1.0</title>
</head>
<frameset cols="170, *">
	<frame name=left src="resource/demo1/left.jsp" frameborder=0 noresize />
	<frame name=main_right src="resource/demo1/wecom.jsp" frameborder=0 noresize
		scrolling=yes />
</frameset>
<noframes>
</noframes>
</html>