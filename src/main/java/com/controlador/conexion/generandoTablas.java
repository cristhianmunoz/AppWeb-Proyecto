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
		
		DAOFactory.getFactory().getDepartamentoDAO().getDepartamentoByNombre(null);
		DAOFactory.getFactory().getEstudianteDAO().getByCedula(null);
		DAOFactory.getFactory().getDocenteDAO().getByCedula(null);
		DAOFactory.getFactory().getAdministradorDAO().getByCedula(null);
		
		
	}

}
