<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		$("#btn").click(function(){
			var is = confirm("确认修改么?");
			if(is){
				$("#myForm").submit();
			}
		});
	});
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
		<form action="updatemsg" method="post"
			enctype="multipart/form-data" id="myForm">
			<input type="hidden" name="userId" value="${sessionScope.ub.userId }">
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px">姓名</td>
					<td><input type="text" name="userName"
						value="${sessionScope.ub.userName }" /></td>
				</tr>
				<tr>
					<td>性别</td>
					<td>
							<input type="radio" name="sex" value="1" <c:if test="${sessionScope.ub.sex ==1 }">checked</c:if> />男
							<input type="radio" name="sex" value="0" <c:if test="${sessionScope.ub.sex ==0 }"></c:if> />女
					</td>
				</tr>

				<tr>
					<td>身份证号：</td>
					<td><input type="text" name="idCard"
						value="${sessionScope.ub.idCard }" /></td>
				</tr>
				<tr>
					<td>办公电话：</td>
					<td><input type="text" name="phone"
						value="${sessionScope.ub.phone }" /></td>
				</tr>
				<tr>
					<td>手机：</td>
					<td><input type="text" name="mobilePhone"
						value="${sessionScope.ub.mobilePhone }" /></td>
				</tr>
				<tr>
					<td>邮箱：</td>
					<td><input type="text" name="userEmail"
						value="${sessionScope.ub.userEmail }" /></td>
				</tr>
				<tr>
					<td>更换头像：</td>
					<td><img alt="" src="${sessionScope.ub.img }"><input type="file" name="touxiang"
						value="" /></td>
				</tr>
				<tr>
					<td>备注：</td>
					<td><textarea name="userRemark"
							value="sessionScope.ub.userRemark"></textarea></td>
				</tr>



				<tr>
					<td colspan="2" align="center"><input id="btn" type="button" value="修改">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>