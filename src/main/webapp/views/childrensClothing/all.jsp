 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>ChildrensClothings: </h2>
	<table class="table-childrensClothing">
		<thead>
			<tr>
				<th>Price</th>
				<th>Availability</th>
				<th>ProductType</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="childrensClothing" items="${childrensClothings}">
				<tr>
					<td>${childrensClothing.price}</td>
					<td>${childrensClothing.availability}</td>
					<td>${childrensClothing.productType}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="a"><a href="createNewChildrensClothing">Create ChildrensClothing</a></div>