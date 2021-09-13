package com.controlador.estudiantil;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class MenuOpcionesEstudianteController
 */
@WebServlet("/MenuOpcionesEstudianteController")
public class MenuOpcionesEstudianteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MenuOpcionesEstudianteController() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			procesar(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    procesar(request, response);
	}
	
	
	
	//Procesar
	private void procesar (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		/*String opcion = request.getParameter("opciones");
		if(opcion == "0") {
			solicitarTutoria(request, response);
		}if(opcion == "1") {
			cambiarClave(request, response);
		}else {*/
			
			getServletContext().getRequestDispatcher("/jsp/menuOpcionesE.jsp").forward(request, response);
		//}
	}
	
	/*
	private void solicitarTutoria (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		//creo la Sesion
		HttpSession session =  request.getSession();
		
		request.getRequestDispatcher("/SolicitarTutoriaController").forward(request, response);
	}
	
	private void cambiarClave (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		HttpSession session =  request.getSession();
		
		request.getRequestDispatcher("/CambiarClaveController").forward(request, response);
	}
	*/
	
	
}
