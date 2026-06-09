package ar.com.unpaz.principal;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.Repositorio.LecturaArchivo;
import ar.com.unpaz.Service.GestionAlumnos;
import ar.com.unpaz.ServiceImp.GestionAlumnosImp;
import ar.com.unpaz.model.Alumno;

public class Inicio {

	public static void main(String[] args) {
		List<Alumno>alumnos= new ArrayList<>();

		LecturaArchivo lectura= new LecturaArchivo();
		alumnos= lectura.lectura();
		GestionAlumnos gestion= new GestionAlumnosImp();
		gestion.mostrarAlumnosPorCarrera(alumnos);
		
		
	}

}
