<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="header">
<h1>Інтернет-магазин
 <br>одягу для немовлят
 <br> "Дмитрик"
</h1>

</div>
<div class="ass">
<h2>Наш асортимент товарів: </h2>
</div>
<br>
	<table class="table-productType">
		<thead>
			<tr>
				<th>Асортимент товарів</th>
							</tr>
		</thead>
		<tbody>
			<c:forEach var="productType" items="${productTypes}">
				<tr>
					<td>${productType.productType}</td>
							</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<div class="a1"><a href="createNewProductType">createNewProductType</a></div>
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