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
        <link href="css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》职位管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="javascript:history.back()">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">职位编码：</td>
                    <td>
					${roleBean.roleCode }
					</td>
                </tr>
                <tr>
                    <td>职位名称：</td>
                    <td>
						${roleBean.roleName }
					</td>
                </tr>
                <tr>
                    <td>职位分类：</td>
                     <td>
						${roleBean.roleKind }
					</td>
                </tr>
                <tr>
                    <td>所属部门：</td>
                     <td>
						${roleBean.deptName }
					</td>
                </tr>
                <tr>
                    <td>职位描述：</td>
                     <td>
						${roleBean.roleIntro }
					</td>
                </tr>
                <tr>
                    <td>备  注：</td>
                     <td>
						${roleBean.roleRemark }
					</td>
                </tr>


				<tr>
                    <td>是否启用：</td>
                    <c:if test="${roleBean.roleState==0 }">
                     <td>
						否
					</td>
					</c:if>  
					 <c:if test="${roleBean.roleState==1 }">
                     <td>
						是
					</td>
					</c:if>            
                </tr>

				
            </table>
        </div>
    </body>
</html>