package ar.com.unpaz.Service;

import java.util.HashMap;
import java.util.List;

import ar.com.unpaz.model.Ventas;

public interface Rentabilidad {
	public void ventasRiesgosa(HashMap<String, Ventas> ventas);
	public void ventasRentable(HashMap<String, Ventas> ventas);
	public HashMap<String, Integer>  tiposCategoria(HashMap<String, Ventas> ventas);

}
