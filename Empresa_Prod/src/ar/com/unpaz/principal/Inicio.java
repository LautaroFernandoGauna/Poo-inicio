package ar.com.unpaz.principal;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.serviceImp.ConBasicasImp;
import ar.com.unpaz.Service.ConsultasBasicas;
import ar.com.unpaz.model.Producto;
public class Inicio {

	public static void main(String[] args) {
		List<Producto> productos= new ArrayList<Producto>();
		Producto prod= new Producto("Teclado RedDragon", " Teclados", 12000, 1000);
		Producto prod1= new Producto("MOuse RedDragon", " MOUSSE", 10, 122);
		productos.add(prod);
		productos.add(prod1) ;
		ConsultasBasicas consultas = new ConBasicasImp();
		consultas.mostrarProductos();
		consultas.mostrarProductos(null);
		
	}

}
