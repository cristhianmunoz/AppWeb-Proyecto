package com.controlador.administrativo;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Modelo.entidades.Departamento;
import com.Modelo.entidades.Persona;
import com.Modelo.jpa.JPADAOFactory;

@WebServlet("/EliminarDepartamentoController")
public class EliminarDepartamentoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EliminarDepartamentoController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("idDepa") != null) {
			try {
				eliminar(request,response);
			} catch (SQLException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void eliminar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		//int idDepa = Integer.parseInt("idDepartamento");
		String nombreDepa = request.getParameter("nombreDepartamento");

		try {
			Departamento departamentoBorrar = (Departamento)JPADAOFactory.getFactory().getDepartamentoDAO().getDepartamentoByNombre(nombreDepa);
			JPADAOFactory.getFactory().getDepartamentoDAO().deleteById(departamentoBorrar.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("/MenuOpcionesAdministradorController").forward(request, response);
	}

}
