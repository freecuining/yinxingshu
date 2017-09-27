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
<title>人事管理</title>

<link href="css/mine.css" type="text/css" rel="stylesheet" />
<style>
.tr_color {
	background-color: #9F88FF
}
</style>
</head>
<body>
	<div class="div_head">
		<span> <span style="float: left;">当前位置是：人事管理-》人事档案管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold;"> <a
				style="text-decoration: none;" href="add.html">【档案登记】</a>
		</span>
		</span>
	</div>
	<div></div>
	<div class="div_search">
		<span>
			<form action="#" method="get">
				姓名: <input type="text" /> 审核状态: <select>
					<option>--请选择--</option>
					<option>起草</option>
					<option>审核中</option>
					<option>审核通过</option>
					<option>驳回</option>
					<option>变更</option>
					<option>变更审核中</option>
				</select> 档案状态： <select>
					<option>--请选择--</option>
					<option>试用期</option>
					<option>正式员工</option>
					<option>离职</option>
					<option>已删除</option>
					<option>实习员工</option>
				</select> 建档时间： <input type="text" />至<input type="text" /> <input
					value="查询" type="submit" />

			</form>
		</span>
	</div>
	<div style="font-size: 13px; margin: 10px 5px;">
		<table class="table_a" border="1" width="100%">
			<tbody>
				<tr style="font-weight: bold;">
					<td width="30px;"><input type="checkbox" /></td>
					<td width="80px;">档案编码</td>
					<td>姓名</td>
					<td>性别</td>
					<td>所属部门</td>
					<td>职位</td>
					<td>职称</td>
					<td>建档日期</td>
					<td>审核状态</td>
					<td>档案状态</td>
					<td align="center" width="100px;">操作</td>
				</tr>
				<c:forEach items="${l }" var="ab">
					<tr id="product1">
						<td><input type="checkbox" /></td>
						<td>${ab.archiveCode}</td>
						<td>${ab.ub.userName}</td>
						<td>${ab.ub.sex}</td>
						<td>${ab.db.deptName}</td>
						<td>${ab.rb.roleName }</td>
						<td>${ab.rb.roleKind}</td>
						<td>${ab.positiveTime }</td>
						<td><c:choose>
								<c:when test="${ab.auditState == 0 }">起草</c:when>
								<c:when test="${ab.auditState == 1 }">审核中</c:when>
								<c:when test="${ab.auditState == 2 }">审核通过</c:when>
								<c:when test="${ab.auditState == 3 }">驳回</c:when>
								<c:when test="${ab.auditState == 4 }">变更</c:when>
								<c:when test="${ab.auditState == 5 }">变更审核中</c:when>
							</c:choose></td>
						<td><c:choose>
								<c:when test="${ab.archiveState == 0 }">试用期</c:when>
								<c:when test="${ab.archiveState == 1 }">正式员工</c:when>
								<c:when test="${ab.archiveState == 2 }">离职</c:when>
								<c:when test="${ab.archiveState == 3 }">已删除</c:when>
								<c:when test="${ab.archiveState == 4 }">实习员工</c:when>
							</c:choose></td>

						<td><a href="ac/pupdate?archiveId=${ab.archiveId }">变更</a> <a href="ac/view?archiveId=${ab.archiveId }">明细</a>
							<a href="#">删除</a></td>
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