package com.Modelo.jpa;

import com.Modelo.dao.DisponibilidadTutoriaDAO;
import com.Modelo.entidades.DisponibilidadTutoria;

public class JPADisponibilidadTutoriaDAO extends JPAGenericDAO<DisponibilidadTutoria, Integer> implements DisponibilidadTutoriaDAO {

	public JPADisponibilidadTutoriaDAO() {
		super(DisponibilidadTutoria.class);
		// TODO Auto-generated constructor stub
	}
	

}
