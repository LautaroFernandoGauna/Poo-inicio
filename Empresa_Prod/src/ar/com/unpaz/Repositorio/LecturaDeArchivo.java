package ar.com.unpaz.Repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

import ar.com.unpaz.model.Producto;
import ar.com.unpaz.model.TipoVentas;
import ar.com.unpaz.model.TipoVentas.TiposDePago;
import ar.com.unpaz.model.Ventas;

public class LecturaDeArchivo {
	 public HashMap<String,Ventas> lectura(){
		 HashMap<String, Ventas> ventas = new HashMap<>(); /*Le pasamos como KEY el atributo String de IDVenta y el valor es toda la clase Ventas asi muestra todos los atributos que estan en Ventas, 
		 como en el archivo txt*/
		 File sFile= new File("ventas.txt"); /* Para almacenar el archivo*/
		 try {
			 FileReader sFileReader= new FileReader(sFile); /*Selecciona el archivo a leer*/
			 BufferedReader sBuffer = new BufferedReader(sFileReader);/*Lee el archivo */
			 String linea = " ";  /*Funciona para almacenar todas las lineas del sBuffer y poder usarlo como condición */
			 boolean bandera= false;
			 while ((linea = sBuffer.readLine()) != null) { /* Mientas buffer tenga archivos por leer va a seguir leyendo, cuando esté vacio va a cortar, basicamente lee la Linea y la almacena en String Linea   */
				 String [] campos  = linea.split(";");
				 Ventas ven = new Ventas();
				 Producto prod = new Producto();
				 TipoVentas tipo = new TipoVentas();
				 if(bandera== false) {
					 bandera=true;  /* aca hago esta bandera para que no rompa el codigo la primer vuelta que da el WHile porque van a ser todos String la primer vuelta y hay INT y DOuble entonces va a dar error*/
					 continue; /* Por esto utilizo el Continue para que lea la segunda linea del archivo*/
				 }
					 ven.setIdVenta(campos[0]);
					 tipo.setMetodoDePago((TiposDePago.valueOf(campos[1].toUpperCase()))); /*Aca puse el valueOf porq pasa el Enum en String y el 
					 .toUpperCase() para que todo lo que se lea desde el archivo se lea en mayuscula*/
					 prod.setNomb(campos[2]);
					 prod.setCategoria(campos[3]);
					 ven.setCant(Integer.parseInt(campos[4]));
					 prod.setPrecioUnitario(Double.parseDouble(campos[5]));
					 prod.setCostoUni(Double.parseDouble(campos [6]));					 
					 ven.setVendedor(campos[7]);
					 ven.setZona(campos[8]);
					 
					 ven.setProducto(prod);/*Aca hacemos ven.setProducto() porque tenemos que pasarle los valores al atributo Producto productos de la clase Venta que es un atributo de esta clase
					 para guardar los valores a este atributo */
					 ven.setTipoDeVentas(tipo);/*Aca hacemos lo mismo, almacenamos lo valores en la clase Ventas*/
					 
					 ventas.put(ven.getIdVenta(),ven);/*Aca lo agregamos al HashMap para que devuelva la lista con su codigo, en este caso la KEY es un String y el IDVenta*/
			 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 return ventas;
		 
	 }
}
