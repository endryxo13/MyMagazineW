<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
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
<div class="register">
        <form class="form-horizontal" action="registrBuyer"  method="post">
              <tr>
       <th colspan="2"><h2>Реєстраційна форма</h2></th>
     </tr>
          <br>
       <br>
          <div class="form-group1">
      <label for="firstName" class="col-sm-2 control-label">Ім'я</label>
    <div class="col-sm-10">
     <input type="text" class="form-control" name="firstName">
    </div>
  </div>
  <div class="form-group1">
      <label for="lastName" class="col-sm-2 control-label">Прізвище</label>
    <div class="col-sm-10">
<input type="text" class="form-control" name="lastName">
    </div>
  </div>
   <div class="form-group1">
      <label for="telefonNumber" class="col-sm-2 control-label">Номер телефону</label>
    <div class="col-sm-10">
    <input type="text" class="form-control" name="telefonNumber">
    </div>
  </div>
   <div class="form-group1">
      <label for="city" class="col-sm-2 control-label">Місто</label>
    <div class="col-sm-10">
    <input type="text" class="form-control" name="city">
    </div>
  </div>
   <div class="form-group1">
      <label for="email" class="col-sm-2 control-label">Email</label>
    <div class="col-sm-10">
<input	type="text" class="form-control" name="email">
    </div>
  </div>
  
    <div class="form-group1">
          <label for="password" class="col-sm-2 control-label">Пароль</label>
    <div class="col-sm-10">
    <input	type="password" class="form-control" name="password">
       </div>
   
  </div>
  	<c:forEach var="buyer" items="${buyers}">
			<input type="radio" name="buyer" value="${buyer.id}">
		</c:forEach>
   <div class="form-group1">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label>
          <input type="checkbox"> Запам'ятайти мене
        </label>
      </div>
    </div>
  </div>
  <div class="form-group1">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="large">Зареєструватись</button>
    </div>
    </div>
     </div>
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
 
</form>
      <div class="footer">
<br>
<br>
<h4>Copyright internet-magazine"Dmytryk" 2016.
</h4>
</div>  
    </body>
</html>