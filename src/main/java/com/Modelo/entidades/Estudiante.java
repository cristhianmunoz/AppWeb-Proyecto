package com.Modelo.entidades;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Estudiante
 *
 */
@Entity
@DiscriminatorValue("Estudiante")
public class Estudiante extends Persona implements Serializable {

	
	public Estudiante(String cedula, String clave, String nombre, String apellido) {
		super(cedula, clave, nombre, apellido);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

	public Estudiante() {
		super();
		this.setTipoUsuario("Estudiante");
	}
	
   
}
