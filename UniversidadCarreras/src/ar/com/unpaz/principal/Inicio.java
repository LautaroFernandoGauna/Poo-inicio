package ar.com.unpaz.principal;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.Repositorio.LecturaDeArchivo;
import ar.com.unpaz.Service.GestionDeAlumnos;
import ar.com.unpaz.ServiceImp.GestionDeAlumnosImp;
import ar.com.unpaz.model.Alumno;

public class Inicio {

	public static void main(String[] args) {
		List<Alumno> alumnos = new ArrayList<Alumno>();
		LecturaDeArchivo lectura = new LecturaDeArchivo();
		GestionDeAlumnos gestion= new GestionDeAlumnosImp();
		alumnos= lectura.lectura();
		gestion.mostrarCarrera(alumnos);
		
	}

}
