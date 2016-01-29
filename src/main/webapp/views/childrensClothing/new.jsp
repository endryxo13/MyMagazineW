<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
	<form action="createChildrensClothing" method="post">
		Price <input type="text" name="price"> Availability <input
			type="text" name="availability">
			<div class="dropdown">
   <p>productType</p>
   <select name="productType" class="btn btn-default dropdown-toggle">
    <option value="dress"> Dress</option>
    <option value="socks"> Socks</option>
    <option value="shirts"> Shirts</option>
    <option value="jacket"> Jacket</option>
    <option value="glovers"> Glovers</option>
    <option value="red dress">Blue dress</option>
  

   </select>
  </div>
  
  <div>
		<c:forEach var="childrensClothing" items="${childrensClothings}">
			<input type="radio" name="childrensClothing" value="${childrensClothing.id}">
		</c:forEach>
		<button type="submit">Create ChildrensClothing</button>
		
		</div>
	</form> 
</body>
</html>
