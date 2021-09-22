package com.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();     // request is an instance of type 
		if(cookies!=null) {
			for(int i = 0; i < cookies.length; i++)
			{ 
				Cookie c = cookies[i];
				if (c.getName().equals("userid"))
				{
					System.out.println("Validacion de cookie: " + c.getValue());
					int userId= Integer.parseInt(c.getValue());
					Persona persona = (Persona)DAOFactory.getFactory().getPersonaDAO().getById(userId);
					System.out.println(persona.toString());
					request.setAttribute("userRemembered", persona);
				}
			} 
		}
		
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
					procesar(request, response, url, administrador.getId());
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
					procesar(request, response, url, docente.getId());
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
					procesar(request, response, url, estudiante.getId());
				}
			} 
			
			
	}
	
	protected void reenviar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		response.sendRedirect("jsp/login.jsp");
	}
	
	private void procesar (HttpServletRequest request, HttpServletResponse response, String url, Integer id)throws ServletException, IOException{
		if(request.getParameter("datos")!="") {
			System.out.println("Guardando cookie");
		    Cookie c = new Cookie("userid", String.valueOf(id));
		    c.setMaxAge(24*60*60);
		    response.addCookie(c);
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
		
	}
	
	

}
