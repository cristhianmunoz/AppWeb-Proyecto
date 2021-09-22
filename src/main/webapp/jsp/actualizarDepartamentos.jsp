<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STE</title>
<link href="./assets/style.css" rel="stylesheet">
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>
	 <h2>Actualizar Departamento</h2>
	<form action="ActualizarDepartamentoController" method="POST"
		class="general">
		<fieldset class="content">

			<legend>Administrador</legend>
			<div>
				<label for="labelNombreActual">Nombre Departamento</label>
                <input
					type="text" id="labelNombreActual" readonly="readonly"
					name="nombreActual" value="${departamento.nombre}" class="float_der sizeL" style="border: rgba(176, 224, 230, 0.5) solid 1px; "> <br><br>
				<label for="nombreDepartamento">Nombre Nuevo</label>
                <input
					type="text" id="nombreDepartamento" name="nombreDepartamento"
					placeholder="e.g:Inteligencia Artificial"class="float_der sizeL" style="border: rgba(176, 224, 230, 0.5) solid 1px; ">
			</div>
            <br>
			<div id="enlaces" class="float_der">
				<a href="ListarDepartamentosController">Volver a Listar
					Departamentos</a>
			</div>
            <br>
			<div class="boton">
				<input type="submit" value="Actualizar">
			</div>


		</fieldset>
	</form>

</body>
<%@ include file="/templates/footer.jsp"%>
</html>