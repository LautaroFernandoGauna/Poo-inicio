package ar.com.unpaz.serviceImp;

import java.util.HashMap;

import ar.com.unpaz.Service.ConsultasBasicas;

import ar.com.unpaz.model.TipoVentas.TiposDePago;
import ar.com.unpaz.model.Ventas;

public class ConBasicasImp implements ConsultasBasicas{

	@Override
	public void mostrarVentas(HashMap<String, Ventas> ventas) {
		ventas.values().stream()
		.forEach(System.out::println);
		
		
	}

	@Override
	public void mostrarProductos(HashMap<String, Ventas> ventas) {
		ventas.values().stream()
		.forEach(p-> System.out.println(p.getProducto()));
		
		
		
	}

	@Override
	public void ventasMayA500(HashMap<String, Ventas> ventas ) {
		ventas.values().stream()
		.filter(p-> p.importeFinal()>= 500000)
		.forEach(System.out::println);
		
	}

	@Override
	public void ventaMayA200(HashMap<String, Ventas> ventas) {
		ventas.values().stream()
		.filter(p-> p.importeFinal() >= 200000)
		.forEach(System.out::println);
	}

	@Override
	public void productosMayus(HashMap<String, Ventas> ventas) {
		ventas.values().stream()
		.map(p-> p.getProducto().getNomb().toUpperCase())
		.forEach(System.out::println);
		
	}

	@Override
	public void venTarjetas(HashMap<String, Ventas> ventas ) {
		long cantVentasTarj=ventas.values().stream()
				.filter(p->p.getTipoDeVentas().getMetodoDePago() == TiposDePago.TARJETA)
				.count();
				System.out.println(cantVentasTarj);
				
	}

	@Override
	public void ventMay(HashMap<String, Ventas> ventas) {
		ventas.values().stream()
		.max((v1, v2) -> Double.compare(v1.importeFinal(), v2.importeFinal()))
	    .ifPresent(v -> System.out.println("Mayor: " + v.getIdVenta()));		
		
	}

	@Override
	public void ventMenGanan(HashMap<String,Ventas> ventas) {
		ventas.values().stream()
		.min((v1,v2) -> Double.compare(v1.calcularGanancia(), v2.calcularGanancia()))
		.ifPresent(v-> System.out.println("La menor ganancia es: " + v));
			
		
	}

	@Override
	public void primerVentMayMillon(HashMap<String, Ventas>ventas) {
		ventas.values().stream()
		.filter(p-> p.importeFinal() > 1000000)
		.findFirst()
		.ifPresent(v -> System.out.println(v));
		
	}

	@Override
	public void ventaPerdida(HashMap<String, Ventas> ventas ) {
		ventas.values().stream()
		.anyMatch(p-> p.calcularGanancia() < 0); 
	}
	
	

}
