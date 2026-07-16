package ar.com.unpaz.model;

import java.util.ArrayList;


public class TorneoRegional extends Inscripciones {

	
	public TorneoRegional() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TorneoRegional(String codigoInscripcion, String nombreEquipo,
			ArrayList<JugadorInscripto> jugadoresInscriptos) {
		super(codigoInscripcion, nombreEquipo, jugadoresInscriptos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double costoTotal() {
		double total=200;
		for(JugadorInscripto jugIn: getJugadoresInscriptos()) {
				total+=50;
		}
		return total;
	}

	@Override
	public String tipoTorneo() {
		
		return "Regional";
	}
	
	
	
		
}
