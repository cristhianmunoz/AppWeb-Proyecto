package com.Modelo.entidades;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: DisponibilidadTutoria
 *
 */
@Entity
@Table(name = "Disponibilidad")
public class DisponibilidadTutoria implements Serializable {

	private static final long serialVersionUID = 1L;	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDisponibilidadTutorias")
	private Integer id;
	@Column(name = "diaSemana")
	private String diaSemana;


	public DisponibilidadTutoria() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getDiaSemana() {
		return this.diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
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
		if (!(object instanceof DisponibilidadTutoria)) {
			return false;
		}
		DisponibilidadTutoria other = (DisponibilidadTutoria) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}
}
