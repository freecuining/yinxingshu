<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
 <title>薪酬标准管理</title>

        <link href="css/mine.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是：系统管理-》菜单管理</span>
                <span style="float: right; margin-right: 8px; font-weight: bold;">
                    <a style="text-decoration: none;" href="add.html">【添加】</a>
                </span>
            </span>
        </div>
        <div></div>
        <div class="div_search">
            <span>
                <form action="cn/viewMenu" method="post">
                    菜单名称: 
					<input type="text" name="menuname" value=""/>
					 状态: 
					<select name="menustate">
						<option value="999">请选择</option>
						<option value="0">启用</option>
						<option value="1">禁用</option>
					</select>
                    <input value="查询" type="submit" />
					
                </form>
            </span>
        </div>
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%">
                <tbody><tr style="font-weight: bold;">
                        <td width="30px;"><input type="checkbox" /></td>
                        <td width="40px;">序号</td>
                        <td width="80px;">菜单名称</td>
                        <td >URL</td>
						<td width="100px;">状态</td>
                        <td align="center" width="100px;">操作</td>
                    </tr>
					<c:forEach items="${menuList }" var="ml"  varStatus="st">
                    <tr id="product1">
                    <td><input type="checkbox" /></td>
                        <td>${st.index+1 }</td>
						<td><a href="view.html">${ml.menuName }</a></td>
                        <td>${ml.menuUrl }</td> 
						<c:if test="${ml.menuState==1 }">
							<td>启用</td>
						</c:if>
						<c:if test="${ml.menuState==0 }">
							<td>停用</td>
						</c:if>					
                        <td>
							<a href="add.html">修改</a>						   
							<a href="#">删除</a>
						</td>                        
                    </tr>
                    </c:forEach>
                     <tr>
				<td colspan="20" style="text-align: center;">
			<span> <a href="cn/viewMenu?pageNum=1">首页</a> <c:if
							test="${requestScope.page.getPageNum() == 1 }">
				上一页
			</c:if> <c:if test="${requestScope.page.getPageNum() > 1 }">
							<a
								href="cn/viewMenu?pageNum=${requestScope.page.getPageNum()-1 }">上一页</a>
						</c:if> <c:forEach items="${requestScope.page.getNavigatepageNums()}"
							var="num">
							<c:if test="${requestScope.page.getPageNum()==num }">${num }</c:if>
							<c:if test="${requestScope.page.getPageNum()!=num }">
								<a href="cn/viewMenu?pageNum=${num }">${num }</a>
							</c:if>
						</c:forEach> <c:if
							test="${requestScope.page.getPageNum()==requestScope.page.getPages()}">
				下一页
			</c:if> <c:if
							test="${requestScope.page.getPageNum() < requestScope.page.getPages() }">
							<a
								href="cn/viewMenu?pageNum=${requestScope.page.getPageNum()+1 }">下一页</a>
						</c:if> <a href="cn/viewMenu?pageNum=${requestScope.page.getPages() }">尾页</a>
						<span>总共${requestScope.page.getPages()}页
							总共${requestScope.page.getTotal() }条 </span>
				</td>
			</tr>
                </tbody>
            </table>
        </div>
    </body>
</html>