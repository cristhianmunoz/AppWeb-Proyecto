package com.Modelo.jpa;

import java.util.List;

import com.Modelo.dao.EstudianteDAO;
import com.Modelo.entidades.Estudiante;

public class JPAEstudianteDAO extends JPAPersonaDAO<Estudiante, Integer> implements EstudianteDAO  {

	public JPAEstudianteDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Estudiante> get() {
		@SuppressWarnings("unchecked")
		List<Estudiante> estudiantes =em.createNativeQuery("select * from persona where tipoUsuario like 'Estudiante'",Estudiante.class).getResultList();
		return estudiantes;
	}
	
	

}
