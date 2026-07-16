package ar.com.unpaz.model;

public class JugadorInscripto {
	private String dniJugador;
	private String numeroCamiseta;
	public JugadorInscripto() {
		// TODO Auto-generated constructor stub
	}
	public JugadorInscripto(String dniJugador, String numeroCamiseta) {
		super();
		this.dniJugador = dniJugador;
		this.numeroCamiseta = numeroCamiseta;
	}
	public String getDniJugador() {
		return dniJugador;
	}
	public void setDniJugador(String dniJugador) {
		this.dniJugador = dniJugador;
	}
	public String getNumeroCamiseta() {
		return numeroCamiseta;
	}
	public void setNumeroCamiseta(String numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}
	@Override
	public String toString() {
		return "JugadorInscripto [dniJugador=" + dniJugador + ", numeroCamiseta=" + numeroCamiseta + "]";
	}
	
}
