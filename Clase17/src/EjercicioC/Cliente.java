package EjercicioC;

/**
 * 
 * Esta es la clase que representa a los clientes que se asociarán a los vendedores
 * @author: Jacob Vega T.
 * @version: 15/02/2020
 * @see <a href="https://github.com/jacobvegatoro/repoejemplo/tree/master/Clase17">Versión en Github</a>
 *
 */

public class Cliente {

	//Atributos de la clase
	private String run;
	private String nombre;
	private String apellidos;
	
	/**
	 *
	 * Constructor de la clase
	 * @param run RUN del cliente
	 * @param nombre Nombre
	 * @param apellidos Apellidos
	 */
	public Cliente(String run, String nombre, String apellidos) {
		this.run = run;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}//Cierre del constructor

	@Override
	public String toString() {
		return "Cliente [run=" + run + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	
}//Cierre de la clase
