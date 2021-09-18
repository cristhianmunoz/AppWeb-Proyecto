package com.Modelo.dao;

import com.Modelo.entidades.Fecha;

public interface FechaDAO extends GenericDAO<Fecha, Integer> {
	public boolean isYearLeap(int anio);
	public int daysInMonth(int anio, int  month);
	public int calcularConstSiglo(int siglo);
	public String determinarDiaDeSemanaDadaUnaFecha(int dia, int mes, int anio);
}
