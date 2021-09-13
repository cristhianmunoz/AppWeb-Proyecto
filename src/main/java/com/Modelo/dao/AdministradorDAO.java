package com.Modelo.dao;

import com.Modelo.entidades.Administrador;

import java.util.List;

import com.Modelo.entidades.*;

public interface AdministradorDAO extends PersonaDAO<Administrador, Integer> {
	
	public List<Persona> listarUsuarios();
}
