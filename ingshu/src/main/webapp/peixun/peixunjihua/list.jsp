<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
<base href="<%=basePath%>" />

<meta http-equiv="content-type" content="text/html; charset=UTF-8" />

<title>培训管理</title>

<link href="../../css/mine.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<style>
.tr_color {
	background-color: #9F88FF
}
</style>
	<div class="div_head">
		<span> <span style="float: left;">当前位置是：培训管理-》培训计划</span> <span
			style="float: right; margin-right: 8px; font-weight: bold;"> <a
				style="text-decoration: none;" href="peixun/peixunjihua/add.jsp">【新增培训计划】</a>
		</span>
		</span>
	</div>
	<div></div>
	<div class="div_search">
		<span>
			<form action="Ain/queryFy" method="post">
		培训名称:
				<input type="text" name="traName" value="${traName}" /> 审核状态:
				<select name="traState">
					<option value="">请选择</option>
					<option value="起草" <c:if test="${traState=='起草'}">selected</c:if>>起草</option>
					<option value="审核中" <c:if test="${traState=='审核中'}">selected</c:if>>审核中</option>
					<option value="审核通过"<c:if test="${traState=='审核通过'}">selected</c:if>>审核通过</option>
				</select>
		 培训时间：
				<input type="text" name="traStartTime" value="${traStartTime}" />至 
				<input type="text" name="traEddTime" value="${traEddTime}" />
				<input value="查询" type="submit" />

			</form>
		</span>
	</div>
	<div style="font-size: 13px; margin: 10px 5px;">
		<table class="table_a" border="1" width="100%">
			<tbody>
				<tr style="font-weight: bold;">
					<td width="">序号</td>
					<td width="">培训名称</td>
					<td width="15%">培训讲师</td>
					<td width="15%">培训时间</td>
					<td>培训反馈</td>
					<td width="15%">审核状态</td>
					<td align="center" width="15%">操作</td>
				</tr>
				<tbody>
					<c:forEach items="${beans}" var="b">
						<tr id="product1">
							<td>${b.traId}</td>
							<td>${b.traName}</td>
							<td>${b.traTeacher}</td>
							<td>${b.traStartTime}</td>
							<td>${b.tbResult}</td>
							<td>${b.traState}</td>
							<td><c:if test="${b.traState == '审核通过'}">
									<a href="Ain/traResult ? traId=${b.traId}">培训反馈</a>
								</c:if> <c:if test="${b.traState == '起草' or b.traState  == '审核中' }">
									<a href="Ain/preUpdateAin ? traId=${b.traId}">明细</a>
								</c:if> <c:if test="${b.traState == '起草' or b.traState == '驳回'}">
									<a href="Ain/preUpdateAin ? traId=${b.traId}">修改</a>
								</c:if> <c:if test="${b.traState == '起草'}">
									<a href="Ain/deleteAin ? traId=${b.traId}">删除</a>
								</c:if> <c:if test="${b.traState == '起草'}">
									<a href="Ain/updateAin1 ? traId=${b.traId}">提交审核</a>
								</c:if></td>
						</tr>
					</c:forEach>
				</tbody>
                </td>
				</tr>
				<tr>
					<td colspan="20" style="text-align: center;"><c:if
							test="${nowPage > 1 }">
							<a
								style="text-decoration: none;"
								href="Ain/queryFY ? nowPage=1&traName=${traName}&traState=${traState}&traStartTime=${traStartTime}&traEddTime=${traEddTime}">首页</a>
						</c:if> <c:if test="${nowPage <= 1 }">首页</c:if> <c:if
							test="${nowPage > 1 }">
							<a style="text-decoration: none;"
								href="Ain/queryFY ? nowPage=${nowPage - 1 }&traName=${traName}&traState=${traState}&traStartTime=${traStartTime}&traEddTime=${traEddTime}">上一页</a>
						</c:if> <c:if test="${nowPage < totalPage }"></c:if> <c:if
							test="${nowPage < totalPage }">
							<a style="text-decoration: none;"
								href="Ain/queryFY ? nowPage=${nowPage + 1 }&traName=${traName}&traState=${traState}&traStartTime=${traStartTime}&traEddTime=${traEddTime}">下一页</a>
						</c:if> <c:if test="${nowPage < totalPage }"></c:if> <c:if
							test="${nowPage < totalPage }">
							<a style="text-decoration: none;"
								href="Ain/queryFY ? nowPage=${totalPage }&traName=${traName}&traState=${traState}&traStartTime=${traStartTime}&traEddTime=${traEddTime}">尾页</a>
						</c:if></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>