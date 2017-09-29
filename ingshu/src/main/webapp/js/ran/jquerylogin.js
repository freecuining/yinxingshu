$(function(){
	$("#ln").blur(function(){
		if(!$(this).val || !$(this).val.macth(/([w]){2,15}$/))
			{
			$("#ll").html("密码不能为空且只能为英文或数字");
			}
		else{
			$("#ll").html("输入正确");
		}
		
	});
	
	$("#ps").blur(function(){
		if(!$(this).val || !$(this).val.macth(/([w]){2,15}$/))
			{
			$("#lp").html("密码不能为空且只能为英文或数字");
			}
		else{
			$("#lp").html("输入正确 ");
		}
	})
	
})