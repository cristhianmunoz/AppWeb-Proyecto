<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Configuración de Disponibilidad</title>
</head>
<%@ include file="/templates/meta.jsp"%>
<%@ include file="/templates/navbarProveedor.jsp"%>
<body>
	<form action="ConfigurarDisponibilidadController" method="POST">
        <fieldset>
            <legend> Configurar Disponibilidad</legend><br>
            <div><h2>Docente</h2></div>
            <div>
                <label for="dia">Dia</label><br>
                <select name="diaSemana" id="dia">
                    <option value="Lunes">Lunes</option>
                    <option value="Martes">Martes</option>
                    <option value="Miercoles">Miércoles</option>
                    <option value="Jueves">Jueves</option>
                    <option value="Viernes">Viernes</option>
                </select><br><br>
                <label for="hora">Hora: </label>
                <select name="horaInicio" id="hora">
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                </select>
                <label for="minutos">Minuto: </label>
                <select name="minutoInicio" id="minutos">
                    <option value="0">0</option>
                    <option value="15">15</option>
                    <option value="30">30</option>
                    <option value="45">45</option>
                </select><br><br>
                
                <input type="submit" value="Guardar"/>
                
          
            </div>
        </fieldset>
    </form><br><br>
   	<table class="table table-success table-striped">
		<thead>
			<tr class="align-middle">
				<th>Id</th>
				<th>Dia de la Semana</th>
				<th>Hora de Inicio</th>
				<th>Hora de Fin</th>
			</tr>
		</thead>
		<c:forEach var="disponibilidad" items="${listaDisponibilidad}">
			<tr class="align-middle">
				<td>${disponibilidad.id}</td>
				<td>${disponibilidad.diaSemana}</td>
				<td>${disponibilidad.horarioInicio.transformar()}</td>
				<td>${disponibilidad.horarioFin.transformar()}</td>
			</tr>
		</c:forEach>
	</table><br><br>
	
	<button type="button" class="btn btn-danger mx-5"
	onclick="location.href='MenuOpcionesDocenteController'"> Volver a Menú</button>
</body>
<%@ include file="/templates/footer.jsp"%>
</html>