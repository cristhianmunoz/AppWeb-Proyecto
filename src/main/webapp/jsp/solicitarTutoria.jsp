<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Solicitar Tutoría</title>
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>
<form action="SolicitarTutoriaController" method="POST">
	<fieldset class="content">
			<legend>Solicitud de Tutorias</legend>
			
			<label for="departamentoDoc">Departamento: </label>
		    <select name="departamentoBuscar" id="departamentoBuscar" onclick="location.href='SolicitarTutoriaController?dep=1&departamentoBuscar=${departamento.nombre}'">
			 	<option ></option>
				<c:forEach items="${listaDepartamentos}" var="departamento">
					<option value="${departamento.nombre}" >${departamento.nombre}</option>
				</c:forEach>
			</select><br><br>
			
			<c:choose>
				    <c:when test="${mostrarDocentes=='1'}">
				    <label for="idDocente">Docente: </label>
				    <option value="null"></option>
				    <select name="idDocente" id="idDocente" placeholder="Docente" onchange="location.href='SolicitarTutoriaController?doc=1'">
				    	<option ></option>
				    	<c:forEach items="${listaDocentes}" var="docente">
				    		<option value="${docente.id}" onclick="location.href='SolicitarTutoriaController?doc=1&idDocente=${docente.id}'"> Ing. ${docente.nombre}</option>
			    		</c:forEach>
		    		</select><br><br>
				    </c:when>    
				<c:otherwise>
					  
				</c:otherwise>
			</c:choose>
			
			<c:choose>
			    <c:when test="${mostrarDisponibilidad=='1'}">
			    <label for="idDisponibilidad">Horario: </label>
			    	<select name="idDisponibilidad" id="idDisponibilidad">
			    		<option value="null"></option>
			    		<c:forEach items="${listaDisponibilidad}" var="disponibilidad">
				    		<option value="${disponibilidad.id}"> ${disponibilidad.diaSemana} ${disponibilidad.horarioInicio.transformar()} - ${disponibilidad.horarioFin.transformar()}</option>
			    		</c:forEach>
		    		</select><br><br>
			    </c:when>    
			<c:otherwise>
						        
				</c:otherwise>
			</c:choose><br><br>
			 
			 
			<input type="submit" value="Solicitar">
			
		</fieldset>
	</form>
	<script>
		function seleccionarDep(nombreDep){
			document.getElementById("departamentoBuscar").value = nombreDep;
		}
		function seleccionarDocente(nombreDoc){
			document.getElementById("idDocente").value = nombreDoc;
		}
	</script>
</body>
<%@ include file="/templates/footer.jsp"%>
</html>