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
<base href="<%=basePath%>">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>用户管理</title>
<link href="css/mine.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-3.2.1.min.js">
</script>
</head>
<body>
	<div class="div_head">
		<span> <span style="float: left">当前位置是：-》资源管理》用户管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none" href="javascript:history.back()">【返回】</a>
		</span>
		</span>
	</div>
	<div></div>
	<div style="font-size: 13px; margin: 10px 5px;" id="userdiv1" >
		<form action="" method="post" enctype="multipart/form-data">
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">用户编号<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="userCode" readonly value="${userBean.userCode }" /></td>
				</tr>
				<tr>
					<td>登录账号<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="loginName" id="a" value="${userBean.loginName }" />
					</td>
				</tr>
				<tr>
					<td>用户姓名<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="userName" value="${userBean.userName }" /></td>
				</tr>
				<tr>
					<td>所属部门<span style="color: red">*</span>：
					</td>
					<td><select name="deptId" id="deptId">
						<c:forEach items="${deptList }" var="deptList">
							<option value="${deptList.deptId }" <c:if test="${deptBean.deptId == deptList.deptId }">selected</c:if> >${deptList.deptName }</option>
						</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>所属职位<span style="color: red">*</span>：
					</td>
					<td>
					<select name="roleId">
					<c:forEach items="${roleList }" var="roleList">
							<option value="${roleList.roleId }" <c:if test="${userBean.roleId == roleList.roleId }">selected</c:if> >${roleList.roleName }</option>
					</c:forEach>
					</select>
					</td>
				</tr>
				<tr>
					<td>身份证<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="idCard"
						value="${userBean.idCard }" /></td>
				</tr>

				<tr>
					<td>联系电话<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="phone"
						value="${userBean.mobilePhone }" /></td>
				</tr>
				<tr>
					<td>邮箱<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="userEmail"
						value="${userBean.userEmail }" /></td>
				</tr>

				<tr>
					<td>联系地址：</td>
					<td><input type="text" name="address" value="${userBean.address }" />
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="确认">
						<input type="reset" value="清空">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>