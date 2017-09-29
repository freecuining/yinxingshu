<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<title>个人信息</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<link href="css/mine.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#xiugai").clice(function(){
		var is = confirm("确认修改吗？");
		if(is){
			$("myForm").submit();
		}
	});
	
})
</script>
</head>

<body>

	<div class="div_head">
		<span> <span style="float: left">当前位置是：工作平台-》个人信息</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none" href="./admin.php?c=goods&a=showlist">【返回】</a>
		</span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<form action="upps" method="post" target="_top"
		id="myForm"	enctype="multipart/form-data">
		<input type="hidden" name="userId" value="${sessionScope.ub.userId }"/>
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px">原密码：</td>
					<td><input type="password" name="password1" value=""/></td>
				</tr>
				<tr>
					<td>新密码</td>
					<td><input type="password" name="password" value=""/></td>
				</tr>
				<tr>
					<td>密码确认：</td>
					<td><input type="password" name="rpassword" /></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit" id="xiugai" value="修改">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>