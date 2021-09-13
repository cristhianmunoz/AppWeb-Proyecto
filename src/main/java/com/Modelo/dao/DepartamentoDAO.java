package com.Modelo.dao;

import java.util.List;

import com.Modelo.entidades.Departamento;
import com.Modelo.entidades.Persona;

public interface DepartamentoDAO extends GenericDAO<Departamento, Integer> {
	public Departamento getDepartamentoByNombre(String nombreDepartamento);
	public List<Departamento> listarDepartamentos();
}
