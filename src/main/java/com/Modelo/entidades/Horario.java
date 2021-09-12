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
	@Column(name = "hora")
	private int hora;
	@Column(name = "minuto")
	private int minuto;
	
	@ManyToOne
	@JoinColumn(name = "disponibilidadTutoria")
	private DisponibilidadTutoria disponbilidadTutoria;


	public Horario() {
		super();
	}  
	
	
	
	public Horario(int hora, int minuto) {
		super();
		this.hora = hora;
		this.minuto = minuto;
	}



	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	@Override
	public String toString() {
		return "Horario hora=" + hora + ", minuto=" + minuto ;
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
