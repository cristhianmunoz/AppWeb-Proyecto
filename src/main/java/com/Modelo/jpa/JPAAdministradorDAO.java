package com.Modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import com.Modelo.dao.AdministradorDAO;
import com.Modelo.entidades.Administrador;
import com.Modelo.entidades.Persona;

public class JPAAdministradorDAO extends JPAPersonaDAO<Administrador, Integer> implements AdministradorDAO {

	public JPAAdministradorDAO() {
		super(Administrador.class);
		
	}

	@Override

	public List<Persona> listarUsuarios() {
		String sentenciaJPQL = "SELECT u FROM Persona u";
		Query query = em.createQuery(sentenciaJPQL);
		@SuppressWarnings("unchecked")
		List<Persona> personas =query.getResultList();
		return personas;

	}


	
	

}
