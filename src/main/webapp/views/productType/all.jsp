<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>ProductTypes: </h2>
	<table class="table-productType">
		<thead>
			<tr>
				<th>productType</th>
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
	<div class="a"><a href="createNewProductType">createNewProductType</a></div>