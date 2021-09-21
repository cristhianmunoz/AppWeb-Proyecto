package com.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.Administrador;
import com.Modelo.entidades.Docente;
import com.Modelo.entidades.Estudiante;
import com.Modelo.entidades.Persona;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("jsp/login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Obtener parametros 
		String cedula = request.getParameter("cedula");
		String clave = request.getParameter("clave");
		
		//Obtener atorizacion por parte del modelo
		Administrador administrador =null;
		Estudiante estudiante = null;
		Docente docente = null;
		
			String modo = request.getParameter("modo");
			if (modo.equals("Administrador")) {
				administrador = DAOFactory.getFactory().getAdministradorDAO().autorizar(cedula,clave);
			}if (modo.equals("Estudiante")) {
				estudiante = DAOFactory.getFactory().getEstudianteDAO().autorizar(cedula,clave);
			}if (modo.equals("Docente")) {
				docente = DAOFactory.getFactory().getDocenteDAO().autorizar(cedula,clave);
			}
		
		if(administrador!=null || estudiante!=null || docente!=null ) {
			//creo la Sesion
			HttpSession session =  request.getSession();
			
			if (modo.equals("Administrador")) {
				session.setAttribute("usuarioLogeado", administrador);
				request.getRequestDispatcher("/MenuOpcionesAdministradorController").forward(request, response);
			}if (modo.equals("Estudiante")) {
				session.setAttribute("usuarioLogeado", estudiante);
				request.getRequestDispatcher("/MenuOpcionesEstudianteController").forward(request, response);
			}if (modo.equals("Docente")) {
				session.setAttribute("usuarioLogeado", docente);
				request.getRequestDispatcher("/MenuOpcionesDocenteController").forward(request, response);
			}
		
		}else {
			response.sendRedirect("jsp/login.jsp");
		}
	
	}

}
