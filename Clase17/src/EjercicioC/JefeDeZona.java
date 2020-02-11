package EjercicioC;
import java.util.ArrayList;

public class JefeDeZona extends Empleado {
	
	private String despacho;
	private Secretario secre;
	private ArrayList<Vendedor> vendedores;
	private Coche cocheJefe;
	
	public JefeDeZona(String nombre, String apellidos, String run, String direccion, int telContacto, int salario, String despacho) {
		super(nombre, apellidos, run, direccion, telContacto, salario);
		this.despacho = despacho;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Puesto en la empresa: Jefe de Zona");
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public Secretario getSecre() {
		return secre;
	}

	public void setSecre(Secretario secre) {
		this.secre = secre;
	}

	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(ArrayList<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	public Coche getCocheJefe() {
		return cocheJefe;
	}

	public void setCocheJefe(Coche cocheJefe) {
		this.cocheJefe = cocheJefe;
	}
	
	public void altaVendedor(Vendedor vend) {
		vendedores.add(vend);
	}

	public void bajaVendedor(int indice) {
		vendedores.remove(indice);
	}
	
	public void incrementarSalario() {
		super.setSalario((int)(super.getSalario()*1.2));
	}
	
	
}
