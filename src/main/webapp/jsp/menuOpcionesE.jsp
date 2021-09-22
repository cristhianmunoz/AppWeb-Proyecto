<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./assets/styles.css" rel="stylesheet">
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>
<h2>ESTUDIANTE</h2>
	<div>
        <fieldset class="content">
            <legend>Módulos</legend>
            <div>
            	<div>Bienvenido ${sessionScope.usuarioLogeado.getNombre()} ${sessionScope.usuarioLogeado.getApellido()}</div><br>
                <div><A href="SolicitarTutoriaController" style="text-decoration: none; color: navy;margin-inline-start: 80px; "> Solicitar Tutoria  </A></div><br>
                <div><A href="CambiarClaveController" style="text-decoration: none; color: navy;margin-inline-start: 80px; "> Cambiar Clave </A></div><br>
            </div>
        </fieldset>
    </div>
</body>
<%@ include file="/templates/footer.jsp"%>
</html>