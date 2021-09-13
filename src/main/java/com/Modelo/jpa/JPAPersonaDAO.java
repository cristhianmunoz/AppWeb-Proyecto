package com.Modelo.jpa;

import com.Modelo.dao.PersonaDAO;

public class JPAPersonaDAO<T,ID> extends JPAGenericDAO<T, ID> implements PersonaDAO<T, ID> {

	public JPAPersonaDAO(Class<T> persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public T autorizar(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
