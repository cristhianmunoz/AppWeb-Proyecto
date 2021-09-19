package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.Fecha;

public class Test {

	public static void main(String[] args) {
		Fecha fecha = DAOFactory.getFactory().getFechaDAO().getFechaByDia("Lunes");
		System.out.println(fecha.toString());
		
		/*
		Date date = new Date();
		SimpleDateFormat dayFormat = new SimpleDateFormat("EE");
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		
		while(!dayFormat.format(c.getTime()).equals("Mon")) {
			c.add(Calendar.DATE, 1);
			System.out.println(dateFormat.format(c.getTime()));
		}
		*/
		

	}

}
