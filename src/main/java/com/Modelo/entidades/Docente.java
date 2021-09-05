package com.Modelo.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Docente
 *
 */
@Entity
@Table(name = "Docente")
public class Docente extends Persona implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private List<DisponibilidadTutoria> disponibilidadTutorias ;
	public Docente() {
		super();
	}
	public List<DisponibilidadTutoria> getDisponibilidadTutorias() {
		return disponibilidadTutorias;
	}
	public void setDisponibilidadTutorias(List<DisponibilidadTutoria> disponibilidadTutorias) {
		this.disponibilidadTutorias = disponibilidadTutorias;
	}

}
