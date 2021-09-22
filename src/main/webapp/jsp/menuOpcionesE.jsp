<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>

	<div>
        <fieldset>
            <legend>Módulos</legend>
            <div>
            	<div>Bienvenido ${sessionScope.usuarioLogeado.getNombre()} ${sessionScope.usuarioLogeado.getApellido()}</div><br>
                <div><A href="SolicitarTutoriaController"> Solicitar Tutoria  </A></div><br>
                <div><A href="CambiarClaveController"> Cambiar Clave </A></div><br>
            </div>
        </fieldset>
    </div>

</body>
<%@ include file="/templates/footer.jsp"%>
</html>