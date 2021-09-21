package test;

import java.util.List;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.Administrador;
import com.Modelo.entidades.DisponibilidadTutoria;
import com.Modelo.entidades.Docente;
import com.Modelo.entidades.Estudiante;
import com.Modelo.entidades.Persona;

public class generandoTablas {

	public static void main(String[] args) {
		
		Administrador admin = new Administrador();
		admin.setNombre("Carlos");
		admin.setApellido("Iniguez");
		admin.setCedula("1754896985");
		admin.setClave("carlos123");
				DAOFactory.getFactory().getAdministradorDAO().create(admin);
//		Docente doc = DAOFactory.getFactory().getDocenteDAO().getByCedula("1111111111");
//		List<DisponibilidadTutoria> disponibilidad = DAOFactory.getFactory().getDocenteDAO().getDisponibilidadByDocente(doc);
//		for(DisponibilidadTutoria disp : disponibilidad) {
//			System.out.println(disponibilidad);
//		}

//		List<Administrador> estudiantes = DAOFactory.getFactory().getAdministradorDAO().get();
//		for(Administrador est : estudiantes) {
//			System.out.println(est);
//		}
		//String dia = DAOFactory.getFactory().getFechaDAO().determinarDiaDeSemanaDadaUnaFecha(19, 9, 2021);
		//System.out.println("24-12-2021 cae -> " + dia);
	}

}
