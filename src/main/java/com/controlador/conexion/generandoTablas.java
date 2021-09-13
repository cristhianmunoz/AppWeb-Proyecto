package com.controlador.conexion;

import java.util.List;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.Docente;
import com.Modelo.entidades.Persona;

public class generandoTablas {

	public static void main(String[] args) {
		
		List<Persona> personas =  DAOFactory.getFactory().getAdministradorDAO().listarUsuarios();
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}

}
