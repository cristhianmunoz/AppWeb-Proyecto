<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>

<h1>Estas aqui juppi</h1>
<div class= "container"> 
	<legend>Módulos</legend>
	<button onclick="location.href='SolicitarTutoriaController'">Solicitar Tutoria </button>
	<br>
	<button onclick="location.href='CambiarClaveController'">Cambiar Clave</button>
</div>

</body>
<%@ include file="/templates/footer.jsp"%>
</html>