package com.controlador.administrativo;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Modelo.entidades.Administrador;
import com.Modelo.entidades.Docente;
import com.Modelo.entidades.Estudiante;
import com.Modelo.jpa.JPADAOFactory;

/**
 * Servlet implementation class ActualizarUsuarioController
 */
@WebServlet("/ActualizarUsuarioController")
public class ActualizarUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarUsuarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Obtener parametros 
		String cedula = request.getParameter("cedula");
		String clave = request.getParameter("clave");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		int id = Integer.parseInt(request.getParameter("id")) ;
		
		//Obtener atorizacion por parte del modelo
		Administrador administrador =null;
		Estudiante estudiante = null;
		Docente docente = null;
		
			String modo = request.getParameter("modo");
			if (modo=="Administrador") {
				administrador = new Administrador();
				administrador.setId(id);
				administrador.setCedula(cedula);
				administrador.setClave(clave);
				administrador.setNombre(nombre);
				administrador.setApellido(apellido);
				//***************************************************************************************
				try {
					JPADAOFactory.getFactory().getAdministradorDAO().update(administrador);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}if (modo=="Estudiante") {
				estudiante = new Estudiante();
				estudiante.setId(id);
				estudiante.setCedula(cedula);
				estudiante.setClave(clave);
				estudiante.setNombre(nombre);
				estudiante.setApellido(apellido);
				try {
					JPADAOFactory.getFactory().getEstudianteDAO().update(estudiante);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}if (modo=="Docente") {
				docente = new Docente();
				docente.setId(id);
				docente.setCedula(cedula);
				docente.setClave(clave);
				docente.setNombre(nombre);
				docente.setApellido(apellido);
				try {
					JPADAOFactory.getFactory().getDocenteDAO().update(docente);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		request.getRequestDispatcher("/MenuOpcionesAdministradorController").forward(request, response);
			
		
	
	}

	private void procesar (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
	
	getServletContext().getRequestDispatcher("/jsp/actualizarUsuarios.jsp").forward(request, response);
	
	}
}
