<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="./assets/styles.css" rel="stylesheet">
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>
	<h1>Cambio de Contraseña</h1>

	<form action="CambiarClaveController" method="POST" class="general">
		<fieldset class="content">
			<legend style="font-size: 45px;">Estudiante</legend>
			<p>Nombre: ${sessionScope.usuarioLogeado.getNombre()}</p>
			<p>Apellido: ${sessionScope.usuarioLogeado.getApellido()}</p>
			<label for="password">Contraseña Antigua:</label> <input
				type="password" name="claveAnterior" required class="float_izq"><br>
			<br> <label for="passsword">Contraseña Nueva:</label> <input
				type="password" name="claveNueva" required class="float_izq"><br>
			<br> <label for="clave">Confirmar Contraseña:</label> <input
				type="password" name="claveNueva2" required class="float_izq"><br>
			<br>

			<div class="boton">
				<input type="submit" value="Ingresar" />
			</div>
		</fieldset>

	</form>



</body>
<%@ include file="/templates/footer.jsp"%>
</html>