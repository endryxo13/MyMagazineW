<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h2>Buyers: </h2>
	<table class="table-buyer">
		<thead>
			<tr>
				<th>FirstName</th>
				
				<th>LastName</th>
				
				<th>TelefonNumber</th>
				
				<th>City</th>
				
				<th>email</th>
								
			</tr>
		</thead>
<tbody>
<c:forEach var="buyer" items="${buyers}">
				<tr>
					<td>${buyer.firstName}</td>
					<td>${buyer.lastName}</td>
					<td>${buyer.telefonNumber}</td>
					<td>${buyer.city}</td>
					<td>${buyer.email}</td>
				</tr>
			</c:forEach>
</tbody>
	</table>
	<div class="a"><a href="registrNewBuyer">Registr Buyer</a></div>