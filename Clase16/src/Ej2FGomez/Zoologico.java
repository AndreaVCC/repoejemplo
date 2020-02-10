package Ej2FGomez;

import javax.swing.JOptionPane;
public class Zoologico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Crealista  list1 = new Crealista();
		
		//Instanciamos e iniciamos las variables que seran nuestros selectores 
		String opcion = "";
		String TipoMostrar ="";
		
		//iniciamos el bucle while con un valor " " en opcion.
		// Mientras opcion no sea d, el bucle seguira de manera indefinida
		while(opcion!="d") {
			opcion=JOptionPane.showInputDialog("Ingresa una de las opciones: \na.Agregar animal \nb.Mostrar animales por categoria \nc.Resumen \nd.Salir");
			switch(opcion) { //Comienza el condicional donde estara el menu principal
			case "a":
				String TipoAnimal= "";
				TipoAnimal = JOptionPane.showInputDialog("Ingresa el tipo de animal : \na.Terrestre \nb.Acuatico \nc.Volador");
				switch(TipoAnimal) {// condicional donde se elige el tipo del animal a ingresar
				case"a":
					AnimalTerrestre temp;
						temp = new AnimalTerrestre("T",JOptionPane.showInputDialog("nombre"),JOptionPane.showInputDialog("pais"),
								JOptionPane.showInputDialog("Fecha,ingreso"),Integer.parseInt(JOptionPane.showInputDialog("Cantidad de patas")),
								JOptionPane.showInputDialog("Tipo comida"),Integer.parseInt(JOptionPane.showInputDialog("Horas que duerme")));

						list1.addAnimal(temp);
						
						break;
				case"b":
					AnimalAcuatico temp1;
					temp1 = new AnimalAcuatico("A",JOptionPane.showInputDialog("nombre"),JOptionPane.showInputDialog("pais"),
							JOptionPane.showInputDialog("Fecha ingreso"),JOptionPane.showInputDialog("Ambiente (salado/dulce)"),
							Integer.parseInt(JOptionPane.showInputDialog("Cantidad aletas")),Integer.parseInt(JOptionPane.showInputDialog("Nivel agresion")));
					list1.addAnimal(temp1);	
					break;
				case"c":
					AnimalVolador temp2;
					temp2 = new AnimalVolador("AC",JOptionPane.showInputDialog("nombre"),JOptionPane.showInputDialog("pais"),
							JOptionPane.showInputDialog("Fecha ingreso"),JOptionPane.showInputDialog("Color plumas"),
							Integer.parseInt(JOptionPane.showInputDialog("TamaÒo")),JOptionPane.showInputDialog("Migrante"));
					list1.addAnimal(temp2);	
					break;
				default:
					System.out.println("sadasdasd");
					
				}break;	
			case "b": //caos donde podemos seleccionar los tipos de animales a ver segun su clase
				TipoMostrar = JOptionPane.showInputDialog("Ingresa la clase de animal que buscas : \na.Terrestre \nb.Acuatico \nc.Volador");
				switch(TipoMostrar) {
				 	case "a":
				 		list1.mostrarTerrestre();
				 		break;
				 	case "b":
				 		list1.mostrarAcuatico();
				 		break;
				 	case "c":
				 		list1.mostrarVolador();	
				 		break;
				 	default:
				 		break;
				 	}break;				
			case "c": // seleccion que nos muestra todo lo que este dentro de la lista
				list1.mostrar();
				break;								
			case "d":
				opcion ="d";
				break;
			}
			
			}
		}
}