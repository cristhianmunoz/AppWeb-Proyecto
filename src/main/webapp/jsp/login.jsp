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
			<div>
				<p>Modo</p>
				<select name="modo" id="modo" >
					<option value="Administrador" >Administrativo</option>
					<option value="Docente" name="">Docente</option>
					<option value="Estudiante">Estudiante</option>
				</select><br>
	
				<p>Cedula:</p>
				<input type="text" name="cedula"  id="cedula"/>
	
				<p>Clave:</p>
				<input type="password" name="clave" id="clave" /><br>
				<br> <input type="checkbox" name="datos" value="1"> Recordar mis datos<br>
			</div>
			<div>
				<input type="submit" value="Ingresar" />
				<input type="submit" value="Salir" />
			</div>
		</fieldset>
	</form>
</body>
</html>