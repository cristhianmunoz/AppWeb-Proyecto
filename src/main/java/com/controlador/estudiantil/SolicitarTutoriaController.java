package com.controlador.estudiantil;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Modelo.entidades.Departamento;
import com.Modelo.entidades.Docente;
import com.Modelo.entidades.Persona;
import com.Modelo.entidades.Tutoria;
import com.mysql.cj.Session;
import com.Modelo.dao.DAOFactory;

/**
 * Servlet implementation class SolicitarTutoriaController
 */
@WebServlet("/SolicitarTutoriaController")
public class SolicitarTutoriaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SolicitarTutoriaController() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("departamentoBuscar")!= null) {
			listarDocentes(request, response);
		}else {
		crearTutoria(request,response);
		}
		
	}
	
	//Procesar
		private void procesar (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
			
			List<Departamento> listDepartamentos = DAOFactory.getFactory().getDepartamentoDAO().get();
			request.setAttribute("ListaDepartamentos", listDepartamentos);
			getServletContext().getRequestDispatcher("/jsp/solicitarTutoria.jsp").forward(request, response);
			
		}
		
		
		
		private void listarDocentes (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
			
			String nomDepartamento= request.getParameter("departamentoBuscar"); 
			List<Docente>  listDocentes = DAOFactory.getFactory().getDocenteDAO().getDocentesPorDepartamento(nomDepartamento);
			request.setAttribute(" listDocentes", listDocentes);
			getServletContext().getRequestDispatcher("/jsp/solicitarTutoria.jsp").forward(request, response);
			
		}
		
		private void crearTutoria (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
			
			String nomDepartamento = request.getParameter("departamentoBuscar"); 
			HttpSession session =  request.getSession();
			Persona persona = (Persona) session.getAttribute("usuarioLogeado");
			String cedulaEstudiante = persona.getCedula();
			
			Tutoria tutoria = new Tutoria();
			
			
			//tutoria.set
			
			try {
				
				//Tutoria tutoria = DAOFactory.getFactory().getTutoriaDAO().create(null);
				System.out.println("Exitoso");
				
			} catch (Exception e) {

				response.sendError(0);
			}
			
			
			
			
		}

}
