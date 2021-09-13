package com.Modelo.dao;

import com.Modelo.entidades.Departamento;

public interface DepartamentoDAO extends GenericDAO<Departamento, Integer> {
	public Departamento getDepartamentoByNombre(String nombreDepartamento);
}
