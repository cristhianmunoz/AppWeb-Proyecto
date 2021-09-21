package com.controlador.administrativo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.Administrador;
import com.Modelo.entidades.Departamento;
import com.Modelo.entidades.Docente;
import com.Modelo.entidades.Estudiante;
import com.Modelo.jpa.JPADAOFactory;

/**
 * Servlet implementation class CrearUsuarioControlle
 */
@WebServlet("/CrearUsuarioControlle")
public class CrearUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearUsuarioController() {
        
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
				//int id = Integer.parseInt(request.getParameter("id"));
					String departamento = request.getParameter("departamento");
				
				//Obtener atorizacion por parte del modelo
				Administrador administrador =null;
				Estudiante estudiante = null;
				Docente docente = null;
				
					String modo = request.getParameter("modo");
					if (modo=="Administrador") {
						administrador = new Administrador();
						//administrador.setId(id);
						administrador.setCedula(cedula);
						administrador.setClave(clave);
						administrador.setNombre(nombre);
						administrador.setApellido(apellido);
						//***************************************************************************************
						JPADAOFactory.getFactory().getAdministradorDAO().create(administrador);
					}if (modo=="Estudiante") {
						estudiante = new Estudiante();
						//estudiante.setId(id);
						estudiante.setCedula(cedula);
						estudiante.setClave(clave);
						estudiante.setNombre(nombre);
						estudiante.setApellido(apellido);
						JPADAOFactory.getFactory().getEstudianteDAO().create(estudiante);
					}if (modo=="Docente") {
						docente = new Docente();
						//docente.setId(id);
						docente.setCedula(cedula);
						docente.setClave(clave);
						docente.setNombre(nombre);
						docente.setApellido(apellido);
						Departamento departamentoobject= DAOFactory.getFactory().getDepartamentoDAO().getDepartamentoByNombre(departamento);
						docente.setDepartamento(departamentoobject);
						JPADAOFactory.getFactory().getDocenteDAO().create(docente);
					}
				
				request.getRequestDispatcher("/MenuOpcionesAdministradorController").forward(request, response);
	}
	
	
	
	private void procesar (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		getServletContext().getRequestDispatcher("/jsp/crearUsuario.jsp").forward(request, response);
	
	}

}
