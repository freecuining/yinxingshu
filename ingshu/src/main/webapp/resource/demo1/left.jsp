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
<link href="css/admin.css" type="text/css" rel="stylesheet" />

<link rel="StyleSheet" href="resource/demo1/dtree.css" type="text/css" />

<script type="text/javascript" src="resource/demo1/dtree.js"></script>

<script type="text/javascript">
	function expand(el) {
		childobj = document.getElementById("child" + el);

		if (childobj.style.display == 'none') {
			childobj.style.display = 'block';
		} else {
			childobj.style.display = 'none';
		}
		return;
	}
</script>
</head>
<body>
	<table height="100%" cellspacing=0 cellpadding=0 width=170 border=0>

		<tr>
			<td valign=top align=middle>


				<table cellspacing="0" cellpadding="0" width="100%" border="0">
					<tr>
						<td height=10></td>
					</tr>
				</table>

			</td>
			<td width=1 bgcolor=#d1e6f7></td>
		</tr>
		
	</table>
	<input type="hidden" id="deptcount" value="${deptCount }" />
	<script type="text/javascript">
		d = new dTree('d');
		d.config.target = "main_right";
		d.add(0, -1, '部门管理');
		<c:forEach items="${deptList}" var="dl">
			d.add("${dl.deptId}", 0, '${dl.deptName}', '${dl.deptUrl}');
		</c:forEach>
		document.write(d);
	</script>
</body>

</html>