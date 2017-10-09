<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>">
<!DOCTYPE>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />

<title>数据分析</title>

<link href="css/mine.css" type="text/css" rel="stylesheet" />
<script type="text/javascript">
	function qingchu() {
		window.location.href = "chuben?flag=query";
	}
</script>
</head>
<body>
	<style>
.tr_color {
	background-color: #9F88FF
}

td {
	width: 11%;
	height: 35px;
	text-align: center
}
</style>
	<div class="div_head">
		<span> <span style="float: left;">当前位置是： 数据分析》》》储备人才统计表</span>

		</span>
	</div>
	<div></div>
	<div class="div_search">
		<span>
			<form action="chuben" method="get">
				员工姓名： <input type="text" name="name" value="${sessionScope.rb.name }" /> <input
					value="查询" type="submit" /> <input value="清除" type="button"
					onclick="qingchu()">
			</form>
		</span>
	</div>
	<div style="font-size: 13px; margin: 10px 5px;">
		<table class="table_a" border="1" width="100%">
			<tbody>
				<tr style="font-weight: bold; background-color: #06F">
					<td>姓名</td>
					<td>性别</td>
					<td>电话</td>
					<td>专业</td>
					<td>学历</td>
					<td>学校</td>
					<td>工作经验</td>
					<td>是否应聘过本公司</td>

				</tr>
				<c:forEach items="${l }" var="l">
					<tr id="product1">

						<td>${l.name }</td>
						<td><c:if test="${l.resumeSex==0 }">男</c:if> <c:if
								test="${l.resumeSex==1 }">女</c:if></td>
						<td>${l.resumePhone }</td>
						<td>${l.major }</td>
						<td><c:if test="${l.education==0 }">专科</c:if> <c:if
								test="${l.education==1 }">本科</c:if> <c:if
								test="${l.education==2 }">硕士</c:if> <c:if
								test="${l.education==3 }">博士</c:if></td>
						<td>${l.graduateSchool }</td>
						<td>${l.workYear }</td>
						<td><c:if test="${l.attributeMianshi==0 }">是</c:if> <c:if
								test="${l.attributeMianshi==1 }">否</c:if></td>

					</tr>
				</c:forEach>
				<tr>
					<td colspan="9" style="text-align: center;"><span> <a
							href="chuben?pageNum=1">首页</a> <c:if
								test="${requestScope.page.getPageNum() == 1 }">
				上一页
			</c:if> <c:if test="${requestScope.page.getPageNum() > 1 }">
								<a href="chuben?pageNum=${requestScope.page.getPageNum()-1 }">上一页</a>
							</c:if> <c:forEach items="${requestScope.page.getNavigatepageNums()}"
								var="num">
								<c:if test="${requestScope.page.getPageNum()==num }">${num }</c:if>
								<c:if test="${requestScope.page.getPageNum()!=num }">
									<a href="chuben?pageNum=${num }">${num }</a>
								</c:if>
							</c:forEach> <c:if
								test="${requestScope.page.getPageNum()==requestScope.page.getPages()}">
			        	下一页
			          </c:if>
			    
			     <c:if test="${requestScope.page.getPageNum() < requestScope.page.getPages() }">
								<a href="chuben?pageNum=${requestScope.page.getPageNum()+1 }">下一页</a>
							</c:if> <a href="chuben?pageNum=${requestScope.page.getPages() }">尾页</a>
							<span>总共${requestScope.page.getPages()}页
								总共${requestScope.page.getTotal() }条 </span></td>
				</tr>
				
			</tbody>
		</table>
	</div>
</body>
</html>