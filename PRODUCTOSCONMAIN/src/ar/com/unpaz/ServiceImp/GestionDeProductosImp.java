package ar.com.unpaz.ServiceImp;

import java.util.List;

import ar.com.unpaz.Service.GestionDeProductos;
import ar.com.unpaz.model.Producto;

public class GestionDeProductosImp implements GestionDeProductos{

	@Override
	public void altaProducto(List<Producto> productos, Producto producto) {
		productos.add(producto);
		
	}

	@Override
	public void modificacionProducto(String IDProducto, String nuevadescripcion, double nuevoPrecio,
			List<Producto> productos) {
		for(Producto p: productos) {
			if(p.getCodigo().equals(IDProducto)) {
				p.setDescripcion(nuevadescripcion);
				p.setPrecio(nuevoPrecio);
				System.out.println("Se ha cambiado con exito la descripcion y el precion ");
			}
		}
		
	}

	@Override
	public void bajaProducto(String IDProducto, List<Producto> productos) {
		productos.removeIf(p-> p.getCodigo().equals(IDProducto));
		
		
	}

	@Override
	public void buscarProducto(String IDProducto, List<Producto> productos) {
		productos.stream()
		.filter(p-> p.getCodigo().equals(IDProducto))
		.forEach(System.out::println);
		
	}

	@Override
	public void listarProductos(List<Producto> productos) {
		productos.stream()
		.forEach(c-> System.out.println(c));
		
		
	}

}
