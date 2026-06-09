package ar.com.unpaz.Repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.Alumno;

public class LecturaArchivo {
	
	
	public List<Alumno> lectura(){
		List<Alumno>alumnos= new ArrayList<Alumno>();
		
		
		File sFile= new File("Alumnos.txt");
		FileReader sFileReader;
		try {
			sFileReader= new FileReader(sFile);
			BufferedReader sBuffer= new BufferedReader(sFileReader);
			String linea= " ";
			while((linea= sBuffer.readLine()) != null ) {
				Alumno al = new Alumno();
				String []Array= linea.split(";");
				 
				al.setLegajo(Array[0]);
				al.setNombre(Array[1]);
				al.setCarrera(Array[2]);
				alumnos.add(al);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return alumnos;
	}

}
