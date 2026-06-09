package ar.com.unpaz.ServiceImp;

import java.util.List;

import ar.com.unpaz.Service.GestionDeClientes;
import ar.com.unpaz.model.Cliente;

public class GestionDeClientesImp implements GestionDeClientes {

	@Override
	public void clientaMaySaldo(List<Cliente> clientes) {
		clientes.stream()
		.max((c1,c2) -> Double.compare(c1.getSaldo(), c2.getSaldo()))
		.ifPresent(s-> System.out.println("El cliente es: " +s.getIdCliente()+" Nombre: "+ s.getNombre() + " Saldo: "+s.getSaldo()));
	}

}
