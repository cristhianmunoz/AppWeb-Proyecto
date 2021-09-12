package com.Modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import com.Modelo.dao.PersonaDAO;
import com.Modelo.entidades.Persona;

public class JPAPersonaDAO<T, ID> extends JPAGenericDAO<T, ID> implements PersonaDAO {

	public JPAPersonaDAO() {
		super(Persona.class);
		// TODO Auto-generated constructor stub
	}
}
