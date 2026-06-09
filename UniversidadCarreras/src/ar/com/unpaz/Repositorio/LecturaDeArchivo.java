package ar.com.unpaz.Repositorio;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.Alumno;

public class LecturaDeArchivo {

	public List<Alumno> lectura(){
		
		List<Alumno> alumnos = new ArrayList<Alumno>();
		
		File sFile= new File("Alumnos.txt");
		try {
			FileReader sFileReader= new FileReader(sFile);
			BufferedReader sBuffer = new BufferedReader(sFileReader);
			String linea= " ";
			while((linea = sBuffer.readLine())!= null) {
				String [] Array= linea.split(";");
				Alumno alum= new Alumno();
				alum.setLegajo(Array[0]);
				alum.setNombre(Array[1]);
				alum.setCarrera(Array[2]);
				alumnos.add(alum);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return alumnos;
	}
	
}
