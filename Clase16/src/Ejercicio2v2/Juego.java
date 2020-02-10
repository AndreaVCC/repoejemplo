package Ejercicio2v2;

public class Juego implements Esquema {
	
	private String nombre;
	private int capacidad;
	private boolean activo;
	
	public Juego() {
		this.nombre = "";
		this.capacidad = 0;
		this.activo = true;
	}
	
	public Juego(String _nombre, int _capacidad, boolean _activo) {
		this.nombre = _nombre;
		this.capacidad = _capacidad;
		this.activo = _activo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Juego [nombre=" + nombre + ", capacidad=" + capacidad + ", activo=" + activo + "]";
	}
	
	public void mostrarDatos() {
		System.out.println("Juego: nombre: " + nombre + ", capacidad: " + capacidad 
				+ ", está activo: " + activo);
	}
	
	public void mostrarDescripcion() {
		System.out.println("Nombre: " + nombre + ", capacidad: " + capacidad);
	}
	
}
