<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE >
<html>
    <head>
        <title>薪酬标准管理</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="../../css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》薪酬标准管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="list.html">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="./admin.php?c=goods&a=add" method="post" enctype="multipart/form-data">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">薪酬标准编号：</td>
                    <td>
						a1001
					</td>
                </tr>
                <tr>
                    <td>薪酬标准名称：</td>
                    <td>
						高级开发工程师
					</td>
                </tr>
                <tr>
                    <td>薪酬总额：</td>
                     <td>
						15000 元
					</td>
                </tr>
                <tr>
                    <td>制定人：</td>
                     <td>
						张XX
					</td>
                </tr>
                <tr>
                    <td>登记人：</td>
                     <td>
						张XX
					</td>
                </tr>
                <tr>
                    <td>登记时间：</td>
                     <td>
						2015-10-29
					</td>
                </tr>


				<tr>
                    <td>基本工资：</td>
                     <td>
						12000 元
					</td>               
                </tr>

				<tr>
                    <td>绩效奖金：</td>
                     <td>
						1000 元
					</td>                
                </tr>

				<tr>
                    <td>交通补助：</td>
                    <td>
                        100 元
                    </td>                
                </tr>

				<tr>
                    <td>通讯补助：</td>
                    <td>
                       100 元
                    </td>                
                </tr>

				<tr>
                    <td>餐补：</td>
                    <td>
                        350 元
                    </td>                
                </tr>
				<tr>
                    <td>住房补助：</td>
                    <td>
                       300 元
                    </td>                
                </tr>
				<tr>
                    <td>出差补助：</td>
                    <td> 
                       1000 元
                    </td>                
                </tr>
				<tr>
                    <td>加班补助：</td>
                    <td>
                        150 元
                    </td>                
                </tr>	
				<tr>
                    <td>备注：</td>
                    <td>
                       基本工资+补助
                    </td>                
                </tr>
            </table>
            </form>
        </div>
    </body>
</html>