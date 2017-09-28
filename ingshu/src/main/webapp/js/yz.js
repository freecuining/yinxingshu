function checkUserName() {
	var name = document.getElementById("username");
	if (name.value == null || name.value == "") {
		document.getElementById("su").innerHTML = "用户名不能为空!";
		return false;
	} else {
		document.getElementById("su").innerHTML = "";
		return true;
	}
}
function checkLoginName() {
	var loginname = document.getElementById("loginname");
	// var regex = /^\w{6,16}$/;
	var regex = /^[a-zA-Z]{6,16}$/;
	if (loginname.value == null || loginname.value == "") {
		document.getElementById("sl").innerHTML = "账号不能为空!";
		return false;
	} else {
		if (!regex.test(loginname.value)) {
			document.getElementById("sl").innerHTML = "账号格式不正确!";
			return false;
		} else {
			var is = true;
			var xmlHttp = null;
			if (window.ActiveXObject) {// 判断是IE
				xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
			} else if (window.XMLHttpRequest) {// 是Mozilla
				xmlHttp = new XMLHttpRequest();
			}
			xmlHttp.open("post", "abc/UserServlet.do?method=onename&loginname="
					+ loginname.value, false);
			xmlHttp.onreadystatechange = function() {
				if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
					var result = xmlHttp.responseText;
					if (result == 0) {
						document.getElementById("sl").innerHTML = "账号已存在!";
						document.getElementById("sl").style.color = "red";
						is = false;
					} else {
						document.getElementById("sl").innerHTML = "账号可以使用!";
						document.getElementById("sl").style.color = "green";
					}
				}
			};
			xmlHttp.send(null);
			return is;
		}
	}
}
function checkPs() {
	var ps = document.getElementById("password");
	var regex = /^\w{6,16}$/;
	if (ps.value == null || ps.value == "") {
		document.getElementById("sp").innerHTML = "密码不能为空!";
		return false;
	} else {
		if (!regex.test(ps.value)) {
			document.getElementById("sp").innerHTML = "密码格式不正确!";
			return false;
		} else {
			document.getElementById("sp").innerHTML = "";
			return true;
		}
	}
}
function checkEquals() {
	var rps = document.getElementById("rpassword");
	var ps = document.getElementById("password");
	if (rps.value == null || rps.value == "") {
		document.getElementById("sr").innerHTML = "请确认密码!";
		return false;
	} else {
		if (rps.value != ps.value) {
			document.getElementById("sr").innerHTML = "两次输入的密码不一致!";
			return false;
		} else {
			document.getElementById("sr").innerHTML = "";
			return true;
		}
	}
}
function queren() {
	var is = confirm("确认添加?");
	if (is) {
		if (!checkUserName()) {

		} else if (!checkLoginName()) {

		} else if (!checkPs()) {

		} else if (!checkEquals()) {

		} else {
			document.getElementById("myForm").submit();
		}
	}
}