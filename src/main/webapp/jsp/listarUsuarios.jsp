<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div><a href="CrearUsuarioController">Nuevo</a></div><br>
<table border="1" class="table">
	<thead>
		<tr>
			<th>Id</th>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Cédula</th>
			<th>Clave</th>
			<th>Acciones</th>
		</tr>
	</thead>
	<c:forEach var="administrador" items="${listaAdministradores}">
	<tr>
		<td>${administrador.id}</td>
		<td>${administrador.nombre}</td>
		<td>${administrador.apellido}</td>
		<td>${administrador.cedula}</td>
		<td>${administrador.clave}</td>
		<td><a href="ActualizarUsuarioController?id=${administrador.id}"><box-icon name='refresh' ></box-icon>Actualizar</a> | 
			<a href="EliminarUsuarioController?id=${administrador.id}"><box-icon name='trash' ></box-icon>Eliminar</a></td>
	</tr>
	</c:forEach>
	<c:forEach var="docente" items="${listaDocentes}">
	<tr>
		<td>${docente.id}</td>
		<td>${docente.nombre}</td>
		<td>${docente.apellido}</td>
		<td>${docente.cedula}</td>
		<td>${docente.clave}</td>
		<td><a href="ActualizarUsuarioController?id=${docente.id}"><box-icon name='refresh' ></box-icon>Actualizar</a> | 
			<a href="EliminarUsuarioController?id=${docente.id}"><box-icon name='trash' ></box-icon>Eliminar</a></td>
	</tr>
	</c:forEach>
	<c:forEach var="estudiante" items="${listaEstudiantes}">
	<tr>
		<td>${estudiante.id}</td>
		<td>${estudiante.nombre}</td>
		<td>${estudiante.apellido}</td>
		<td>${estudiante.cedula}</td>
		<td>${estudiante.clave}</td>
		<td><a href="ActualizarUsuarioController?id=${estudiante.id}"><box-icon name='refresh' ></box-icon>Actualizar</a> | 
			<a href="EliminarUsuarioController?id=${estudiante.id}"><box-icon name='trash' ></box-icon>Eliminar</a></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>