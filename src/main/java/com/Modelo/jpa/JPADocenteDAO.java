package com.Modelo.jpa;

import com.Modelo.dao.DocenteDAO;
import com.Modelo.entidades.Docente;

public class JPADocenteDAO extends JPAGenericDAO<Docente, Integer> implements DocenteDAO {

	public JPADocenteDAO() {
		super(Docente.class);
		// TODO Auto-generated constructor stub
	}

}
