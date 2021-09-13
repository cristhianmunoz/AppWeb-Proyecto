package com.controlador.docencia;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Modelo.entidades.Departamento;
import com.Modelo.entidades.Docente;
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
		Docente docente = new Docente();
		Departamento depa = new Departamento();
		
		docente.setNombre(nombre);
		docente.setApellido(apellido);
		depa.setNombre(departamento);
		
		try {
			JPADAOFactory.getFactory().getDocenteDAO().update(docente);
			JPADAOFactory.getFactory().getDepartamentoDAO().update(depa);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		///request.getRequestDispatcher("/.................").forward(request, response);
	}
	
	protected void procesar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/jsp/actualizarInformacionPersonal.jsp").forward(request, response);
	}

}
