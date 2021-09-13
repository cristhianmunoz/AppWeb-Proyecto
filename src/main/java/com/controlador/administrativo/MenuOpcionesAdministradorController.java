package com.controlador.administrativo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Modelo.jpa.JPADAOFactory;

/**
 * Servlet implementation class MenuOpcionesAdministradorController
 */
@WebServlet("/MenuOpcionesAdministradorController")
public class MenuOpcionesAdministradorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuOpcionesAdministradorController() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	private void procesar (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
			getServletContext().getRequestDispatcher("/jsp/menuOpcionesA.jsp").forward(request, response);
		
	}

}
