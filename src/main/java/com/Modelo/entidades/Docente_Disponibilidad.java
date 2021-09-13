package com.Modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Docente_Disponibilidad")
public class Docente_Disponibilidad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDocente_Disponibilidad")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "idDisponibilidad")
	private  DisponibilidadTutoria disponibilidad;
	
	@ManyToOne
	@JoinColumn(name = "idDocente")
	private Docente docente;
	
	
	public Docente_Disponibilidad() {
		super();
	}


	public Docente_Disponibilidad(DisponibilidadTutoria disponibilidad, Docente docente) {
		super();
		this.disponibilidad = disponibilidad;
		this.docente = docente;
	}


	public DisponibilidadTutoria getDisponibilidad() {
		return disponibilidad;
	}


	public void setDisponibilidad(DisponibilidadTutoria disponibilidad) {
		this.disponibilidad = disponibilidad;
	}


	public Docente getDocente() {
		return docente;
	}


	public void setDocente(Docente docente) {
		this.docente = docente;
	}






	
	
	
}
