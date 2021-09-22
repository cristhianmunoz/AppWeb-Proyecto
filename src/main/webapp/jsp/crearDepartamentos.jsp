<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STE</title>
<link href="./assets/style.css" rel="stylesheet">
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>
        <h2>CREAR DEPARTAMENTO</h2>
        <fieldset class="content">
            <legend>Administrador</legend>
            <form action="CrearDepartamentoController" method="POST" onle>
                
                <label for="nombreDepartamento" >Nombre Departamento</label> 
                <div class="float_der">
                    <input
                    type="text" id="nombreDepartamento" name="nombreDepartamento"
                    placeholder="e.g:Inteligencia Artificial" >
                </div>
            </form>
            <br>
            <div style="font-size: 12px; font-style: italic;" class="float_izq"> <a href="MenuOpcionesAdministradorController">Volver a Menú</a> </div>
            <br>
            <div class="boton">
                <input type="submit" value="Crear">

            </div>
        </fieldset>
        
    </body>
<%@ include file="/templates/footer.jsp"%>
</html>