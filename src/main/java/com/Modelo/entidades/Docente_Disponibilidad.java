package com.Modelo.entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
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


	@Override
	public String toString() {
		return "Docente_Disponibilidad [id=" + id + ", disponibilidad=" + disponibilidad + ", docente=" + docente + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(disponibilidad, docente, id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Docente_Disponibilidad other = (Docente_Disponibilidad) obj;
		return Objects.equals(disponibilidad, other.disponibilidad) && Objects.equals(docente, other.docente)
				&& Objects.equals(id, other.id);
	}

	




	
	
	
}
