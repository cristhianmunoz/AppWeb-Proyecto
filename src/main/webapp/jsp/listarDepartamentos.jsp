<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Departamentos</title>
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>
<h1>Lista de Departamentos</h1>
<div><a href="MenuOpcionesAdministradorController">Menu Administrador</a><a href="ListarDepartamentosController">Listar Departamentos</a></div>
<div> <div><a href="CrearDepartamentoController">Crear Departamento</a></div> </div>

<div class="container">
	<div class="row py-3 justify-content-center"> 
		<table class="table table-success table-striped">
			<tr class="align-middle">
				<td>Nombre Departamento</td>
				<td>Acciones</td>
			</tr>
			<c:forEach  items="${listDepartamento}"  var="departamento">
				<tr class="align-middle">
					<td>${departamento.nombre}</td>
					<td><a href="ActualizarDepartamentoController?nombreDepartamento=${departamento.nombre} ">Actualizar</a><a href="EliminarDepartamentoController?idDepartamento=${departamento.id}">Eliminar</a> </td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>


</body>
<%@ include file="/templates/footer.jsp"%>
</html>