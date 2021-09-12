package com.Modelo.dao;

import com.Modelo.entidades.Administrador;


public interface AdministradorDAO extends GenericDAO<Administrador, Integer> {
	public Administrador autorizar(String username, String password);
}
