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

<title>用户管理</title>
<link href="css/mine.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-3.2.1.min.js">
</script>
<!-- 全选全不选 -->
<script type="text/javascript">
	function showDiv(){
		$("#userdiv1").css("display","display");
		$("#userdiv2").css("display","none");
	}
	function change(){
		if($("#isSelect").val()!=0){
			$("#userdiv1").hide();
			$("#userdiv2").toggle();
			
		}else{
			$("#userdiv1").toggle();
			$("#userdiv2").hide();
		}
	}
	
		$(function(){
			$("#deptId").change(function(){
				var deptId = $("#deptId").val();
				$.ajax({
					url:'cn/ajax',
					async:true,
					type:'get',
					dataType:'json',
					data:{
						'deptId':deptId
					},
					success:function(res){
						alert(res.roleName);
					}
				});
			});
		});
	
</script>
</head>
<body onload="showDiv()">
	<div class="div_head">
		<span> <span style="float: left">当前位置是：-》资源管理》用户管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none" href="javascript:history.back()">【返回】</a>
		</span>
		</span>
	</div>
	<div><table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">是否要选择档案<span style="color: red">*</span>：
					</td>
					<td>
					<select id="isSelect" onchange="change()">
							<option value="0">请选择</option>
						<c:forEach items="${archiveList }" var="archiveList">
							<option value="${archiveList.archiveId }">${archiveList.rsb.name }</option>
						</c:forEach>
					</select>
					</td>
				</tr>
			</table></div>
	<div style="font-size: 13px; margin: 10px 5px;" id="userdiv1" >
		<form action="" method="post" enctype="multipart/form-data">
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">用户编号<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="userCode" value="RS000101" /></td>
				</tr>
				<tr>
					<td>登录账号<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="loginName" value="" />
					</td>
				</tr>
				<tr>
					<td>用户姓名<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="userName" value="" /></td>
				</tr>
				<tr>
					<td>密码<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="password"
						value="" /></td>
				</tr>

				<tr>
					<td>所属部门<span style="color: red">*</span>：
					</td>
					<td><select name="deptId" id="deptId">
						<option value="999">请选择</option>
						<c:forEach items="${deptList }" var="deptList">
							<option value="${deptList.deptId }">${deptList.deptName }</option>
						</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>所属职位<span style="color: red">*</span>：
					</td>
					<td>
					<select name="roleId">
							<option value="999">请选择</option>
					<c:forEach items="${roleList }" var="roleList">
							<option value="${roleList.roleId }">${roleList.roleName }</option>
					</c:forEach>
					</select>
					</td>
				</tr>
				<tr>
					<td>身份证<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="idCard"
						value="" /></td>
				</tr>

				<tr>
					<td>联系电话<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="phone"
						value="" /></td>
				</tr>

				<tr>
					<td>邮箱<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="userEmail"
						value="" /></td>
				</tr>

				<tr>
					<td>联系地址：</td>
					<td><input type="text" name="address" value="" />
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="确认">
						<input type="reset" value="清空">
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div style="font-size: 13px; margin: 10px 5px;" id="userdiv2">
		<form action="" method="post" enctype="multipart/form-data">
			
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">用户编号<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="userCode" value="RS22222" /></td>
				</tr>
				<tr>
					<td>登录账号<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="loginName" value="" />
					</td>
				</tr>

				<tr>
					<td>用户姓名<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="userName" value="" /></td>
				</tr>
				<tr>
					<td>密码<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="password"
						value="" /></td>
				</tr>

				<tr>
					<td>所属部门<span style="color: red">*</span>：
					</td>
					<td><select name="deptId">
						<option value="999">请选择</option>
						<c:forEach items="${deptList }" var="deptList">
							<option value="${deptList.deptId }">${deptList.deptName }</option>
							
						</c:forEach>
					</select></td>
				</tr>

				<tr>
					<td>所属职位<span style="color: red">*</span>：
					</td>
					<td>
					<select name="roleId">
							<option value="999">请选择</option>
					<c:forEach items="${roleList }" var="roleList">
							<option value="${roleList.roleId }">${roleList.roleName }</option>
					</c:forEach>
					</select>
					</td>
				</tr>
				<tr>
					<td>身份证<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="idCard"
						value="" /></td>
				</tr>

				<tr>
					<td>联系电话<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="phone"
						value="" /></td>
				</tr>

				<tr>
					<td>邮箱<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="userEmail"
						value="" /></td>
				</tr>

				<tr>
					<td>联系地址：</td>
					<td><input type="text" name="address" value="" />
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="确认">
						<input type="reset" value="清空">
					</td>
				</tr>
			</table>
			
		</form>
	</div>
</body>
</html>