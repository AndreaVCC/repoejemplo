package EjercicioC;

import java.util.ArrayList;

public class Vendedor extends Empleado {

	private Coche cocheVendedor;
	private int telefonoMovil;
	private String areaVenta;
	private ArrayList<Cliente> clientes;
	private int porcComision;
		
	public void imprimir() {
		super.imprimir();
		System.out.println("Puesto en la empresa: Vendedor");
	}

	public Vendedor(String nombre, String apellidos, String run, String direccion, int telContacto, int salario, int telefonoMovil, String areaVenta, int porcComision) {
		super(nombre, apellidos, run, direccion, telContacto, salario);
		this.telefonoMovil = telefonoMovil;
		this.areaVenta = areaVenta;
		this.porcComision = porcComision;
	}

	public Coche getCocheEmpresa() {
		return cocheVendedor;
	}


	public void setCocheEmpresa(Coche cocheVendedor) {
		this.cocheVendedor = cocheVendedor;
	}


	public int getTelefonoMovil() {
		return telefonoMovil;
	}


	public void setTelefonoMovil(int telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	public String getAreaVenta() {
		return areaVenta;
	}

	public void setAreaVenta(String areaVenta) {
		this.areaVenta = areaVenta;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public int getPorcComision() {
		return porcComision;
	}

	public void setPorcComision(int porcComision) {
		this.porcComision = porcComision;
	}
		
	public void altaCliente(Cliente cli) {
		clientes.add(cli);
	}
	
	public void bajaCliente(int indice) {
		clientes.remove(indice);
	}
	
	public void cambiarCoche(Coche auto) {
		this.setCocheEmpresa(auto);
	}
	
	public void incrementarSalario() {
		super.setSalario((int)(super.getSalario()*1.1));
	}
	
}
