package ar.com.unpaz.model;

public class Jugador {
	private String dni;
	private String nombre;
	private int edad;
	private String categoría;
	
	public Jugador() {
		// TODO Auto-generated constructor stub
	}
	
	public Jugador(String dni, String nombre, int edad, String categoría) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.categoría = categoría;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCategoría() {
		return categoría;
	}
	public void setCategoría(String categoría) {
		this.categoría = categoría;
	}

	@Override
	public String toString() {
		return "Jugador [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", categoría=" + categoría + "]";
	}
	
}
