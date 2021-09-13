package com.Modelo.dao;

import com.Modelo.jpa.JPADAOFactory;

public abstract class DAOFactory {
	protected static DAOFactory factory = new JPADAOFactory();
	public static  DAOFactory getFactory() {
		return factory;
	}
	public abstract PersonaDAO getPersonaDAO();
	public abstract DepartamentoDAO  getDepartamentoDAO();
	public abstract AdministradorDAO getAdministradorDAO();
	public abstract DisponibilidadTutoriaDAO getDisponibilidadTutoriaDAO();
	public abstract DocenteDAO getDocenteDAO();
	public abstract EstudianteDAO getEstudianteDAO();
	public abstract FechaDAO getFechaDAO();
	public abstract HorarioDAO getHorarioDAO();
	public abstract TutoriaDAO getTutoriaDAO();
	public abstract Docente_DisponibilidadDAO getDocente_DisponibilidadDAO();

}
