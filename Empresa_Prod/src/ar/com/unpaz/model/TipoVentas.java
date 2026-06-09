package ar.com.unpaz.model;

public class TipoVentas extends Ventas   {
	private String IdVenta;
	private TiposDePago metodoDePago;
	
	public TipoVentas(String IdVenta, TiposDePago metodoDePago) {
		this.IdVenta= IdVenta;
		this.metodoDePago=metodoDePago;
	}
	
	public enum TiposDePago{
		EFECTIVO,
		TARJETA,
		TRANSFERENCIA
	}
	
	public TipoVentas() {
	}
	
	public String getIdVenta() {
		return IdVenta;
	}
	public void setIDVenta(String idVenta) {
		IdVenta = idVenta;
	}
	public TiposDePago getMetodoDePago() {
		return metodoDePago;
	}
	public void setMetodoDePago(TiposDePago metodoDePago) {
		this.metodoDePago = metodoDePago;

	}
	
}

