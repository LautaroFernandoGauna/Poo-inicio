package ar.com.unpaz.Service;

import java.util.HashMap;

import ar.com.unpaz.model.Ventas;

public interface ConsultasBasicas {
	public void mostrarVentas(HashMap<String, Ventas> ventas);
	public void mostrarProductos(HashMap<String, Ventas> ventas);
	public void ventasMayA500(HashMap<String, Ventas> ventass);
	public void ventaMayA200(HashMap<String, Ventas> ventas);
	public void productosMayus(HashMap<String, Ventas> ventas);
	public void venTarjetas(HashMap<String, Ventas> ventas);
	public void ventMay(HashMap<String, Ventas> ventas );
	public void ventMenGanan(HashMap<String, Ventas> ventass);
	public void primerVentMayMillon(HashMap<String, Ventas> ventas);
	public void ventaPerdida(HashMap<String, Ventas> ventas);
	
}
