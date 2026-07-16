package ar.com.unpaz.ServiceImp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

import ar.com.unpaz.Service.GestionMision;
import ar.com.unpaz.model.Mision;
import ar.com.unpaz.model.MisionColonizacion;
import ar.com.unpaz.model.MisionExploracion;
import ar.com.unpaz.model.Recurso;
import ar.com.unpaz.model.RecursoNecesario;

public class GestionMisionImp implements GestionMision {
	HashMap<String, Recurso>recursos= new HashMap<>();
	HashMap<String, Mision>misiones= new HashMap<>();

	@Override
	public void registrarRecursos(String codigo, String nombre, int stock, double valorUnitario) {
		Recurso rec= new Recurso(codigo,nombre,stock,valorUnitario);
		recursos.put(codigo,rec);
		
	}
	@Override
	public void registrarMision(String codigo, String nombre, String planeta, String tipoMision,
			ArrayList<RecursoNecesario> recursoNece) {
		if(tipoMision.equals("E")) {
			MisionExploracion miExploracion= new MisionExploracion(codigo, nombre,planeta,recursoNece);
			misiones.put(codigo,miExploracion);
		}else {
			MisionColonizacion misColo= new MisionColonizacion(codigo,nombre,planeta,recursoNece);
			misiones.put(codigo, misColo);
		}
	}
	@Override
	public void validarMisionStock(String codig) {
		misiones.containsKey(codig);
		Mision m= misiones.get(codig);
		if(m.puedeEjecutarse(recursos)== true) {
			System.out.println("Puede Ejecutarse");
		}else {
			System.out.println("No puede ejecutarse");
		}
	}

	@Override
	public void mostrarMisionesCaract() {
		misiones.values().stream()	
		.forEach(c->{
			System.out.println("Codigo" + c.getCodigo()+ "\n"
					+ "Nombre: " + c.getNombre() + "\n"
					+ "Tipo de Mision" + c.tipoMision()+ "\n"+
					"Planeta Destino: " + c.getPlanetaDestino()+ "\n"
					+ "Costo total: " + c.costoFinalMision(recursos)+ "\n"+
					"Estado: " + (c.puedeEjecutarse(recursos)? "APROBADA" : "RECHAZADA" )
					);
		});
	}

	@Override
	public void mostrarMayorCostoMision() {
		misiones.values().stream()
		.max((m1,m2)-> Double.compare(m1.costoFinalMision(recursos), m2.costoFinalMision(recursos)))
		.ifPresentOrElse(m-> System.out.println(m),() -> System.out.println("No hay ninguna mision"));
	}

	@Override
	public void mostrarMisionesAprobadas() {
		misiones.values().stream()
		.filter(m-> m.puedeEjecutarse(recursos)== true)
		.forEach(System.out::println);
		
	}

	@Override
	public void calcularCostoTotalMisiones() {
		double recaudado= misiones.values().stream()
				.mapToDouble((Mision m)->  m.costoFinalMision(recursos))
				.sum();
				System.out.println("Lo recaudado es: " + recaudado);
	}

	@Override
	public void rankingMisionesCostoYNombres() {
		misiones.values().stream()
		.sorted(Comparator.comparing((Mision m)-> m.costoFinalMision(recursos) ).reversed()
				.thenComparing((Mision m) -> m.getNombre()));
		
	}


}
