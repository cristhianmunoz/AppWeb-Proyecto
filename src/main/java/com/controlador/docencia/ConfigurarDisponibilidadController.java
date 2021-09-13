package com.controlador.docencia;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.DisponibilidadTutoria;
import com.Modelo.entidades.Docente;
import com.Modelo.entidades.Horario;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Parser;

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
		String cedula = docente.getCedula();
		
		String diasemana = request.getParameter("diaSemana");
		int horaInicio = Integer.parseInt(request.getParameter("horaInicio")) ;
		int minutoInicio = Integer.parseInt(request.getParameter("minutoInicio")) ;
		
		//******************Horario*******************************************
		Horario horario = new Horario();
				horario.setHora(horaInicio);
				horario.setMinuto(minutoInicio);
		DAOFactory.getFactory().getHorarioDAO().create(horario);
		
		//******************Disponiiblidad***************************************
		DisponibilidadTutoria dispo = new DisponibilidadTutoria();
							  dispo.setDiaSemana(diasemana);
							  dispo.setHorarioInicio(horario);
		
		docente.addDisponibilidad(dispo);
		
		//dispo = DAOFactory.getFactory().getDisponibilidadTutoriaDAO().DisponibilidadDocente(cedula,dispo);
		
		
	}
	
	
	private void procesar (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		getServletContext().getRequestDispatcher("/jsp/menuOpcionesD.jsp").forward(request, response);
	}
	
	

}
