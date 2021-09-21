<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="./assets/styles.css" rel="stylesheet">
</head>
<body>
	<form action="../LoginController" method="POST" class="general">
		<fieldset class="content">
			<legend>Log in</legend>

			<a href="otra_pagina.html"> Iniciar Sesion </a><br> 
			<a href="otra_pagina.html"> Crear Usuario </a><br>
			<p>Modo</p>
			<select name="modo" id="cargo" value="modo">
				<option value="Administrador">Administrativo</option>
				<option value="Docente">Docente</option>
				<option value="Estudiente">Estudiante</option>
			</select><br>

			<p>Cedula:</p>
			<input type="text" name="cedula" />

			<p>Clave:</p>
			<input type="text" name="clave" /><br>
			<br> <input type="checkbox" name="datos" value="1"> Recordar mis datos<br>
			<input type="submit" value="Ingresar" />
			<input type="submit" value="Salir" />

		</fieldset>
	</form>
</body>
</html>