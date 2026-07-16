package ar.com.unpaz.ServiceImp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import ar.com.unpaz.Service.GestionDeInscripciones;
import ar.com.unpaz.model.Inscripciones;
import ar.com.unpaz.model.Jugador;
import ar.com.unpaz.model.JugadorInscripto;
import ar.com.unpaz.model.TorneoAmistoso;
import ar.com.unpaz.model.TorneoNacional;
import ar.com.unpaz.model.TorneoRegional;

public class GestionDeInscripcionesImp implements GestionDeInscripciones{
	HashMap<String, Jugador>jugadores= new HashMap<>();
	HashMap<String, Inscripciones>inscripciones= new HashMap<>();
	@Override
	public void registrarJugador(String dni, String nombre, int edad, String categoria) {
		Jugador jug= new Jugador(dni, nombre,edad,categoria);
		jugadores.put(dni, jug);
		
	}
	@Override
	public void registrarInscripcion(String codigoInscripcion, String nombreEquipo,
			ArrayList<JugadorInscripto> jugadoresInscriptos, String tipoTorneo) {
		if(tipoTorneo.equals("REGIONAL")) {
			TorneoRegional toReg= new TorneoRegional(codigoInscripcion, nombreEquipo,jugadoresInscriptos);
			inscripciones.put(codigoInscripcion, toReg);
		}else if(tipoTorneo.equals("NACIONAL")) {
			TorneoNacional torNacio= new TorneoNacional(codigoInscripcion,nombreEquipo,jugadoresInscriptos);
			inscripciones.put(codigoInscripcion, torNacio);
		}else if(tipoTorneo.equals("AMISTOSO")) {
			TorneoAmistoso torAmis= new TorneoAmistoso(codigoInscripcion, nombreEquipo,jugadoresInscriptos);
			inscripciones.put(codigoInscripcion, torAmis);
		}
		
	}
	@Override
	public void validarRealizarInscripcion(String codigoInscripcion) {
		inscripciones.containsKey(codigoInscripcion);
		Inscripciones in= inscripciones.get(codigoInscripcion);
		if(in == null) {
			System.out.println("NO hay ninguna inscripcion");
			
		}else if(in.confirmarInscripcion(jugadores) == false) {
			System.out.println("No se puede inscribir");
		}else if(in.confirmarInscripcion(jugadores)== true) {
			System.out.println("Se puede inscribir correctamente");
		}
		
	}
	@Override
	public void mostrarInscripcionesConCaracteristicas() {
		inscripciones.values().stream()
		.forEach(c->{
			System.out.println("Codigo: "+ c.getCodigoInscripcion()+ "\n"+
					"Nombre del equipo: "+ c.getNombreEquipo() + "\n"+
					"Costo Total: "+ c.costoTotal() +"\n"+
					"Tipo De Torneo: "+ c.tipoTorneo()+"\n"+
					"ESTADO: "+ (c.confirmarInscripcion(jugadores)? "CONFIRMADA" : "RECHAZADA" )
					);
		});
		
	}
	@Override
	public void agruparPorGrupoDeTorneo() {
		Map <String, Long> conteo= inscripciones.values().stream()
		.collect(Collectors.groupingBy(Inscripciones :: tipoTorneo, Collectors.counting()) );
		conteo.entrySet().stream()
		.forEach(c-> {
			String tipo= c.getKey();
			String nombre= switch(tipo) {
			case "NACIONAL"-> "TORNEO NACIONAL";
			case "REGIONAL"-> "TORNEO REGIONAL";
			case "AMISTOSO"-> "TORNEO AMISTOSO";
			default -> "Desconocido";
			};
			System.out.println(nombre + ": " + c.getValue());
		});
		
	}
	@Override
	public void calcularCostoPromedio() {
		inscripciones.values().stream()
		.mapToDouble((Inscripciones in)-> in.costoTotal())
		.average()
		.ifPresentOrElse(c-> System.out.println("El promedio es: " + c),()-> System.out.println("No hay ninguna inscripcion Cargada"));
		
	}
	@Override
	public void listarNombresDeEquipos() {
		inscripciones.values().stream()
		.map(c-> c.getNombreEquipo())
		.distinct()
		.forEach(c-> System.out.println(c));
		
	}
	@Override
	public void contarInscripcionesRechazadas() {
		long cantidad= inscripciones.values().stream()
				.filter(in-> in.confirmarInscripcion(jugadores)== false)
				.count();
			System.out.println("Las inscripciones rechazadas son: "+ cantidad);
				
		
	}
	@Override
	public void rankingPorCostoYNombreEquipo() {
		inscripciones.values().stream()
		.sorted(Comparator.comparing( (Inscripciones in)-> in.costoTotal() ).reversed()
				.thenComparing( (Inscripciones in)-> in.getNombreEquipo() )  )
		.forEach(System.out::println);
	}
	

}

