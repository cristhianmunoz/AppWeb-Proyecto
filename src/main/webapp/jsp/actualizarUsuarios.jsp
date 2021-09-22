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
	<form action="ActualizarUsuarioController" method="POST">
        <div>
            <fieldset>
                <legend>Crear Usuario</legend><br>
                <div>
                    <label for="Tipo">Tipo de Usuario: </label>
                    <input type="text" name="cargo" id="cargo" required readonly value="${persona.tipoUsuario}"><br><br> 
                 
                    <label for="cedula">Cédula</label>
                    <input type="text" name="cedula" id="cedula" title="Ingrese la cédula" required readonly value="${persona.cedula}"><br><br>
                    <label for="nombre">Nombre</label>
                    <input type="text" name="nombre" id="nombre" title="Ingrese su nombre" required value="${persona.nombre}"><br><br>
                    <label for="cedula">Apellido</label>
                    <input type="text" name="apellido" id="apellido" title="Ingrese su apellido" required value="${persona.apellido}"><br><br>
                    <label for="clave">Clave</label>
                    <input type="password" name="clave" id="clave" value="${persona.clave}"/><br><br>
                    
                    <c:choose>
					    <c:when test="${persona.tipoUsuario=='Docente'}">
					    	<label for="Tipo">Departamento: </label>
					    	<input type="text" name="departamento" id="departamento" required readonly value="${persona.departamento.nombre}"><br><br>
					    </c:when>    
					    <c:otherwise>
					        
					    </c:otherwise>
					</c:choose>
					 <input type="submit" value="Actualizar"/><br><br>
                </div>
                <div>
                    <input type="submit" value="Volver a menú" /><br>
                </div>
            </fieldset>
        </div>
    </form>
   
</body>
<%@ include file="/templates/footer.jsp"%>
</html>