package com.Modelo.jpa;

import com.Modelo.dao.DepartamentoDAO;
import com.Modelo.entidades.Departamento;

public class JPADepartamentoDAO extends JPAGenericDAO<Departamento, Integer> implements DepartamentoDAO {

	public JPADepartamentoDAO() {
		super(Departamento.class);
		// TODO Auto-generated constructor stub
	}



}
