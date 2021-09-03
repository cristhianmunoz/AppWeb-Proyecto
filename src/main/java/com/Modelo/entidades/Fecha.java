package com.Modelo.entidades;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Fecha
 *
 */
@Entity
@Table(name="Fecha")
public class Fecha implements Serializable {

	private static final long serialVersionUID = 1L;  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idFecha")
	private Integer id;
	@Column(name = "dia")
	private int dia;
	@Column(name = "mes")
	private int mes;
	@Column(name = "anio")
	private int anio;
	

	public Fecha() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public int getDia() {
		return this.dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}   
	public int getMes() {
		return this.mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}   
	public int getAnio() {
		return this.anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	@Override
	public String toString() {
		return "Fecha dia=" + dia + ", mes=" + mes + ", anio=" + anio ;
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
		if (!(object instanceof Fecha)) {
			return false;
		}
		Fecha other = (Fecha) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}
   
}
