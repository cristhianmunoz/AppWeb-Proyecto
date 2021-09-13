package com.Modelo.jpa;

import java.util.List;

import com.Modelo.dao.DocenteDAO;
import com.Modelo.entidades.DisponibilidadTutoria;
import com.Modelo.entidades.Docente;

public class JPADocenteDAO extends JPAPersonaDAO<Docente, Integer> implements DocenteDAO {

	public JPADocenteDAO() {
		super(Docente.class);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Docente> get() {
		@SuppressWarnings("unchecked")
		List<Docente> docentes =em.createNativeQuery("select * from persona where tipoUsuario like 'Docente'",Docente.class).getResultList();
		return docentes;
	}

	public List <DisponibilidadTutoria> getDisponibilidadByDocente(Docente docente){
		return null;
	}

	@Override
	public List<Docente> getDocentesByDepartamento(String nombreDepartamento) {
		List<Docente> docentes =this.get();
		for(Docente docente : docentes) {
			if(docente.getDepartamento().getNombre().equals(nombreDepartamento)==false) {
				docentes.remove(docente);
			}
		}
		return docentes;
	}

}
