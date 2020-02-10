package Ej2FGomez;

import java.util.*;
public class Crealista extends Animal implements Comparable<Crealista>{
	
	//Se crea una lista de tipo animal la cual tiene de nombre Lista
	public static List<Animal> Lista = new ArrayList<Animal>();
	
	//instanciamos las clases aniamels para poder trabajar sin tener problemas de campos nulos ( los cuales son una posibilidad)
	//Como estan iniciados con constructores vacios, no es problema que se reemplazen despues
	AnimalTerrestre pepe = new AnimalTerrestre();
	AnimalAcuatico pipi = new AnimalAcuatico();
	AnimalVolador popo = new AnimalVolador();
	Animal d = new Animal();
	
	// metodo para poder agregar objetos dentro de nuestra lista ya sean subclases o clases padre
	public void addAnimal(Animal d) {
		Lista.add(d);
	}
	
	// Se recorre  la lista con un elemento d de tipo animal y se va mostrando punto a punto
	public void mostrar(	) {
		for(Animal d :Lista) {
			d.mostrar();
		}
	}
	
	// igual que el metodo anterior, solo que en este caso realizacomos una comparacion entre clases
	// la clase del objeto que esta dentro de la lista y la clase que tenmos como constante en este caso de tipo AnimalTerrestre
	//Posteriormente imprimimos el objet que entra, lo cual es distinto a el objeto.mostrar() lo cual nos trae todos los elementos de la lista
	public void mostrarTerrestre(	) {
			for(Animal d :Lista) {
				if(d.getClass().equals(pepe.getClass())) {
				
				System.out.println(d);
				}
			}	
	}
	public void mostrarAcuatico(	) {
		for(Animal d :Lista) {
			if(d.getClass() == pipi.getClass()) {
				//System.out.println("Nombre" + d.getNombre() + ", pais: " + d.getPais() + ", tipo clase" + d.getClass());
				System.out.println(d);
			}	
		}
	}
	public void mostrarVolador(	) {	
		for(Animal d :Lista) {
			if(d.getClass() == popo.getClass()) {
				//System.out.println("Nombre" + d.getNombre() + ", pais: " + d.getPais() + ", tipo clase" + d.getClass());
				System.out.println(d);
			}
		}
	}
	

	@Override
	public int compareTo(Crealista o) {
		// TODO Auto-generated method stub
		return this.getTipo().compareTo(o.getTipo());
	}
	
}