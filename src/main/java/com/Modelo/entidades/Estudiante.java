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

	
	private static final long serialVersionUID = 1L;

	public Estudiante() {
		super();
	}
	
	public boolean cambiarClave(String claveAnterior, String claveNueva) {
		return true;
	}
   
}
