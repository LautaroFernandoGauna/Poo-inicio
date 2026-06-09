package ar.com.unpaz.model;

public class CajaAhorro extends Cuenta {
	private double porcentajeInteres;

	
	

	public CajaAhorro(String numero, String titular, double saldo, double porcentajeInteres) {
		super(numero, titular, saldo);
		this.porcentajeInteres= porcentajeInteres;
	}
	
	@Override
	public double depositar(double dinero) {
		double dineroPorcentaje= dinero * porcentajeInteres;
		if(dinero>0) {
			dinero+=dineroPorcentaje;
			saldo+=dinero;
			System.out.println("Se ha depositado correctamente con interes");
		}
		return saldo;
	}

	public CajaAhorro() {
		// TODO Auto-generated constructor stub
	}
	
	
	public double getPorcentajeInteres() {
		return porcentajeInteres;
	}

	public void setPorcentajeInteres(double porcentajeInteres) {
		this.porcentajeInteres = porcentajeInteres;
	}


	@Override
	public String toString() {
		return "CajaAhorro [porcentajeInteres=" + porcentajeInteres + ", getNumero()=" + getNumero() + ", getTitular()="
				+ getTitular() + ", getSaldo()=" + getSaldo() + "]";
	}
	
	
}
