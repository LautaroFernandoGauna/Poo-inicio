package ar.com.unpaz.model;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Inscripciones {
	private String codigoInscripcion;
	private String nombreEquipo;
	private ArrayList<JugadorInscripto>jugadoresInscriptos;
	
	public Inscripciones() {
		// TODO Auto-generated constructor stub
	}
	public Inscripciones(String codigoInscripcion, String nombreEquipo,ArrayList<JugadorInscripto>jugadoresInscriptos) {
		super();
		this.codigoInscripcion = codigoInscripcion;
		this.nombreEquipo = nombreEquipo;
		this.jugadoresInscriptos=jugadoresInscriptos;
	}
	
	public abstract double costoTotal(); 
	public boolean confirmarInscripcion(HashMap<String,Jugador>jugadores){
		for(JugadorInscripto jugIns: jugadoresInscriptos) {
			if(jugadores.containsKey(jugIns.getDniJugador())) {
				Jugador jug= jugadores.get(jugIns.getDniJugador());
				if(jug.getEdad() < 16 || jug.getEdad() >41) {
					return false;
				}
			}
		}
		return true;
	}
	public abstract String tipoTorneo();
	
	public String getCodigoInscripcion() {
		return codigoInscripcion;
	}
	public void setCodigoInscripcion(String codigoInscripcion) {
		this.codigoInscripcion = codigoInscripcion;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public ArrayList<JugadorInscripto> getJugadoresInscriptos() {
		return jugadoresInscriptos;
	}
	public void setJugadoresInscriptos(ArrayList<JugadorInscripto> jugadoresInscriptos) {
		this.jugadoresInscriptos = jugadoresInscriptos;
	}
	
	
	
}
/*Inscripciones
Un equipo se inscribe a un torneo. De cada inscripción se conoce:

Código de inscripción
Nombre del equipo
Uno o más jugadores inscriptos (DNI del jugador + número de camiseta que va a usar en ese torneo — un mismo jugador puede tener un número distinto según el torneo)

*/