<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<div class="newcc">
	<form action="createChildrensClothing" method="post">
		Ціна <input type="text" name="price">
				 Наявність <input
			type="text" class="btn btn-default dropdown-toggle" name="availability">
			
			<br>
			<br>
		
		<div class="dropdown">
		<br>
   <p>Тип товару:</p>
    <select name="productType" class="btn btn-default dropdown-toggle">
    <option value="dress"> Dress</option>
    <option value="socks"> Socks</option>
    <option value="shirts"> Shirts</option>
    <option value="jacket"> Jacket</option>
    <option value="glovers"> Glovers</option>
    <option value="red dress">Blue dress</option>
     </select>
  </div>
  <br>
    <div>
		<c:forEach var="childrensClothing" items="${childrensClothings}">
			<input type="radio" name="childrensClothing" value="${childrensClothing.id}">
		</c:forEach>
		<button type="submit">Create ChildrensClothing</button>
				</div>
	</form> 
	</div>
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
	<div class="footer">
<br>
<br>
<h4>Copyright internet-magazine"Dmytryk" 2016.
</h4>
</div>
</body>
</html>
