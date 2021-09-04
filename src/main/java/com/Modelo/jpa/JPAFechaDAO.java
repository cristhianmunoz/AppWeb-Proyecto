package com.Modelo.jpa;

import com.Modelo.dao.FechaDAO;
import com.Modelo.entidades.Fecha;

public class JPAFechaDAO extends JPAGenericDAO<Fecha, Integer> implements FechaDAO {

	public JPAFechaDAO() {
		super(Fecha.class);
		// TODO Auto-generated constructor stub
	}

}
