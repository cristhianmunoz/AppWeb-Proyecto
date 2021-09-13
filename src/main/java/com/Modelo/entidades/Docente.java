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
	
	@ManyToMany(targetEntity = DisponibilidadTutoria.class)
	private Set<DisponibilidadTutoria> disponibilidadTutoriaSet;
	
	public Docente() {
		super();
	}
	
	public Set<DisponibilidadTutoria> getDisponibilidadTutorias() {
		return disponibilidadTutoriaSet;
	}
	public void setDisponibilidadTutorias(Set<DisponibilidadTutoria> disponibilidadTutorias) {
		this.disponibilidadTutoriaSet = disponibilidadTutorias;
	}
	
	public void addDisponibilidad(DisponibilidadTutoria disponibilidad) {
		disponibilidadTutoriaSet.add(disponibilidad);
	}

}
