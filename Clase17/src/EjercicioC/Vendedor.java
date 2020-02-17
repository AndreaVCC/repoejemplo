package EjercicioC;
import java.util.ArrayList;

/**
 * 
 * Esta clase contiene los atributos y métodos pertenecientes a la clase Vendedor
 * @author: Jacob Vega T.
 * @version: 15/02/2020
 * @see <a href="https://github.com/jacobvegatoro/repoejemplo/tree/master/Clase17">Versión en Github</a>
 *
 */

public class Vendedor extends Empleado {

	//Atributos de la clase
	private Coche cocheVendedor;
	private int telefonoMovil;
	private String areaVenta;
	private ArrayList<Cliente> clientes;
	private int porcComision;
		
	/**
	 * Método que imprime en consola los datos básicos del empleado más la labor desempeñada
	 */
	public void imprimir() {
		super.imprimir();
		System.out.println("Puesto en la empresa: Vendedor");
	}//Cierre del método

	/**
	 *
	 * Constructor de la clase, usa los mismos parámetros que su clase padre
	 * @param telefonoMovil Teléfono móvil del vendedor
	 * @param areaVenta Area de venta
	 * @param porcComision Porcentaje de comisión
	 */
	public Vendedor(String nombre, String apellidos, String run, String direccion, int telContacto, int salario, int telefonoMovil, String areaVenta, int porcComision) {
		super(nombre, apellidos, run, direccion, telContacto, salario);
		this.telefonoMovil = telefonoMovil;
		this.areaVenta = areaVenta;
		this.porcComision = porcComision;
		this.clientes = new ArrayList<Cliente>();
	}//Cierre del constructor

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
		
	/**
	 * Método que agrega un cliente al atributo correspondiente 
	 * @param cli Instancia de la clase Cliente que se agregará
	 */
	public void altaCliente(Cliente cli) {
		clientes.add(cli);
	}//Cierre del método

	/**
	 * Método que elimina un cliente desde el listado a través de su índice
	 * @param indice Número correspondiente al índice de cliente que se desea eliminar desde el listado
	 */
	public void bajaCliente(int indice) {
		clientes.remove(indice);
	}//Cierre del método
	
	/**
	 * Método que actualiza el auto de un vendedor
	 * @param auto Instancia de la clase Auto que se asignará al Vendedor 
	 */
	public void cambiarCoche(Coche auto) {
		this.setCocheEmpresa(auto);
	}//Cierre del método
	
	/**
	 * Método que incrementa el salario de un vendedor. 
	 */
	public void incrementarSalario() {
		super.setSalario((int)(super.getSalario()*1.1));
	}//Cierre del método
	
	/**
	 * Método que muestra por consola el listado de clientes de un vendedor
	 */
	public void mostrarClientes() {
		for (Cliente cli:clientes) {
			System.out.println(cli.toString());
		}
	}//Cierre del método
	
	/**
	 * Método que elimina un cliente de acuerdo a su RUN
	 * @param run RUN del cliente a eliminar
	 * @return si el RUN existía en el listado, se retorna verdadero, de lo contrario se retorna falso
	 */
	public boolean eliminarCliente(String run) {
		boolean eliminado = false;
		int indice = -1;
		int contador = 0;
		for (Cliente cli:clientes) {
			if (run.equals(cli.getRun())){
				indice = contador;
			}
			contador++;
		}
		
		if (indice > -1) {
			this.bajaCliente(indice);
			eliminado = true;
		}
		
		return eliminado;
	}//Cierre del método
	
}//Cierre de la clase