package EjercicioC;

public class Cliente {
	private String run;
	private String nombre;
	private String apellidos;
	
	public Cliente(String run, String nombre, String apellidos) {
		this.run = run;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

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

	
}
