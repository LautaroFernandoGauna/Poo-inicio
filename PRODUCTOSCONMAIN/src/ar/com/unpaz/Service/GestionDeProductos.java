package ar.com.unpaz.Service;

import java.util.List;

import ar.com.unpaz.model.Producto;

public interface GestionDeProductos {
	public void altaProducto(List<Producto>productos, Producto producto);
	public void modificacionProducto(String IDProducto,String nuevadescripcion, double nuevoPrecio,List<Producto>productos);
	public void bajaProducto(String IDProducto,List<Producto>productos);
	public void buscarProducto(String IDProducto,List<Producto>productos);
	public void listarProductos(List<Producto>productos);
	
}
/*Alta
Modificación
Baja
Buscar
Listar
Salir
Todo utilizando ArrayList.

*/