<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form class="form-inline" action="loginprocessing" method="post">

  <div class="form-group">
    Login <input type="text" class="form-control" name="username">
  </div>
  <div class="form-group">
   
    Password <input type="password" class="form-control" name="password">
  </div>
  <div class="checkbox">
    <label>
      <input type="checkbox"> Remember me
    </label>
  </div>
  <button type="submit" class="btn btn-primary btn-lg">Sign in</button>
	
  <ul>
<li>
<a href ="#"><img src='<c:url value="/resources/Image/Youtube.png"></c:url>' /></a>
</li>
<li>
<a href ="#"><img src='<c:url value="/resources/Image/twitter.png"></c:url>' /></a>
</li>
<li>
<a href ="#"><img src='<c:url value="/resources/Image/facebook.png"></c:url>' /></a>
</li>
<li>
<a href ="#"><img src='<c:url value="/resources/Image/vk3 (1).png"></c:url>' /></a>
</li>
</ul>
</form>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<div class="about">
	<img src='<c:url value="/resources/Image/child.jpg"></c:url>' /></a>
	<p>
	<i>Наш магазин створений для люблячих матусь,
	<br> які дбають про стиль і красу своїх діточок.
	<br> Кожна з наших речей підібрана кваліфікованими спеціалістами 
	<br> для Вашої зручності та дитячого комфорту))
	 </i>
	</p>
	</div>
</body>
</html>