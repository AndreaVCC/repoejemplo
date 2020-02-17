package EjercicioC;

/**
 * 
 * Esta clase contiene los atributos y métodos pertenecientes a la clase Secretario
 * @author: Jacob Vega T.
 * @version: 15/02/2020
 * @see <a href="https://github.com/jacobvegatoro/repoejemplo/tree/master/Clase17">Versión en Github</a>
 *
 */
public class Secretario extends Empleado {

	//Atributos de la clase
	private String despacho;
	private int numeroFax;
	
	/**
	 *
	 * Constructor de la clase, usa los mismos parámetros que su clase padre
	 * @param despacho Oficina del secretario
	 * @param numeroFax Número de fax
	 */
	public Secretario(String nombre, String apellidos, String run, String direccion, int telContacto, int salario, String despacho, int numeroFax) {
		super(nombre, apellidos, run, direccion, telContacto, salario);
		this.despacho = despacho;
		this.numeroFax = numeroFax;
	}//Cierre del constructor
	
	/**
	 * Método que imprime en consola los datos básicos del empleado más la labor desempeñada
	 */
	public void imprimir() {
		super.imprimir();
		System.out.println("Puesto en la empresa: Secretario");
	}//Cierre del método

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
	
	/**
	 * Método que incrementa el salario de un secretario. 
	 */
	public void incrementarSalario() {
		this.setSalario((int)(this.getSalario()*1.05));
	}//Cierre del método
	
}//Cierre de la clase
