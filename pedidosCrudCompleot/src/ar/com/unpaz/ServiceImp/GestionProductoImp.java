package ar.com.unpaz.ServiceImp;

import java.util.List;

import ar.com.unpaz.Service.GestionDePedidos;
import ar.com.unpaz.model.Producto;

public class GestionProductoImp implements GestionDePedidos{

	@Override
	public void altaProducto(List<Producto> productos, Producto producto) {
		productos.add(producto);
		
	}

	@Override
	public void modificarProducto(String codigo, List<Producto> productos, double nuevoPrecio) {
		boolean encontrado= false;
		for(Producto prod : productos) {
			if(prod.getCodigo().equals(codigo) && encontrado == false) {
				prod.setPrecio(nuevoPrecio) ;
				System.out.println("El precio se ha modificado correctamente, Es: " + nuevoPrecio);
				encontrado=true;
			}
		}
		if(encontrado== false) {
			System.out.println("No se ha encontrado ningun producto");
		}
		
	}

	@Override
	public void bajaaProducto(String codigo, List<Producto> productos) {
		productos.removeIf(p-> p.getCodigo().equals(codigo));
		System.out.println("El producto se ha borrado correctamente");
		
	}

	@Override
	public void buscarProducto(String codigo, List<Producto> productos) {
		productos.stream()
		.filter(p-> p.getCodigo().equals(codigo))
		.forEach(System.out::println);
		
	}

	@Override
	public void listarProducto(List<Producto> productos) {
		productos.stream()
		.forEach(p-> System.out.println(p));
		
	}

}
