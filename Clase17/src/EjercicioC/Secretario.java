package EjercicioC;

public class Secretario extends Empleado {

	private String despacho;
	private int numeroFax;
	
	public Secretario(String nombre, String apellidos, String run, String direccion, int telContacto, int salario, String despacho, int numeroFax) {
		super(nombre, apellidos, run, direccion, telContacto, salario);
		this.despacho = despacho;
		this.numeroFax = numeroFax;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Puesto en la empresa: Secretario");
	}

	@Override
	public String toString() {
		return super.toString() + "Secretario [despacho=" + despacho + ", numeroFax=" + numeroFax + "]";
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public int getNumeroFax() {
		return numeroFax;
	}

	public void setNumeroFax(int numeroFax) {
		this.numeroFax = numeroFax;
	}
	
	public void incrementarSalario() {
		this.setSalario((int)(this.getSalario()*1.05));
	}
	
}
