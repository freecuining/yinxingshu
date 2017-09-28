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

<title>职位管理</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》职位管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="javascript:history.back()">【返回】</a>
                </span>f
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="" method="post" enctype="multipart/form-data">
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">职位编码<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="roleCode" value="" readonly="readonly" /></td>
				</tr>
				<tr>
					<td>职位名称<span style="color: red">*</span>：
					</td>
					<td>
					<input type="text" name="roleName" value=""/>
					</td>
				</tr>
				<tr>
					<td>职位分类<span style="color: red">*</span>：
					</td>
					<td><select name="roleKind">
							<option value="0" >管理</option>
							<option value="1"
								<c:if test="${roleBean.roleKind == 1 }">selected</c:if>>技术</option>
							<option value="2"
								<c:if test="${roleBean.roleKind == 2 }">selected</c:if>>职能</option>
							<option value="3"
								<c:if test="${roleBean.roleKind == 3 }">selected</c:if>>业务</option>
					</select></td>
				</tr>
				<tr>
					<td>所属部门<span style="color: red">*</span>：
					</td>
					<td>
						<select name="deptId">
							<c:forEach items="${deptList }" var="deptList">
								<option value="${deptList.deptId }">${deptList.deptName }</option>
							</c:forEach>
						</select>
					</td>
				</tr>

				<tr>
					<td>菜单权限<span style="color: red">*</span>：
					</td>
					<td>
					<c:forEach items="${menuList }" var="menuList">
					<c:if test="${menuList.parentMenu == 0 }">
					<input type="checkbox" name="menuId" value="${menuList.menuId }" <c:if test="${menuList.menuId == 1 }">checked</c:if>/>
					${menuList.menuName }<br>
					</c:if>
						<c:if test="${menuList.parentMenu != 0 }">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="menuId" value="${menuList.menuId }" <c:if test="${menuList.menuId == 2 || menuList.menuId == 3 }">checked</c:if> />
							${menuList.menuName }<br>
						</c:if>
					</c:forEach>
					</td>
				</tr>
				<tr>
					<td>职位描述<span style="color: red">*</span>：
					</td>
					<td><textarea name="roleIntro"></textarea></td>
				</tr>

				<tr>
					<td>备 注：</td>
					<td><textarea name="roleRemark"></textarea></td>
				</tr>
				<tr>
					<td>是否启用：</td>
					<td><select name="roleState">
							<option value="0" >是</option>
							<option value="1" >否</option>
					</select></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="确定">
						<input type="reset" value="重置"></td>
				</tr>
			</table>
            </form>
        </div>
    </body>
</html>