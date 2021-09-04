package com.Modelo.jpa;

import com.Modelo.dao.HorarioDAO;
import com.Modelo.entidades.Horario;

public class JPAHorarioDAO extends JPAGenericDAO<Horario, Integer> implements HorarioDAO {

	public JPAHorarioDAO() {
		super(Horario.class);
		// TODO Auto-generated constructor stub
	}

	

}
