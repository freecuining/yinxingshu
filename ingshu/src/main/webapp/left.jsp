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
<title>Insert title here</title>
<link href="css/admin.css" type="text/css" rel="stylesheet" />
<script language=javascript>
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
<body background=img/menu_bg.jpg>
	<table height="100%" cellspacing=0 cellpadding=0 width=170
		background=img/menu_bg.jpg border=0>
		<tr>
			<td valign=top align=middle>
				<table cellspacing=0 cellpadding=0 width="100%" border=0>
					<tr>
						<td height=10></td>
					</tr>
				</table> <c:forEach items="${sessionScope.ml }" var="m" varStatus="st">
					<c:if test="${m.parentMenu == 0 }">
						<table cellspacing=0 cellpadding=0 width=150 border=0>
							<tr height=22>
								<td style="padding-left: 30px" background=img/menu_bt.jpg>
									<a class=menuparent onclick="expand(${m.menuId})"
									href="javascript:void(0);">${m.menuName }</a>
								</td>
							</tr>
							<tr height=4>
								<td></td>
							</tr>
						</table>
					</c:if>

					<table id="child${m.menuId}" style="display: none" cellspacing=0 cellpadding=0
						width=150 border=0>
						<c:forEach items="${sessionScope.ml }" var="mm">
							<c:if test="${mm.parentMenu == m.menuId }">
								<tr height=20>
									<td align=middle width=30><img height=9
										src="img/menu_icon.gif" width=9></td>
									<td><a class=menuchild href="${mm.url }" target="right">${mm.menuName }</a>
									</td>
								</tr>
							</c:if>
						</c:forEach>
						<tr height=4>
							<td colspan=2></td>
						</tr>
					</table>



				</c:forEach> <!-- <table cellspacing=0 cellpadding=0 width=150 border=0>
					<tr height=22>
						<td style="padding-left: 30px" background=./img/menu_bt.jpg>
							<a class=menuparent onclick=expand(1) href="javascript:void(0);">个人信息</a>
						</td>
					</tr>
					<tr height=4>
						<td></td>
					</tr>
				</table>
				<table id=child1 style="display: none" cellspacing=0 cellpadding=0
					width=150 border=0>

					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="msg.html" target="right">个人信息修改</a>
						</td>
					</tr>
					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="password.html" target="right">密码修改</a>
						</td>
					</tr>

					<tr height=4>
						<td colspan=2></td>
					</tr>
				</table>

				<table cellspacing=0 cellpadding=0 width=150 border=0>
					<tr height=22>
						<td style="padding-left: 30px" background=./img/menu_bt.jpg>
							<a class=menuparent onclick=expand(2) href="javascript:void(0);">薪酬管理</a>
						</td>
					</tr>
					<tr height=4>
						<td></td>
					</tr>
				</table>

				<table id=child2 style="display: none" cellspacing=0 cellpadding=0
					width=150 border=0>

					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="pay/list_standard.html"
							target="right">薪酬标准管理</a></td>
					</tr>

					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="pay/list_standard_sp.html"
							target="right">薪酬标准审批</a></td>
					</tr>


					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="pay/list_payment.html"
							target="right">薪酬发放管理</a></td>
					</tr>

					<tr height=4>
						<td colspan=2></td>
					</tr>
				</table>

				<table cellspacing=0 cellpadding=0 width=150 border=0>
					<tr height=22>
						<td style="padding-left: 30px" background=./img/menu_bt.jpg>
							<a class=menuparent onclick=expand(3) href="javascript:void(0);">人事管理</a>
						</td>
					</tr>
					<tr height=4>
						<td></td>
					</tr>
				</table>

				<table id=child3 style="display: none" cellspacing=0 cellpadding=0
					width=150 border=0>
					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="pmag/demo1/list.html"
							target="right">人事档案管理</a></td>
					</tr>
					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="pmag/demo1/list2.html"
							target="right">人事档案审批</a></td>
					</tr>

					<tr height=4>
						<td colspan=2></td>
					</tr>
				</table>

				<table cellspacing=0 cellpadding=0 width=150 border=0>
					<tr height=22>
						<td style="padding-left: 30px" background=./img/menu_bt.jpg>
							<a class=menuparent onclick=expand(4) href="javascript:void(0);">招聘管理</a>
						</td>
					</tr>
					<tr height=4>
						<td></td>
					</tr>
				</table>

				<table id=child4 style="display: none" cellspacing=0 cellpadding=0
					width=150 border=0>
					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="zhaopin/demo1/list.html"
							target="right">职位发布管理</a></td>
					</tr>
					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="zhaopin/demo2/list.html"
							target="right">简历管理</a></td>
					</tr>
					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="zhaopin/demo3/list.html"
							target="right">面试管理</a></td>
					</tr>

					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="zhaopin/demo4/list.html"
							target="right">录用管理</a></td>
					</tr>

					<tr height=4>
						<td colspan=2></td>
					</tr>
				</table>


				<table cellspacing=0 cellpadding=0 width=150 border=0>
					<tr height=22>
						<td style="padding-left: 30px" background=./img/menu_bt.jpg>
							<a class=menuparent onclick=expand(5) href="javascript:void(0);">培训管理</a>
						</td>
					</tr>
					<tr height=4>
						<td></td>
					</tr>
				</table>

				<table id=child5 style="display: none" cellspacing=0 cellpadding=0
					width=150 border=0>
					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="peixun/peixunjihua/list.html"
							target=right>培训计划</a></td>
					</tr>
					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="peixun/peixunfuhe/list.html"
							target="right">培训复核</a></td>
					</tr>
					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="peixun/peixunfankui/list.html"
							target="right">培训考核与反馈</a></td>
					</tr>

					<tr height=4>
						<td colspan=2></td>
					</tr>
				</table>

				<table cellspacing=0 cellpadding=0 width=150 border=0>
					<tr height=22>
						<td style="padding-left: 30px" background=./img/menu_bt.jpg>
							<a class=menuparent onclick=expand(6) href="javascript:void(0);">数据分析</a>
						</td>
					</tr>
					<tr height=4>
						<td></td>
					</tr>
				</table>

				<table id=child6 style="display: none" cellspacing=0 cellpadding=0
					width=150 border=0>
					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="datamsg/demo1/list.html"
							target="right">职员明细表</a></td>
					</tr>
					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="datamsg/demo2/list.html"
							target="right">职员数据综合报表</a></td>
					</tr>
					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="datamsg/demo3/list.html"
							target="right">职员异动情况统计分析</a></td>
					</tr>
					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="datamsg/demo4/list.html"
							target="right">储备人才统计表</a></td>
					</tr>

					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="datamsg/demo5/list.html"
							target="right">公司各体系结构分析</a></td>
					</tr>

					<tr height=4>
						<td colspan=2></td>
					</tr>
				</table>


				<table cellspacing=0 cellpadding=0 width=150 border=0>
					<tr height=22>
						<td style="padding-left: 30px" background=./img/menu_bt.jpg>
							<a class=menuparent onclick=expand(7) href="javascript:void(0);">系统管理</a>
						</td>
					</tr>
					<tr height=4>
						<td></td>
					</tr>
				</table>

				<table id=child7 style="display: none" cellspacing=0 cellpadding=0
					width=150 border=0>
					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="resource/demo1/ifm.html"
							target="right">部门管理</a></td>
					</tr>
					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="user/list?pageNum=1"
							target="right">用户管理</a></td>
					</tr>
					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="role/list?pageNum=1"
							target="right">职位设置</a></td>
					</tr>

					<tr height=20>
						<td align=middle width=30><img height=9
							src="img/menu_icon.gif" width=9></td>
						<td><a class=menuchild href="resource/demo8/list.html"
							target="right">菜单管理</a></td>
					</tr>


					<tr height=4>
						<td colspan=2></td>
					</tr>
				</table> -->
			</td>
			<td width=1 bgcolor=#d1e6f7></td>
		</tr>
	</table>
</body>
</html>