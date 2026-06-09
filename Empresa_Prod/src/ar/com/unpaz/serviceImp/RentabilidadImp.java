package ar.com.unpaz.serviceImp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ar.com.unpaz.Service.Rentabilidad;
import ar.com.unpaz.model.Ventas;

public class RentabilidadImp implements Rentabilidad {

	@Override
	public void ventasRiesgosa(HashMap<String, Ventas> ventas) {
		ventas.values().stream()
		.filter(v-> v.calcularRentabilidad() == "Riesgosa")
		.forEach(System.out::println);
		
	}

	@Override
	public void ventasRentable(HashMap<String, Ventas> ventas) {
		ventas.values().stream()
		.filter(v-> v.calcularRentabilidad() == "Rentable")
		.forEach(System.out::println);
		
	}

	@Override
	/*public HashMap<String, Integer>  tiposCategoria(HashMap<String, Ventas> ventas) {
	/*	HashMap<String, Integer> categorias = new HashMap<>();
		int valorActual=0;
		for( Map.Entry<String, Ventas> entry: ventas.entrySet() ) {
			if(categorias.containsKey(ventas.get(entry))) {
				categorias.get(ventas.getProducto().getCategoria());
				valorActual=categorias.get(ventas.getProducto().getCategoria());
				categorias.put(ventas.getProducto().getCategoria(), valorActual+1);
				
			}else {
				categorias.put(ventas.getProducto().getCategoria(), 1);

			
			
			
			
			for(Map.Entry<String, Integer> datos : categorias.entrySet()) {
			System.out.println(datos.getKey() + "--" + datos.getValue());
			}
			return categorias;
			*/	
		
		
		}

}
