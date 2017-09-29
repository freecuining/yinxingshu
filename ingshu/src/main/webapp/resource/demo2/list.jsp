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

<title>用户管理</title>

<link href="css/mine.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery-3.2.1.min.js">
</script>
<!-- 全选全不选 -->
<script type="text/javascript">
$(function(){
		$("#checkAll").click(function(){
			//1.获取当前元素的选中状态 this在funcation中代表的是当前dom对象
			//alert(this.checked);
			//alert($(this).attr("checked"));//获取undefined
			//alert($(this).prop("checked"));
			
			//2.获取所有的复选框 让其状态和 当前元素的选中状态保持一致
			$("#checkThis").prop("checked",$(this).prop("checked"));
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
		<span> <span style="float: left;">当前位置是：系统管理-》用户管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold;"> <a
				style="text-decoration: none;" href="cn/pinsertUser">【添加】</a> <a
				style="text-decoration: none;" href="#">【删除】</a>
		</span>
		</span>
	</div>
	<div></div>
	<div class="div_search">
		<span>
			<form action="cn/getUser" method="post">
				姓名： <input type="text" name="userName"/> 角色: <input type="text" name="roleName"/> 所属部门: <input
					type="text" name="deptName"/> <input type="submit" value="查询" />
			</form>
		</span>
	</div>
	<div style="font-size: 13px; margin: 10px 5px;">
		<table class="table_a" border="1" width="100%">
			<tbody>
				<tr style="font-weight: bold;">
					<td width="30px;"><input type="checkbox" id="checkAll"/></td>
					<td width="40px;">序号</td>
					<td width="80px;">账号</td>
					<td width="80px;">姓名</td>
					<td>角色</td>
					<td width="100px;">所属部门</td>
					<td align="center" width="100px;">操作</td>
				</tr>
				<c:forEach items="${userList }" var="userList" varStatus="st">
				<tr id="product1">
					<td><input type="checkbox" id="checkThis"/></td>
					<td>${st.index+1 }</td>
					<td>${userList.loginName }</td>
					<td><a href="view.html">${userList.userName }</a></td>
					<td>${userList.roleBean.roleName }</td>
					<td>人力资源</td>
					<td><a href="add.html">修改</a> <a href="#">删除</a></td>
				</tr>
				</c:forEach>
				<tr>
				<td colspan="20" style="text-align: center;">
			<span> <a href="cn/getUser?pageNum=1">首页</a> <c:if
							test="${requestScope.page.getPageNum() == 1 }">
				上一页
			</c:if> <c:if test="${requestScope.page.getPageNum() > 1 }">
							<a
								href="cn/getUser?pageNum=${requestScope.page.getPageNum()-1 }">上一页</a>
						</c:if> <c:forEach items="${requestScope.page.getNavigatepageNums()}"
							var="num">
							<c:if test="${requestScope.page.getPageNum()==num }">${num }</c:if>
							<c:if test="${requestScope.page.getPageNum()!=num }">
								<a href="cn/getUser?pageNum=${num }">${num }</a>
							</c:if>
						</c:forEach> <c:if
							test="${requestScope.page.getPageNum()==requestScope.page.getPages()}">
				下一页
			</c:if> <c:if
							test="${requestScope.page.getPageNum() < requestScope.page.getPages() }">
							<a
								href="cn/getUser?pageNum=${requestScope.page.getPageNum()+1 }">下一页</a>
						</c:if> <a href="cn/getUser?pageNum=${requestScope.page.getPages() }">尾页</a>
						<span>总共${requestScope.page.getPages()}页
							总共${requestScope.page.getTotal() }条 </span>
				</td>
			</tr>
			</tbody>
		</table>
	</div>
</body>
</html>