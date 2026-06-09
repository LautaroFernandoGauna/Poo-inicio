package ar.com.unpaz.ServiceImp;

import java.util.List;

import ar.com.unpaz.Service.GestionBanco;
import ar.com.unpaz.model.CajaAhorro;
import ar.com.unpaz.model.Cuenta;
import ar.com.unpaz.model.CuentaCorriente;

public class GestionBancoImp implements GestionBanco {

	@Override
	public void agregarCuenta(List<Cuenta> cuentas, Cuenta cuenta) {
		cuentas.add(cuenta);
		
	}

	@Override
	public void buscarCuenta(String nroCuenta, List<Cuenta> cuentas) {
		cuentas.stream()
		.filter(p-> p.getNumero().equals(nroCuenta))
		.forEach(System.out::println);
	}

	@Override
	public void eliminarCuenta(String nroCUenta, List<Cuenta> cuentas) {
		cuentas.removeIf(p-> p.getNumero().equals(nroCUenta));
		
	}

	@Override
	public void saldoCuenta(List<Cuenta> cuentas) {
		double total= cuentas.stream()
		.mapToDouble(Cuenta:: getSaldo)
		.sum();
		System.out.println(total);
		
		
	}

	@Override
	public void guardarCuentasUnaLista(List<Cuenta> cuentas, List<CuentaCorriente> cuentasCorrientes,
			List<CajaAhorro> cajasDeAhorro) {
		cuentas.addAll(cuentasCorrientes);
		cuentas.addAll(cajasDeAhorro);
		
	}

	@Override
	public void tipoCuenta(List<Cuenta> cuentas) {
		for(Cuenta c : cuentas) {
			if (c instanceof CuentaCorriente) {
				System.out.println(c+"Es de tipo Cuenta corriente");
			}else if(c instanceof CajaAhorro) {
				System.out.println(c+"Es de tipo Caja De Ahorro");
			}	
		}
	}

	@Override
	public void dineroAdmin(List<Cuenta> cuentas, List<CuentaCorriente> cuentasCorrientes,List<CajaAhorro>cajasDeAhorro) {
		guardarCuentasUnaLista(cuentas, cuentasCorrientes, cajasDeAhorro);
		double total= cuentas.stream()
				.mapToDouble(Cuenta:: getSaldo)
				.sum();
		System.out.println("El total de dinero administrado es: "+ total);
	}

	@Override
	public void mostrarCuentaCorrientes(List<CuentaCorriente> cuentasCorrientes) {
		cuentasCorrientes.stream()
		.forEach(System.out::println);
		
	}

}
