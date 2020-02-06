package PClase14;

public class Persona {

	private String nombre;
	private int edad;
	private String rut;
	private char sexo;
	private double peso;
	private double altura;

	Persona(){
		this.nombre = "";
		this.edad = 0;
		this.sexo = 'M';
		this.peso = 0;
		this.altura = 0;
		this.rut = generarRUN();
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = 0;
		this.altura = 0;
		this.rut = generarRUN();
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
		this.rut = generarRUN();
	}

	public int calcularIMC() {
		double imc = (this.peso / (this.altura * this.altura));
		int retorno = 0;

		if (imc < 20) {
			retorno = -1;
		}
		else if (imc >= 20 && imc <= 25) {
			retorno = 0;
		}
		else {
			retorno = 1;
		}
		return retorno;
	}
	
	public String evaluarIMC() {
		int resultado = calcularIMC();
		String mensaje = "";
		if (resultado == -1) {
			mensaje = "La persona está debajo del peso ideal"; 
		}
		if (resultado == 0) {
			mensaje = "La persona está en el peso ideal"; 
		}
		if (resultado == 1) {
			mensaje = "La persona está con sobrepeso"; 
		}
		return mensaje;
	}

	public boolean esMayorDeEdad() {
		boolean esmayor = false;

		if (this.edad >= 18) {
			esmayor = true;
		}

		return esmayor;
	}

	private char comprobarSexo(char sexo) {

		if (sexo != 'M' && sexo != 'H') {
			sexo = 'H';
		}

		return sexo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", rut=" + rut + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	private String generarRUN() {
		String RUN = "";
		int numero = 0;

		for (int i=0;i<8;i++) {
			int digito = (int)(Math.random()*10);
			numero = numero * 10 + digito;
		}

		RUN = String.valueOf(numero);

		String digverificador = calculaDigitoVerificador(RUN);
		
		RUN = RUN + "-" + digverificador;
		
		return RUN;
	}

	private static String calculaDigitoVerificador(String original) {
		if (original == null)
			return null;
		String digit;
		/* se convierte el número en un arreglo de digitos */
		int[] digits = new int[original.length()];
		for (int i = 0; i < original.length(); i++) {
			digits[i] = Character.getNumericValue(original.charAt(i));
		}

		/* se duplica cada dígito desde la derecha saltando de dos en dos*/
		for (int i = digits.length - 1; i >= 0; i -= 2)  {
			digits[i] += digits[i];

			/* si la suma de los digitos es más de 10, se resta 9 */
			if (digits[i] >= 10) {
				digits[i] = digits[i] - 9;
			}
		}
		int sum = 0;
		for (int i = 0; i < digits.length; i++) {
			sum += digits[i];
		}

		/* se multiplica por 9 */
		sum = sum * 9;

		/* se convierte a cadena para obtener facilmente el último dígito */
		digit = sum + "";
		return digit.substring(digit.length() - 1);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
}









