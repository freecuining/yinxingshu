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
<title>薪酬标准管理添加</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
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
		<form action="cn/insertDept" method="post" enctype="multipart/form-data" target="_right">
		<input type="hidden" name="deptId" value="${deptId }"/>
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">部门编码<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="deptCode" value="${deptCode+1 }" /></td>
				</tr>
				<tr>
					<td>部门简称<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="deptShortName" value="" /></td>
				</tr>

				<tr>
					<td>部门全称<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="deptName" value="" /></td>
				</tr>
				<tr>
					<td>上级部门<span style="color: red">*</span>：
					</td>
					<td><input type="text" readonly name=""
						value="${deptBean.deptName }"/>
						<input type="hidden" name="parentDept" value="${deptBean.deptId }"/>
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
					<td><textarea name="deptIntro"></textarea></td>
				</tr>

				<tr>
					<td>备注：</td>
					<td><textarea name="deptRemark"></textarea></td>
				</tr>
				<tr>
					<td>是否启用：</td>
					<td><select name="deptState">
							<option value="1">否</option>
							<option value="0">是</option>
					</select></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="确认">
						<input type="reset" value="清空"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>