package ar.com.unpaz.model;

import ar.com.unpaz.model.TipoVentas.TiposDePago;

public class Ventas {
	private String IdVenta;
	private Producto producto;
	private TipoVentas tipoDeVentas;
	private String zona;
	private String vendedor;
	private int cant;
	
	public Ventas(String IdVenta, Producto producto, TipoVentas tipoDeVentas, String zona, String vendedor, int cant) {
		this.IdVenta=IdVenta;
		
		this.producto=producto;
		this.tipoDeVentas= tipoDeVentas;
		this.zona=zona;
		this.vendedor=vendedor;
		this.cant=cant;
	}
	
	public Ventas() {
		// TODO Auto-generated constructor stub
	}
	public double importeBruto() {
		double impBruto=0;
		impBruto=producto.getPrecioUnitario() * cant ;
		return impBruto;
	}
	
	public double importeFinal() {
		double importeFinal=importeBruto();
		
		double descuentoEfectivo = importeFinal * 0.10;
		double recargoTarjeta = importeFinal* 0.08;
		if( tipoDeVentas.getMetodoDePago() == TiposDePago.EFECTIVO) {
			importeFinal= importeFinal - descuentoEfectivo;
			return importeFinal;
		}
		if(tipoDeVentas.getMetodoDePago() == TiposDePago.TARJETA) {
			importeFinal = importeFinal + recargoTarjeta;
			return importeFinal;
		}
		if(tipoDeVentas.getMetodoDePago() == TiposDePago.TRANSFERENCIA ) {
			return importeFinal;
		}
		return importeFinal ;
			}
	
	public double calcularGanancia() {
		return importeFinal() - (cant * producto.getCostoUni());
	}
	
	public String calcularRentabilidad() {
		double porcentaje = (calcularGanancia()) / importeFinal() *100;
		if(porcentaje < 10) {
			return "Riesgosa";	
		}
		if(porcentaje > 10 && porcentaje <= 25) {
			return "Normal";
		}else
			return "Rentable";
	}
	
	
	public String getIdVenta() {
		return IdVenta;
	}
	public void setIdVenta(String idVenta) {
		IdVenta = idVenta;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}

	public TipoVentas getTipoDeVentas() {
		return tipoDeVentas;
	}

	public void setTipoDeVentas(TipoVentas tipoDeVentas) {
		this.tipoDeVentas = tipoDeVentas;
	}
	
	

}
