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
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Docente)) {
			return false;
		}
		Docente other = (Docente) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}
}
