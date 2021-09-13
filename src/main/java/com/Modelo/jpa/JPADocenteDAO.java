package com.Modelo.jpa;

import java.util.List;

import com.Modelo.dao.DocenteDAO;
import com.Modelo.entidades.DisponibilidadTutoria;
import com.Modelo.entidades.Docente;

public class JPADocenteDAO extends JPAPersonaDAO<Docente, Integer> implements DocenteDAO {

	public JPADocenteDAO() {
		super(Docente.class);
		// TODO Auto-generated constructor stub
	}
	
	public List <DisponibilidadTutoria> getDisponibilidadByDocente(Docente docente){
		return null;
	}

}
