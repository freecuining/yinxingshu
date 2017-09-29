<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE>
<html>

<head>
<base href="<%=basePath%>">
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />

<title>数据分析</title>

<link href="css/mine.css" type="text/css" rel="stylesheet" />
</head>

<body>
	<style>
.tr_color {
	background-color: #9F88FF
}
</style>
	<div class="div_head">
		<span> <span style="float: left;">当前位置是：数据分析》》》职员异动情况统计分析</span>

		</span>
	</div>
	<div></div>
	<div class="div_search">
		<span>
			<form action="datamsg/changelist" method="get">
				年度： <select name="year">
					<option>--请选择--</option>
					<option>2010</option>
					<option>2011</option>
					<option>2012</option>
					<option>2013</option>
					<option>2014</option>
					<option>2015</option>
					<option>2016</option>
					<option>2017</option>
				</select> <input type="submit" value="查询" />

			</form>
		</span>
	</div>
	<div style="font-size: 13px; margin: 10px 5px;">
		<%-- <table class="table_a" border="1" width="100%">
			<tbody>

				<tr style="font-weight: bold; background-color: #06C">

					<td
						style="width: 150px; height: 50px; text-align: right; border-bottom: none">异动类型</td>
					<td colspan="${size+1}" style="width: 30px;">入职(人数)</td>
					<td colspan="${size+1}" style="width: 30px;">转正(人数)</td>
					<td colspan="${size+1}" style="width: 30px;">调薪(人数)</td>
					<td colspan="${size+1}" style="width: 30px;">调岗(人数)</td>
					<td colspan="${size+1}" style="width: 30px;">离职(人数)</td>
				</tr>

				<tr style="font-weight: bold; height: 130px; background-color: #06C">
					<td style="border-top: none; text-align: left;" valign="bottom">时间</td>
					<c:forEach begin="0" end="4">
						<c:forEach items="${deptl}" var="deptl">
							<td>${deptl.deptName}</td>
						</c:forEach>
						<td>总计</td>
					</c:forEach>
				</tr>
		</table> --%>
		<table>
			<tr>
				<td>

					<table class="table_a" border="1" width="100%" style="">
						<tr style="font-weight: bold; background-color: #06C">

							<td
								style="width: 150px; height: 50px; text-align: right; border-bottom: none">异动类型</td>
						</tr>
						<tr>
						<tr
							style="font-weight: bold; height: 130px; background-color: #06C">
							<td style="border-top: none; text-align: left;" valign="bottom">时间</td>
						</tr>
						<c:forEach items="${ylist }" var="year">
							<tr>
								<td style="text-align: center"><a href="datamsg/changelist?year=${year}">${year}</a>
								</td>
							</tr>
						</c:forEach>

					</table>

				</td>
				<td>

					<table class="table_a" border="1" width="100%" style="">
						<tr style="font-weight: bold; background-color: #06C ;height=200px">
							<td colspan="${size+1}" style="width: 30px;">入职(人数)</td>
							<td colspan="${size+1}" style="width: 30px;">转正(人数)</td>
							<td colspan="${size+1}" style="width: 30px;">调薪(人数)</td>
							<td colspan="${size+1}" style="width: 30px;">调岗(人数)</td>
							<td colspan="${size+1}" style="width: 30px;">离职(人数)</td>
						</tr>
						<tr
							style="font-weight: bold; height: 153px; background-color: #06C">
							<c:forEach begin="0" end="4">
								<c:forEach items="${deptl}" var="deptl">
									<td>${deptl.deptName}</td>
								</c:forEach>
								<td>总计</td>
							</c:forEach>
						</tr>
						<c:forEach items="${yearlist}" var="statelist">
							<tr>
								<c:forEach items="${statelist}" var="loglist">
									<c:forEach items="${loglist}" var="log">
										<td>${log.count}</td>
									</c:forEach>

								</c:forEach>
							</tr>
						</c:forEach>
					</table>


				</td>
			</tr>



		</table>


		<%-- 	
		<table class="table_a" border="1" width="100%">
			<c:forEach items="${datalist}" var="yearlist">

				<tr>
					<td style="text-align: center"><a href="yuezonglist.html">${yearlist }</a>
					</td>
					<c:forEach items="${yearlist}" var="statelist">
						<c:forEach items="${statelist}" var="loglist">
							<c:forEach items="${loglist}" var="log">
								<td>${log.count}</td>
							</c:forEach>

						</c:forEach>
					</c:forEach>
				</tr>
			</c:forEach>
			</tbody>

		</table> --%>
	</div>
</body>

</html>