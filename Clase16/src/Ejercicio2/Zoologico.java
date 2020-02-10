package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Zoologico {

	private List<Animal> animales = new ArrayList<Animal>();
	
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
	}
	
	public void addAnimal (Animal ani) {
		animales.add(ani);
	}

	public void mostrarAnimales (int categoria) {
		
		String clase = "";
		if (categoria == 1) {
			clase = "class Ejercicio2.AnimalTerrestre";
		}
		else if (categoria == 2) {
			clase = "class Ejercicio2.AnimalAcuatico";
		}
		else if (categoria == 3) {
			clase = "class Ejercicio2.AnimalVolador";
		}
		
		for (Animal ani:animales) {
			if (ani.getClass().toString().equals(clase)) {
				System.out.println("Nombre: " + ani.getNombre() + ", Pais: " + ani.getPaisOrigen() + ", clase: " + ani.getClass().toString());
				ani.mostrarDatos();
			}
		}
	}
	
	public void resumen () {
		int cantterr = 0, cantacua = 0, cantvol = 0;
		for (Animal ani:animales) {
			if (ani.getClass().toString().equals("class Ejercicio2.AnimalTerrestre")) {
				cantterr++;
			}
			else if (ani.getClass().toString().equals("class Ejercicio2.AnimalAcuatico")) {
				cantacua++;
			}
			else if (ani.getClass().toString().equals("class Ejercicio2.AnimalVolador")) {
				cantvol++;
			}
		}
		
		System.out.println("Cantidad de animales por categoría:");
		System.out.println("Terrestres: " + cantterr);
		System.out.println("Acuaticos: " + cantacua);
		System.out.println("Voladores: " + cantvol);
	}

}
