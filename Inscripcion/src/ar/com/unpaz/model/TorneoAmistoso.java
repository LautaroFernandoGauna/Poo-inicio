package ar.com.unpaz.model;

import java.util.ArrayList;

public class TorneoAmistoso extends Inscripciones{

	
	public TorneoAmistoso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TorneoAmistoso(String codigoInscripcion, String nombreEquipo,
			ArrayList<JugadorInscripto> jugadoresInscriptos) {
		super(codigoInscripcion, nombreEquipo, jugadoresInscriptos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double costoTotal() {
		double total=200;
		return total;
	}

	@Override
	public String tipoTorneo() {
		
		return "Amistoso";
	}
	
}
