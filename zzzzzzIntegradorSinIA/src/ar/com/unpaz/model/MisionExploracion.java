package ar.com.unpaz.model;

import java.util.ArrayList;
import java.util.HashMap;

public class MisionExploracion extends Mision{

	public MisionExploracion(String codigo, String nombre, String planetaDestino,
			ArrayList<RecursoNecesario> recursoNecesario) {
		super(codigo, nombre, planetaDestino, recursoNecesario);
		// TODO Auto-generated constructor stub
	}

	public MisionExploracion() {
		super();
	}

	@Override
	public double costoFinalMision(HashMap<String, Recurso> recursos) {
		double total= 0 ;
		for(RecursoNecesario rN: getRecursoNecesario()) {
			if(recursos.containsKey(rN.getCodigo())) {
				Recurso rec= recursos.get(rN.getCodigo());
				total+= rN.getCantidadNecesaria() * rec.getValorUnitario();
			}
			
		}
		return total * 1.10;
	}

	

	@Override
	public String tipoMision() {
		
		return "Exploracion";
	}

	

	
}
