<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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
</html>