package ar.com.unpaz.model;

public class Alumno {
	private String legajo;
	private String nombre;
	private String carrera;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	
	public Alumno(String legajo, String nombre, String carrera) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.carrera = carrera;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + ", nombre=" + nombre + ", carrera=" + carrera + "]";
	}
	
	
	
}
