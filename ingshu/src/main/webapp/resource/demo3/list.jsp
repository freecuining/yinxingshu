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

<title>职位管理</title>

        <link href="css/mine.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是：系统管理-》职位设置</span>
                <span style="float: right; margin-right: 8px; font-weight: bold;">
                    <a style="text-decoration: none;" href="add.html">【添加】</a>
                </span>
            </span>
        </div>
        <div></div>
        <div class="div_search">
            <span>
                <form action="cnRole/getRoles" method="post">
                   	 职位名称: 
					<input type="text" name="roleName" value=""/>
					 所属部门: 
					<input type="text" name="deptName" value=""/>
					<!-- 是否启用: 
					<select name="roleState">
						<option value="999">---请选择---</option>
						<option value="1">是</option>
						<option value="0">否</option>
					</select> -->
                    <input value="查询" type="submit" />
                </form>
            </span>
        </div>
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%">
                <tbody><tr style="font-weight: bold;">
                        <td width="40px;">序号</td>
                        <td width="80px;"> 职位编码</td>
                        <td >职位名称</td>
						<td width="100px;">职位分类</td>
                        <td width="120px;">所属部门</td>                       
						<td width="120px;">状态</td>  
                        <td align="center" width="100px;">操作</td>
                    </tr>
					<c:forEach items="${roleList }" var="roleList" varStatus="st">
					
                    <tr id="product1">
                        <td>${st.index+1 }</td>
						<td>${roleList.roleCode }</td>
                        <td><a href="cnRole/getRoleById?roleId=${roleList.roleId }">${roleList.roleName }</a></td> 
						<td>${roleList.roleKind }</td> 						
                        <td>${roleList.deptName }</td>
						<c:if test="${roleList.roleState==0 }">
						<td>禁用</td>
						</c:if>
						<c:if test="${roleList.roleState==1 }">
						<td>启用</td>
						</c:if>
                        <td>
							<a href="add.html">修改</a>						   
							<a href="#">删除</a>
						</td>                        
                    </tr> 
					 </c:forEach>
                    <tr>
					<td colspan="20" style="text-align: center;"><a
						href="cnRole/getRoles?pageNum=1">首页</a> <c:choose>
							<c:when test="${page.pageNum == page.firstPage}">上一页</c:when>
							<c:otherwise>
								<a href="cnRole/getRoles?pageNum=${page.pageNum-1}">上一页</a>
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
								<a href="cnRole/getRoles?pageNum=${page.pageNum+1}">下一页</a>
							</c:otherwise>
						</c:choose> <c:if test="${page.pageNum == page.lastPage}">尾页</c:if> <c:if
							test="${page.pageNum != page.total}">
							<a href="cnRole/getRoles?pageNum=${page.lastPage}">尾页</a>
						</c:if> 共${page.total}条记录，当前显示第${page.pageNum}页 ，总共${page.lastPage}页</td>
				</tr>
                </tbody>
            </table>
        </div>
    </body>
</html>