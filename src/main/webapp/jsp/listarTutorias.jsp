<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<fieldset>
        <h2>Listar Tutoria</h2>
        <table border="1" class="table">
            <thead>
                <tr>
                    <th>Cedula</th>
                    <th>Nombre</th>
                    <th>Dia</th>
                    <th>Hora</th>
                </tr>
            </thead>
            <c:forEach items="${tutorias}" var="listar">
                <tr>
                    <td>${listar.Cedula}</td>
                    <td>${listar.nombre}</td>
                    <td>${listar.Dia}</td>
                    <td>${listar.Hora}</td>
                </tr>
            </c:forEach>
        </table>
    </fieldset>
</body>
<%@ include file="/templates/footer.jsp"%>
</html>