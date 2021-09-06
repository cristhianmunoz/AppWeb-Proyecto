package com.controlador.docencia;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.Estudiante;
import com.Modelo.entidades.Tutoria;

@WebServlet("/ListarTutoriasController")
public class ListarTutoriasController extends HttpServlet {
	
	private static final long serialVersionUID = 1L; 
	
    public ListarTutoriasController() {
        //super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		procesar(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		procesar(request, response);
	}
	
	protected void procesar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Tutoria> tutorias = DAOFactory.getFactory().getTutoriaDAO().get();
		
		//2. Llamo a la vista Listar Tutorias para que me presente los datos que obtuve del modelo
		request.setAttribute("tutorias", tutorias);
		String path = "jsp/listarTutorias.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
		
	}
}
