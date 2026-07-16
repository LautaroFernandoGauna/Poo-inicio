package ar.com.unpaz.model;

public class Recurso {
	private String codigo;
	private String nombre;
	private int stock;
	private double valorUnitario;
	
	public Recurso() {
		// TODO Auto-generated constructor stub
	}
	public Recurso(String codigo, String nombre, int stock, double valorUnitario) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.stock = stock;
		this.valorUnitario = valorUnitario;
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
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	@Override
	public String toString() {
		return "Recurso [codigo=" + codigo + ", nombre=" + nombre + ", stock=" + stock + ", valorUnitario="
				+ valorUnitario + "]";
	}
	
	
	
}
