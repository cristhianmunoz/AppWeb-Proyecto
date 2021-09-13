package com.Modelo.jpa;

import javax.persistence.Query;

import com.Modelo.dao.DocenteDAO;
import com.Modelo.entidades.Docente;
import com.Modelo.entidades.Estudiante;

public class JPADocenteDAO extends JPAPersonaDAO<Docente, Integer> implements DocenteDAO {

	public JPADocenteDAO() {
		super(Docente.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Docente autorizar(String username, String password) {
		String sentenciaJPQL = "SELECT e FROM Persona e WHERE e.usuario = :param_nombre AND e.password = :param_clave";
		Query query = em.createQuery(sentenciaJPQL);
		query.setParameter("param_nombre", username);
		query.setParameter("param_clave", password);
		Docente resultado = (Docente)query.getSingleResult();
		return resultado;
	}

}
