package ar.com.unpaz.ServiceImp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ar.com.unpaz.Service.GestionDeAlumnos;
import ar.com.unpaz.model.Alumno;

public class GestionDeAlumnosImp implements GestionDeAlumnos {

	@Override
	public void mostrarCarrera(List<Alumno> alumnos) {
		HashMap <String, Integer> mapaCarrera= new HashMap<>();
		
		for(Alumno al : alumnos) {
			if(mapaCarrera.containsKey(al.getCarrera())) {
				int count= mapaCarrera.get(al.getCarrera())+1;
				mapaCarrera.put(al.getCarrera(), count);
				
			}
			else {
				mapaCarrera.put(al.getCarrera(), 1);
			}
		}
		for(Map.Entry<String, Integer> carrera: mapaCarrera.entrySet()) {
			System.out.println(
					carrera.getKey()
					+"-"
					+ carrera.getValue());
			
		}
}

}
/*HashMap<String, Integer> mapaCarrera= new HashMap<>();
		for (Alumno al: alumnos) {
			if(mapaCarrera.containsKey(al.getCarrera())) {
				int count=mapaCarrera.get(al.getCarrera())+1;
				mapaCarrera.put(al.getCarrera(),count);
			}
			else {
				mapaCarrera.put(al.getCarrera(), 1);
			}
		}
		for(Map.Entry<String, Integer> carreras : mapaCarrera.entrySet()) {
			System.out.println(
					carreras.getKey()+
					":"+
					carreras.getValue());
		}
		
	}

}
*/