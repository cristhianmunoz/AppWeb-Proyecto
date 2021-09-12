package com.Modelo.dao;

import com.Modelo.entidades.Docente;

public interface DocenteDAO extends PersonaDAO {
	public Docente autorizar(String username, String password);
}
