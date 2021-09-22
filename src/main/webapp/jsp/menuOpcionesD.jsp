<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menú Docente</title>
<link href="./assets/styles.css" rel="stylesheet">
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>
	    <div>
        <h2>DOCENTE</h2>
        <fieldset class="CONTENT">
            <legend>Módulos</legend>
            <div>
            	<div>Bienvenido ${sessionScope.usuarioLogeado.getNombre()} ${sessionScope.usuarioLogeado.getApellido()}</div><br>
                <div><A href="ActualizarInformacionPersonalController"> Informacion Docente </A></div><br>
                <div><A href="ListarTutoriasController"> Tutoria Académica </A></div><br>
                <div><A href="ConfigurarDisponibilidadController"> Disponibilidad Académica </A></div><br>
            </div>
        </fieldset>
    </div>
</body>
<%@ include file="/templates/footer.jsp"%>
</html>