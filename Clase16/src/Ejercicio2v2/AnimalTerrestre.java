package Ejercicio2v2;

import java.time.LocalDate;

public class AnimalTerrestre extends Animal {
	
	private int cantidadPatas;
	private String tipoAlimentacion;
	private double horasSueno;
	
	public AnimalTerrestre() {
		super();
		this.cantidadPatas = 4;
		this.tipoAlimentacion = "Normal";
		this.horasSueno = 8;
	}
	
	public AnimalTerrestre(String nombre, String paisOrigen, LocalDate fechaIngreso, int cantidadPatas, String tipoAlimentacion, double horasSueno) {
		super(nombre, paisOrigen, fechaIngreso);
		this.cantidadPatas = cantidadPatas;
		this.tipoAlimentacion = tipoAlimentacion;
		this.horasSueno = horasSueno;
	}

	public int getCantidadPatas() {
		return cantidadPatas;
	}

	public void setCantidadPatas(int cantidadPatas) {
		this.cantidadPatas = cantidadPatas;
	}

	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}

	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}

	public double getHorasSueno() {
		return horasSueno;
	}

	public void setHorasSueno(double horasSueno) {
		this.horasSueno = horasSueno;
	}

	@Override
	public String toString() {
		return "AnimalTerrestre [cantidadPatas=" + cantidadPatas + ", tipoAlimentacion=" + tipoAlimentacion
				+ ", horasSueno=" + horasSueno + "]";
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Animal Terrestre: Cantidad de patas: " + cantidadPatas 
				+ ", tipo de alimentacion: " + tipoAlimentacion + ", horas de sueño: " + horasSueno);
	}

	
}
