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
<h1>Lista Departamentos</h1>

<div><a href="MenuOpcionesAdministradorController">Menu Administrador</a></div>
<div> <div><a href="CrearDepartamentoController">Crear Departamento</a></div> </div>

<table>
	<tr>
		<td>Nombre Departamento</td>
		<td>Acciones</td>
	</tr>
	<c:forEach  items="${listDepartamento}"  var="departamento">
		<tr>
		<td>${departamento.nombre}</td>
		<td><a href="ActualizarDepartamentoController?departamento=${depar.nombre} ">IIcono Refresh</a><a href="EliminarDepartamentoController?departamento=${depar.nombre}">Incono Borrar</a> </td>
		</tr>
	</c:forEach>
	
</table>
</body>
<%@ include file="/templates/footer.jsp"%>
</html>