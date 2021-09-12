package com.Modelo.dao;

import com.Modelo.entidades.Estudiante;

public interface EstudianteDAO extends PersonaDAO {
	public Estudiante autorizar(String username, String password);
}
