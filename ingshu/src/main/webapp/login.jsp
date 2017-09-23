<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<title>Insert title here</title>
<link href="css/login.css" type="text/css" rel="stylesheet" />

</head>
<body id="userlogin_body">
	<form action="login" method="post">
		<div id="user_login">
			<dl>
				<dd id="user_top">
					<ul>
						<li class="user_top_l"></li>
						<li class="user_top_c"></li>
						<li class="user_top_r"></li>
					</ul>
				</dd>
				<dd id="user_main">
					<ul>
						<li class="user_main_l"></li>
						<li class="user_main_c">
							<div class="user_main_box">
								<ul>
									<li class="user_main_text">用户名：</li>
									<li class="user_main_input"><input name="loginName"
										maxlength="20" id="ln" class="txtusernamecssclass"></li>
									<li style="line-height: 16px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style="font-size: 12px;color:red;">${msg }</span></li>
								</ul>
								<ul>
									<li class="user_main_text">密 码：</li>
									<li class="user_main_input"><input type="password"
										name="password" id="ps" class="txtpasswordcssclass"></li>
									<li style="line-height: 16px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style="font-size: 12px;color:red;">${msg }</span></li>
								</ul>
								<ul>
									<li class="user_main_text">Cookie：</li>
									<li class="user_main_input"><select name="DropExpiration"
										id="DropExpiration">
											<option selected="" value="None">不保存</option>
											<option value="Day">保存一天</option>
											<option value="Month">保存一月</option>
											<option value="Year">保存一年</option>
									</select></li>
								</ul>
							</div>
						</li>
						<li class="user_main_r"><input type="image" name="IbtnEnter"
							src="img/user_botton.gif" class="ibtnentercssclass"></li>
					</ul>
				</dd>
				<dd id="user_bottom">
					<ul>
						<li class="user_bottom_l"></li>
						<li class="user_bottom_c"></li>
						<li class="user_bottom_r"></li>
					</ul>
				</dd>
			</dl>
		</div>
	</form>

</body>
</html>