package com.Modelo.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import com.Modelo.dao.DocenteDAO;
import com.Modelo.entidades.DisponibilidadTutoria;
import com.Modelo.entidades.Docente;
import com.Modelo.entidades.Docente_Disponibilidad;

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
		String sentenciaJPQL = "SELECT e FROM Docente_Disponibilidad e WHERE e.docente = :param_docente";
		Query query = em.createQuery(sentenciaJPQL);
		query.setParameter("param_docente", docente);
		@SuppressWarnings("unchecked")
		List<Docente_Disponibilidad> resultado = query.getResultList();
		List<DisponibilidadTutoria> disponibilidad = new ArrayList<DisponibilidadTutoria>();
		for(Docente_Disponibilidad d: resultado) {
			disponibilidad.add(d.getDisponibilidad());
		}
		
		return disponibilidad;
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
