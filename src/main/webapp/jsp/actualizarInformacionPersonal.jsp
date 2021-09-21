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

	<h1>Actualizar Informaci�n</h1>
	<fieldset class="content">
		<form action="ActualizarInformacionPersonalController" method="POST">
			<legend>Docente</legend>
			<label for="labelNombreDocente">Nombre :</label> <input type="text"
				id="labelNombreDocente" name="nombreDocente"
				value="${sessionScope.usuarioLogeado.getNombre()} "> <br>
			<label for="apellidoDocente">Apellido:</label> 
			<input type="text"	id="apellidoDocente" name="apellidoDocente" 	value="${sessionScope.usuarioLogeado.getApellido()}"> 
			<label	for="departamentoDoc">Departamento:</label> 
			<select	name="departamentoDoc" id="departamentoDoc">
				<c:forEach items="${listaDepartamentos}" var="departamento">
					<option value="${departamento.nombre} ">${departamento.nombre}</option>
				</c:forEach>
			</select><br> 
			<div>
				<a href="ListarDepartamentosController">Volver a Men�</a>
			</div>
			<input type="submit" value="Actualizar">
	</fieldset>
	</form>
	

	<form action="../ActualizarInformacionPersonalController" method="POST">
        <fieldset>
            <h2>Actualizar Informacion</h2><br>
            <legend>Docente</legend>
            <label for="nombre">Nombre</label>
            <input type="text" name="txtnombre" title="Ingrese su nombre" required><br><br>
            <label for="cedula">Apellido</label>
            <input type="apellido" name="txtapellido" title="Ingrese su apellido" required><br><br>
            <label for="cargo">Departamento</label><br>
            <select name="cargo" id="cargo">
                <option value="director">Director</option>
                <option value="operador">Operador</option>
                <option value="supervisor">Supervisor</option>
            </select><br>
        </fieldset>
    </form>

</body>
<%@ include file="/templates/footer.jsp"%>
</html>