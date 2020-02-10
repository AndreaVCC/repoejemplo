package Ejercicio1;

public class ProductosRefrigerados extends Productos {

	private int codigoOrganismo;
	private double temperaturaMantenimiento;
	
	public ProductosRefrigerados(String fechaCaducidad, int numeroLote, String paisOrigen, String fechaEnvasado, int codigoOrganismo, double temperaturaMantenimiento) {
		super(fechaCaducidad, numeroLote, paisOrigen, fechaEnvasado);
		this.codigoOrganismo = codigoOrganismo;
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}

	public int getCodigoOrganismo() {
		return codigoOrganismo;
	}

	public void setCodigoOrganismo(int codigoOrganismo) {
		this.codigoOrganismo = codigoOrganismo;
	}

	public double getTemperaturaMantenimiento() {
		return temperaturaMantenimiento;
	}

	public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}

	@Override
	public String toString() {
		return "ProductosRefrigerados [codigoOrganismo=" + codigoOrganismo + ", temperaturaMantenimiento="
				+ temperaturaMantenimiento + super.toString() +  "]";
	}
	
	
	
}
