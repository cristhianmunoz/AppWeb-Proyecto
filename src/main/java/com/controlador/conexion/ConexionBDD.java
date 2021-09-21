package com.controlador.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionBDD {
	
	public static Connection getConexion() throws SQLException{
		String servidor = "tutoriasproyecto.mysql.database.azure.com";
		String database = "dbtutoriasproyecto";
		String url ="jdbc:mysql://"+servidor+"/"+database;
		String usuario = "appswebproy@tutoriasproyecto";
		String password = "epnapiweb99#";
		
		//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		return DriverManager.getConnection(url,usuario,password);
	}
	
	public static void cerrar (ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
	}
	
	public static void cerrar (PreparedStatement ps) {
		try {
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
	}
	
	public static void cerrar (Connection cnn) {
		try {
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
	}
	
}
