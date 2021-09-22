<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Usuarios</title>
<link href="./assets/style.css" rel="stylesheet">
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>
<h1 style="font-size:15px;">LISTAR USUARIOS</h1>
    <fieldset class="content">
        <legend >Usuarios Registrados</legend>
        <div id="enlaces"><a href="CrearUsuarioController">Nuevo</a></div><br>

        <div class="container">
            <div class="row py-3 justify-content-center">
                <table class="table table-success table-striped">
                    <thead>
                        <tr class="align-middle">
                            <th>Id</th>
                            <th>Tipo de Usuario</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Cédula</th>
                            <th>Clave</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <c:forEach var="administrador" items="${listaAdministradores}">
                    <tr class="align-middle">
                        <td class="tds">${administrador.id}</td>
                        <td class="tds">${administrador.tipoUsuario}</td>
                        <td class="tds">${administrador.nombre}</td>
                        <td class="tds">${administrador.apellido}</td>
                        <td class="tds">${administrador.cedula}</td>
                        <td class="tds">${administrador.clave}</td>
                        <td><a href="ActualizarUsuarioController?id=${administrador.id}"style="text-decoration: none; color: rgb(2, 57, 83);"><box-icon name='refresh' ></box-icon>Actualizar</a> | 
                            <a href="EliminarUsuarioController?id=${administrador.id}"style="text-decoration: none; color: rgb(2, 57, 83);"><box-icon name='trash' ></box-icon>Eliminar</a></td>
                    </tr>
                    </c:forEach>
                    <c:forEach var="docente" items="${listaDocentes}">
                    <tr class="align-middle">
                        <td class="tds">${docente.id}</td>
                        <td class="tds">${docente.tipoUsuario}</td>
                        <td class="tds">${docente.nombre}</td>
                        <td class="tds">${docente.apellido}</td>
                        <td class="tds">${docente.cedula}</td>
                        <td class="tds">${docente.clave}</td>
                        <td><a href="ActualizarUsuarioController?id=${docente.id}"style="text-decoration: none; color: rgb(2, 57, 83);"><box-icon name='refresh' ></box-icon>Actualizar</a> | 
                            <a href="EliminarUsuarioController?id=${docente.id}"style="text-decoration: none; color: rgb(2, 57, 83);"><box-icon name='trash' ></box-icon>Eliminar</a></td>
                    </tr>
                    </c:forEach>
                    <c:forEach var="estudiante" items="${listaEstudiantes}">
                    <tr class="align-middle">
                        <td class="tds">${estudiante.id}</td>
                        <td class="tds">${estudiante.tipoUsuario}</td>
                        <td class="tds">${estudiante.nombre}</td>
                        <td class="tds">${estudiante.apellido}</td>
                        <td class="tds">${estudiante.cedula}</td>
                        <td class="tds">${estudiante.clave}</td>
                        <td><a href="ActualizarUsuarioController?id=${estudiante.id}"style="text-decoration: none; color: rgb(2, 57, 83);"><box-icon name='refresh' ></box-icon>Actualizar</a> | 
                            <a href="EliminarUsuarioController?id=${estudiante.id}"style="text-decoration: none; color: rgb(2, 57, 83);"><box-icon name='trash' ></box-icon>Eliminar</a></td>
                    </tr>
                    </c:forEach>
                </table><br><br>
            </div>
        </div>
    </fieldset>
    


</body>
<%@ include file="/templates/footer.jsp"%>
</html>