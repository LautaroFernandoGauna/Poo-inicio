package ar.com.unnpaz.Repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.Producto;

public class LecturaArchivo {
	
	public List<Producto> lectura(){
		List<Producto>productos= new ArrayList<Producto>();
		Producto prod= new Producto();
		
		File sFile = new File("Productos.txt");
		FileReader sFileReader;
		try {
			sFileReader= new FileReader(sFile);
			BufferedReader sBuffer= new BufferedReader(sFileReader);
			String linea= "";
			while((linea = sBuffer.readLine())!= null ) {
				String [] Array = linea.split(",");
				prod.setCodigo(Array[0]);
				prod.setDescripcion(Array[1]);
				prod.setPrecio(Double.parseDouble(Array[2]));
				productos.add(prod);
			
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return productos;
	}
	
	
}
 