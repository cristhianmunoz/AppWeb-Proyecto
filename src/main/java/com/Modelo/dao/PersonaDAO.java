package com.Modelo.dao;

public interface PersonaDAO<T, ID> extends GenericDAO<T, ID> {

	public T autorizar(String username, String password);
	public T getByCedula(String cedula);
}
