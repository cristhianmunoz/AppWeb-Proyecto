package com.Modelo.jpa;

import java.util.List;

import com.Modelo.dao.AdministradorDAO;
import com.Modelo.entidades.Administrador;
import com.Modelo.entidades.Persona;

public class JPAAdministradorDAO extends JPAPersonaDAO<Administrador, Integer> implements AdministradorDAO {

	public JPAAdministradorDAO() {
		super(Administrador.class);
		
	}
	
	
	@Override
	public List<Persona> listarUsuarios(){
		
		return null;
	}

}
