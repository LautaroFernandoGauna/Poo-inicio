package ar.com.unpaz.Service;

import java.util.ArrayList;

import ar.com.unpaz.model.RecursoNecesario;

public interface GestionMision {
	public void registrarRecursos(String codigo, String nombre, int stock, double valorUnitario);
	public void registrarMision(String codigo, String nombre, String planeta, String tipoMision, ArrayList<RecursoNecesario>recursoNece);
	public void validarMisionStock(String codig);
	public void mostrarMisionesCaract();
	public void mostrarMayorCostoMision();
	public void mostrarMisionesAprobadas();
	public void calcularCostoTotalMisiones();
	public void rankingMisionesCostoYNombres();
}
