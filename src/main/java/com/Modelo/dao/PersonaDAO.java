package com.Modelo.dao;

import java.util.List;

import com.Modelo.entidades.Persona;

public interface PersonaDAO<T, ID> extends GenericDAO<T, ID> {

	public T autorizar(String username, String password);
	public T getByCedula(String cedula);
}
