package com.Modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import com.Modelo.dao.AdministradorDAO;
import com.Modelo.entidades.Administrador;
import com.Modelo.entidades.Docente;
import com.Modelo.entidades.Persona;

public class JPAAdministradorDAO extends JPAPersonaDAO<Administrador, Integer> implements AdministradorDAO {

	public JPAAdministradorDAO() {
		super(Administrador.class);
		
	}

	@Override
	public Administrador autorizar(String username, String password) {
		String sentenciaJPQL = "SELECT e FROM Persona e WHERE e.usuario = :param_nombre AND e.password = :param_clave";
		Query query = em.createQuery(sentenciaJPQL);
		query.setParameter("param_nombre", username);
		query.setParameter("param_clave", password);
		Administrador resultado = (Administrador)query.getSingleResult();
		return resultado;
	}
	
	public List<Persona> listarUsuarios(){
		
		return null;
	}

}
