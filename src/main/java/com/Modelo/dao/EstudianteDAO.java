package com.Modelo.dao;

import com.Modelo.entidades.Estudiante;

public interface EstudianteDAO extends GenericDAO<Estudiante, Integer> {
	public Estudiante autorizar(String username, String password);
}
