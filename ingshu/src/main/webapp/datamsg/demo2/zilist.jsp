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

<title>薪酬标准管理</title>

<link href="css/mine.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<style>
.tr_color {
	background-color: #9F88FF
}
</style>
	<script type="text/javascript">
		
	</script>

	<div class="div_head">
		<span> <span style="float: left;">当前位置是：数据分析 》》》职员数据综合报表</span>

		</span>
	</div>
	<div></div>
	<div class="div_search">
		<span>
			
				 <input type="button" value="返回"
					onclick="javascript:history.back(-1);" />


			</form>
		</span>

	</div>
	<div style="font-size: 13px; margin: 10px 5px;">
		<table class="table_a" border="1" width="100%">
			<tbody>
				<tr style="font-weight: bold;">
					<td width="90px;" style="text-align: right; border-bottom: none">学历</td>
					<td width="60px;" rowspan="2" valign="top">全部(人数)</td>
					<td width="60px;" rowspan="2" valign="top">博士(人数)</td>
					<td width="60px;" rowspan="2" valign="top">硕士(人数)</td>
					<td width="60px;" rowspan="2" valign="top">本科(人数)</td>
					<td width="60px;" rowspan="2" valign="top">专科(人数)</td>

				</tr>
				<tr style="font-weight: bold;">
					<td style="text-align: left; border-top: none">部门</td>

				</tr>

				<c:forEach items="${l}" var ="year">
					<tr>
						<td style="font-weight: bold;">${year.deptName}</td>
						<td>${year.loarned }</td>
						<td>${year.master}</td>
						<td>${year.regular}</td>
						<td>${year.junior}</td>
						<td>${year.amount}</td>
					</tr>

				</c:forEach>

				<!-- <tr id="product1">
                        <td style="font-weight: bold;">*****公司</td>
                        <td>500</td>
						<td>50</td>
						<td>100</td>
						<td>300</td>
						 <td>50</td>
                    </tr> 
					 <tr id="product1">
                      <td style="font-weight: bold;">产品设计中心</td>
                        <td><a href="mingxilist.html">300</a></td>
						<td>50</td>
						<td>100</td>
						<td>300</td>
						 <td>50</td>                   
                    </tr>
					
					 <tr id="product1">
                        <td style="font-weight: bold;">平台研发中心</td>
                        <td><a href="">100</a></td>
						<td><a href="">50</a></td>
						<td><a href="">100</a></td>
						<td><a href="">300</a></td>
						 <td><a href="">50</a></td>                    
                    </tr>
					
					 <tr id="product1">
                       <td style="font-weight: bold;">人力资源中心</td>
                        <td><a href="">50</a></td>
						<td><a href="">50</a></td>
						<td><a href="">100</a></td>
						<td><a href="">300</a></td>
						 <td><a href="">50</a></td>                 
                    </tr>
					 <tr id="product1">
                       <td style="font-weight: bold;">财务部</td>
                        <td><a href="">50</a></td>
						<td><a href="">50</a></td>
						<td><a href="">100</a></td>
						<td><a href="">300</a></td>
						 <td><a href="">50</a></td>                 
                    </tr> -->

			</tbody>
		</table>
	</div>
</body>
</html>