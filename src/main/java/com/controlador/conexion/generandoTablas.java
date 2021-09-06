package com.controlador.conexion;

import com.modelo.dao.DAOFactory;
import com.modelo.entidades.Departamento;
import com.modelo.entidades.DisponibilidadTutoria;
import com.modelo.entidades.Horario;

public class generandoTablas {

	public static void main(String[] args) {
		DisponibilidadTutoria disponibilidad = new DisponibilidadTutoria();
		DisponibilidadTutoria disponibilidad2 = new DisponibilidadTutoria();
		DisponibilidadTutoria disponibilidad3 = new DisponibilidadTutoria();
		DisponibilidadTutoria disponibilidad4 = new DisponibilidadTutoria();
		DisponibilidadTutoria disponibilidad5 = new DisponibilidadTutoria();
		disponibilidad.setDiaSemana("Lunes");
		disponibilidad2.setDiaSemana("Martes");
		disponibilidad3.setDiaSemana("Miercoles");
		disponibilidad4.setDiaSemana("Jueves");
		disponibilidad5.setDiaSemana("Viernes");
		DAOFactory.getFactory().getDisponibilidadTutoriaDAO().create(disponibilidad);
		DAOFactory.getFactory().getDisponibilidadTutoriaDAO().create(disponibilidad2);
		DAOFactory.getFactory().getDisponibilidadTutoriaDAO().create(disponibilidad3);
		DAOFactory.getFactory().getDisponibilidadTutoriaDAO().create(disponibilidad4);
		DAOFactory.getFactory().getDisponibilidadTutoriaDAO().create(disponibilidad5);
		Horario h1 = new Horario();
		h1.
		
	}

}
