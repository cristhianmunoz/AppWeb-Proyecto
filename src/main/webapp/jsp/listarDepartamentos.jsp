<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STE</title>
</head>
<body>
<h1>Lista Departamentos</h1>

<div> <div><a href="CrearDepartamentoController">Crear Departamento</a></div> </div>

<table>
	<tr>
		<td>Nombre Departamento</td>
		<td>Acciones</td>
	</tr>
	<c:forEach items="${listDepartamento}" var="depar">
		<tr>
		<td>${depar.nombre}</td>
		<td><a href="ActualizarDepartamentoController?departamento=${depar.nombre} }">IIcono Refresh</a><a href="EliminarDepartamentoController?departamento=${depar.nombre}">Incono Borrar</a> </td>
		</tr>
	</c:forEach>
	
</table>
</body>
</html>