package ar.com.unpaz.model;

import java.util.ArrayList;


public class TorneoNacional extends Inscripciones {
	
	public TorneoNacional() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TorneoNacional(String codigoInscripcion, String nombreEquipo,
			ArrayList<JugadorInscripto> jugadoresInscriptos) {
		super(codigoInscripcion, nombreEquipo, jugadoresInscriptos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double costoTotal() {
		double total= 200;
		for(JugadorInscripto jugIn: getJugadoresInscriptos()) {
				total+= 50;
			
		}
		return total * 1.25;
	}

	@Override
	public String tipoTorneo() {
		
		return "Nacional";
	}

}
