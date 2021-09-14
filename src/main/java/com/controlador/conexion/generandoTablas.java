package com.controlador.conexion;

import java.util.List;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.Administrador;
import com.Modelo.entidades.DisponibilidadTutoria;
import com.Modelo.entidades.Docente;
import com.Modelo.entidades.Estudiante;
import com.Modelo.entidades.Persona;

public class generandoTablas {

	public static void main(String[] args) {
		
		/*Docente doc = DAOFactory.getFactory().getDocenteDAO().getByCedula("1111111111");
		List<DisponibilidadTutoria> disponibilidad = DAOFactory.getFactory().getDocenteDAO().getDisponibilidadByDocente(doc);
		for(DisponibilidadTutoria disp : disponibilidad) {
			System.out.println(disponibilidad);
		}*/

		List<Administrador> estudiantes = DAOFactory.getFactory().getAdministradorDAO().get();
		for(Administrador est : estudiantes) {
			System.out.println(est);
		}
	}

}
