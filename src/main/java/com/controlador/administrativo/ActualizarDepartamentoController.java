package com.controlador.administrativo;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String nombredepartamento = request.getParameter("nombreDepartamento");
		int idDepartamento = Integer.parseInt(request.getParameter("idDepartamento"));
		
		//Obtenemos la autorizaciòn por parte del modelo
		Departamento departamento = new Departamento();
		departamento.setId(idDepartamento);
		departamento.setNombre(nombredepartamento);
		
		
		try {
			JPADAOFactory.getFactory().getDepartamentoDAO().update(departamento);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("/MenuOpcionesAdministradorController").forward(request, response);
	}
	
	private void procesar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/jsp/actualizarDepartamentos.jsp").forward(request, response);
	}
}
