<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
  $(function() {
    $( "#datepicker" ).datepicker({
    	dateFormat : "dd-mm-yy"
    });
  });
  </script>
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
<div class="pay">
<h2>Оплата банківською картою</h2>
<ul class="card">

<li>
<a href ="#"><img src='<c:url value="/resources/Image/visa.png"></c:url>' /></a>
</li>
<li>
<a href ="#"><img src='<c:url value="/resources/Image/aestro.png"></c:url>' /></a>
</li>
<li>
<a href ="#"><img src='<c:url value="/resources/Image/mastercard.png"></c:url>' /></a>
</li>
</ul>
<h3>Перевірте, будь-ласка, чи карта підтримує інтернет платежі!</h3>
<br>
 <div class="form-group">
    <label for="inputcart" class="col-sm-2 control-label">Номер карти:</label>
    <div class="col-sm-10">
      <input type="cart number" class="form-control" id="inputcart" placeholder="Номер карти">
    </div>
  </div>
  <div class="form-group">
    <label for="inputTime" class="col-sm-2 control-label">Термін дії карти:</label>
    <div class="col-sm-10">
      <input type="Термін дії карти:" class="form-control" id="datepicker" placeholder="dd-mm-yy">
          </div>
</div>
 <div class="form-group">
    <label for="inputcvv" class="col-sm-2 control-label">CVV-код:</label>
    <div class="col-sm-10">
      <input type="Cvv" class="form-control" id="inputCvv" placeholder="CVV-код">
    </div>
  </div>
<br>
<button type="button" class="large">
Оплатити
</button>
<br>
<br>

<a href="showAllChildrensClothing" >Повернутись до покупок</a>
</div>
<div class="about">
		<img src='<c:url value="/resources/Image/child.jpg"></c:url>' /></a>
		<p>
			<i>Привіт!!)) Наш магазин створений для люблячих матусь, <br> які
				дбають про стиль і красу своїх діточок. <br> Кожна з наших
				речей підібрана кваліфікованими спеціалістами <br> для Вашої
				зручності та дитячого комфорту))
			</i>
		</p>
	</div>
</body>
</html>