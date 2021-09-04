package com.Modelo.jpa;

import com.Modelo.dao.EstudianteDAO;
import com.Modelo.entidades.Estudiante;

public class JPAEstudianteDAO extends JPAGenericDAO<Estudiante, Integer> implements EstudianteDAO {

	public JPAEstudianteDAO() {
		super(Estudiante.class);
		// TODO Auto-generated constructor stub
	}


}
