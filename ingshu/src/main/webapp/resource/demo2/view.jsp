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

 <title>薪酬标准管理</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》系统管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="javascript:history.back()">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>
        <div style="font-size: 13px;margin: 10px 5px">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">用户编号：</td>
                    <td>
						${userBean.userCode }
					</td>
                </tr>
				<tr>
                    <td width="120px;">登录账号：</td>
                    <td>
						${userBean.loginName }
					</td>
                </tr>
                <tr>
                    <td>用户姓名：</td>
                    <td>
						${userBean.userName }
					</td>
                </tr>
                <tr>
                    <td>用户角色：</td>
                     <td>
						${userBean.roleBean.roleName }
					</td>
                </tr>
                <tr>
                    <td>所属部门：</td>
                     <td>
						${userBean.deptBean.deptName }
					</td>
                </tr>
				<tr>
                    <td>身份证：</td>
                    <td>
                        ${userBean.idCard }
                    </td>                
                </tr>
                <tr>
                    <td>联系电话：</td>
                     <td>
						${userBean.mobilePhone }
					</td>
                </tr>
				<tr>
                    <td>邮箱：</td>
                     <td>
						${userBean.userEmail }
					</td>               
                </tr>

				<tr>
                    <td>联系地址：</td>
                     <td>
						${userBean.address }
					</td>                
                </tr>
            </table>
        </div>
    </body>
</html>