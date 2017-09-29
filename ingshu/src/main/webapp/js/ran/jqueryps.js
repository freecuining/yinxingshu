var result;
$(function() {
	result = $("#myForm").validate({
		rules : {
			"password1" : {
				required : true,
				equalTo : $("#ppp")
			},
			"password" : {
				required : true,
				maxlength : 20,
				minlength : 8
			},
			"rpassword" : {
				required : true,
				equalTo : $("#newps")
			}

		}, // 验证规则
		messages : {
			"password1" : {
				required : "密码不能为空!",
				equalTo : "请输入正确的密码!"
			},
			"password" : {
				required : "请输入新密码!",
				maxlength : "请输入8-20位密码!",
				minlength : "请输入8-20位密码!"
			},
			"rpassword" : {
				required : "请确认密码!",
				equalTo : "两次密码输入不一致!"
			}

		}, // 提示信息
		errorPlacement : function(error, element) { // 提示信息的位置
			element.next().html(error.text());
		},
		success : function(label) {
			label.html();
		}
	});
});