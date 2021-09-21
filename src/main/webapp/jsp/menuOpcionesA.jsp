<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>
	<div>
        <fieldset>
            <legend>Menu</legend>
            <div>
            	<div>Bienvenido ${ sessionScope.usuarioLogeado.getNombre()}</div><br>
                <div><A href="ListarUsuariosController"> Usuarios </A></div><br>
                <div><A href="ListarDepartamentosController"> Departamentos </A></div><br>
            </div>
        </fieldset>
    </div>
</body>
<%@ include file="/templates/footer.jsp"%>
</html>