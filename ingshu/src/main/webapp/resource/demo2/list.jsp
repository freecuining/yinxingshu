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

<link href="css/mine.css" type="text/css" rel="stylesheet" />
<style>
.tr_color {
	background-color: #9F88FF
}
</style>
</head>
<body>

	<div class="div_head">
		<span> <span style="float: left;">当前位置是：系统管理-》用户管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold;"> <a
				style="text-decoration: none;" href="add.html">【添加】</a> <a
				style="text-decoration: none;" href="#">【删除】</a>
		</span>
		</span>
	</div>
	<div></div>
	<div class="div_search">
		<span>
			<form action="#" method="get">
				姓名： <input type="text" /> 角色: <input type="text" /> 所属部门: <input
					type="text" /> <input value="查询" type="submit" />

			</form>
		</span>
	</div>
	<div style="font-size: 13px; margin: 10px 5px;">
		<table class="table_a" border="1" width="100%">
			<tbody>
				<tr style="font-weight: bold;">
					<td width="40px;">序号</td>
					<td width="30px;"><input type="checkbox" /></td>
					<td width="80px;">账号</td>
					<td width="80px;">姓名</td>
					<td>角色</td>
					<td width="100px;">所属部门</td>
					<td align="center" width="100px;">操作</td>
				</tr>

				<c:forEach items="${userlist }" var="u" varStatus="st">
					<tr id="product1">
						<td>${st.index+1 }</td>
						<td><input type="checkbox" /></td>
						<td>${u.loginName }</td>
						<td><a href="view.html">${u.userName }</a></td>
						<td>${u.rb.roleName }</td>
						<td>${u.db.deptShortName }</td>
						<td><a href="add.html">修改</a> <a href="#">删除</a></td>
					</tr>
				</c:forEach>

				<tr>
					<td colspan="20" style="text-align: center;"><a
						style="text-decoration: none;" href="#"> 首页 上一页 ... 7 8 9 10
							11 12 ... 下一页 尾页 共1234条 每页显示 10/23 </a></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>