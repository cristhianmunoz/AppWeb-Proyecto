package com.controlador;

import java.io.IOException;
import java.util.List;

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
		
		String url=null;
		
		HttpSession session =  request.getSession();
		
			String modo = request.getParameter("modo");
			if (modo.equals("Administrador")) {
				try {
					administrador = DAOFactory.getFactory().getAdministradorDAO().autorizar(cedula,clave);
					
				}catch(Exception e) {
					reenviar(request, response);
				}
				if(administrador!=null) {
					session.setAttribute("usuarioLogeado", administrador);
					url="/MenuOpcionesAdministradorController";
					procesar(request, response, url);
				}
				
			}if (modo.equals("Docente")) {
				try {
					docente = DAOFactory.getFactory().getDocenteDAO().autorizar(cedula,clave);
				}catch(Exception e) {
					reenviar(request, response);
				}
				if(docente!=null) {
					session.setAttribute("usuarioLogeado", docente);
					url="/MenuOpcionesDocenteController";
					procesar(request, response, url);
				}
			}if (modo.equals("Estudiante")) {
				try {
					estudiante = DAOFactory.getFactory().getEstudianteDAO().autorizar(cedula,clave);
					
				}catch(Exception e) {
					reenviar(request, response);
				}
				if(estudiante!=null) {
					session.setAttribute("usuarioLogeado", estudiante);
					url="/MenuOpcionesEstudianteController";
					procesar(request, response, url);
				}
			} 
	}
	
	protected void reenviar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		response.sendRedirect("/login.jsp");;
	}
	
	private void procesar (HttpServletRequest request, HttpServletResponse response, String url)throws ServletException, IOException{
		
		getServletContext().getRequestDispatcher(url).forward(request, response);
		
	}
	
	

}
