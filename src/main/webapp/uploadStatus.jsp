<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}
footer {
  position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
  background-color: black;
  color: white;
  text-align: center;
}
</style>

<body >

	<img src="/img/hm.jpg" alt="HappiestMinds logo" width="80%" height="300px">
	
	<ul>
		<li><a href="home.jsp">home</a></li>
  		<li><a href="upload.jsp">upload</a></li>
		<li><a href="search.jsp">search</a></li>
	</ul>

	<div style="margin: 0 auto;width:250px;">
    	<h1>${message}</h1>
	</div>

<footer>
	 <p>Project By Mayank Arora</p>
	</footer>
</body>
</html>