<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*"
	isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>薪酬标准管理添加</title>
<base href="<%=basePath%>">
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<link href="css/mine.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-3.2.1.min.js">
</script>
<script type="text/javascript">
	function count() {
		var s = $("#c1").val() + "+" + $("#c2").val() + "+" + $("#c3").val()
				+ "+" + $("#c4").val() + "+" + $("#c5").val() + "+"
				+ $("#c6").val() + "+" + $("#c7").val() + "+" + $("#c8").val();
		//总金额
		$("#c9").val(eval(s));
	}
</script>
</head>

<body>

	<div class="div_head">
		<span> <span style="float: left">当前位置是：-》薪酬标准管理》添加</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none" href="javascript:void(0)"
				onclick="history.back()">【返回】</a>
		</span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<form action="bb/addSalary" method="post">
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">薪酬标准编号<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="salaryCode" value="${code+1}"
						readonly="readonly" /></td>
				</tr>
				<tr>
					<td>薪酬标准名称<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="name" value="" /></td>
				</tr>

				<tr>
					<td>制定人<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="maker" value="" /></td>
				</tr>
				<tr>
					<td>登记人<span style="color: red">*</span>：
					</td>
					<td><input type="text" readonly name="salaryRegister"
						value="${sessionScope.ub.userName}" /></td>
				</tr>
				<tr>
					<td>登记时间<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="registerTime"
						value='<fmt:formatDate value="<%=new Date()%>" pattern="yyyy-MM-dd HH:mm"/>'
						readonly="readonly" /></td>
				</tr>


				<tr>
					<td>基本工资<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="basePay" value="0"
						onkeyup="count()" id="c1" />元</td>
				</tr>

				<tr>
					<td>绩效奖金：</td>
					<td><input type="text" name="addPay" value="0" onkeyup="count()"
						id="c2" />元</td>
				</tr>

				<tr>
					<td>交通补助：</td>
					<td><input type="text" name="trafficPay" value="0"
						onkeyup="count()" id="c3" />元</td>
				</tr>

				<tr>
					<td>通讯补助：</td>
					<td><input type="text" name="phonePay" value="0"
						onkeyup="count()" id="c4" />元</td>
				</tr>

				<tr>
					<td>餐补：</td>
					<td><input type="text" name="footPay" value="0"
						onkeyup="count()" id="c5" />元</td>
				</tr>
				<tr>
					<td>住房补助：</td>
					<td><input type="text" name="housePay" value="0"
						onkeyup="count()" id="c6" />元</td>
				</tr>
				<tr>
					<td>出差补助：</td>
					<td><input type="text" name="awayPay" value="0"
						onkeyup="count()" id="c7" />元</td>
				</tr>
				<tr>
					<td>加班补助：</td>
					<td><input type="text" name="overTimePay" value="0"
						onkeyup="count()" id="c8" />元</td>
				</tr>

				<tr>
					<td>薪酬总额：</td>
					<td><input type="text" readonly name="salaryTotal" value="0"
						id="c9" />元</td>
				</tr>


				<tr>
					<td>备注：</td>
					<td><input type="text" name="salaryRemark" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="添加">
						<input type="reset" value="清空"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>