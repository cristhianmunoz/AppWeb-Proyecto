package com.controlador.conexion;

import com.Modelo.dao.DAOFactory;
import com.Modelo.dao.GenericDAO;
import com.Modelo.entidades.Departamento;
import com.Modelo.entidades.DisponibilidadTutoria;
import com.Modelo.entidades.Docente;
import com.Modelo.entidades.Horario;

public class generandoTablas {

	public static void main(String[] args) {
		Departamento d = DAOFactory.getFactory().getDepartamentoDAO().getById(2);
		Docente doc = new Docente("1111111111","pedro123","Pedro","Gonzales",d);
		DAOFactory.getFactory().getDocenteDAO().create(doc);		
	}

}
