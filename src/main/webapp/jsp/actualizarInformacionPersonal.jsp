<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
  
<html>
<head>
<meta charset="ISO-8859-1">
<title>Actualización de Usuario</title>
<link href="./assets/style.css" rel="stylesheet">
<link href="./jsp/toastr/build/toastr.min.css" rel="stylesheet">

</head>

<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>

	<h2>Actualizar Informacion</h2>
	
	<form action="ActualizarInformacionPersonalController" method="POST">
		<fieldset class="content">
			<legend>Docente</legend>
			<label for="labelNombreDocente">Nombre</label> 
			<input type="text"
				id="labelNombreDocente" name="nombreDocente"
				value="${sessionScope.usuarioLogeado.getNombre()} "class="float_der sizeL"> <br><br>
			<label for="apellidoDocente">Apellido</label> 
			<input type="text"
				id="apellidoDocente" name="apellidoDocente"
				value="${sessionScope.usuarioLogeado.getApellido()}"class="float_der sizeL"> <br><br>
			<label for="departamentoDoc">Departamento</label> 
			<select name="departamentoDoc" id="departamentoDoc" class="float_der sizeL" >
				<c:forEach items="${listaDepartamentos}" var="departamento" >
					<option value="${departamento.nombre} ">${departamento.nombre}</option>
				</c:forEach>
			</select><br><br>
			<div id="enlaces" class="float_der">
				<a href="MenuOpcionesDocenteController">Volver a Menu</a>
			</div>
			<br><br>
			<div class="boton">
				<input type="submit" value="Actualizar">
			</div>
			
		</fieldset>
	</form>
	<c:choose>
	    <c:when test="${seActualizo==true}">
	    		<script  >toastr["warning"]("Are you the 6 fingered man?","Mensaje de prueba");</script>
	    </c:when>    
		<c:otherwise>
	        
	    </c:otherwise>
	</c:choose>
	
</body>
<%@ include file="/templates/footer.jsp"%>
<script src="./jsp/toastr/build/toastr.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</html>