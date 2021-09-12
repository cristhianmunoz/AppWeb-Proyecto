package com.Modelo.jpa;

import java.util.List;

import com.Modelo.dao.AdministradorDAO;
import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.Administrador;
import com.Modelo.entidades.Estudiante;
import com.Modelo.entidades.Persona;

public class JPAAdministradorDAO extends JPAGenericDAO<Administrador, Integer> implements AdministradorDAO {

	public JPAAdministradorDAO() {
		super(Administrador.class);
		
	}

	@Override
	public Administrador autorizar(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Persona> listarUsuarios(){
		List <Administrador> administradores = DAOFactory.getFactory().getAdministradorDAO().get();
		List <Persona> docentes = DAOFactory.getFactory().getDocenteDAO().get();
		List <Persona> estudiantes = DAOFactory.getFactory().getEstudianteDAO().get();
		return null;
	}

}
