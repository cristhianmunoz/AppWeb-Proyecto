package com.Modelo.jpa;

import com.Modelo.dao.Docente_DisponibilidadDAO;
import com.Modelo.entidades.Docente_Disponibilidad;

public class JPADocente_DisponibilidadDAO extends JPAGenericDAO<Docente_Disponibilidad, Integer> implements Docente_DisponibilidadDAO {

	public JPADocente_DisponibilidadDAO() {
		super(Docente_Disponibilidad.class);
		// TODO Auto-generated constructor stub
	}

}
