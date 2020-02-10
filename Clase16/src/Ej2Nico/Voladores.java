package Ej2Nico;

public class Voladores extends Animales{
	
	String colorDePlumas;
	double tamano;
	boolean migrante;
	
	public Voladores() {
		super();
	}
	
	public Voladores(String nombreAnimal, String paisDeOrigen, String fechaDeIngreso, String colorDePlumas, double tamano, boolean migrante) {
		super(nombreAnimal, paisDeOrigen, fechaDeIngreso);
		this.colorDePlumas = colorDePlumas;
		this.tamano = tamano;
		this.migrante = migrante;
		
	}

	@Override
	public String toString() {
		return super.toString() + "\n Color de Plumas:" + colorDePlumas + "\nTamaño: " + tamano + "\nMigrante: " + migrante;
	}
}