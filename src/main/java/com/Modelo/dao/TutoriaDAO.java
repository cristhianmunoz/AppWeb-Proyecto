package com.Modelo.dao;

import com.Modelo.entidades.Fecha;
import com.Modelo.entidades.Tutoria;

public interface TutoriaDAO extends GenericDAO<Tutoria, Integer> {
	public boolean existeTuroria(Fecha fecha);
}
