<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="../LoginController" method="POST">
        <fieldset>
            <legend>Log in</legend>
            
            <A HREF="otra_pagina.html"> Iniciar Seción </A><br>
            <A HREF="otra_pagina.html"> Crear Usuario </A><br>
            <p>Modo</p>
            <select name="modo" id="cargo" value="modo">
                <option value="Administrador">Administrativo</option>
                <option value="Docente">Docente</option>
                <option value="Estudiente">Estudiante</option>
            </select><br>

            <p>Usuario:</p>
            <input type="text" name="cedula" />

            <p>Clave:</p>
            <input type="text" name="clave" /><br><br>
            <input type="checkbox" name="datos" value="1">Recordar mis datos <br> <br> <br>
            <input type="submit" value="Ingresar" /><br>
            <input type="submit" value="Salir" />
        
        </fieldset>
    </form>
</body>
</html>