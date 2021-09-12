package com.Modelo.jpa;

import javax.persistence.Query;

import com.Modelo.dao.EstudianteDAO;
import com.Modelo.entidades.Estudiante;
import com.Modelo.entidades.Persona;

public class JPAEstudianteDAO extends JPAGenericDAO<Estudiante, Integer> implements EstudianteDAO {

	public JPAEstudianteDAO() {
		super(Estudiante.class);
		// TODO Auto-generated constructor stub
	}


	@Override
	public Estudiante autorizar(String username, String password) {
		String sentenciaJPQL = "SELECT e FROM Persona e WHERE e.usuario = :param_nombre AND e.password = :param_clave";
		Query query = em.createQuery(sentenciaJPQL);
		query.setParameter("param_nombre", username);
		query.setParameter("param_clave", password);
		Estudiante resultado = (Estudiante)query.getSingleResult();
		return resultado;
	}
}
