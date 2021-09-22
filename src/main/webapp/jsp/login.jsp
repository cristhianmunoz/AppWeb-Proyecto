<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href="./assets/styles.css" rel="stylesheet">
</head>
<body>
	<h2>INICIO DE SESIÒN</h2>
	<form action="../LoginController" method="POST" >
		<fieldset class="content">
			<legend>Log in</legend>
			<div>
				<label>Modo</label>
				<select name="modo" id="modo" class="float_der sizeL tds" >
					<option value="Administrador">Administrador</option>
					<option value="Docente" name="">Docente</option>
					<option value="Estudiante">Estudiante</option>
				</select><br>

				<label>Cèdula:</label>
				<input type="text" name="cedula"  id="cedula"class="float_der sizeL tds"/><br>

				<label>Clave:</label>
				<input type="password" name="clave" id="clave" class="float_der sizeL tds"/><br>
				<br> <input type="checkbox" name="datos" value="1" > Recordar mis datos<br>
			</div>
			<br>
			<div class="boton">
				<input type="submit" value="Ingresar" />
				<input type="submit" value="Salir" />
			</div>
		</fieldset>
	</form>
</body>
</html>