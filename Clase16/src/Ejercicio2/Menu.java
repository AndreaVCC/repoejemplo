package Ejercicio2;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {

	private static Zoologico zoo;
	private static Scanner scanner;
	
	public static void mostrarAnimalesXCategoria() {
		System.out.println("Seleccione categoría: (1.- Terrestre, 2.- Acuatico, 3.- Volador)");
		int categoria = scanner.nextInt();
		
		zoo.mostrarAnimales(categoria);
	}
	
	public static void agregarAnimal() {
		
		System.out.println("Nombre: ");
		String nombre = scanner.next();
		System.out.println("País origen: ");
		String pais = scanner.next();
		System.out.println("Día ingreso: ");
		int diaingreso = scanner.nextInt();
		System.out.println("Mes ingreso: ");
		int mesingreso = scanner.nextInt();
		System.out.println("Año ingreso: ");
		int anioingreso = scanner.nextInt();
		LocalDate fechaing = LocalDate.of(anioingreso, mesingreso, diaingreso);
		System.out.println("Tipo animal: (1.- Terrestre, 2.- Acuatico, 3.- Volador)");
		int tipoanimal = scanner.nextInt();
		if (tipoanimal == 1) {
			System.out.println("Cantidad de patas: ");
			int cantpatas = scanner.nextInt();
			System.out.println("Tipo alimentación: ");
			String tipoali = scanner.next();
			System.out.println("Horas de sueño: ");
			double horassueno = scanner.nextDouble();
			AnimalTerrestre aniter = new AnimalTerrestre(nombre,pais,fechaing,cantpatas,tipoali,horassueno);
			zoo.addAnimal(aniter);
		}
		else if (tipoanimal == 2) {
			System.out.println("Tipo de ambiente (1.- Agua dulce, 2.- Agua salada): ");
			int ambiente = scanner.nextInt();
			System.out.println("Cantidad de aletas: ");
			int cantaletas = scanner.nextInt();
			System.out.println("Nivel de agresividad (1 a 5 de menor a mayor nivel): ");
			int nivagresividad = scanner.nextInt();
			AnimalAcuatico aniacu = new AnimalAcuatico(nombre,pais,fechaing,ambiente,cantaletas,nivagresividad);
			zoo.addAnimal(aniacu);
		}
		else if (tipoanimal == 3) {
			System.out.println("Color de plumas: ");
			String cplumas = scanner.next();
			System.out.println("Tamaño: ");
			int tamanio = scanner.nextInt();
			System.out.println("Migrante (1.- Sí, 2.- No): ");
			int migrante = scanner.nextInt();
			boolean esmigrante;
			if (migrante == 1) {
				esmigrante = true;
			}
			else if (migrante == 2) {
				esmigrante = false;
			}
			else {
				esmigrante = false;
			}
			
			AnimalVolador anivol = new AnimalVolador(nombre,pais,fechaing,cplumas,tamanio,esmigrante);
			zoo.addAnimal(anivol);			
		}
		
		System.out.println("El animal " + nombre + " proveniente de " + pais + " ha sido registrado exitosamente");
	}
	
	public static void main(String[] args) {
		zoo = new Zoologico();
		zoo.cargarAnimales();
		
		int op = 0;
		scanner = new Scanner(System.in);

		do {
			System.out.println("");
			System.out.println("Menu");
			System.out.println("--------------------");
			System.out.println("1.- Agregar animal");
			System.out.println("2.- Mostrar animales por categoria");
			System.out.println("3.- Resumen");
			System.out.println("4.- Salir del programa");
			System.out.println("-------------------");
			System.out.println("Ingrese una opción: ");

			op = scanner.nextInt();
			
			switch(op){
				case 1:
					agregarAnimal();
					break;
				case 2:
					mostrarAnimalesXCategoria();
					break;
				case 3:
					zoo.resumen();
					break;
				case 4: 
					System.out.println("Adios!!!");
					break;
				default:
					System.out.println("Ingrese una opción válida");
					break;
			}
			
		}while (op != 4);

		scanner.close();

	}

}
