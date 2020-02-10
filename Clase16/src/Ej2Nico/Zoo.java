package Ej2Nico;

import java.util.ArrayList;
import java.util.List;


import javax.swing.JOptionPane;

public class Zoo{

	static String nombreAnimal;
	static String paisOrigen ;
	static String fechaIngreso;
	static Byte cantidadpatas;
	static Byte horasSueno;
	static String tipoDeAlimentacion;
	static String tipoAmbiente;
	static int cantidadDeAletas;
	static String nivelDeAgresividad;
	static String colorDePlumas;
	static double tamano;
	static boolean migrante;

	static char letra;

	static List<Terrestres> Animales = new ArrayList <Terrestres>();
	static List<Acuaticos> Acuaticos = new ArrayList <Acuaticos>();
	static List<Voladores> Voladores = new ArrayList <Voladores>();		

	static int contadorTerrestre = 0;
	static int contadorAcuatico = 0;
	static int contadorVoladores = 0;

	public static void agregarAnimal() {
		int tipoAnimal = JOptionPane.showInputDialog("Ingrese tipo de animal:"
				+ "\n" + "1.- Terrestre"
				+ "\n" + "2.- Acuatico"
				+ "\n" + "3.- Voladores").charAt(0);

		switch (tipoAnimal) {

		case '1':

			nombreAnimal = JOptionPane.showInputDialog("Nombre de Animal: ");
			paisOrigen = JOptionPane.showInputDialog("Ingrese pais de Origen: ");
			fechaIngreso = JOptionPane.showInputDialog("Ingrese fecha de ingreso: ");
			cantidadpatas = Byte.parseByte(JOptionPane.showInputDialog("Ingrese cantida de patas: "));
			tipoDeAlimentacion = JOptionPane.showInputDialog("Tipo de Alimentacion: ");
			horasSueno = Byte.parseByte(JOptionPane.showInputDialog("Ingrese horas de sueno: "));

			Terrestres at = new Terrestres(nombreAnimal,paisOrigen,fechaIngreso,cantidadpatas,tipoDeAlimentacion,horasSueno);
			Animales.add(at);

			contadorTerrestre = contadorTerrestre + 1;


			break;

		case '2':

			nombreAnimal = JOptionPane.showInputDialog("Nombre de Animal: ");
			paisOrigen = JOptionPane.showInputDialog("Ingrese pais de Origen: ");
			fechaIngreso = JOptionPane.showInputDialog("Ingrese fecha de ingreso: ");
			tipoAmbiente = JOptionPane.showInputDialog("Ingrese tipo de Ambiente: ");
			cantidadDeAletas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad de Aletas: "));
			nivelDeAgresividad = JOptionPane.showInputDialog("Ingrese Nivel de Agresividad de 1 a 3: ");

			Acuaticos aa = new Acuaticos(nombreAnimal,paisOrigen,fechaIngreso,tipoAmbiente,cantidadDeAletas,nivelDeAgresividad);
			Acuaticos.add(aa);

			contadorAcuatico = contadorAcuatico + 1;
			break;

		case '3':

			nombreAnimal = JOptionPane.showInputDialog("Nombre de Animal: ");
			paisOrigen = JOptionPane.showInputDialog("Ingrese pais de Origen: ");
			fechaIngreso = JOptionPane.showInputDialog("Ingrese fecha de ingreso: ");
			colorDePlumas = JOptionPane.showInputDialog("Ingrese Color de Plumas: ");
			tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamano: "));
			String migra; 
			migra = JOptionPane.showInputDialog("Ingrese si es migrante o no: ");
			if (migra == "si") {
				migrante = true;
			}else
				migrante = false;

			Voladores av = new Voladores(nombreAnimal,paisOrigen,fechaIngreso,colorDePlumas,tamano,migrante);
			Voladores.add(av);

			contadorVoladores = contadorVoladores + 1;

			break;


		default:
			break;
		}	
	}


	public static void mostrarAnimales(){
		int letraOpcion;

		letraOpcion = JOptionPane.showInputDialog("Eliga un de tipo de animal: "
				+ "\n" + "1.- Terrestres"
				+ "\n" + "2.- Acuaticos"
				+ "\n" + "3.- Voladores").charAt(0);

		switch (letraOpcion) {
		case '1':
			JOptionPane.showMessageDialog(null, Animales);
			break;
		case '2':
			JOptionPane.showMessageDialog(null, Acuaticos);
			break;
		case '3':
			JOptionPane.showMessageDialog(null, Voladores);
			break;

		default:
			break;
		}


		/*for (Terrestres i : Animales) {
	JOptionPane.showInputDialog(i.toString());		
	}*/	
	}	

	public static void resumenAnimales(){

		JOptionPane.showMessageDialog(null, "Cantidad de Animales"
				+ "\nAnimales terrestres: "+ contadorTerrestre
				+ "\nAnimales acuaticos:  "+ contadorAcuatico
				+ "\nAnimales Voladores:  "+ contadorVoladores);
	}


	public static void main(String[]Args) {

		do {


			letra = JOptionPane.showInputDialog("Ingrese opcion: "
					+ "\n" + "A.- Agregar Animal"
					+ "\n" + "B.- Mostrar Animal"
					+ "\n" + "C.- Resumen"
					+ "\n" + "D.- Salir: D").charAt(0);


			/*System.out.println("Ingrese opcion: ");
		System.out.println("Agregar animal: A ");
		System.out.println("Mostar animales: B ");
		System.out.println("Resumen: C");
		System.out.println("Salir: D");*/

			//letra = JOptionPane.showInputDialog("Ingresa opcion: ").charAt(0);		

			switch (letra) {
			case 'a':
				agregarAnimal();
				break;

			case 'b':
				mostrarAnimales();
				break;

			case 'c':
				resumenAnimales();
				break;

			case 'd':
				JOptionPane.showMessageDialog(null,"Adios");
				break;			
			}	
		}while(letra != 'd');

	}
}