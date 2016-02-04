<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>


</head>
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
<h2 style="text-align: center;">Дитячий одяг</h2>

<c:forEach var="childrensClothing" items="${childrensClothings}">

<div class="chilclo">
<figure>
<img src='<c:url value="/resources/Image/${childrensClothing.productType}.jpg"></c:url>' />
<figcaption>
<a href="payment" class="bout" ><button class="buy">Buy </button></a>

${childrensClothing.productType}
${childrensClothing.price}
</figcaption>
</figure>
</div>

</c:forEach>

<div id="search-bar">
	<div class="top-bar">
		<form id="search_mini_form" action="" method="get">
			<div class="form-search">
				<input
					onfocus="if(this.value=='${childrensClothing.productType}') {this.value='${childrensClothing.productType}'};"
					onblur="if(this.value=='${childrensClothing.productType}') {this.value='${childrensClothing.productType}'};"
					id="search" name="q" value="Search" class="input-text" type="text" />
				<button type="submit" title="Go" class="button">Go</button>
			</div>
		</form>
	</div>
</div>

<div class="a" style="margin-top: 800px;">
	<a href="createNewChildrensClothing">Create ChildrensClothing</a>
	</div>
<div class="atHome">
<img src='<c:url value="/resources/Image/nazad.jpg"></c:url>' /></a>
	<a href="home" >Повернутись на головну сторінку</a>
	</div>
<div class="footer">
<br>
<br>
<h4>Copyright internet-magazine"Dmytryk" 2016.
</h4>
</div>
</html>

