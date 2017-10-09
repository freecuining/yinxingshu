<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">

<!DOCTYPE HTML >
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />

<title>数据分析</title>

<link href="css/mine.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
   function qingkong(){
	   window.location.href="datamsg/dilopma?pageNum=1&query=query";
   }
</script>
<script type="text/javascript">
			function checkTime() {
				var st = document.getElementById("st");
				var et = document.getElementById("et");
				if (st.value != null && st.value != "" && et.value != null
						&& et.value != "") {
					if (st.value > et.value) {
						st.value = "";
						et.value = "";
						alert("请输入正确的时间!");
					}
				}
			}
		</script>
</head>
<body>
	<style>
.tr_color {
	background-color: #9F88FF
}
</style>
	<div class="div_head">
		<span> <span style="float: left;">当前位置是：数据分析 ---》职员明细表</span> <span
			style="float: right; margin-right: 8px; font-weight: bold;"> </span>
		</span>
	</div>
	<div></div>
	<div class="div_search">
		<span>
			<form action="datamsg/dilopma" method="get">
			<input type="hidden" value="1" name="pageNum">
			
				部门: <select name="deptId">
				    <c:if test="${db.deptId!=null&&db.deptId!=999 }">
					<option value="999">--请选择---</option>
					<c:forEach items="${l }" var="l">
					<c:if test="${l.deptId == db.deptId }" >
					  <option value="${l.deptId }"  selected="selected">${l.deptName }</option>
					</c:if>
					<c:if test="${l.deptId == db.deptId }" >
					  <option value="${l.deptId }">${l.deptName }</option>
					</c:if>
					</c:forEach>
					</c:if>
					
					
					
					<c:if test="${db.deptId==null||db.deptId==999 }">
					<option value="999">--请选择---</option>
					<c:forEach items="${l }" var="l">
					  <option value="${l.deptId }">${l.deptName }</option>
					</c:forEach>
					</c:if>
					<!-- <option>平台研发中心</option>
					<option>人力资源中心</option>
					<option>财务部</option> -->
				</select>
				 员工姓名： <input type="text" name="userName" value="${db.userName }"/> 
	                   档案状态： <select name="archiveState">
	                   <c:if test="${db.archiveState==0 }">
					<option value="999">--请选择---</option>
					<option value="0" selected="selected">试用期</option>
					<option value="1">正式员工</option>
					<option value="2">离职</option>
					<option value="3">已删除</option>
					</c:if>
					<c:if test="${db.archiveState==1 }">
					<option value="999">--请选择---</option>
					<option value="0" >试用期</option>
					<option value="1" selected="selected">正式员工</option>
					<option value="2">离职</option>
					<option value="3">已删除</option>
					</c:if>
					<c:if test="${db.archiveState==2 }">
					<option value="999">--请选择---</option>
					<option value="0" >试用期</option>
					<option value="1" >正式员工</option>
					<option value="2" selected="selected">离职</option>
					<option value="3">已删除</option>
					</c:if>
					<c:if test="${db.archiveState==3 }">
					<option value="999">--请选择---</option>
					<option value="0" >试用期</option>
					<option value="1" >正式员工</option>
					<option value="2">离职</option>
					<option value="3" selected="selected" >已删除</option>
					</c:if>
					<c:if test="${db.archiveState==null||db.archiveState==''||db.archiveState==999}">
					<option value="999">--请选择---</option>
					<option value="0" >试用期</option>
					<option value="1" >正式员工</option>
					<option value="2">离职</option>
					<option value="3"  >已删除</option>
					</c:if>
					

				</select> 建档时间: 
				<input type="text" id="st" onclick="WdatePicker()" onchange="checkTime()" name="oneTime" value="${db.oneTime }" /> 至 
				<input type="text" id="et" onclick="WdatePicker()" onchange="checkTime()" name="stateTime" value="${db.stateTime }" />
				 <input value="查询" type="submit" />
				 <input value="清空" type="button" onclick="qingkong()">

			</form>
		</span>
	</div>
	<div style="font-size: 13px; margin: 10px 5px;">
		<table class="table_a" border="1" width="100%">
			<tbody>
				<tr style="font-weight: bold;">
					<td width="110px;">部门</td>
					<td width="140px;">档案编号</td>
					<td width="80px;">员工姓名</td>
					<td width="80px;">性别</td>
					<td width="100px;">职位</td>
					<td width="120px;">职称</td>
					<td width="100px;">电话</td>
					<td width="120px;">档案状态</td>
					<td width="120px;">建档日期</td>
				</tr>
				<c:forEach items="${list }" var="list">
					<tr id="product1">
						<td>${list.deptName }</td>
						<td>${list.archiveCode }</td>
						<td>${list.userName }</td>
						<td>
						  <c:if test="${list.sex==0 }">男</c:if>
						   <c:if test="${list.sex==1 }">女</c:if>
						</td>
						<td>${list.roleName }</td>
						<td>${list.salaryName }</td>
						<td>${list.mobilePhone }</td>
						<td>
						  <c:if test="${list.archiveState==0 }">试用期</c:if>
						  <c:if test="${list.archiveState==1 }">正式员工</c:if>
						  <c:if test="${list.archiveState==2 }">离职</c:if>
						  <c:if test="${list.archiveState==3 }">已删除</c:if>
						</td>
						<td>${list.archivetime }</td>
					</tr>
				</c:forEach>
				<!--   <tr id="product1">
                          <td rowspan="3" >产品设计中心</td>
						  <td >DBQN000001</td>
						  <td >张华</td>
						  <td >男</td>
						  <td >技术培训师</td>
						  <td >高级软件开发工程师</td>
						 <td >13623452345</td>
						 <td >试用期</td>
						 <td >2013-12-09</td>
                    </tr> 
					 <tr id="product1">
                          
						  <td >DBQN000002</td>
						  <td >王晓庆</td>
						  <td >女</td>
						  <td >技术培训师</td>
						  <td >初级软件开发工程师</td>
						 <td >13623452345</td>
						 <td >正式员工</td>
						 <td >2013-12-09</td>            
                    </tr>
					
					 <tr id="product1">
                          
						  <td >DBQN000003</td>
						  <td >刘湖南</td>
						  <td >男</td>
						  <td >产品培训师</td>
						  <td >高级软件开发工程师</td>
						 <td >13623452345</td>
						 <td >正式员工</td>
						 <td >2013-12-09</td>              
                    </tr>
					
					 <tr id="product1">
                           <td  >平台研发中心</td>
						  <td >DBQN000004</td>
						  <td >黎去去</td>
						  <td >女</td>
						  <td >技术培训师</td>
						  <td >高级软件开发工程师</td>
						 <td >13623452345</td>
						 <td >试用期</td>
						 <td >2013-12-09</td>           
                    </tr> -->

			<tr>
					<td colspan="20" style="text-align: center;"><a
						href="datamsg/dilopma?pageNum=1">首页</a> <c:choose>
							<c:when test="${page.pageNum == page.firstPage}">上一页</c:when>
							<c:otherwise>
								<a href="datamsg/dilopma?pageNum=${page.pageNum-1}">上一页</a>
							</c:otherwise>
						</c:choose> <c:if
							test="${page.navigatepageNums[page.navigateFirstPage-1] != 1 }">...</c:if>
						<c:forEach items="${page.navigatepageNums}" var="pNum">
								${pNum }
							</c:forEach> 
							<c:if test="${page.lastPage >= 5 }">
							   <c:if
								       test="${page.navigatepageNums[page.navigateLastPage-1] != page.total }">...</c:if>
						    </c:if> 
						    <c:choose>
							<c:when test="${page.pageNum == page.lastPage}">下一页</c:when>
							<c:otherwise>
								<a href="datamsg/dilopma?pageNum=${page.pageNum+1}">下一页</a>
							</c:otherwise>
						</c:choose> <c:if test="${page.pageNum == page.lastPage}">尾页</c:if> <c:if
							test="${page.pageNum != page.total}">
							<a href="datamsg/dilopma?pageNum=${page.lastPage}">尾页</a>
						</c:if> 共${page.total}条记录，当前显示第${page.pageNum}页 ，总共${page.lastPage}页</td>
				</tr>


				<%--  <tr>
                        <td colspan="20" style="text-align: center;">	
                        <c:forEach begin="1" end="${info.getPages() }" var="in" >
                            <a style="text-decoration: none;" href="#">${in }</a>	
                        </c:forEach>				
						<!-- <a style="text-decoration: none;" href="#">
                            首页 上一页  ... 7 8 9 10 11 12 ... 下一页 尾页 共1234条 每页显示 10/23 </a> -->
                        </td>
                    </tr> --%>
			</tbody>
		</table>
	</div>
</body>
</html>
