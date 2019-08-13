<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="resources.css" />
<title>Login Page</title>
</head>
<body>
<div class="login">
<form action="MainServlet" method="POST">
  <input type="text" placeholder="Username" name="username">  
  <input type="password" placeholder="Password" name="password">  
    <input type="submit" value="Sign In">
    <a href="#" class="forgot">forgot password?</a>
 </form>
</div>



</body>
</html>