package com.controlador.conexion;

import java.util.Iterator;
import java.util.List;

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
		
		List<Docente> docentes =  DAOFactory.getFactory().getDocenteDAO().getDocentesByDepartamento("Proyecto Inclusión Digital");
		for (Docente docente : docentes) {
			System.out.println(docente);
		}
	}

}
