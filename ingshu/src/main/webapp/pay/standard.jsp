<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
<title>银杏树信息技术服务(北京)有限公司</title>
<link href="css/mine.css" type="text/css" rel="stylesheet" />

<script type="text/javascript" src="js/jquery-3.2.1.min.js">
</script>
<!-- 全选全不选 -->
<script type="text/javascript">
$(function(){
		$("#selectAll").click(function(){
			//1.获取当前元素的选中状态 this在funcation中代表的是当前dom对象
			//alert(this.checked);
			//alert($(this).attr("checked"));//获取undefined
			//alert($(this).prop("checked"));
			
			//2.获取所有的复选框 让其状态和 当前元素的选中状态保持一致
			$(".salarySelect").prop("checked",$(this).prop("checked"));
		});
		
   });


</script>
 
</head>

<body>
	<style>
.tr_color {
	background-color: #9F88FF
}
</style>
	<div class="div_head">
		<span> <span style="float: left;">当前位置是：薪酬管理-》薪酬标准管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold;"> <a
				style="text-decoration: none;" href="bb/codeId">【添加】</a>
		</span>
		</span>
	</div>
	<div></div>
	<div class="div_search">
		<span>
			<form action="#" method="get">
				薪酬标准类型: <input type="text" /> 审核状态: <select>
					<option>-- 请选择--</option>
					<option>-- 起草--</option>
					<option>-- 审核中--</option>
					<option>-- 已通过--</option>
				</select> <input value="查询" type="submit" />
			</form>
		</span>
	</div>
	<div style="font-size: 13px; margin: 10px 5px;">
		<table class="table_a" border="1" width="100%">
			<tbody>
				<tr style="font-weight: bold;">
					<td width="30px;"><input type="checkbox" id="selectAll" /></td>
					<td width="40px;">序号</td>
					<td width="80px;">薪酬编码</td>
					<td>薪酬标准类型</td>
					<td width="100px;">审核状态</td>
					<td width="120px;">时间</td>
					<td align="center" width="100px;">操作</td>
				</tr>
				<c:if test="${empty salaryList }">
					<tr>
						<td colspan="9" style="font-size: 26px; color: red;">没有找到合适的数据</td>
					</tr>
				</c:if>
				<c:if test="${!empty salaryList }">
					<c:forEach items="${ salaryList }" var="s" varStatus="sl">
						<tr id="product1">
							<td><input type="checkbox" name="sa"  class="salarySelect"/></td>
							<td>${sl.index+1 }</td>
							<td>${s.code }</td>
							<td>${s.name }</td>
							<c:if test="${s.salarySate == 0 }">
								<td>审核通过</td>
							</c:if>
							<c:if test="${s.salarySate == 1 }">
								<td>审核失败</td>
							</c:if>
							<c:if test="${s.salarySate == 2 }">
								<td>审核中</td>
							</c:if>
							<c:if test="${s.salarySate == 3 }">
								<td>起草</td>
							</c:if>
							<td>${fn:substring(s.registerTime,0,16) }</td>
							<td>
							<c:if test="${s.salarySate == 1 }">
							<a href="UserServlet.do?salaryId=${s.salaryId }&pageNum=${page.pageNum}">修改</a>&nbsp;&nbsp;&nbsp;
							<a href="UserServlet.do?salaryId=${s.salaryId }&pageNum=${page.pageNum}">删除</a>
							</c:if>
							<c:if test="${s.salarySate == 3 }">
							<a href="UserServlet.do?salaryId=${s.salaryId }&pageNum=${page.pageNum}">修改</a>&nbsp;&nbsp;&nbsp;
							<a href="UserServlet.do?salaryId=${s.salaryId }&pageNum=${page.pageNum}">删除</a>
							</c:if>
							
							
								
								
							</td>
						</tr>
					</c:forEach>
				</c:if>
				<tr>
					<td colspan="20" style="text-align: center;"><a
						href="bb/salary?pageNum=1">首页</a> <c:choose>
							<c:when test="${page.pageNum == page.firstPage}">上一页</c:when>
							<c:otherwise>
								<a href="bb/salary?pageNum=${page.pageNum-1}">上一页</a>
							</c:otherwise>
						</c:choose> <c:if
							test="${page.navigatepageNums[page.navigateFirstPage-1] != 1 }">...</c:if>
						<c:forEach items="${page.navigatepageNums}" var="pNum">
								${pNum }
							</c:forEach> 
							<c:if test="${page.lastPage >= 5 }">
							   <c:if
								       test="${page.navigatepageNums[page.navigateLastPage-1] != page.total }">...</c:if>
						    </c:if> 
						    <c:choose>
							<c:when test="${page.pageNum == page.lastPage}">下一页</c:when>
							<c:otherwise>
								<a href="bb/salary?pageNum=${page.pageNum+1}">下一页</a>
							</c:otherwise>
						</c:choose> <c:if test="${page.pageNum == page.lastPage}">尾页</c:if> <c:if
							test="${page.pageNum != page.total}">
							<a href="bb/salary?pageNum=${page.lastPage}">尾页</a>
						</c:if> 共${page.total}条记录，当前显示第${page.pageNum}页 ，总共${page.lastPage}页</td>
				</tr>


				<!--  <tr id="product1">
                        <td>1</td>
                        <td><input type="checkbox" /></td>
						<td>a1001</td>
                        <td><a href="standard_view.html">研发工程师</a></td> 
						<td>起草</td> 						
                        <td>2012-10-18 17:40</td>
                        <td>
							<a href="standard_edit.html">修改</a>						   
							<a href="#">删除</a>
						</td>                        
                    </tr> 
					 <tr id="product1">
                        <td>2</td>
                        <td><input type="checkbox" /></td>
						<td>b1002</td>
                        <td><a href="standard_view.html">实施工程师</a></td> 
						<td>审核中</td> 						
                        <td>2012-10-18 17:40</td>
                        <td>
												   							
						</td>                        
                    </tr>
					
					 <tr id="product1">
                        <td>3</td>
                        <td><input type="checkbox" /></td>
						<td>a1002</td>
                        <td><a href="standard_view.html">项目经理</a></td> 
						<td>未通过</td> 						
                        <td>2012-10-18 17:40</td>
                        <td>
							<a href="standard_edit.html">修改</a>						   
							<a href="#">删除</a>
						</td>                        
                    </tr>
					
					 <tr id="product1">
                        <td>3</td>
                        <td><input type="checkbox" /></td>
						<td>a1002</td>
                        <td><a href="standard_view.html">项目经理</a></td> 
						<td>审核通过</td> 						
                        <td>2012-10-18 17:40</td>
                        <td>
							
						</td>                        
                    </tr>
					
					
					
                    <tr>
                        <td colspan="20" style="text-align: center;">						
						<a style="text-decoration: none;" href="#">
                            首页 上一页  ... 7 8 9 10 11 12 ... 下一页 尾页 共1234条 每页显示 10/23 </a>
                        </td>
                    </tr> -->
			</tbody>
		</table>
	</div>
</body>
</html>