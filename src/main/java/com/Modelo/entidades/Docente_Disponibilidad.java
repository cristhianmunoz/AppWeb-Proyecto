package com.Modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@Column(name = "idDisponibilidad")
	private int idDisponibilidad;
	
	@ManyToOne
	@Column(name = "idDocente")
	private int idDocente;

	
	
	public Docente_Disponibilidad() {
		super();
	}



	public Docente_Disponibilidad(int idDisponibilidad, int idDocente) {
		super();
		this.idDisponibilidad = idDisponibilidad;
		this.idDocente = idDocente;
	}



	public int getIdDisponibilidad() {
		return idDisponibilidad;
	}



	public void setIdDisponibilidad(int idDisponibilidad) {
		this.idDisponibilidad = idDisponibilidad;
	}



	public int getIdDocente() {
		return idDocente;
	}



	public void setIdDocente(int idDocente) {
		this.idDocente = idDocente;
	}
	
	
	
	
}
