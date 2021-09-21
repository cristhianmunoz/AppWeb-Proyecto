package com.Modelo.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Docente
 *
 */
@Entity
@DiscriminatorValue("Docente")
public class Docente extends Persona implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	//Foreign Key Departamento Muchos Profes - Un departamento
	@ManyToOne
	@JoinColumn(name = "departamento")
	private Departamento departamento;
	
		public Docente() {
		super();
		this.setTipoUsuario("Docente");
		}

		public Docente(String cedula, String clave, String nombre, String apellido,Departamento departamento) {
			super(cedula, clave, nombre, apellido);
			this.departamento=departamento;
		}

		public Departamento getDepartamento() {
			return departamento;
		}

		public void setDepartamento(Departamento departamento) {
			this.departamento = departamento;
		}

		


}
