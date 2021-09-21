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
				<label>Modo</label>
				<select name="modo" id="modo" class="float_izq" >
					<option value="Administrador" >Administrativo</option>
					<option value="Docente" name="">Docente</option>
					<option value="Estudiante">Estudiante</option>
				</select><br>
	
				<label>Cedula:</label>
				<input type="text" name="cedula"  id="cedula"class="float_izq"/>
	
				<label>Clave:</label>
				<input type="password" name="clave" id="clave" class="float_izq"/><br>
				<br> <input type="checkbox" name="datos" value="1"> Recordar mis datos<br>
			</div>
			<div class="boton">
				<input type="submit" value="Ingresar" class="float_der"/>
				<input type="submit" value="Salir"class="float_izq" />
			</div>
		</fieldset>
	</form>
</body>
</html>