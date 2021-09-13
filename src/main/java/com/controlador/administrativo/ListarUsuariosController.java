package com.controlador.administrativo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.Persona;

/**
 * Servlet implementation class ListarUsuariosController
 */
@WebServlet("/ListarUsuariosController")
public class ListarUsuariosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarUsuariosController() {
        
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
		
	}

	private void procesar (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		List<Persona> listPersonas= DAOFactory.getFactory().getAdministradorDAO().listarUsuarios();
		
		request.setAttribute("listPersonas", listPersonas);
		getServletContext().getRequestDispatcher("/jsp/listarUsuarios.jsp").forward(request, response);
	}
}
