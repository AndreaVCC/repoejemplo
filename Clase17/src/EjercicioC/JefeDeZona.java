package EjercicioC;
import java.util.ArrayList;

/**
 * 
 * Esta clase contiene los atributos y métodos pertenecientes a la clase JefeDeZona
 * @author: Jacob Vega T.
 * @version: 15/02/2020
 * @see <a href="https://github.com/jacobvegatoro/repoejemplo/tree/master/Clase17">Versión en Github</a>
 *
 */

public class JefeDeZona extends Empleado {
	
	//Atributos de la clase
	private String despacho;
	private Secretario secre;
	private ArrayList<Vendedor> vendedores;
	private Coche cocheJefe;
	
	/**
	 *
	 * Constructor de la clase, usa los mismos parámetros que su clase padre
	 * @param despacho Oficina del jefe de zona
	 */
	public JefeDeZona(String nombre, String apellidos, String run, String direccion, int telContacto, int salario, String despacho) {
		super(nombre, apellidos, run, direccion, telContacto, salario);
		this.despacho = despacho;
		this.vendedores = new ArrayList<Vendedor>();
	}//Cierre del constructor
	
	/**
	 * Método que imprime en consola los datos básicos del empleado más la labor desempeñada
	 */
	public void imprimir() {
		super.imprimir();
		System.out.println("Puesto en la empresa: Jefe de Zona");
	}//Cierre del método

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
	
	/**
	 * Método que agrega un vendedor al atributo correspondiente 
	 * @param vend Instancia de la clase Vendedor que se agregará
	 */
	public void altaVendedor(Vendedor vend) {
		vendedores.add(vend);
	}//Cierre del método

	/**
	 * Método que elimina un vendedor desde el listado  
	 * @param indice Número correspondiente al índice que se desea eliminar desde el listado
	 */
	public void bajaVendedor(int indice) {
		vendedores.remove(indice);
	}//Cierre del método
	
	/**
	 * Método que incrementa el salario de un empleado. 
	 */
	public void incrementarSalario() {
		super.setSalario((int)(super.getSalario()*1.2));
	}//Cierre del método
	
	/**
	 * Método que muestra por consola el listado de vendedores de un jefe de zona 
	 */
	public void mostrarVendedores() {
		for (Vendedor ven:vendedores) {
			System.out.println(ven.toString());
		}
	}//Cierre del método
	
}//Cierre de la clase