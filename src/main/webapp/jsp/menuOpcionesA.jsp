<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menú Administrador</title>
<link href="./assets/style.css" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>
	       <div>
        <h2>ADMINISTRADOR</h2>
        <fieldset class="content">
            <legend>Menù</legend>
            <div style="display: inline;">
            	<div>Bienvenido ${sessionScope.usuarioLogeado.getNombre()} ${sessionScope.usuarioLogeado.getApellido()}</div><br>
                <i class="fas fa-users" style="font-size: 50px; margin-inline-start: 80px; "></i>
                <i class="fas fa-building" style="font-size: 50px; margin-inline-start: 80px;"></i><br>
                <div>
                    <a href="ListarUsuariosController" style="text-decoration: none; color: navy;margin-inline-start: 80px; "> Usuarios </a>
                    <a href="ListarDepartamentosController"style="text-decoration: none; color: navy;margin-inline-start: 50px; "> Departamentos </a>
                </div>
            </div>
        </fieldset>
    </div>
</body>
<%@ include file="/templates/footer.jsp"%>
</html>