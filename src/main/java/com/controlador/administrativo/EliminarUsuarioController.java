package com.controlador.administrativo;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.Persona;
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

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("id") != null) {
			
			eliminar(request, response);
		}
		
	}
	


	@SuppressWarnings("unchecked")
	private void eliminar (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		String cedula = request.getParameter("cedula") ;
		
		try {
			Persona persona = (Persona) JPADAOFactory.getFactory().getPersonaDAO().getByCedula(cedula);
			DAOFactory.getFactory().getPersonaDAO().deleteById(persona.getId());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("/MenuOpcionesAdministradorController").forward(request, response);
		
		}
	
	}
