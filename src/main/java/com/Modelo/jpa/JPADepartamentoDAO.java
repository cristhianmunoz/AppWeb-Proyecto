package com.Modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import com.Modelo.dao.DepartamentoDAO;
import com.Modelo.entidades.Departamento;

public class JPADepartamentoDAO extends JPAGenericDAO<Departamento, Integer> implements DepartamentoDAO {

	public JPADepartamentoDAO() {
		super(Departamento.class);
		
	}
	public Departamento getDepartamentoByNombre(String nombreDepartamento) {
		String sentenciaJPQL = "SELECT d FROM Departamento d WHERE d.nombre = :param_nombre";
		Query query = em.createQuery(sentenciaJPQL);
		query.setParameter("param_nombre", nombreDepartamento);
		Departamento depa = (Departamento)query.getSingleResult();
		return depa;
	}
	
	@Override
	public List<Departamento> get() {
		String sentenciaJPQL = "SELECT d FROM Departamento d ";
		Query query = em.createQuery(sentenciaJPQL);
		@SuppressWarnings("unchecked")
		List<Departamento> depas = query.getResultList();
		return depas;
	}

}
