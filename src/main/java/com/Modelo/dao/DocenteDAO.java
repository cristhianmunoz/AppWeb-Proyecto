package com.Modelo.dao;

import java.util.List;

import com.Modelo.entidades.DisponibilidadTutoria;
import com.Modelo.entidades.Docente;

public interface DocenteDAO extends PersonaDAO<Docente, Integer> {
	public List <DisponibilidadTutoria> getDisponibilidadByDocente(Docente docente);
}
