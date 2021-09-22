<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Usuario</title>
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>
	<form action="CrearUsuarioController" method="POST">
        <div>
            <fieldset>
                <legend>Crear Usuario</legend><br>
                <div>
                    <label for="Tipo">Tipo de Usuario</label>
                    <select name="cargo" id="cargo" onchange="cambiarVisibilidad(this.options[this.selectedIndex].value);">
                        <option value=1>Administrador</option>
                        <option value=2>Docente</option>
                        <option value=3>Estudiante</option>
                    </select><br><br>
                    <label for="cedula">C�dula</label>
                    <input type="text" name="cedula" id="cedula" title="Ingrese la c�dula" required><br><br>
                    <label for="nombre">Nombre</label>
                    <input type="text" name="nombre" id="nombre" title="Ingrese su nombre" required><br><br>
                    <label for="cedula">Apellido</label>
                    <input type="text" name="apellido" id="apellido" title="Ingrese su apellido" required><br><br>
                    <label for="clave">Clave</label>
                    <input type="password" name="clave" id="clave"/><br><br>
                    <label for="departamento" style="visibility:hidden" id="labelDepartamento">Departamento </label>
                    <select name="departamento" id="departamento" style="visibility:hidden">
                   		<option value="null"></option>
                    	<c:forEach var="departamento" items="${listaDepartamentos}">
							<option value="${departamento.nombre}">${departamento.nombre}</option>
						</c:forEach>
                    </select><br><br>
                    <input type="submit" value="Crear" /><br><br>
                    
                </div>
                <div>
                    <input type="submit" value="Volver a men�" /><br>
                </div>
            </fieldset>
        </div>
    </form>
    
    <script>
    	function cambiarVisibilidad(op){
    		if(op == 2){
    			var style = document.querySelector("#departamento");
    			style.setAttribute("style","visibility:visible");
    			var label = document.querySelector("#labelDepartamento");
    			label.setAttribute("style","visibility:visible");
    		}else{
    			var style = document.querySelector("#departamento");
    			style.setAttribute("style","visibility:hidden");
    			var label = document.querySelector("#labelDepartamento");
    			label.setAttribute("style","visibility:hidden");
    		}
    	}
    </script>
</body>
<%@ include file="/templates/footer.jsp"%>
</html>