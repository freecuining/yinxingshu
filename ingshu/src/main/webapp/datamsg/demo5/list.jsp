<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE>
<html>

<head>
<base href="<%=basePath%>">
<head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8" />

        <title>数据分析</title>

        <link href="../../css/mine.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是数据分析》》》公司各体系结构分析</span>
                
            </span>
        </div>
        
        
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="80%">
                <tbody>
                <tr style="font-weight: bold;">
                        <td>
                        <table width="100%">
                        	<tr>
                            	<td width="100%" style="text-align:right">异动类型</td>
                            </tr>
                            <tr>
                            	<td style=" text-align:left">时间</td>
                            </tr>
                           </table>
                        </td>
                        <td>管理体系--高层</td>
                        <td>管理体系--底层</td>
                        <td>业务体系</td>
                        <td>职能体系</td>
                        <td>技术体系</td>
                    </tr>

                    <tr id="product1">
                       <td><a href="">2007年</a></td>
                       <td></td>
                       <td></td>
                       <td></td> 
                       <td></td>
                       <td></td>              
                    </tr> 
					
                </tbody>
            </table>
        </div>
    </body>
</html>