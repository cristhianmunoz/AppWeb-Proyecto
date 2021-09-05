package com.Modelo.entidades;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Tutoria
 *
 */
@Entity
@Table(name = "Tutoria")
public class Tutoria implements Serializable {

	private static final long serialVersionUID = 1L; 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTutoria")
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "docente")
	private Docente docente;
	@ManyToOne
	@JoinColumn(name = "estudiante")
	private Estudiante estudiante;
	@ManyToOne
	@JoinColumn(name = "horario")
	private Horario horario;
	@Column(name = "estado")
	private String estado;
	

	public Tutoria() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Tutoria estado=" + estado ;
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
		if (!(object instanceof Tutoria)) {
			return false;
		}
		Tutoria other = (Tutoria) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}
}
