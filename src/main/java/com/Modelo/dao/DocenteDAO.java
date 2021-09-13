package com.Modelo.dao;

import com.Modelo.entidades.Docente;

public interface DocenteDAO extends GenericDAO<Docente, Integer> {
	public Docente autorizar(String username, String password);
}
