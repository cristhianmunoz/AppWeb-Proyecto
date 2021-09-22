package test;

import com.Modelo.dao.DAOFactory;

public class crearHorarios {

	public static void main(String[] args) {
		DAOFactory.getFactory().getHorarioDAO().create(null);

	}

}
