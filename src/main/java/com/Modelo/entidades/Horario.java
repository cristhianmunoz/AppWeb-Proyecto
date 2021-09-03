package com.Modelo.entidades;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Horario
 *
 */
@Entity
@Table(name = "Horario")
public class Horario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idHorario")
	private Integer id;
	@Column(name = "horaInicio")
	private int horaInicio;
	@Column(name = "horaFin")
	private int horaFin;
	

	public Horario() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public int getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}   
	public int getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(int horaFin) {
		this.horaFin = horaFin;
	}
	@Override
	public String toString() {
		return "Horario horaInicio=" + horaInicio + ", horaFin=" + horaFin ;
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
		if (!(object instanceof Horario)) {
			return false;
		}
		Horario other = (Horario) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}
}
