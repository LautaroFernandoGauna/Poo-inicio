package ar.com.unpaz.principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import ar.com.unpaz.Service.GestionMision;
import ar.com.unpaz.ServiceImp.GestionMisionImp;
import ar.com.unpaz.model.Mision;
import ar.com.unpaz.model.Recurso;
import ar.com.unpaz.model.RecursoNecesario;

public class Inicio {

	public static void main(String[] args) {
		HashMap<String, Recurso>recursos= new HashMap<>();
		HashMap<String, Mision>misiones= new HashMap<>();
		GestionMision gestion= new GestionMisionImp();
		Scanner scanner= new Scanner(System.in);
		
		int opcion;
		do {
			System.out.println("----BIENVENIDO AL SISTEMA DE MISIONES----");
			System.out.println("1. REGISTRAR RECURSO");
			System.out.println("2. REGISTRAR MISIONES");
			System.out.println("3. VALIDAR MISION SEGUN STOCK");
			System.out.println("4. MOSTRAR TODAS LAS MISIONES CON SUS CARACTERISTICAS");
			System.out.println("5. MOSTRAR MISION CON MAYOR COSTO");
			System.out.println("6. MOSTRAR MISIONES APROBADAS");
			System.out.println("7. CALCULAR EL COSTO TOTAL DE TODAS LAS MISIONES");
			System.out.println("8. RANKING DE MISIONES POR MAYOR COSTO");
			System.out.println("9. SALIR");
			System.out.println("INGRESE UNA OPCION: ");
			opcion= scanner.nextInt();
			scanner.nextLine();
			switch(opcion) {
			case 1:
				System.out.println("Ingrese codigo");
				String cod= scanner.nextLine();
				System.out.println("Ingrese el nombre: ");
				String nom= scanner.nextLine();
				System.out.println("Ingrese stock: ");
				int stock= scanner.nextInt();
				scanner.nextLine();
				double valorUnitario= scanner.nextDouble();
				gestion.registrarRecursos(cod, nom, stock, valorUnitario);
				break;
			case 2:
				System.out.println("Ingrese codigo de la Mision: ");
				String codigo= scanner.nextLine();
				System.out.println("Ingrese nombre: ");
				String nomb= scanner.nextLine();
				System.out.println("Ingrese planeta Destino");
				String planeta= scanner.nextLine();
				System.out.println("Ingrese el tipo de Mision: ");
				String tipoMision= scanner.nextLine();
				ArrayList<RecursoNecesario> recursoNecesario= new ArrayList<>();
				String op;
				do {
					System.out.println("Ingrese el codigo del recurso Necesario:");
					String codi= scanner.nextLine();
					System.out.println("Ingrese La cantidad Necesaria: ");
					int cantidadNec= scanner.nextInt();
					scanner.nextLine();
					RecursoNecesario recNece= new RecursoNecesario(codi, cantidadNec);
					recursoNecesario.add(recNece);
					System.out.println("Presione S para salir"+"\n"
					+"Para seguir presiones otra letra");
					
					op= scanner.nextLine();
				}while(op.equals("S"));
				gestion.registrarMision(codigo, nomb, planeta, tipoMision, recursoNecesario);
				break;
			case 3:
				System.out.println("Ingrese codigo para buscar una mision: ");
				String co= scanner.nextLine();
				gestion.validarMisionStock(co);
				break;
			case 4:
				gestion.mostrarMisionesCaract();
				break;
			case 5:
				gestion.mostrarMayorCostoMision();
				break;
			case 6:
				gestion.mostrarMisionesAprobadas();
				break;
			case 7:
				gestion.calcularCostoTotalMisiones();
				break;
			case 8:
				gestion.rankingMisionesCostoYNombres();
				break;
			default:
				System.out.println("Ingrese una opcion correcta");
			}
		}while(opcion!=9);
		scanner.close();
		
	}

}
