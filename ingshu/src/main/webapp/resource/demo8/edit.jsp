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
            <form action="cn/updateMenu" method="post" enctype="multipart/form-data">
            <input type="hidden" name="menuId" value="${menuBean.menuId }"/>
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">菜单名称<span style="color:red">*</span>：</td>
                    <td><input type="text" name="menuName" value="${menuBean.menuName }" /></td>
                </tr>
                <tr>
                    <td>上级菜单<span style="color:red">*</span>：</td>
                    <td>
                       <select name="parentMenu">
						<option value="0">顶级菜单</option>
						<c:forEach items="${menuList }" var="menuListTwo">
						<option value="${menuListTwo.menuId }">${menuListTwo.menuName }</option>
						</c:forEach>
					   </select>
                    </td>
                </tr>
				  <tr>
                    <td>URL<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" readonly name="menuUrl" value="${menuBean.menuUrl }" />
					</td>
                </tr>
               
                <tr>
                    <td>状态<span style="color:red">*</span>：</td>
                    <td>
						 <select name="menuState">
							<option value="1" <c:if test="${menuBean.menuState==1 }">selected</c:if>>启用</option>
							<option value="0" <c:if test="${menuBean.menuState==0 }">selected</c:if>>禁用</option>						
						 </select>
					</td>
                </tr>
                <tr>
                    <td>备注：</td>
                    <td>
						<input type="text"  name="menuRemark" value="" />
					</td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="确认">
						<input type="reset" value="清空">
                    </td>
                </tr>  
            </table>
            </form>
        </div>
    </body>
</html>