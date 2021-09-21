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

	<div>
        <fieldset>
            <legend>Modulos</legend>
            <div>
                <div><A HREF="/SolicitarTutoriaController"> Solicitar Tutoria  </A></div><br>
                <div><A HREF="/CambiarClaveController"> Cambiar Clave </A></div><br>
            </div>
        </fieldset>
    </div>

</body>
<%@ include file="/templates/footer.jsp"%>
</html>