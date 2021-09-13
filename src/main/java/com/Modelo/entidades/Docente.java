package com.Modelo.entidades;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Docente
 *
 */
@Entity
@DiscriminatorValue("Docente")
public class Docente extends Persona implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	//Foreign Key Departamento Muchos Profes - Un departamento
	@ManyToOne
	@JoinColumn(name = "departamento")
	private Departamento departamento;
	
	
	public Docente() {
		super();
	}
	


}
