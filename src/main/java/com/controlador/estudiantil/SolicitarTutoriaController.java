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
import com.Modelo.dao.FechaDAO;

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
		
		/*
		if (request.getParameter("dep") != "0") {
			request.setAttribute("mostrarDocentes", '1');
			listarDocentes(request, response);
		}
		if (request.getParameter("doc")!= "0"){
			request.setAttribute("mostrarDisponibilidad", '1');
			listarHorarioDocente(request, response);
		}
		*/
		if(request.getParameter("idDisponibilidad")!= "null"){
			crearTutoria(request,response);
		}
		
	}
		
	
	
	//Procesar
		private void procesar (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
			
			List<Departamento> listaDepartamentos = DAOFactory.getFactory().getDepartamentoDAO().get();
			request.setAttribute("listaDepartamentos", listaDepartamentos);
			
			
			HttpSession session =  request.getSession();
			
			
			if (request.getParameter("dep") != null) {
				System.out.println("Entre a mostrar docentes");
				System.out.println(request.getAttribute("departamentoBuscar"));
				request.setAttribute("mostrarDocentes", "1");
				listarDocentes(request, response);
			}
			if (request.getParameter("doc")!= null){
				System.out.println("Entre a mostrar disponibilidad");
				request.setAttribute("mostrarDisponibilidad", "1");
				listarHorarioDocente(request, response);
			}
			
			getServletContext().getRequestDispatcher("/jsp/solicitarTutoria.jsp").include(request, response);
		}
		
		
		
		private void listarDocentes (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
			
			String nomDepartamento= request.getParameter("departamentoBuscar"); 
			System.out.println("Busqueda docente: " + nomDepartamento);
			List<Docente>  listaDocentes = DAOFactory.getFactory().getDocenteDAO().getDocentesByDepartamento(nomDepartamento);
			request.setAttribute("listaDocentes", listaDocentes);
			//getServletContext().getRequestDispatcher("/jsp/solicitarTutoria.jsp").forward(request, response);
			
		}
		
		private void listarHorarioDocente (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
			
			int id= Integer.parseInt(request.getParameter("idDocente")); 
			System.out.println("estamos ready");
			Docente docente = DAOFactory.getFactory().getDocenteDAO().getById(id);
			System.out.println(docente.toString());
			List<DisponibilidadTutoria>  listaHorarioDocente = DAOFactory.getFactory().getDocenteDAO().getDisponibilidadByDocente(docente);
			request.setAttribute("listaDisponibilidad", listaHorarioDocente);
			//getServletContext().getRequestDispatcher("/jsp/solicitarTutoria.jsp").forward(request, response);
			
		}
		private void crearTutoria (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
			
			//String nomDepartamento = request.getParameter("departamentoBuscar"); 
			HttpSession session =  request.getSession();
			Persona persona = (Persona) session.getAttribute("usuarioLogeado");
			String cedulaEstudiante = persona.getCedula();
			
			String cedulaDocente =  request.getParameter("cedulaDocente");
			//String cedulaEstudiante = request.getParameter("cedulaEstudiante");
			
			int idDis = Integer.parseInt(request.getParameter("idDisponibilidad"));
			DisponibilidadTutoria dis = DAOFactory.getFactory().getDisponibilidadTutoriaDAO().getById(idDis);
			
			/*
			request.getParameter("horario");
			request.getParameter("fecha"); // dd/mm/yy
			request.getParameter("hora"); // hh:mm  //hora de comienzo
			
			int horaInicio = Integer.parseInt(request.getParameter("horaInicio"));
			int minInicio = Integer.parseInt(request.getParameter("minInicio"));
			
			Horario inicio = new Horario(horaInicio,minInicio);
			
			Horario fin = null;
			if(minInicio!=45) {
				fin = new Horario(horaInicio,minInicio+15);
			}else {
				fin = new Horario(horaInicio+1,0);
			}
			*/
			
			Horario inicio = dis.getHorarioInicio();
			
			Docente docente = DAOFactory.getFactory().getDocenteDAO().getByCedula(cedulaDocente);
			Estudiante estudiante = DAOFactory.getFactory().getEstudianteDAO().getByCedula(cedulaEstudiante);
			String diaSemana = request.getParameter("diaSemana");
			Fecha fecha = DAOFactory.getFactory().getFechaDAO().getFechaByDia(diaSemana);
			
			Tutoria tutoria = new Tutoria(docente, estudiante, inicio, fecha);
			
			//tutoria.set
			try {
				
				DAOFactory.getFactory().getTutoriaDAO().create(tutoria);
				//System.out.println("Exitoso");
				request.getRequestDispatcher("/MenuOpcionesEstudianteController").forward(request, response);
				
			} catch (Exception e) {
				
				response.sendError(0);
			}
			
			
			
			
		}

}
