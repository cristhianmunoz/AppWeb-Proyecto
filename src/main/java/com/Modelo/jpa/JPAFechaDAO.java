package com.Modelo.jpa;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.Modelo.dao.DAOFactory;
import com.Modelo.dao.FechaDAO;
import com.Modelo.entidades.Fecha;

public class JPAFechaDAO extends JPAGenericDAO<Fecha, Integer> implements FechaDAO {

	public JPAFechaDAO() {
		super(Fecha.class);
		// TODO Auto-generated constructor stub
	}

	public boolean isYearLeap(int year) {
		if (year % 100 == 0 && year > 1581) {
			if (year % 400 == 0) {
				return true;
			} else {
				return false;
			}
		}
		if(year%4==0) {
			return true;
		}else {
			return false;
		}
	}
	public int daysInMonth(int year, int month) {
		if(month==1 || month==3 || month==5 || month==7||month==8||month==10
				||month==12) {
			return 31;
		}
		if(month==2) {
			if(isYearLeap(year)) {
				return 29;
			}else {
				return 28;
			}
		}else {
			return 30;
		}
	}
	public int  calcularConstSiglo(int siglo) {
		if(siglo%2==0 && siglo%4!=0) {
			return 2;
		}
		if(siglo%4==0) {
			return 0;
		}
		int numeroVerificador = 1;
		int numeroVerificador2=3;
		while(numeroVerificador<=siglo) {
			if(numeroVerificador==siglo) {
				return 3;
			}
			numeroVerificador+=4;
		}
		while(numeroVerificador2<=siglo) {
			if(numeroVerificador2==siglo) {
				return 1;
			}
			numeroVerificador2+=4;
		}
		return -1;
	}
	public String determinarDiaDeSemanaDadaUnaFecha(int dia, int mes, int anio) {
		String resultado = "";
		String[] diaCadena = {"Domingo","Lunes","Martes","Miercoles","Jueves", "Viernes","Sábado","Domingo"};
		int[] monthLeap= {6,2,3,6,1,4,6,2,5,0,3,5};
		int[] monthNormal= {0,3,3,6,1,4,6,2,5,0,3,5};
		int[] constSiglo= {0,2,4,6};
		int anioDigitos=0;
		int siglo=0;
		int cocienteAnio=anio;
		int contador=0;
		while(cocienteAnio>0) {
			contador+=1;
			if(contador==2) {
				anioDigitos+=(cocienteAnio%10)*10;
			}
			if(contador==1) {
				anioDigitos+=cocienteAnio%10;
			}
			if(contador==3) {
				siglo+=cocienteAnio%10;
			}
			if(contador==4) {
				siglo+=(cocienteAnio%10)*10;
			}
			cocienteAnio=Math.floorDiv(cocienteAnio, 10) ;
		}
		siglo+=1;
		int mesConstante;
		int anioConstante;
		int numeroDia;
		if(isYearLeap(anio)) {
			mesConstante = monthLeap[mes-1];
			anioConstante = constSiglo[this.calcularConstSiglo(siglo)];
			numeroDia = (dia+mesConstante+anioDigitos+(Math.floorDiv(anioDigitos, 4))+anioConstante)%7;
		}else {
			mesConstante=monthNormal[mes-1];
			anioConstante=constSiglo[calcularConstSiglo(siglo)];
			numeroDia=(dia+mesConstante+anioDigitos+(Math.floorDiv(anioDigitos, 4))+anioConstante)%7;
		}
		return diaCadena[numeroDia];
	}
	
	public Fecha getFechaByDia(String diaSemana) {
		Date date = new Date();
		SimpleDateFormat dayFormat = new SimpleDateFormat("EE");
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		
		c.setTime(date);
		switch(diaSemana) {
			case "Lunes":
				while(dayFormat.format(c.getTime())!="Mon") {
					c.add(Calendar.DATE, 1);
				}
				break;
			case "Martes":
				while(dayFormat.format(c.getTime())!="Tue") {
					c.add(Calendar.DATE, 1);
				}
				break;
			case "Miércoles":
				while(dayFormat.format(c.getTime())!="Wed") {
					c.add(Calendar.DATE, 1);
				}
				break;
			case "Jueves":
				while(dayFormat.format(c.getTime())!="Thu") {
					c.add(Calendar.DATE, 1);
				}
				break;
			case "Viernes":
				while(dayFormat.format(c.getTime())!="Fri") {
					c.add(Calendar.DATE, 1);
				}
				break;
			default:
				break;
		}
		
		while(DAOFactory.getFactory().getTutoriaDAO().existeTuroria(this.transformar(dateFormat.format(c.getTime())))) {
			c.add(Calendar.DATE, 7);
		}
		//System.out.println(dateFormat.format(c.getTime()));
		return this.transformar(dateFormat.format(c.getTime()));
	}
	
	public Fecha transformar(String fecha){
        String parts[] = fecha.split("/");
        Fecha resultado = new Fecha();
        resultado.setDia(Integer.parseInt(parts[0]));
        resultado.setMes(Integer.parseInt(parts[1]));
        resultado.setAnio(Integer.parseInt(parts[2]));
        return resultado;
    }
}
