<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
	<form action="createProductType" method="post">
		ProductType <input type="text" name="productType"> 
		<c:forEach var="productType" items="${productTypes}">
			<input type="radio" name="productType" value="${productType.id}">
		</c:forEach>
		<button type="submit">Create ProductType</button>
	</form>
</body>
</html>