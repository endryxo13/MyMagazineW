<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>


</head>

<h2>ChildrensClothings:</h2>

<c:forEach var="childrensClothing" items="${childrensClothings}">
<div class="chilclo">
<img src='<c:url value="/resources/Image/${childrensClothing.productType}.jpg"></c:url>' />
<a href="#" >Buy </a>

${childrensClothing.productType}
${childrensClothing.price}
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

</html>

