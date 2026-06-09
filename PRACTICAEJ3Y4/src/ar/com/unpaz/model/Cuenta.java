package ar.com.unpaz.model;

public class Cuenta {
	private String numero;
	private String titular;
	protected double saldo;
	
	
	
	public double depositar(double dinero) {
		if(dinero >0 ) {
			saldo+=dinero;
			System.out.println("Se ha depositado Correctamente");
		}
		return saldo;
	}
	
	public double extraer(double dineroSacado) {
		if(saldo >= dineroSacado && dineroSacado> 0) {
			saldo-=dineroSacado;
			System.out.println("Se ha hecho la Extracción Correctamente");
			
		}
		else {
			System.out.println("Saldo insusficiente");
		}
		
		return saldo;
	}
	
	
	public Cuenta() {
		// TODO Auto-generated constructor stub
	}
	
	public Cuenta(String numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}

	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	
}
