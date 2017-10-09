<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<!DOCTYPE>
<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8" />

        <title>数据分析</title>

        <link href="css/mine.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是：数据分析 》》》职员数据综合报表</span>
              
            </span>
        </div>
        <div></div>
        <div class="div_search">
            <span>
                <form action="datamsg/year" method="get">
                   年度：
				   <select name="year">
						<option>
							--请选择---
						</option>
						<option value="2010">
							2010
						</option>
						<option value="2011">
							2011
						</option>
						<option value="2012">
							2012
						</option>
						<option value="2013">
							2013
						</option>
						<option value="2014">
							2014
						</option>
						<option value="2015">
							2015
						</option>
						<option value="2016">
							2016
						</option>
						<option value="2017">
							2017
						</option>
				   </select>
                    <input value="查询" type="submit" />
					
                </form>
            </span>
        </div>
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%" >
                <tbody>
					<tr style="font-weight: bold; background-color:#06F">
                        <td width="90px;" style="text-align:right; border-bottom:none">学历</td>
                        <td width="60px;" rowspan="2" valign="top">全部(人数)</td>						
                        <td width="60px;" rowspan="2" valign="top">博士(人数)</td>
                        <td width="60px;" rowspan="2" valign="top">硕士(人数)</td>
						<td width="60px;" rowspan="2" valign="top">本科(人数)</td>
                        <td width="60px;" rowspan="2" valign="top">专科(人数)</td>                       
                        
                    </tr>
					<tr style="font-weight: bold;background-color:#06F"">
                        <td  style="text-align:left; border-top:none">年度</td>
                       
                    </tr>
                    <c:forEach items="${l }" var="l">
                    <tr id="product1">
                       <td><a href="datamsg/year?year=${l.time}">${l.time }</td>
                        <td>${l.amount }</a></td>
						<td>${l.learned }</td>
						<td>${l.master }</td>
						<td>${l.regular }</td>
						 <td>${l.junior }</td>                   
                    </tr>
                    </c:forEach>
                    
                    
             <!--        <tr id="product1">
                        <td>2007年</td>
                        <td><a href="zilist.html">500</a></td>
						<td>50</td>
						<td>100</td>
						<td>300</td>
						 <td>50</td>
                    </tr> 
					 <tr id="product1">
                       <td>2008年</td>
                        <td><a href="zilist.html">600</a></td>
						<td>50</td>
						<td>200</td>
						<td>300</td>
						 <td>50</td>                   
                    </tr>
					
					 <tr id="product1">
                        <td>2009年</td>
                        <td><a href="">650</a></td>
						<td><a href="">50</a></td>
						<td><a href="">250</a></td>
						<td><a href="">300</a></td>
						 <td><a href="">50</a></td>                    
                    </tr>
					
					 <tr id="product1">
                        <td>2010年</td>
                        <td><a href="">700</a></td>
						<td><a href="">50</a></td>
						<td><a href="">250</a></td>
						<td><a href="">350</a></td>
						 <td><a href="">50</a></td>                 
                    </tr>
					<tr id="product1">
                        <td>2011年</td>
                        <td><a href="">800</a></td>
						<td><a href="">50</a></td>
						<td><a href="">250</a></td>
						<td><a href="">450</a></td>
						 <td><a href="">50</a></td>                 
                    </tr> -->
                   
                </tbody>
            </table>
        </div>
    </body>
</html>