package ar.com.unpaz.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.com.unpaz.Service.GestionDeProductos;
import ar.com.unpaz.ServiceImp.GestionDeProductosImp;
import ar.com.unpaz.model.Producto;

public class Inicio {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		List<Producto> productos= new ArrayList<Producto>();
		
		GestionDeProductos gestion= new GestionDeProductosImp();
		
		int opcion;
		do {
			System.out.println("----SISTEMA DE PRODUCTO----");
			System.out.println("1. ALTA PRODUCTO");
			System.out.println("2. MODIFICACION PRODUCTO");
			System.out.println("3. BAJA DE PRODUCTO");
			System.out.println("4. BUSCAR PRODUCTO ");
			System.out.println("5. LISTAR PRODUCTOS");
			System.out.println("6. SALIR ");
			System.out.println("SELECCIONE UNA OPCION: ");
			
			opcion= scanner.nextInt();
			scanner.nextLine();
			
			switch(opcion){
				case 1:
					System.out.println("Codigo del producto: ");
					String cod = scanner.nextLine();
					System.out.println("Descripcion del producto: ");
					String desc= scanner.nextLine();
					System.out.println("Precio del producto: ");
					double prec = scanner.nextDouble();
					scanner.nextLine();
					Producto p = new Producto(cod, desc,prec);
					gestion.altaProducto(productos, p);
					break;
				case 2: 
					System.out.println("Seleccione el codigo: ");
					String codi = scanner.nextLine();
					System.out.println("Nueva Descripcion: ");
					String des = scanner.nextLine();
					System.out.println("Nuevo Precio: ");
					double nuevoPrecio = scanner.nextDouble();
					scanner.nextLine();
					gestion.modificacionProducto(codi, des, nuevoPrecio, productos);
					break;
				case 3: 
					System.out.println("Seleccione el codigo: ");
					String codig= scanner.nextLine();
					gestion.bajaProducto(codig, productos);
					System.out.println("Ha sido removido");
					break;
				case 4: 
					System.out.println("Seleccione el codigo que desea buscar");
					String co = scanner.nextLine();
					gestion.buscarProducto(co, productos);
					break;
				case 5:
					gestion.listarProductos(productos);
					break;
				case 6: 
					System.out.println("SALIENDO DEL SISTEMA...");
					break;
				default:
					System.out.println("OPCION INVALIDA");
				
				
			}
			
			
			
			
			
			
			
		}
		while(opcion != 6);
		scanner.close();

	}

}
/*
Alta
Modificación
Baja
Buscar
Listar
Salir*/