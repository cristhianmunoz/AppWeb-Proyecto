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
	<h3>Estudiante</h3>
		
		<form action="CambiarClaveController" method="POST" >
			<p>Nombre:     ${sessionScope.usuarioLogeado.getNombre()}</p>
			<p>Apellido:     ${sessionScope.usuarioLogeado.getApellido()}</p>
                    <label for="password">Contraseña Antigua:</label>
                    <input type="password" name="claveAnterior" required><br><br>
                    <label for="passsword">Contraseña Nueva:</label>
                    <input type="password" name="claveNueva"  required><br><br>
                    <label for="clave">Confirmar Contraseña:</label>
					<input type="password" name="claveNueva2"  required><br><br>
			
			

			<input type="submit" value="Ingresar" />
			
		</form>
		


</body>
<%@ include file="/templates/footer.jsp"%>
</html>