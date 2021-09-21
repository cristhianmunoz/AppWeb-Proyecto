<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
  
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>

	<h1>Actualizar Informaci�n</h1>
	<fieldset class="content">
		<form action="ActualizarInformacionPersonalController" method="POST">
			<legend>Docente</legend>
			<label for="labelNombreDocente">Nombre :</label> <input type="text"
				id="labelNombreDocente" name="nombreDocente"
				value="${sessionScope.usuarioLogeado.getNombre()} "> <br>
			<label for="apellidoDocente">Apellido:</label> 
			<input type="text"	id="apellidoDocente" name="apellidoDocente" 	value="${sessionScope.usuarioLogeado.getApellido()}">  <br>
			<label	for="departamentoDoc">Departamento:</label> 
			<select	name="departamentoDoc" id="departamentoDoc">
				<c:forEach items="${listaDepartamentos}" var="departamento">
					<option value="${departamento.nombre} ">${departamento.nombre}</option>
				</c:forEach>
			</select><br> 
			<div>
				<a href="MenuOpcionesDocenteController">Volver a Menu</a>
			</div>
			<input type="submit" value="Actualizar">
	</fieldset>
	</form>
	
</body>
<%@ include file="/templates/footer.jsp"%>
</html>