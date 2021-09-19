package test;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.Fecha;

public class Test {

	public static void main(String[] args) {
		Fecha fecha = DAOFactory.getFactory().getFechaDAO().getFechaByDia("Lunes");
		System.out.println(fecha.toString());

	}

}
