package ar.com.unpaz.Repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.Cliente;

public class LecturaArchivo {
	public List<Cliente> lectura(){
		List<Cliente>clientes = new ArrayList<Cliente>();
		File sFile= new File("Cliente.txt");
		try {
			FileReader sFileReader= new FileReader(sFile);
			BufferedReader sBuffer = new BufferedReader(sFileReader);
			String linea= " ";
			while((linea =  sBuffer.readLine()) != null) {
				String []Array = linea.split(";");
				Cliente cc = new Cliente();
				cc.setIdCliente(Array[0]);
				cc.setNombre(Array[1]);
				cc.setSaldo(Double.parseDouble(Array[2]));
				clientes.add(cc);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return clientes;
	}
}
