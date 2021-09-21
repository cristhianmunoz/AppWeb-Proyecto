<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STE</title>
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>
	<div>
        <fieldset>
            <legend>Módulos</legend>
            <div>
            	<div>Bienvenido ${ sessionScope.usuarioLogeado.getNombre()}</div><br>
                <div><A href="ActualizarInformacionPersonalController"> Informacion Docente </A></div><br>
                <div><A href="ListarTutoriasController"> Tutoria Académica </A></div><br>
                <div><A href="ConfigurarDisponibilidadController"> Disponibilidad Académica </A></div><br>
            </div>
        </fieldset>
    </div>
</body>
<%@ include file="/templates/footer.jsp"%>
</html>