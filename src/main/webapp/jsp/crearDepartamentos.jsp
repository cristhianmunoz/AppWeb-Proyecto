<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STE</title>
<link href="./assets/styles.css" rel="stylesheet">
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>
	<h1>Crear Departamento</h1>
	<fieldset class="content">
		<form action="CrearDepartamentoController" method="POST" onle>
			<legend>Administrador</legend>
			<label for="nombreDepartamento">Nombre Departamento</label> <input
				type="text" id="nombreDepartamento" name="nombreDepartamento"
				placeholder="e.g:Inteligencia Artificial">
			<div> <a href="MenuOpcionesAdministradorController">Volver a Menú</a> </div>
			<input type="submit" value="Crear">
	</fieldset>
	</form>
	
</body>
<%@ include file="/templates/footer.jsp"%>
</html>