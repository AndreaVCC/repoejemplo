package Ejercicio2v2;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Zoologico {

	private List<Esquema> animales = new ArrayList<Esquema>();
	
	public void cargarAnimales() {
		AnimalTerrestre aniter1 = new AnimalTerrestre("Vaca","Suiza",LocalDate.of(2010,4,3),4,"De todo",5.6);
		this.addAnimal(aniter1);
		AnimalTerrestre aniter2 = new AnimalTerrestre("Caballo","España",LocalDate.of(2012,5,12),4,"pastito",4.5);
		this.addAnimal(aniter2);

		AnimalAcuatico aniacu1 = new AnimalAcuatico("Jurel","Japon",LocalDate.of(2014,5,1),2,3,1);
		this.addAnimal(aniacu1);
		AnimalAcuatico aniacu2 = new AnimalAcuatico("Tiburon","China",LocalDate.of(2015,12,13),2,1,5);
		this.addAnimal(aniacu2);

		AnimalVolador anivol1 = new AnimalVolador("Pelicano","Argentina",LocalDate.of(2019,10,13),"blancas",30,false);
		this.addAnimal(anivol1);
		AnimalVolador anivol2 = new AnimalVolador("Pato","Alemania",LocalDate.of(2018,4,25),"negro y verde",20,true);
		this.addAnimal(anivol2);
		
		Juego juego1 = new Juego("Barco Pirata",30,true);
		this.addAnimal(juego1);		
		Juego juego2 = new Juego("Autos chocadores",20,false);
		this.addAnimal(juego2);
		Juego juego3 = new Juego("Resbalin",5,true);
		this.addAnimal(juego3);
		
	}
	
	public void addAnimal (Esquema esq) {
		animales.add(esq);
	}

	public void mostrarAnimales (int categoria) {
		
		String clase = "";
		if (categoria == 1) {
			clase = "class Ejercicio2v2.AnimalTerrestre";
		}
		else if (categoria == 2) {
			clase = "class Ejercicio2v2.AnimalAcuatico";
		}
		else if (categoria == 3) {
			clase = "class Ejercicio2v2.AnimalVolador";
		}
		else if (categoria == 4) {
			clase = "class Ejercicio2v2.Juego";
		}
		
		for (Esquema ani:animales) {
			if (ani.getClass().toString().equals(clase)) {
				ani.mostrarDescripcion();
				ani.mostrarDatos();
			}
		}
	}
	
	public void resumen () {
		int cantterr = 0, cantacua = 0, cantvol = 0, cantjuegos = 0;
		for (Esquema ani:animales) {
			if (ani.getClass().toString().equals("class Ejercicio2v2.AnimalTerrestre")) {
				cantterr++;
			}
			else if (ani.getClass().toString().equals("class Ejercicio2v2.AnimalAcuatico")) {
				cantacua++;
			}
			else if (ani.getClass().toString().equals("class Ejercicio2v2.AnimalVolador")) {
				cantvol++;
			}
			else if (ani.getClass().toString().equals("class Ejercicio2v2.Juego")) {
				cantjuegos++;
			}
		}
		
		System.out.println("Cantidad de animales por categoría:");
		System.out.println("Terrestres: " + cantterr);
		System.out.println("Acuaticos: " + cantacua);
		System.out.println("Voladores: " + cantvol);
		System.out.println("Juegos: " + cantjuegos);
	}

}
