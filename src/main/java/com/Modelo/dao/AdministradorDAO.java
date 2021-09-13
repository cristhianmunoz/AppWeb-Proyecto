package com.Modelo.dao;

import java.util.List;

import com.Modelo.entidades.Administrador;
import com.Modelo.entidades.Persona;

import java.util.List;

import com.Modelo.entidades.*;

public interface AdministradorDAO extends PersonaDAO<Administrador, Integer> {

	public List<Persona> listarUsuarios();

}
