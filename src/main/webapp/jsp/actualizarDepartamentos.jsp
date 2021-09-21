<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STE</title>
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>
	<h1>Actualizar Departamento</h1>
	<form action="ActualizarDepartamentoController" method="POST"
		class="general">
		<fieldset class="content">

			<legend>Administrador</legend>
			<div>
				<label for="labelNombreActual">Nombre Departamento:</label> <input
					type="text" id="labelNombreActual" readonly="readonly"
					name="nombreActual" value="${departamento.nombre}"> <br>
				<label for="nombreDepartamento">Nombre Nuevo:</label> <input
					type="text" id="nombreDepartamento" name="nombreDepartamento"
					placeholder="e.g:Inteligencia Artificial">
			</div>

			<div id="enlaces">
				<a href="ListarDepartamentosController">Volver a Listar
					Departamentos</a>
			</div>
			<div class="boton">
				<input type="submit" value="Actualizar">
			</div>


		</fieldset>
	</form>

</body>
<%@ include file="/templates/footer.jsp"%>
</html>