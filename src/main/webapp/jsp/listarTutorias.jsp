<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>

<h1>Lista Tutorias</h1>
	<h3>Docente</h3>
		
	
		<div class="container">
			<div class="row py-3 justify-content-center"> 
				<table class="table table-success table-striped">
					<thead>
						<tr class="align-middle">
							<th>Cédula</th>
							<th>Nombre</th>
							<th>Día</th>
							<th>Hora</th>
							<th>Estado</th>
						</tr>
					</thead>
					<c:forEach var="tutoria" items="${tutorias}">
						<tr class="align-middle">
							<td>${tutoria.estudiante.cedula}</td>
							<td>${tutoria.estudiante.nombre}</td>
							<td>${tutoria.fecha.dia}</td>
							<td>${tutoria.horario.hora}:${tutoria.horario.minuto}</td>
							<td>${tutoria.estado}</td>
							<td><button class="btn btn-primary" onclick="location.href='CargarSubastaControlador?codigo=${subasta.codigo}'">Ver</button></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	
	<button type="button" class="btn btn-danger mx-5"
	onclick="location.href='MenuOpcionesDocenteController'"> Volver a Menú</button>



</body>
<%@ include file="/templates/footer.jsp"%>
</html>