package com.controlador.estudiantil;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.Estudiante;
import com.Modelo.entidades.Persona;

/**
 * Servlet implementation class CambiarClaveController
 */
@WebServlet("/CambiarClaveController")
public class CambiarClaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CambiarClaveController() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session =  request.getSession();
		Estudiante estudiante = (Estudiante) session.getAttribute("usuarioLogeado");
		
		String clave = request.getParameter("clave");
		String claveanterior = estudiante.getClave();
		
		if(estudiante.cambiarClave(claveanterior, clave)) {
			try {
				DAOFactory.getFactory().getEstudianteDAO().update(estudiante);
				request.getRequestDispatcher("/MenuOpcionesEstudianteController").forward(request, response);
			} catch (SQLException e) {
				
				e.printStackTrace();
				response.sendError(0);
				request.getRequestDispatcher("/CambiarClaveController").forward(request, response);
			}
		}else {
			response.sendError(0);
			request.getRequestDispatcher("/CambiarClaveController").forward(request, response);
		}
	}
	
	private void procesar (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{

			getServletContext().getRequestDispatcher("/jsp/cambiarClave.jsp").forward(request, response);
		
	}

}
