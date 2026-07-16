package ar.com.unpaz.Service;

import java.util.ArrayList;

import ar.com.unpaz.model.JugadorInscripto;

public interface GestionDeInscripciones {
	public void registrarJugador(String dni, String nombre, int edad, String categoria);
	public void registrarInscripcion(String codigoInscripcion, String nombreEquipo, ArrayList<JugadorInscripto>jugadoresInscriptos, String tipoTorneo);
	public void validarRealizarInscripcion(String codigoInscripcion);
	public void mostrarInscripcionesConCaracteristicas();
	public void agruparPorGrupoDeTorneo();
	public void calcularCostoPromedio();
	public void listarNombresDeEquipos();
	public void contarInscripcionesRechazadas();
	public void rankingPorCostoYNombreEquipo();
	
}
/*Validar si una inscripción puede confirmarse (según la regla de edad, no de stock — pensá bien cómo se traduce esa regla al código).
Mostrar todas las inscripciones: código, equipo, tipo de torneo, costo total, estado (CONFIRMADA/RECHAZADA).
Con Streams, resolvé (sin ayuda mía esta vez, investigá si hace falta):

Agrupar las inscripciones por tipo de torneo, mostrando cuántas hay de cada tipo.
Calcular el costo promedio de las inscripciones confirmadas.
Listar los nombres de equipo distintos (sin duplicados).
Contar cuántas inscripciones fueron rechazadas.
Ranking de inscripciones por costo descendente, empate por nombre de equipo.

*/