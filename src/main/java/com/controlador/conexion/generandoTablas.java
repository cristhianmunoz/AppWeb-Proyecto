package com.controlador.conexion;

import com.Modelo.dao.DAOFactory;
import com.Modelo.dao.GenericDAO;
import com.Modelo.entidades.Departamento;
import com.Modelo.entidades.DisponibilidadTutoria;
import com.Modelo.entidades.Docente;
import com.Modelo.entidades.Docente_Disponibilidad;
import com.Modelo.entidades.Estudiante;
import com.Modelo.entidades.Horario;

public class generandoTablas {

	public static void main(String[] args) {
		Departamento d =new Departamento("Proyecto Inclusión Digital");
		DAOFactory.getFactory().getDepartamentoDAO().create(d);
		Estudiante estudiante = new Estudiante("0000000000","luis123","Luis","Agora");
		Docente doc = new Docente("222222222","julio123","Julio","Loza",d);
		DAOFactory.getFactory().getDocenteDAO().create(doc);
		DAOFactory.getFactory().getEstudianteDAO().create(estudiante);
		Horario horario = new Horario(8, 30);
		Horario horarioFin = new Horario(horario.getHora(),horario.getMinuto()+15); 
		DAOFactory.getFactory().getHorarioDAO().create(horario);
		DAOFactory.getFactory().getHorarioDAO().create(horarioFin);
		DisponibilidadTutoria disponibilidad = new DisponibilidadTutoria("Martes", horario, horarioFin);
		DAOFactory.getFactory().getDisponibilidadTutoriaDAO().create(disponibilidad);
		Docente_Disponibilidad doc_dispo = new Docente_Disponibilidad(disponibilidad, doc);
		DAOFactory.getFactory().getDocente_DisponibilidadDAO().create(doc_dispo);
		
	}

}
