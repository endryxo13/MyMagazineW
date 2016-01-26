<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
	<form action="createChildrensClothing" method="post">
		Price <input type="text" name="price"> Availability <input
			type="text" name="availability">
			ProductType
			<select  name="productType">
    <option selected disabled>Select productType</option>
    <option value="dress">dress</option>
    <option  value="socks">socks</option>
    <option value="shirts">shirts</option>
    <option value="jacket">jacket</option>
      <option value="gloves">gloves</option>
   </select></p>
		<c:forEach var="childrensClothing" items="${childrensClothings}">
			<input type="radio" name="childrensClothing" value="${childrensClothing.id}">
		</c:forEach>
		<button type="submit">Create ChildrensClothing</button>
	</form>
</body>
</html>