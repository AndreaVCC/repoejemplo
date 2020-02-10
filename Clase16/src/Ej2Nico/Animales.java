package Ej2Nico;

public class Animales {
	
	private String nombreAnimal;
	private String paisDeOrigen;
	private String fechaDeIngreso;
	
	public Animales() {
	}

	public Animales(String nombreAnimal, String paisDeOrigen, String fechaDeIngreso) {
		
		this.nombreAnimal = nombreAnimal;
		this.paisDeOrigen = paisDeOrigen;
		this.fechaDeIngreso = fechaDeIngreso;
	}

	@Override
	public String toString() {
		return "\nNombre Animal: " + nombreAnimal + "\nPaís de Origen: " + paisDeOrigen + "\nFecha de Ingreso: "
				+ fechaDeIngreso;
	}
}