package ar.com.unpaz.Service;

import java.util.List;

import ar.com.unpaz.model.Producto;

public interface GestionDePedidos {
	public void altaProducto(List<Producto> productos, Producto producto);
	public void modificarProducto(String codigo,List<Producto> productos, double nuevoPrecio);
	public void bajaaProducto(String codigo,List<Producto> productos);
	public void buscarProducto(String codigo,List<Producto> productos);
	public void listarProducto(List<Producto> productos);
}
