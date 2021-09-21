package com.Modelo.jpa;

import javax.persistence.Query;

import com.Modelo.dao.PersonaDAO;

public class JPAPersonaDAO<T,ID> extends JPAGenericDAO<T, ID> implements PersonaDAO<T, ID> {

	public JPAPersonaDAO(Class<T> persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public T autorizar(String username, String password) {
		String sentenciaJPQL = "SELECT e FROM Persona e WHERE e.cedula = :param_cedula AND e.clave = :param_clave";
		Query query = em.createQuery(sentenciaJPQL);
		query.setParameter("param_cedula", username);
		query.setParameter("param_clave", password);
		@SuppressWarnings("unchecked")
		T resultado = (T)query.getSingleResult();
		return resultado;
	}
	
	public T getByCedula(String cedula) {
		String sentenciaJPQL = "SELECT e FROM Persona e WHERE e.cedula = :param_cedula";
		Query query = em.createQuery(sentenciaJPQL);
		query.setParameter("param_cedula", cedula);
		@SuppressWarnings("unchecked")
		T resultado = (T)query.getSingleResult();
		return resultado;
	}
	

}
