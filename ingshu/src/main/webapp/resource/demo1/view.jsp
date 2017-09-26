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
<link href="css/mine.css" type="text/css" rel="stylesheet">
<script type="text/javascript">



</script>
</head>

<body>
<input type="hidden" id="msg" value="${msg }"/>
	<div class="div_head">
		<span> <span style="float: left">当前位置是：-系统管理》部门管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none" href="cn/pupdateDept?deptId=${deptBean.deptId }">【修改】</a> 
				<c:if test="${deptBean.parentDept == 0 }">
				<a style="text-decoration: none" href="cn/pinsertDept?deptId=${deptBean.deptId }">【添加子部门】</a>
				</c:if>
					<c:if test="${!isok}">
						<a style="text-decoration: none" href="list.html">【删除】</a>
					</c:if>
		</span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<form action="./admin.php?c=goods&a=add" method="post"
			enctype="multipart/form-data">
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">部门编码：</td>
					<td>${deptBean.deptCode }</td>
				</tr>
				<tr>
					<td>部门简称：</td>
					<td>${deptBean.deptShortName }</td>
				</tr>
				<tr>
					<td>部门全称：</td>
					<td>${deptBean.deptName }</td>
				</tr>
				<tr>
					<td>上级部门：</td>
					
						<c:if test="${deptBean.parentDept==0 }">
							<td>顶级部门</td>
						</c:if>
						<c:forEach items="${deptList }" var="deptList">
						<c:if test="${deptBean.parentDept==deptList.deptId }">
							<td>${deptList.deptName }</td>
						</c:if>
					</c:forEach>
				</tr>
				<tr>
					<td>地址：</td>
					<td>${deptBean.deptAddress }</td>
				</tr>
				<tr>
					<td>简介：</td>
					<td>${deptBean.deptIntro }</td>
				</tr>
				<tr>
					<td>备注：</td>
					<td>${deptBean.deptRemark }</td>
				</tr>

				<tr>
					<td>是否启用：</td>
					<c:if test="${deptBean.deptState==0 }">
					<td>启用</td>
					</c:if>
					<c:if test="${deptBean.deptState==1 }">
					<td>禁用</td>
					</c:if>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>