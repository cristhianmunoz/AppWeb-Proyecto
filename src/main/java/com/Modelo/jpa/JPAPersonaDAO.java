package com.Modelo.jpa;

import com.Modelo.dao.PersonaDAO;
import com.Modelo.entidades.Persona;

public class JPAPersonaDAO extends JPAGenericDAO<Persona, Integer> implements PersonaDAO {

	public JPAPersonaDAO() {
		super(Persona.class);
		// TODO Auto-generated constructor stub
	}


}
