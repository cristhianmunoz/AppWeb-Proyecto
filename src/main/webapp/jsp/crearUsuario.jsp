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
	<form action="../CrearUsuarioControlle" method="POST">
        <div>
            <fieldset>
                <legend>Crear Usuario</legend><br>
                <div>
                    <label for="Tipo">Tipo de Usuario</label>
                    <select name="cargo" id="cargo">
                        <option value="director">Administrativo</option>
                        <option value="operador">Docente</option>
                        <option value="supervisor">Estudiante</option>
                    </select><br><br>
                    <label for="cedula">C�dula</label>
                    <input type="text" name="cedula" title="Ingrese la c�dula" required><br><br>
                    <label for="nombre">Nombre</label>
                    <input type="text" name="nombre" title="Ingrese su nombre" required><br><br>
                    <label for="cedula">Apellido</label>
                    <input type="apellido" name="apellido" title="Ingrese su apellido" required><br><br>
                    <label for="clave">Clave</label>
                    <input type="clave" name="clave" /><br><br>
                    <input type="submit" value="Crear" /><br><br>
                </div>
                <div>
                    <input type="submit" value="Volver a men�" /><br>
                </div>
            </fieldset>
        </div>
    </form>
</body>
<%@ include file="/templates/footer.jsp"%>
</html>