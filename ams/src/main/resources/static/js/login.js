function check(name,password,formname){
	var namew = document.getElementById(name);
	var passwordw = document.getElementById(password);
	if(namew.value == ""){
		alert("姓名不能为空!");
		return;
	}
	if(passwordw.value == ""){
		alert("密码不能为空!");
		return;
	}
	jqueryAjax(namew.value,passwordw.value);
//	document.forms[formname].submit();
	//用ajax来提交表单	
}

function jqueryAjax(name,password){
	$.ajax({
		url:"http://localhost:18080/order/login/"+name+"/"+password,
		data:"",
		datatype:"json",
		type:"POST",
		success:function(data){
			var dataJson = JSON.parse(data);
			if(dataJson.code == "0"){
				alert("账号或者密码错误!");
			}else{
				alert("登录成功!");
			}
		},
		error:function(){
			alert("系统错误!");
		}
	});
}