<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menú Administrador</title>
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>
	<div>
        <fieldset>
            <legend>Menu</legend>
            <div>
            	<div>Bienvenido ${sessionScope.usuarioLogeado.getNombre()} ${sessionScope.usuarioLogeado.getApellido()}</div><br>
                <div><A href="ListarUsuariosController"> Usuarios </A></div><br>
                <div><A href="ListarDepartamentosController"> Departamentos </A></div><br>
            </div>
        </fieldset>
    </div>
</body>
<%@ include file="/templates/footer.jsp"%>
</html>