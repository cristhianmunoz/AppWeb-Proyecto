package com.controlador.docencia;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.DisponibilidadTutoria;
import com.Modelo.entidades.Docente;
import com.Modelo.entidades.Docente_Disponibilidad;
import com.Modelo.entidades.Horario;

/**
 * Servlet implementation class ConfigurarDisponibilidadController
 */
@WebServlet("/ConfigurarDisponibilidadController")
public class ConfigurarDisponibilidadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ConfigurarDisponibilidadController() {
        
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
		
		//********************Docente*************************************************
		HttpSession session =  request.getSession();
		Docente docente = (Docente) session.getAttribute("usuarioLogeado");
		//String cedula = docente.getCedula();
		
		String diasemana = request.getParameter("diaSemana");
		int horaInicio = Integer.parseInt(request.getParameter("horaInicio")) ;
		int minutoInicio = Integer.parseInt(request.getParameter("minutoInicio")) ;
		
		//******************Horario*******************************************
		Horario horario = new Horario();
				horario.setHora(horaInicio);
				horario.setMinuto(minutoInicio);
		
		System.out.println(horario.toString());
				
		//DAOFactory.getFactory().getHorarioDAO().create(horario);
		
		//******************Disponiiblidad***************************************
		DisponibilidadTutoria dispo = new DisponibilidadTutoria(diasemana, horario);
		System.out.println(dispo.toString());
		//DAOFactory.getFactory().getDisponibilidadTutoriaDAO().create(dispo);
		//pendiente**********************************************************************************************************
							  
		Docente_Disponibilidad docente_disponibilidad = new Docente_Disponibilidad(dispo, docente);
		System.out.println(docente_disponibilidad.toString());
		DAOFactory.getFactory().getDocente_DisponibilidadDAO().create(docente_disponibilidad);
		
		request.getRequestDispatcher("/MenuOpcionesDocenteController").forward(request, response);
		
		
		
	}
	
	
	private void procesar (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		HttpSession session =  request.getSession();
		Docente docente = (Docente) session.getAttribute("usuarioLogeado");
		List<DisponibilidadTutoria> disponibilidades = DAOFactory.getFactory().getDocenteDAO().getDisponibilidadByDocente(docente);
		request.setAttribute("listaDisponibilidad", disponibilidades);
		getServletContext().getRequestDispatcher("/jsp/configurarDisponibilidad.jsp").forward(request, response);
	}
	
	

}
