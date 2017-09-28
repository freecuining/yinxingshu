<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="../../css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》培训管理 -》修改培训计划</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="javascript:history.back();">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="Ain/updateAin.do" method="post" enctype="multipart/form-data">
            <input type="hidden" name="traId" value="${train.traId}">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">培训名称<span style="color:red">*</span>：</td>
                    <td><input type="text" readonly name="traName" value="${train.traName}" /></td>
                </tr>
                <tr>
                    <td>培训讲师<span style="color:red">*</span>：</td>
                    <td>
                       <input type="text" readonly name="traTeacher" value="${train.traTeacher}" /> 
                    </td>
                </tr>
               
                <tr>
                    <td>培训时间<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" readonly name="traStartTime" value="${train.traStartTime}" /></td>
                </tr>
                <tr>
                    <td>至</td>
                    <td>
						<input type="text"  readonly name="traEddTime" value="${train.traEddTime}" />
					</td>
                </tr>
                <tr>
                    <td>培训目的<span style="color:red">*</span>：</td>
                   <td>
                       <input type="text" readonly name="traRequired" value="${train.traRequired}" /> 
                    </td>
                </tr>


				 <tr>
                    <td>参训人员<span style="color:red">*</span>：</td>
                   <td>
                       <input type="text" readonly name="attribute_141" value="${train.attribute_141}" /> 
                    </td>
                </tr>

				<tr>
                    <td>培训简介：</td>
                    <td>
                       <input type="text" readonly  name="traIntro" value="${train.traIntro}" /> 
                    </td>               
                </tr>

				<tr>
                    <td>培训资料：</td>
                    <td>
                        <input type="file" readonly name="traResouce" value="${train.traResouce}"/>
                    </td>                
                </tr>

				<tr>
                    <td></td>
                                
               
            </table>
            </form>
        </div>
    </body>
</html>