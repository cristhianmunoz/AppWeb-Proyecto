<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
        <fieldset>
            <legend>Menu</legend>
            <div>
            	<div>Bienvenido $(sessionScope.usuarioLogeado.getNombre())</div><br>
                <div><A HREF="/CrearUsuarioControlle"> Usuarios </A></div><br>
                <div><A HREF="/CrearDepartamentoController"> Departamentos </A></div><br>
            </div>
        </fieldset>
    </div>
</body>
</html>