package EjercicioC;

public class Empleado {
	
	private String nombre;
	private String apellidos;
	private String run;
	private String direccion;
	private int aniosAntiguedad;
	private int telContacto;
	private int salario;
	private Empleado supervisor;
	
	public Empleado(String nombre, String apellidos, String run, String direccion, int telContacto, int salario) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.run = run;
		this.direccion = direccion;
		this.telContacto = telContacto;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", run=" + run + ", direccion=" + direccion
				+ ", aniosAntiguedad=" + aniosAntiguedad + ", telContacto=" + telContacto + ", salario=" + salario
				+ ", supervisor=" + supervisor + "]";
	}
	
	public void imprimir() {
		System.out.println("Nombre: " + nombre + ", apellidos: " + apellidos + ", run: " + run 
				+ ", direccion: " + direccion);
	}
	
	public void cambiarSupervisor(Empleado emp) {
		this.setSupervisor(emp);
	}
	
	public void incrementarSalario() {
		this.setSalario(this.getSalario());
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

	
	
}
