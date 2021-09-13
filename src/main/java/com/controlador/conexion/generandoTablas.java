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
		
		System.out.println( DAOFactory.getFactory().getDepartamentoDAO().getDepartamentoByNombre("Proyecto Inclusión Digital"));
		System.out.println( DAOFactory.getFactory().getEstudianteDAO().getByCedula("0000000000"));
		System.out.println( DAOFactory.getFactory().getDocenteDAO().getByCedula("222222222"));
		System.out.println( DAOFactory.getFactory().getAdministradorDAO().getByCedula("1234567890"));
		
		
	}

}
