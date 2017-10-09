<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body><title>薪酬标准管理添加</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》人事管理 -》人事档案管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="javascript:history.back()">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="./admin.php?c=goods&a=add" method="post" enctype="multipart/form-data">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">档案编码<span style="color:red">*</span>：</td>
                    <td><input type="text"  value="${an.archiveCode}" readonly /></td>
                </tr>
                <tr>
                     
                    <td>所属部门<span style="color:red">*</span>：</td>
                    <td>
                    
                    </td>
                    
                </tr>
               
                <tr>
                   <td>档案状态<span style="color:red">*</span>：</td>
                    <td>
					
					</td>
					
                </tr>
                <tr>
                    <td>职位名称<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" value="${an.rb.roleName }">
					</td>
                </tr>
                <tr>
                    <td>职位编码<span style="color:red">*</span>：</td>
                    <td>
                     
                    </td>
                </tr>


				<tr>
                    <td>姓名<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text"  readonly value="${an.ub.userName }"/>
                    </td>                
                </tr>

				<tr>
                    <td>性别：</td>
                    <td>
                     <c:choose>
                     <c:when test="${an.ub.sex == 0 }">男</c:when>
                     </c:choose>
                     <c:choose>
                     <c:when test="${an.ub.sex == 1 }">女</c:when>
                     </c:choose>
                    </td>                
                </tr>

				<tr>
                    <td>EMAIL：</td>
                    <td>
                        <input type="text"  readonly value="${an.rsb.resume_Email }"/>
                    </td>                
                </tr>

				<tr>
                    <td>联系电话：</td>
                    <td>
                        <input type="text"  readonly value="${an.rsb.resume_Phone}" />
                    </td>                
                </tr>

				<tr>
                    <td>住址：</td>
                    <td>
                       
                    </td>                
                </tr>
				<tr>
                    <td>身份证号：</td>
                    <td>
                        <input type="text" readonly value="${an.rsb.card_Id}" />
                    </td>                
                </tr>
				<tr>
                    <td>户口所在地：</td>
                    <td>
                        <input type="text"  readonly value="${an.rsb.local_Address }" />
                    </td>                
                </tr>
				<tr>
                    <td>政治面貌：</td>
                    <td>
                        <input type="text" readonly value="${an.rsb.major }"/>
                    </td>                
                </tr>	

				<tr>
                    <td>毕业院校：</td>
                    <td>
						 <input type="text" readonly value="${an.rsb.graduate_school }" />
                    </td>
                </tr>


				<tr>
                    <td>专业：</td>
                    <td>
                        <input type="text"  readonly value="${an.rsb.political }"/>
                    </td>                
                </tr>
				<tr>
                    <td>学历：</td>
                    <td><input type="text"  readonly value="${an.rsb.education }"/>
                    </td>                
                </tr>
				<tr>
                    <td>薪酬标准：</td>
                    <td>
                      <input type="text" value="${an.rsb.major }">
                    </td>                
                </tr>
				<tr>
                    <td>开户行：</td>
                    <td>
                        <input type="text"  readonly value="${an.bank }"/>
                    </td>                
                </tr>
				<tr>
                    <td>银行卡号：</td>
                    <td>
                        <input type="text"  readonly value="${an.bankCard }"/>
                    </td>                
                </tr>
				<tr>
                    <td>社保卡号：</td>
                    <td>
                        <input type="text"  readonly value="${an.socialCard }"/>
                    </td>                
                </tr>
				<tr>
                    <td>登记人：</td>
                    <td>
                        <input type="text"  readonly value="hanlu"/>
                    </td>                
                </tr>
				<tr>
                    <td>建档时间：</td>
                    <td>
                        <input type="text"  readonly value="${an.positiveTime }"/>
                    </td>                
                </tr>
				<tr>
                    <td>个人履历：</td>
                    <td>
                        <textarea readonly></textarea>
                    </td>                
                </tr>
				<tr>
                    <td>家庭关系信息：</td>
                    <td>
                        <textarea readonly></textarea>
                    </td>                
                </tr>
				
				<tr>
                    <td>简历附件：</td>
                    <td>
                        <a href="">张华个人简历.doc</a>
                    </td>                
                </tr>
				
               
            </table>
            </form>
        </div>
    </body>

</html>