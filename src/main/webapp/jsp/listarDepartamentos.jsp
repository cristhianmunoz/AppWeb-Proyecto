<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Departamentos</title>
<link href="./assets/style.css" rel="stylesheet">
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>
	<h2 style="font-size:15px;">LISTA DEPARTAMENTOS</h2>

    <fieldset class="content">
        <legend>Facultad</legend><br>
        <div id="enlaces">
            <a href="MenuOpcionesAdministradorController">Menu Administrador</a>
            <a href="ListarDepartamentosController">Listar Departamentos</a>
            <a href="CrearDepartamentoController">Crear Departamento</a>
        </div>

        <div class="container">
            <div class="row py-3 justify-content-center">
                <table class="table table-success table-striped">
                    <tr class="align-middle" id="title" >
                        <td style="border-radius: 10px;">Nombre Departamento</td>
                        <td style="border-radius: 10px;">Acciones</td>
                    </tr>
                    <c:forEach items="${listDepartamento}" var="departamento">
                        <tr class="align-middle">
                            <td style="border: rgba(176, 224, 230, 0.5) solid 1px; ">${departamento.nombre}</td>
                            <td >
                                <a href="ActualizarDepartamentoController?nombreDepartamento=${departamento.nombre} "style="text-decoration: none; color: rgb(2, 57, 83);">Actualizar</a><t> | <t>
                                <a href="EliminarDepartamentoController?idDepartamento=${departamento.id}"style="text-decoration: none; color: rgb(2, 57, 83);">Eliminar</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </fieldset>
</body>
<%@ include file="/templates/footer.jsp"%>
</html>