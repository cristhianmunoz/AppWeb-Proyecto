package com.Modelo.jpa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
		@SuppressWarnings("unchecked")
		List<Tutoria> resultado = (List<Tutoria>) query.getResultList();
		if(resultado.size()!=0) {
			existe = true;
		}
		return existe;
	}



	@Override
	public List<Tutoria> listarTutoriasPendientesPorDocente(int  idDoc){
		List<Tutoria> tutorias = this.get();
		List<Tutoria> tutoriasDoc = new ArrayList<Tutoria>();
		Date fechaActual = new Date();
		
		for(Tutoria tutoria : tutorias) {
			SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
			Date fechaTutoria = null;
			try {
				fechaTutoria = sf.parse(tutoria.getFecha().toString());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(tutoria.getDocente().getId()==idDoc && fechaTutoria.after(fechaActual)) {
				tutoriasDoc.add(tutoria);
			}
		}
		
		return tutoriasDoc;
	}
	

	
}
