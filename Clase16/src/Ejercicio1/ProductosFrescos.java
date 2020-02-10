package Ejercicio1;

public class ProductosFrescos extends Productos {
	
	public ProductosFrescos(String fechaCaducidad, int numeroLote, String paisOrigen, String fechaEnvasado) {
		super(fechaCaducidad, numeroLote, paisOrigen, fechaEnvasado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProductosFrescos [getFechaCaducidad()=" + getFechaCaducidad() + ", getNumeroLote()=" + getNumeroLote()
				+ ", getPaisOrigen()=" + getPaisOrigen() + ", getFechaEnvasado()=" + getFechaEnvasado()
				+ "]";
	}	
	
	
}
