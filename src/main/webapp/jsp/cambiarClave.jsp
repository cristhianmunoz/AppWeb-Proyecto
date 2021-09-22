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
	<h2>CAMBIO DE CONTRASEÑA</h2>

	<form action="CambiarClaveController" method="POST" class="general">
		<fieldset class="content">
			<legend>Estudiante</legend>
			<p>Nombre: ${sessionScope.usuarioLogeado.getNombre()}</p>
			<p>Apellido: ${sessionScope.usuarioLogeado.getApellido()}</p>
            <div class="float_izq">
                <label for="password">Contraseña Antigua:</label><br>
                <label for="passsword">Contraseña Nueva:</label> <br>
                <label for="clave">Confirmar Contraseña:</label> <br>

            </div>
            <div class="float_der">
                <input type="password" name="claveAnterior" required ><br>
                <input type="password" name="claveNueva" required ><br>
                <input type="password" name="claveNueva2" required ><br>

            </div>
            
			<div class="boton" style="margin-top:100px;">
                <input type="submit" value="Ingresar" />
            </div>
		</fieldset>
        
	</form>



</body>
<%@ include file="/templates/footer.jsp"%>
</html>