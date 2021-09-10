package com.Modelo.jpa;

import com.Modelo.dao.AdministradorDAO;
import com.Modelo.dao.DAOFactory;
import com.Modelo.dao.DepartamentoDAO;
import com.Modelo.dao.DisponibilidadTutoriaDAO;
import com.Modelo.dao.DocenteDAO;
import com.Modelo.dao.EstudianteDAO;
import com.Modelo.dao.FechaDAO;
import com.Modelo.dao.HorarioDAO;
import com.Modelo.dao.PersonaDAO;
import com.Modelo.dao.TutoriaDAO;

public class JPADAOFactory extends DAOFactory{

	@Override
	public PersonaDAO getPersonaDAO() {
		// TODO Auto-generated method stub
		return new JPAPersonaDAO();
	}

	@Override
	public DepartamentoDAO getDepartamentoDAO() {
		// TODO Auto-generated method stub
		return new JPADepartamentoDAO();
	}

	@Override
	public AdministradorDAO getAdministradorDAO() {
		// TODO Auto-generated method stub
		return new JPAAdministradorDAO();
	}

	@Override
	public DisponibilidadTutoriaDAO getDisponibilidadTutoriaDAO() {
		// TODO Auto-generated method stub
		return new JPADisponibilidadTutoriaDAO();
	}

	@Override
	public DocenteDAO getDocenteDAO() {
		// TODO Auto-generated method stub
		return new JPADocenteDAO();
	}

	@Override
	public EstudianteDAO getEstudianteDAO() {
		// TODO Auto-generated method stub
		return new JPAEstudianteDAO();
	}

	@Override
	public FechaDAO getFechaDAO() {
		// TODO Auto-generated method stub
		return new JPAFechaDAO();
	}

	@Override
	public HorarioDAO getHorarioDAO() {
		// TODO Auto-generated method stub
		return new JPAHorarioDAO();
	}

	@Override
	public TutoriaDAO getTutoriaDAO() {
		// TODO Auto-generated method stub
		return new JPATutoriaDAO();
	}

}
