<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
      <tr>
       <th colspan="2">Реєстраційна форма</th>
     </tr>
        <form class="form-horizontal" method="post">
          <div class="form-group">
      <label for="firstName" class="col-sm-2 control-label">FirstName</label>
    <div class="col-sm-10">
     <input type="text" class="form-control" name="firstName">
    </div>
  </div>
  <div class="form-group">
      <label for="lastName" class="col-sm-2 control-label">LastName</label>
    <div class="col-sm-10">
<input type="text" class="form-control" name="lastName">
    </div>
  </div>
   <div class="form-group">
      <label for="telefonNumber" class="col-sm-2 control-label">telefonNumber</label>
    <div class="col-sm-10">
    <input type="text" class="form-control" name="telefonNumber">
    </div>
  </div>
   <div class="form-group">
      <label for="city" class="col-sm-2 control-label">city</label>
    <div class="col-sm-10">
    <input type="text" class="form-control" name="city">
    </div>
  </div>
   <div class="form-group">
      <label for="email" class="col-sm-2 control-label">email</label>
    <div class="col-sm-10">
<input	type="text" class="form-control" name="email">
    </div>
  </div>
  
    <div class="form-group">
      <label for="password" class="col-sm-2 control-label">password</label>
    <div class="col-sm-10">
    <input	type="text" class="form-control" name="email">
    </div>
  </div>
  	<c:forEach var="buyer" items="${buyers}">
			<input type="radio" name="buyer" value="${buyer.id}">
		</c:forEach>
   <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label>
          <input type="checkbox"> Remember me
        </label>
      </div>
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">Sign in</button>
    </div>
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
  </div>
</form>
        
    </body>
</html>