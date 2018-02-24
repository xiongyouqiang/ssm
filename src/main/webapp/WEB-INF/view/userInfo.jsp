<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>用户信息</title>  
<script type="text/javascript">
	
	
</script>
</head>  
<body>
		<form action ="<%=request.getContextPath()%>/userinfo/addUser" method="post"> 
		     用户名:&nbsp;<input type="text" name="username"/><br/>
		     密&nbsp;&nbsp;码:&nbsp;<input type="password" name="password"/><br/>
		     性&nbsp;&nbsp;别:&nbsp;<input type="radio" name="sex" value="男" checked="checked"/><input type="radio" name="sex" value="女"/><br/>
		     年&nbsp;&nbsp;龄:&nbsp;<input type="text" name="age"/><br/>
		  <input type="submit" value="提交"/> 
		   <input type="reset" value="重置"/> 
		</form>
</body>  
</html> 