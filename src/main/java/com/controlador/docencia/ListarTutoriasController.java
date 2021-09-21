package com.controlador.docencia;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Modelo.dao.DAOFactory;

import com.Modelo.entidades.Docente;
import com.Modelo.entidades.Estudiante;
import com.Modelo.entidades.Persona;

import com.Modelo.entidades.Tutoria;

@WebServlet("/ListarTutoriasController")
public class ListarTutoriasController extends HttpServlet {
	
	private static final long serialVersionUID = 1L; 
	
    public ListarTutoriasController() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}
	
	protected void procesar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		//List<Tutoria> tutorias = DAOFactory.getFactory().getTutoriaDAO().get();
		

		HttpSession session =  request.getSession();	
		Docente docente = (Docente) session.getAttribute("usuarioLogeado");
		
		List<Tutoria> tutorias = null;
		try {
			tutorias = DAOFactory.getFactory().getTutoriaDAO().listarTutoriasPendientesPorDocente(docente.getId());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.setAttribute("tutorias", tutorias);
		getServletContext().getRequestDispatcher("jsp/listarTutorias.jsp").forward(request, response);
		
	}
}
