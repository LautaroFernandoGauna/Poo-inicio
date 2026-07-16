package ar.com.unpaz.model;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Mision {
	private String codigo; 
	private String nombre;
	private String planetaDestino;
	private ArrayList<RecursoNecesario> recursoNecesario;
	
	public Mision() {
		// TODO Auto-generated constructor stub
	}
	public Mision(String codigo, String nombre, String planetaDestino, ArrayList<RecursoNecesario> recursoNecesario) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.planetaDestino = planetaDestino;
		this.recursoNecesario = recursoNecesario;
	}
	public abstract double costoFinalMision(HashMap<String,Recurso>recursos);
	public abstract String tipoMision();
	public boolean puedeEjecutarse(HashMap<String,Recurso>recursos) {
		for(RecursoNecesario rn: recursoNecesario) {
			if(recursos.containsKey(rn.getCodigo())) {
				Recurso rec= recursos.get(rn.getCodigo());
				if(rn.getCantidadNecesaria()> rec.getStock()) {
					return false;
			}
			}
		}
		return true;	
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPlanetaDestino() {
		return planetaDestino;
	}
	public void setPlanetaDestino(String planetaDestino) {
		this.planetaDestino = planetaDestino;
	}
	public ArrayList<RecursoNecesario> getRecursoNecesario() {
		return recursoNecesario;
	}
	public void setRecursoNecesario(ArrayList<RecursoNecesario> recursoNecesario) {
		this.recursoNecesario = recursoNecesario;
	}
	

}
