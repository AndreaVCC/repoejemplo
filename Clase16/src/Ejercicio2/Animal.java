package Ejercicio2;

import java.time.LocalDate;

public abstract class Animal {

	private String nombre;
	private String paisOrigen; 
	private LocalDate fechaIngreso;

	public Animal() {
		this.nombre = "";
		this.paisOrigen = "Chile";
		this.fechaIngreso = LocalDate.now();
	}

	public Animal(String nombre, String paisOrigen, LocalDate fechaIngreso) {
		this.nombre = nombre;
		this.paisOrigen = paisOrigen;
		this.fechaIngreso = fechaIngreso;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPaisOrigen() {
		return paisOrigen;
	}
	
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", paisOrigen=" + paisOrigen + ", fechaIngreso=" + fechaIngreso + "]";
	}

	public abstract void mostrarDatos();
	
}
