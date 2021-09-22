<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STE</title>
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>
<h1>Solicitud de Tutorias</h1>
<form action="ActualizarInformacionPersonalController" method="POST">
			<legend>Estudiante</legend>
			
			<label for="departamentoDoc">Departamento:</label>
			 <select	name="departamentoBuscar" id="departamentoDoc">
				<c:forEach items="${listaDepartamentos}" var="departamento">
					<option value="${departamento.nombre} ">${departamento.nombre}</option>
				</c:forEach>
			</select><br>
			<select	name="docenteDepartamento" id="departamentoDoc">
				<c:forEach items="${listaDocentes}" var="docente">
				<c:choose>
					    <c:when test="${docente.departamento.nombre.equals(request.getParameter("departamentoBuscar"))}">
					    		<option value="${docente.cedula} "> Ing. ${docente.nombre}</option>
					    </c:when>    
			<c:otherwise>
					        
	</c:otherwise>
			</c:choose>
					
				</c:forEach>
			</select><br>
			<table>
	<tr>
		<td>Día Disponible</td>
		<td>Hora Disponible</td>
	</tr>
	<c:forEach  items="${listDepartamento}"  var="departamento">
		<tr>
		<td>${departamento.nombre}</td>
		<td><a href="ActualizarDepartamentoController?nombreDepartamento=${departamento.nombre} ">IIcono Refresh</a><a href="EliminarDepartamentoController?idDepartamento=${departamento.id}">Icono Borrar</a> </td>
	</tr> 
 	</c:forEach>
	
</table>
			<input type="submit" value="Actualizar">
	</fieldset>
	</form>
	<div>
				<a href="MenuOpcionesEstudianteController">Volver a Menu</a>
	</div>
</body>
<%@ include file="/templates/footer.jsp"%>
</html>