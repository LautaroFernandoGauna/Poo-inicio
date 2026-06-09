package ar.com.unpaz.model;

public class Producto {
	private String nomb;
	private String categoria;
	private double precioUnitario;
	private double costoUni;
	
	public Producto(String nomb, String categoria, double precioUnitario, double costoUni) {
		this.nomb=nomb;
		this.categoria=categoria;
		this.precioUnitario=precioUnitario;
		this.costoUni=costoUni;
	}
	
	public Producto() {
		
	}
	public String getNomb() {
		return nomb;
	}
	public void setNomb(String nomb) {
		this.nomb = nomb;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public double getCostoUni() {
		return costoUni;
	}
	public void setCostoUni(double costoUni) {
		this.costoUni = costoUni;
	}
	

}
