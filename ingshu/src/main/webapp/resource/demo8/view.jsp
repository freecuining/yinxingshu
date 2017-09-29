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
        <title>菜单管理</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》菜单管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="javascript:history.back()">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">菜单名称<span style="color:red">*</span>：</td>
                    <td><input type="text" name="menuName" value="${menuBean.menuName }" /></td>
                </tr>
                <tr>
                    <td>上级菜单<span style="color:red">*</span>：</td>
                   <%--  <c:if test="${menBean.parentMenu == 0 }"><td>顶级菜单</td></c:if>
                    <c:forEach items="${menuList }" var="menuList">
                      	<c:if test="${menBean.parentMenu != 0 && menuBean.parentMenu == menuList.menuId}">
                      		<td>${menuList.menuName }</td>
                      	</c:if>
                      	</c:forEach> --%>
                </tr>
				  <tr>
                    <td>URL<span style="color:red">*</span>：</td>
                    <td>
						<input type="text"  name="menuUrl" value="${menuBean.menuUrl }" />
					</td>
                </tr>
               
                <tr>
                    <td>状态<span style="color:red">*</span>：</td>
                    <td>
						<c:if test="${menuBean.menuState==0 }">否</c:if>
						<c:if test="${menuBean.menuState==1 }">是</c:if>
					</td>
                </tr>
                <tr>
                    <td>备注：</td>
                    <td>
						<input type="text" readonly name="menuRemark" value="${menuBean.menuRemark }" />
					</td>
                </tr>
            </table>
        </div>
    </body>
</html>