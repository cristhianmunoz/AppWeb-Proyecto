package com.controlador.administrativo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Modelo.jpa.JPADAOFactory;

/**
 * Servlet implementation class EliminarUsuarioController
 */
@WebServlet("/EliminarUsuarioController")
public class EliminarUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarUsuarioController() {
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
		if (request.getParameter("id") != null) {
			
			eliminar(request, response);
		}
		
	}
	
private void procesar (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		getServletContext().getRequestDispatcher("/jsp/eliminarUsuario.jsp").forward(request, response);
		
		}

}

	private void eliminar (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		int id = Integer.parseInt(request.getParameter("id")) ;
		
		JPADAOFactory.getFactory().getPersonaDAO().deleteById(id);
		
		
		request.getRequestDispatcher("/MenuOpcionesAdministradorController").forward(request, response);
		
		}
	
	}
