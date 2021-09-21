package com.controlador.administrativo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.Departamento;

@WebServlet("/CrearDepartamentoController")
public class CrearDepartamentoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CrearDepartamentoController() {
        //super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre_departamento = request.getParameter("nombreDepartamento");
		
		Departamento departamentoNuevo = new Departamento();
		departamentoNuevo.setNombre(nombre_departamento);
		
		DAOFactory.getFactory().getDepartamentoDAO().create(departamentoNuevo);
		
		request.getRequestDispatcher("/ListarDepartamentosController").forward(request, response);
	}
	
	private void procesar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/jsp/crearDepartamentos.jsp").forward(request, response);
	}

}
