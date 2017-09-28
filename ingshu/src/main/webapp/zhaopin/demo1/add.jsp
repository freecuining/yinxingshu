<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>

	<head>
		<title>职位发布登记</title>
		<meta http-equiv="content-type" content="text/html;charset=utf-8">
		<link href="css/mine.css" type="text/css" rel="stylesheet">
	</head>

	<body>

		<div class="div_head">
			<span>
                <span style="float:left">当前位置是：职位发布管理-》职位发布登记</span>
			<span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="rec/demo1">【返回】</a>
                </span>
			</span>
		</div>
		<div></div>

		<div style="font-size: 13px;margin: 10px 5px">
			<form action="../../rec/add" method="post" enctype="multipart/form-data">
				<table border="1" width="100%" class="table_a">
					<tr>
						<td width="120px;">部门<span style="color:red">*</span>：</td>
						<td>
							<select name="deptId">
								<c:forEach items="${role }" var="d" >
						    	 	<option value="${d.deptId }">${d.deptName }</option>
								</c:forEach>
							</select>
						</td>
					</tr>
					<tr>
						<td>招聘类型<span style="color:red">*</span>：</td>
						<td>
							<select>
								<option>-请选择-</option>
								<option>校园招聘</option>
								<option>社会招聘</option>
							</select>
						</td>
					</tr>

					<tr>
						<td>招聘人数<span style="color:red">*</span>：</td>
						<td>
							<input type="text" name="roleNum" value="" /></td>
					</tr>
					<tr>
						<td>职位名称<span style="color:red">*</span>：</td>
						<td>
							<select name="roleName">
								<c:forEach items="${list }" var="o" >
						    	 	<option value="${o.deptId }">${o.roleName }</option>
								</c:forEach>
							</select>
						</td>
					</tr>
					<tr>
						<td>职位编码<span style="color:red">*</span>：</td>
						<td>
							<input type="text"  name="roleCode" value="YXS-" />
						</td>
					</tr>
					<tr>
						<td>职位分类<span style="color:red">*</span>：</td>
						<td>
							<input type="text" readonly name="roleKind" value="" />
						</td>
					</tr>
					<tr>
						<td>登记人<span style="color:red">*</span>：</td>
						<td>
							<input type="text" readonly name="userId" value="当前登录人" />
						</td>
					</tr>
					<tr>
						<td>登记时间<span style="color:red">*</span>：</td>
						<td>
							<input type="text" name="startTime" readonly value="" />
						</td>
					</tr>
					<tr>
						<td>截止时间<span style="color:red">*</span>：</td>
						<td>
							<input type="text" name="eddTime" readonly value="" />
						</td>
					</tr>

					<tr>
						<td>职位描述<span style="color:red">*</span>：</td>
						<td>
							<textarea cols="70" rows="12" name="roleRemark">  
					
					   </textarea>
						</td>
					</tr>

					<tr>
						<td>招聘要求<span style="color:red">*</span>：</td>
						<td>
							<textarea cols="70" rows="12" name="roleRequired"> 
					
					   </textarea>
						</td>
					</tr>

					<tr>
						<td colspan="2" align="center">
							<input type="submit" value=" 发布 ">
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>

</html>