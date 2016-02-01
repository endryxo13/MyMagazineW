<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Online-shop childrens clothing</title>
</head>
<body>

<div class="header">
<h1>Інтернет-магазин
 <br>одягу для немовлят
 <br> "Дмитрик"
</h1>
<ul class="social">
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
</div>
<div class="content">
     <sec:authorize access="isAuthenticated()">
		<sec:authentication property="name"/>
		<a href="logout" class="bout">Logout</a>
	</sec:authorize>
	<sec:authorize access="isAnonymous()">
	
		<a href="loginpage" class="button">Login</a>
	</sec:authorize>
	<br>
	 
   <h3 class="reg">Ще не зареєстровані??!!</h3>
  
  <a href="buyer-new" class="button">Реєстрація тут!!!</a>
                   
                    </div>
     <div class="menu">
<ul class="menu">
	<li><a href="aboutUs">Про нас</a></li>
		<li><a href="showAllProductType">Асортимент</a></li>
	<li><a href="showAllChildrensClothing">Дитячий одяг</a></li>
		<li><a href="contact">Контакти</a></li>
	
	</ul> 
	</div>
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