package com.controlador.administrativo;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.Departamento;
import com.Modelo.jpa.JPADAOFactory;

@WebServlet("/ActualizarDepartamentoController")
public class ActualizarDepartamentoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ActualizarDepartamentoController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Obtener los paràmetros
		Departamento departamento = (Departamento) request.getAttribute("departamento");

		try {
			JPADAOFactory.getFactory().getDepartamentoDAO().update(departamento);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("/MenuOpcionesAdministradorController").forward(request, response);
	}
	
	private void procesar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombredepartamento = request.getParameter("nombreDepartamento");
		Departamento departamento = DAOFactory.getFactory().getDepartamentoDAO().getDepartamentoByNombre(nombredepartamento);
		request.setAttribute("departamento", departamento);
		getServletContext().getRequestDispatcher("/jsp/actualizarDepartamentos.jsp").forward(request, response);
	}
}
