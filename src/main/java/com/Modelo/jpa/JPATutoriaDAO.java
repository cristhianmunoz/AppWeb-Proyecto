package com.Modelo.jpa;

import com.Modelo.dao.TutoriaDAO;
import com.Modelo.entidades.Tutoria;

public class JPATutoriaDAO extends JPAGenericDAO<Tutoria, Integer> implements TutoriaDAO {

	public JPATutoriaDAO() {
		super(Tutoria.class);
		// TODO Auto-generated constructor stub
	}


}
