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
import com.Modelo.entidades.DisponibilidadTutoria;
import com.Modelo.entidades.Docente;
import com.Modelo.entidades.Estudiante;
import com.Modelo.entidades.Fecha;
import com.Modelo.entidades.Horario;
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
		}if (request.getParameter("cedulaDocentte")!= null){
			listarHorarioDocente(request, response);
		}else {
		}
		crearTutoria(request,response);
	}
		
	
	
	//Procesar
		private void procesar (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
			
			List<Departamento> listaDepartamentos = DAOFactory.getFactory().getDepartamentoDAO().get();
			request.setAttribute("ListaDepartamentos", listaDepartamentos);
			getServletContext().getRequestDispatcher("/jsp/solicitarTutoria.jsp").forward(request, response);
			
		}
		
		
		
		private void listarDocentes (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
			
			String nomDepartamento= request.getParameter("departamentoBuscar"); 
			List<Docente>  listaDocentes = DAOFactory.getFactory().getDocenteDAO().getDocentesByDepartamento(nomDepartamento);
			request.setAttribute(" listDocentes", listaDocentes);
			getServletContext().getRequestDispatcher("/jsp/solicitarTutoria.jsp").forward(request, response);
			
		}
		
		private void listarHorarioDocente (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
			
			String nomDepartamento= request.getParameter("departamentoBuscar"); 
			DAOFactory.getFactory().getDocenteDAO();
			List<DisponibilidadTutoria>  listaHorarioDocente = DAOFactory.getFactory().getDocenteDAO().getDisponibilidadByDocente(null);
			request.setAttribute("listDocentes", listaHorarioDocente);
			getServletContext().getRequestDispatcher("/jsp/solicitarTutoria.jsp").forward(request, response);
			
		}
		private void crearTutoria (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
			
			//String nomDepartamento = request.getParameter("departamentoBuscar"); 
			HttpSession session =  request.getSession();
			Persona persona = (Persona) session.getAttribute("usuarioLogeado");
			String cedulaEstudiante = persona.getCedula();
			
			String cedulaDocente =  request.getParameter("cedulaDocente");
			//String cedulaEstudiante = request.getParameter("cedulaEstudiante");
			request.getParameter("horario");
			request.getParameter("fecha"); // dd/mm/yy
			request.getParameter("hora"); // hh:mm  //hora de comienzo
			
			int horaInicio = Integer.parseInt(request.getParameter("horaInicio"));
			int minInicio = Integer.parseInt(request.getParameter("minInicio"));
			
			Horario inicio = new Horario(horaInicio,minInicio);
			/*
			Horario fin = null;
			if(minInicio!=45) {
				fin = new Horario(horaInicio,minInicio+15);
			}else {
				fin = new Horario(horaInicio+1,0);
			}
			*/
			
			Docente docente = DAOFactory.getFactory().getDocenteDAO().getByCedula(cedulaDocente);
			Estudiante estudiante = DAOFactory.getFactory().getEstudianteDAO().getByCedula(cedulaEstudiante);
			String diaSemana = request.getParameter("diaSemana");
			Fecha fecha = Fecha.getFechaByDia(diaSemana);
			
			Tutoria tutoria = new Tutoria(docente, estudiante, inicio, fecha);
			
			DAOFactory.getFactory().getTutoriaDAO().create(tutoria);
			
			response.sendError(0);
			
			
			
			//tutoria.set
			
			try {
				
				//Tutoria tutoria = DAOFactory.getFactory().getTutoriaDAO().create(null);
				System.out.println("Exitoso");
				
			} catch (Exception e) {

				response.sendError(0);
			}
			
			
			
			
		}

}
