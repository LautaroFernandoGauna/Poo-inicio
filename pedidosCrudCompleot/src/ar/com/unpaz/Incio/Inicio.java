package ar.com.unpaz.Incio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.com.unpaz.Service.GestionDePedidos;
import ar.com.unpaz.ServiceImp.GestionProductoImp;
import ar.com.unpaz.model.Producto;

public class Inicio {

	public static void main(String[] args) {
		List<Producto> productos = new ArrayList<Producto>();
		Scanner scanner= new Scanner(System.in);
		
		GestionDePedidos gestion = new GestionProductoImp();

		int opcion=0;
		
		do {
			System.out.println("----BIENVENIDO A LA GESTION DE PRODUCTOS----");
			System.out.println("1. ALTA de  producto");
			System.out.println("2. MODIFICACION de producto");
			System.out.println("3. BAJA de producto");
			System.out.println("4. BUSCAR producto");
			System.out.println("5. LISTAR producto");
			System.out.println("6. SALIR");
			System.out.println("SELECCION UNA OPCION: ");
			opcion= scanner.nextInt();
			scanner.nextLine();
		
			switch(opcion) {
			case 1: 
				System.out.println("Codigo: ");
				String cod = scanner.nextLine();
				
				System.out.println("Nombre: ");
				String nom = scanner.nextLine();
				
				System.out.println("Precio: ");
				double precio = scanner.nextDouble();
				Producto prod = new Producto(cod,nom,precio);
				gestion.altaProducto(productos,prod);
				break;
			case 2:
				System.out.println("Modificacion de precio");
				System.out.println("Seleccione el codigo a buscar");
				String codi= scanner.nextLine();
				System.out.println("Seleccione el nuevo precio: ");
				double precioNuevo = scanner.nextDouble();
				
				gestion.modificarProducto(codi, productos, precioNuevo);
				break;
				
			case 3:
				System.out.println("BAJA DE PRODUCTO");
				System.out.println("INGRESE EL CODIGO: ");
				String codigo= scanner.nextLine();
				
				gestion.bajaaProducto(codigo, productos);
				break;
				
			case 4: 
				System.out.println("BUSQUEDA DE PRODUCTO");
				System.out.println("INGRESE EL CODIGO DE PRODUCTO: ");
				String codigoBusqueda = scanner.nextLine();
				gestion.buscarProducto(codigoBusqueda, productos);
				break;
			case 5:
				System.out.println("----LISTADO DE PRODUCTOS----");
				gestion.listarProducto(productos);
				break;
			case 6:
				System.out.println("Saliendo del Sistema....");
				break;
			default: 
				System.out.println("OPCION INCORRECTA");
				
			}
		
		
		}
		while(opcion != 6);
		scanner.close();
	}
}




