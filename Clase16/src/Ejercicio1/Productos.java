package Ejercicio1;

public class Productos {
	
	private String fechaCaducidad;
	private int numeroLote;
	private String paisOrigen;
	private String fechaEnvasado;
	
	Productos (String fechaCaducidad, int numeroLote, String paisOrigen, String fechaEnvasado){
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
		this.paisOrigen = paisOrigen;
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getFechaCaducidad() {
		return this.fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	@Override
	public String toString() {
		return "Productos [fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + ", paisOrigen="
				+ paisOrigen + ", fechaEnvasado=" + fechaEnvasado + "]";
	}

	
}
