package com.Modelo.jpa;

import com.Modelo.dao.Docente_DisponibilidadDAO;
import com.Modelo.entidades.Docente_Disponibilidad;

public class JPADocente_AdministradorDAO extends JPAGenericDAO<Docente_Disponibilidad, Integer> implements Docente_DisponibilidadDAO {

	public JPADocente_AdministradorDAO() {
		super(Docente_Disponibilidad.class);
		// TODO Auto-generated constructor stub
	}

}
