package EjercicioC;

/**
 * 
 * Esta clase contiene los atributos y métodos pertenecientes a la clase Empleado
 * @author: Jacob Vega T.
 * @version: 15/02/2020
 * @see <a href="https://github.com/jacobvegatoro/repoejemplo/tree/master/Clase17">Versión en Github</a>
 *
 */

public class Empleado {
	
	//Atributos de la clase
	private String nombre;
	private String apellidos;
	private String run;
	private String direccion;
	private int aniosAntiguedad;
	private int telContacto;
	private int salario;
	private Empleado supervisor;
	
	/**
	 *
	 * Constructor de la clase
	 * @param nombre Nombre del empleado
	 * @param apellidos Apellido paterno y materno
	 * @param run RUN del empleado, formato xxxxxxxx-x
	 * @param direccion Direccion
	 * @param telContacto Telefono de contacto
	 * @param salario Salario
	 */
	public Empleado(String nombre, String apellidos, String run, String direccion, int telContacto, int salario) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.run = run;
		this.direccion = direccion;
		this.telContacto = telContacto;
		this.salario = salario;
	}//Cierre del constructor

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", run=" + run + ", direccion=" + direccion
				+ ", aniosAntiguedad=" + aniosAntiguedad + ", telContacto=" + telContacto + ", salario=" + salario
				+ ", supervisor=" + supervisor + "]";
	}
	
	/**
	 * Método que imprime en consola los datos básicos del empleado
	 */
	public void imprimir() {
		System.out.println("Nombre: " + nombre + ", apellidos: " + apellidos + ", run: " + run 
				+ ", direccion: " + direccion + ", salario: " + salario);
	}//Cierre del método
	
	/**
	 * Método que cambia el supervisor de un empleado
	 * @param emp Instancia de la clase Empleado asociada
	 */
	public void cambiarSupervisor(Empleado emp) {
		this.setSupervisor(emp);
	}//Cierre del método
	
	/**
	 * Método que incrementa el salario de un empleado. 
	 */
	public void incrementarSalario() {
		this.setSalario(this.getSalario());
	}//Cierre del método

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

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getAniosAntiguedad() {
		return aniosAntiguedad;
	}

	public void setAniosAntiguedad(int aniosAntiguedad) {
		this.aniosAntiguedad = aniosAntiguedad;
	}

	public int getTelContacto() {
		return telContacto;
	}

	public void setTelContacto(int telContacto) {
		this.telContacto = telContacto;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Empleado getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Empleado supervisor) {
		this.supervisor = supervisor;
	}
	
}//Cierre de la clase
