package ar.com.unpaz.Service;

import java.util.List;

import ar.com.unpaz.model.CajaAhorro;
import ar.com.unpaz.model.Cuenta;
import ar.com.unpaz.model.CuentaCorriente;

public interface GestionBanco {
	public void agregarCuenta(List<Cuenta>cuentas, Cuenta cuenta);
	public void buscarCuenta(String nroCuenta, List<Cuenta>cuentas);
	public void eliminarCuenta(String nroCUenta, List<Cuenta>cuentas);
	public void saldoCuenta(List<Cuenta>cuentas);
	public void guardarCuentasUnaLista(List<Cuenta> cuentas, List<CuentaCorriente>cuentasCorrientes, List<CajaAhorro>cajasDeAhorro);
	public void tipoCuenta(List<Cuenta> cuentas);
	public void dineroAdmin(List<Cuenta> cuentas, List<CuentaCorriente>cuentasCorrientes,List<CajaAhorro>cajasDeAhorro);
	public void mostrarCuentaCorrientes(List<CuentaCorriente>cuentasCorrientes);
	
	
}
