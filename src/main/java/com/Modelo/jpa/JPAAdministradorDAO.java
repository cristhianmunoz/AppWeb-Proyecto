package com.Modelo.jpa;

import com.Modelo.dao.AdministradorDAO;
import com.Modelo.entidades.Administrador;

public class JPAAdministradorDAO extends JPAGenericDAO<Administrador, Integer> implements AdministradorDAO {

	public JPAAdministradorDAO() {
		super(Administrador.class);
		
	}

}
