<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>薪酬标准管理添加</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
        
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》人事档案管理 -》添加档案</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="javascript:history.back()">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="../../ac/add" method="post" enctype="multipart/form-data">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">档案编码<span style="color:red">*</span>：</td>
                    <td><input type="text" name="archiveCode" value="" /></td>
                </tr>
                <tr>
                    <td>所属部门<span style="color:red">*</span>：</td>
                    <td>
                       <input type="text" name="" value="" /> 
                    </td>
                </tr>
               
                <tr>
                    <td>档案状态<span style="color:red">*</span>：</td>
                    <td>
						<select name="archiveState">
							<option>--请选择--</option>
							<option>试用期</option>
							<option>正式员工</option>
							<option>离职</option>
							<option>实习员工</option>
						</select>
					</td>
                </tr>
                <tr>
                    <td>职位名称<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" readonly name="" value="" />
					</td>
                </tr>
                <tr>
                    <td>职位编码<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="" readonly value="" />
                    </td>
                </tr>


				<tr>
                    <td>姓名<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name=""  value=""/>
                    </td>                
                </tr>

				<tr>
                    <td>性别<span style="color:red">*</span>：</td>
                    <td>
                       <input type="radio" checked value="0"/>男 <input type="radio" value="1"/>女
                    </td>                
                </tr>

				<tr>
                    <td>EMAIL<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="" value=""/>
                    </td>                
                </tr>

				<tr>
                    <td>联系电话<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="" value="" />
                    </td>                
                </tr>

				<tr>
                    <td>住址<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="" value="" />
                    </td>                
                </tr>
				<tr>
                    <td>身份证号<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="" value="" />
                    </td>                
                </tr>
				<tr>
                    <td>户口所在地：</td>
                    <td>
                        <input type="text" name="" value="" />
                    </td>                
                </tr>
				<tr>
                    <td>政治面貌：</td>
                    <td>
                        <input type="text" name="" value=""/>
                    </td>                
                </tr>	

				<tr>
                    <td>毕业院校<span style="color:red">*</span>：</td>
                    <td>
						 <input type="text" readonly name="" value="" />
                    </td>
                </tr>


				<tr>
                    <td>专业<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="" value=""/>
                    </td>                
                </tr>
				<tr>
                    <td>学历<span style="color:red">*</span>：</td>
                    <td>
                        <select>
							<option>--请选择--</option>
							<option>专科</option>
							<option>本科</option>
							<option selected>硕士</option>
							<option>博士</option>
						</select>
                    </td>                
                </tr>
				<tr>
                    <td>薪酬标准<span style="color:red">*</span>：</td>
                    <td>
                        <select>
							<option>--请选择--</option>
							<option>高级软件工程师</option>
							<option>中级软件工程师</option>
							<option selected>初级软件工程师</option>
						</select>
                    </td>                
                </tr>
				<tr>
                    <td>开户行：</td>
                    <td>
                        <input type="text" name="" value=""/>
                    </td>                
                </tr>
				<tr>
                    <td>银行卡号：</td>
                    <td>
                        <input type="text" name="" value="63304578623159"/>
                    </td>                
                </tr>
				<tr>
                    <td>社保卡号：</td>
                    <td>
                        <input type="text" name="" value="63304578623159"/>
                    </td>                
                </tr>
				<tr>
                    <td>登记人：</td>
                    <td>
                        <input type="text" readonly name="" value="" />
                    </td>                
                </tr>
				<tr>
                    <td>建档时间：</td>
                    <td>
                        <input type="text" readonly name="" value=""/>
                    </td>                
                </tr>
				<tr>
                    <td>个人履历：</td>
                    <td>
                        <textarea></textarea>
                    </td>                
                </tr>
				<tr>
                    <td>家庭关系信息：</td>
                    <td>
                        <textarea></textarea>
                    </td>                
                </tr>
				<tr>
                    <td>备注：</td>
                    <td>
                        <textarea></textarea>
                    </td>                
                </tr>
				<tr>
                    <td>简历附件：</td>
                    <td>
                        <input type="file" name="" value=""/>
                    </td>                
                </tr>
				
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="添加"/>
						<input type="reset" value="清空"/>
                    </td>
                </tr>  
            </table>
            </form>
        </div>
    </body>
</html>