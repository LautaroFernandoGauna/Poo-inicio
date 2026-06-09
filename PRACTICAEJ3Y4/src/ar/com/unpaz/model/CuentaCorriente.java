package ar.com.unpaz.model;

public class CuentaCorriente extends Cuenta {
	private double descubierto;

	

	public CuentaCorriente() {
	}

	public CuentaCorriente(String numero, String titular, double saldo, double descubierto) {
		super(numero, titular, saldo);
		this.descubierto= descubierto;
		// TODO Auto-generated constructor stub
	}
	
	



	@Override
	public double extraer(double dineroSacado) {
		if(saldo< dineroSacado && saldo + descubierto >= dineroSacado) {
			saldo-=dineroSacado;
			System.out.println("Se ha extraido Correctamente");
			
			
			
		}
		else {
			System.out.println("Saldo insusficiente");
		}
		return saldo;
	}

	public double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [descubierto=" + descubierto + ", getNumero()=" + getNumero() + ", getTitular()="
				+ getTitular() + ", getSaldo()=" + getSaldo() + "]";
	}
	
	
}
