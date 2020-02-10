package Ejercicio2;

import java.time.LocalDate;

public class AnimalVolador extends Animal {

	private String colorPlumas;
	private int tamano;
	private boolean esMigrante;
	
	public AnimalVolador() {
		super();
		this.colorPlumas = "ninguno";
		this.tamano = 0;
		this.esMigrante = false;
	}
	
	public AnimalVolador(String nombre, String paisOrigen, LocalDate fechaIngreso, String colorPlumas, int tamano, boolean esMigrante) {
		super(nombre, paisOrigen, fechaIngreso);
		this.colorPlumas = colorPlumas;
		this.tamano = tamano;
		this.esMigrante = esMigrante;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public boolean isEsMigrante() {
		return esMigrante;
	}

	public void setEsMigrante(boolean esMigrante) {
		this.esMigrante = esMigrante;
	}

	@Override
	public String toString() {
		return "AnimalVolador [colorPlumas=" + colorPlumas + ", tamano=" + tamano + ", esMigrante=" + esMigrante + "]";
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Animal Volador: Color de plumas: " + colorPlumas + ", tamaño: " + tamano 
				+ ", es migrante: " + esMigrante);
	}
	
}
