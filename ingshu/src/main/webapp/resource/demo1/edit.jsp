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
</head>
<body>

	<div class="div_head">
		<span> <span style="float: left">当前位置是：-系统管理》部门管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> </span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<form action="#" method="post" enctype="multipart/form-data">
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">部门编码：
					</td>
					<td><input type="text" name="deptCode" readonly value="${deptBean.deptCode }" /></td>
				</tr>
				<tr>
					<td>部门简称：<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="deptShortName" readonly value="${deptBean.deptShortName }" /></td>
				</tr>

				<tr>
					<td>部门全称：
					</td>
					<td><input type="text" name="deptName" value="${deptBean.deptName }" /></td>
				</tr>
				<tr>
					<td>上级部门：<span style="color: red">*</span>：
					</td>
					<td>
						<c:if test="${deptBean.parentDept==0 }">
								顶级部门
						</c:if>
						<c:if test="${deptBean.parentDept!=0 }">
						<select>
							<c:forEach items="${deptList }" var="deptList">
								<option value="${deptList.deptId }" <c:if test="${deptBean.parentDept==deptList.deptId }">selected</c:if>>${deptList.deptName }</option>
							</c:forEach>
						</select>
						</c:if>
					</td>
				</tr>
				<tr>
					<td>地址<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="deptAddress" readonly
						value="${deptBean.deptAddress }" /></td>
				</tr>


				<tr>
					<td>简介：</td>
					<td><textarea name="deptIntro">${deptBean.deptIntro }</textarea></td>
				</tr>

				<tr>
					<td>备注：</td>
					<td><textarea name="deptRemark">${deptBean.deptRemark }</textarea></td>
				</tr>

				<tr>
					<td>是否启用：</td>
					<td><select>
							<option value="0" <c:if test="${deptBean.deptState==0 }">selected</c:if>>是</option>
							<option value="1" <c:if test="${deptBean.deptState==1 }">selected</c:if>>否</option>
					</select></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit" value="确认">
						<button type="reset">清空</button></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>