package test;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.Horario;

public class crearHorarios {

	public static void main(String[] args) {
		Horario horario = null;
		for(int i=0; i<60; i=i+15) {
			for(int j=7; j<=19; j++) {
				horario = new Horario();
				horario.setHora(j);
				horario.setMinuto(i);
				DAOFactory.getFactory().getHorarioDAO().create(horario);
			}
		}
		
		

	}

}
