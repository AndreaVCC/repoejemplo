package EjercicioC;

/**
 * 
 * Esta es la clase que representa a los autos que se asociarán a los vendedores y jefes de zona
 * @author: Jacob Vega T.
 * @version: 15/02/2020
 * @see <a href="https://github.com/jacobvegatoro/repoejemplo/tree/master/Clase17">Versión en Github</a>
 *
 */

public class Coche {

	//Atributos de la clase
	String matricula;
	String marca;
	String modelo;
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]";
	}

	/**
	 *
	 * Constructor de la clase
	 * @param matricula patente del auto
	 * @param marca Nombre de la marca del auto
	 * @param modelo Modelo del auto
	 */
	public Coche(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}//Cierre del constructor
	
	
	
}
