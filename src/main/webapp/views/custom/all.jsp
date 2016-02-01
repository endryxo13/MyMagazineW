<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>Customs: </h2>
	<table class="table-custom">
		<thead>
			<tr>
				<th>Date</th>
				<th>Quantity</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="custom" items="${customs}">
				<tr>
					<td>${custom.date}</td>
					<td>${custom.quantity}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="a"><a href="createNewCustom" >Create Custom</a></div>
	<div class="footer">
<br>
<br>
<h4>Copyright internet-magazine"Dmytryk" 2016.
</h4>
</div>