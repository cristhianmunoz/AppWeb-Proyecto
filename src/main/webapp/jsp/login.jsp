<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href="./assets/style.css" rel="stylesheet">
</head>
<body>
	<h2>INICIO DE SESIÓN</h2>
	<form action="../LoginController" method="POST" >
		<fieldset class="content">
			<legend>Log in</legend>
			<div>
				<c:choose>
				    <c:when test="${userRemembered==''}">
				    	<label>Modo</label>
						<select name="modo" id="modo" class="float_der sizeL tds" >
							<option value="Administrador">Administrador</option>
							<option value="Docente" name="">Docente</option>
							<option value="Estudiante">Estudiante</option>
						</select><br>
		
						<label>Cédula:</label>
						<input type="text" name="cedula"  id="cedula"class="float_der sizeL tds"/><br>
		
						<label>Clave:</label>
						<input type="password" name="clave" id="clave" class="float_der sizeL tds"/><br>
						<br> <input type="checkbox" name="datos" value=1 > Recordar mis datos<br>
				    </c:when>
				    <c:otherwise>
						<label>Modo</label>
						<select name="modo" id="modo" class="float_der sizeL tds" >
							<option value="Administrador">Administrador</option>
							<option value="Docente">Docente</option>
							<option value="Estudiante">Estudiante</option>
						</select><br>
		
						<label>Cédula:</label>
						<input type="text" name="cedula"  id="cedula"class="float_der sizeL tds" value="${userRemembered.cedula}"/><br>
		
						<label>Clave:</label>
						<input type="password" name="clave" id="clave" class="float_der sizeL tds" value="${userRemembered.clave}"/><br>
						<br> <input type="checkbox" name="datos" value=1 > Recordar mis datos<br>
				    </c:otherwise>
				</c:choose>
				
			</div>
			<br>
			<div class="boton">
				<input type="submit" value="Ingresar"/>
				<input type="submit" value="Salir"/>
			</div>
		</fieldset>
	</form>
</body>
</html>