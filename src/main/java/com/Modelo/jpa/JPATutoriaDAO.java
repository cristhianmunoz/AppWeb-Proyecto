package com.Modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import com.Modelo.dao.TutoriaDAO;
import com.Modelo.entidades.Fecha;
import com.Modelo.entidades.Tutoria;

public class JPATutoriaDAO extends JPAGenericDAO<Tutoria, Integer> implements TutoriaDAO {

	public JPATutoriaDAO() {
		super(Tutoria.class);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean existeTuroria(Fecha fecha) {
		boolean existe = false;
		String sentenciaSQL = "SELECT * FROM tutoria t LEFT JOIN fecha f ON t.fecha = f.idFecha WHERE f.dia = ? AND f.mes = ? AND f.anio = ?";
		Query query = em.createNativeQuery(sentenciaSQL);
		query.setParameter(1, fecha.getDia());
		query.setParameter(2, fecha.getMes());
		query.setParameter(3, fecha.getAnio());
		Tutoria resultado = (Tutoria)query.getSingleResult();
		if(resultado!=null) {
			existe = true;
		}
		return existe;
	}
	

	
}
