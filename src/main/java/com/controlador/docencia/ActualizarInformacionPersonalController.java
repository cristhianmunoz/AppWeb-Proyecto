package com.controlador.docencia;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.Departamento;
import com.Modelo.entidades.Docente;
import com.Modelo.entidades.Persona;
import com.Modelo.jpa.JPADAOFactory;


@WebServlet("/ActualizarInformacionPersonalController")
public class ActualizarInformacionPersonalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ActualizarInformacionPersonalController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Obtener los paràmetros
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String departamento = request.getParameter("nombreDepartamento");
		
		//Obtener autorizaciòn por parte del modelo
		HttpSession session =  request.getSession();
		Docente docente =(Docente) session.getAttribute("usuarioLogeado");
		Departamento depa = DAOFactory.getFactory().getDepartamentoDAO().getDepartamentoByNombre(departamento);
		
		
		docente.setNombre(nombre);
		docente.setApellido(apellido);
		docente.setDepartamento(depa);
		
		try {
			JPADAOFactory.getFactory().getDocenteDAO().update(docente);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		///request.getRequestDispatcher("/.................").forward(request, response);
	}
	
	protected void procesar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session =  request.getSession();	
			Persona persona = (Persona) session.getAttribute("usuarioLogeado");
			persona = DAOFactory.getFactory().getDocenteDAO().getByCedula(persona.getCedula());
			session.setAttribute("usuarioLogeado", persona);
			
		getServletContext().getRequestDispatcher("/jsp/actualizarInformacionPersonal.jsp").forward(request, response);
	}

}
