<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="../../css/mine.css" type="text/css" rel="stylesheet">
      
    <script type="text/javascript">
  /* //验证表单
	 function gos(){
		if(tbName()&&tbTeacher()&&tbTime()&&tbC()&&tbPema&&tbTrainer()&&tbIntro()&&tbDownload()){
			return true;
		}else{
			return false;
		}
	}
	//验证培训名称	
		function tbName(){
			var tbName=document.getElementById("tbName");
			var message1=document.getElementById("message1");
			
			if(tbName==null||tbName==""||tbName.value.length==0){
				message1.style.color="red";
				message1.innerHTML="此项不能为空！";
				return false;
			}else{
				message1.style.color="green";
				message1.innerHTML="*";
				return true;
			}
		}
//验证培训讲师
    function tbTeacher(){
			var tbTeacher=document.getElementById("tbTeacher");
			var message1=document.getElementById("message2");
			
			if(tbTeacher==null||tbTeacher==""||tbTeacher.value.length==0){
				message2.style.color="red";
				message2.innerHTML="此项不能为空！";
				return false;
			}else{
				message2.style.color="green";
				message2.innerHTML="*";
				return true;
			}
		}
    //验证时间
    function tbTime(){
			var tbTime=document.getElementById("tbTime");
			var message3=document.getElementById("message3");
			
			if(tbTime==null||tbTime==""||tbTime.value.length==0){
				message3.style.color="red";
				message3.innerHTML="此项不能为空！";
				return false;
			}else{
				message3.style.color="green";
				message3.innerHTML="*";
				return true;
			}
		}
    //验证时间2
    function tbC(){
			var tbC=document.getElementById("tbC");
			var message1=document.getElementById("message4");
			
			if(tbC==null||tbC==""||tbC.value.length==0){
				message4.style.color="red";
				message4.innerHTML="此项不能为空！";
				return false;
			}else{
				message4.style.color="green";
				message4.innerHTML="*";
				return true;
			}
		}
    //验证目的
    function tbPema(){
			var tbPema=document.getElementById("tbPema");
			var message5=document.getElementById("message5");
			
			if(tbPema==null||tbPema==""||tbPema.value.length==0){
				message5.style.color="red";
				message5.innerHTML="此项不能为空！";
				return false;
			}else{
				message5.style.color="green";
				message5.innerHTML="*";
				return true;
			}
		}
    //验证参训人员
    function tbTrainer(){
			var tbTrainer=document.getElementById("tbTrainer");
			var message6=document.getElementById("message6");
			
			if(tbTrainer==null||tbTrainer==""||tbTrainer.value.length==0){
				message6.style.color="red";
				message6.innerHTML="此项不能为空！";
				return false;
			}else{
				message6.style.color="green";
				message6.innerHTML="*";
				return true;
			}
		}
    //验证简介
    function tbIntro(){
			var tbIntro=document.getElementById("tbIntro");
			var message7=document.getElementById("message7");
			
			if(tbIntro==null||tbIntro==""||tbIntro.value.length==0){
				message7.style.color="red";
				message7.innerHTML="此项不能为空！";
				return false;
			}else{
				message7.style.color="green";
				message7.innerHTML="*";
				return true;
			}
		}
    //验证资料
    function tbDownload(){
			var tbDownload=document.getElementById("tbDownload");
			var message8=document.getElementById("message8");
			
			if(tbDownload==null||tbDownload==""||tbDownload.value.length==0){
				message8.style.color="red";
				message8.innerHTML="此项不能为空！";
				return false;
			}else{
				message8.style.color="green";
				message8.innerHTML="*";
				return true;
			}
		} */
    </script>
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》培训管理 -》增加培训计划</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="javascript:history.back();">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="Ain/insertAin.do" method="post" onsubmit="return gos();">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">培训名称<span style="color:red">*</span>：</td>
                    <td><input type="text" name="traName" id="traName" value="" />
                    <input type="hidden" id="message1">
                    </td>
                </tr>
                <tr>
                    <td>培训讲师<span style="color:red">*</span>：</td>
                    <td>
                       <input type="text" name="traTeacher" value="" /> 
                        <input type="hidden" id="message2">
                    </td>
                </tr>
               
                <tr>
                    <td>培训时间<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" name="traStartTime" value="" />
						<input type="hidden" id="message3">
						</td>
                </tr>
                <tr>
                    <td>至</td>
                    <td>
						<input type="text"  name="traEddTime" value="" />
					<input type="hidden" id="message4">
					</td>
                </tr>
                <tr>
                    <td>培训目的<span style="color:red">*</span>：</td>
                   <td>
                       <input type="text" name="traRequired" value="" /> 
                    <input type="hidden" id="message5">
                    </td>
                </tr>


				 <tr>
                    <td>参训人员<span style="color:red">*</span>：</td>
                   <td>
                       <input type="text" name="attribute_141" value="" /> 
                   <input type="hidden" id="message6">
                    </td>
                </tr>

				<tr>
                    <td>培训简介：</td>
                    <td>
                       <input type="text" name="traIntro" value="" /> 
                    <input type="hidden" id="message7">
                    </td>               
                </tr>

				<tr>
                    <td>培训资料：</td>
                    <td>
                        <input type="text" name="traResouce" value=""/>
                        <input type="hidden" id="message8">
                    </td>                
                </tr>

				

				
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="保存">
						<input type="submit" value="申请复核">
                    </td>
                </tr>  
            </table>
            </form>
        </div>
    </body>
</html>