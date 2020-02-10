package Ejercicio2;

import java.time.LocalDate;

public class AnimalAcuatico extends Animal {

	private int tipoAmbiente; //1--> agua dulce, 2--> agua salada
	private int cantidadAletas;
	private int nivelAgresividad;
	
	public AnimalAcuatico() {
		super();
		this.tipoAmbiente = 1;
		this.cantidadAletas = 2;
		this.nivelAgresividad = 1;
	}
	
	public AnimalAcuatico(String nombre, String paisOrigen, LocalDate fechaIngreso, int tipoAmbiente, int cantidadAletas, int nivelAgresividad) {
		super(nombre, paisOrigen, fechaIngreso);
		this.tipoAmbiente = tipoAmbiente;
		this.cantidadAletas = cantidadAletas;
		this.nivelAgresividad = nivelAgresividad;
	}

	public int getTipoAmbiente() {
		return tipoAmbiente;
	}

	public void setTipoAmbiente(int tipoAmbiente) {
		this.tipoAmbiente = tipoAmbiente;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public int getNivelAgresividad() {
		return nivelAgresividad;
	}

	public void setNivelAgresividad(int nivelAgresividad) {
		this.nivelAgresividad = nivelAgresividad;
	}

	@Override
	public String toString() {
		return "AnimalAcuatico [tipoAmbiente=" + tipoAmbiente + ", cantidadAletas=" + cantidadAletas
				+ ", nivelAgresividad=" + nivelAgresividad + "]";
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Animal Acuatico: tipo ambiente: " + tipoAmbiente + ", cantidad aletas: " 
				+ cantidadAletas + ", nivel de agresividad: " + nivelAgresividad);
	}
	
}
