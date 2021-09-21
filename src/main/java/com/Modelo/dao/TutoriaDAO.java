package com.Modelo.dao;

import java.text.ParseException;
import java.util.List;

import com.Modelo.entidades.Fecha;
import com.Modelo.entidades.Tutoria;

public interface TutoriaDAO extends GenericDAO<Tutoria, Integer> {
	public boolean existeTuroria(Fecha fecha);
	public List<Tutoria> listarTutoriasPendientesPorDocente(int idDoc) throws ParseException;
}
