package com.controlador.conexion;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.Departamento;
import com.Modelo.entidades.DisponibilidadTutoria;
import com.Modelo.entidades.Horario;

public class generandoTablas {

	public static void main(String[] args) {
		Departamento d = new Departamento();
		DAOFactory.getFactory().getDepartamentoDAO().create(d);
		
		
		
	}

}
