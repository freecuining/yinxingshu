$(function() {
	$("#bt").click(function() {
		var is = confirm("确认提交么?");
		if (is) {
			$("#myForm").submit();
		}
	});
});

var result;
$(function(){
	result = $("#myForm").validate({
		rules :{
			"username":{
				required :true
			},
			"loginname":{
				required:true,
				loginName:true,
				remote : {//异步验证 ajax
					url : "abc/UserServlet.do",
					type : "post",
					dataType : "json",
					data : {
						"method" : "onename",
						"loginname":function(){
							return $("#loginname").val();
						}
					},
				}
			},
			"password" :{
			    required : true,
			    psw:true
			},
			"rpassword" :{
				required : true,
				equalTo :$("#password")
			},
			"idcard" :{
				required : true,
			    rangelength : [15,18]
			},
			"remark" :{
				required :true,
				rangelength:[1,100]
			}
		},
		messages : {
			"username" : {
				required : "用户名不能为空!"
			},
			"loginname" : {
				required : "账号不能为空！",
				loginName : "账号格式不正确！",
				remote : "该账号已注册!"
			},
			"password" :{
				required :"密码不能为空！",
				psw :"密码格式不正确"
			},
			"rpassword" :{
				required :"请确认密码！",
				equalTo:"两次密码输入的不一致!"
			},
			"idcard" :{
				required : "身份证不能为空！",
				rangelength : "请输入{0}或{1}位身份证号!"
			},
			"remark" :{
				required :"请输入备注信息!",
				rangelength : "请输入{0}到{1}个文字!"
			}
		},
		errorPlacement : function(error, element) { // 指定错误信息位置
			element.nextAll("span").html(error.text());
		},
		success : function(label) {
			label.html();
		}
	});
});