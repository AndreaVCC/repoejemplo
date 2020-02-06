package PClase14;

import java.util.Scanner;

public class PruebaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String _nombre; 
		int _edad;
		char _sexo;
		double _peso, _altura;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		_nombre = scanner.next();
		
		System.out.println("Ingrese edad: ");
		_edad = scanner.nextInt();

		System.out.println("Ingrese sexo: ");
		_sexo = scanner.next().charAt(0);

		System.out.println("Ingrese peso: ");
		_peso = scanner.nextDouble();

		System.out.println("Ingrese altura: ");
		_altura = scanner.nextDouble();

		scanner.close();
		
		Persona persona1 = new Persona(_nombre, _edad, _sexo, _peso, _altura);
		System.out.println(persona1.toString());
		System.out.println("¿Es mayor de edad?: " + persona1.esMayorDeEdad());
		System.out.println("Situación IMC: " + persona1.evaluarIMC());
		
		Persona persona2 = new Persona(_nombre, _edad, _sexo);
		System.out.println(persona2.toString());
		persona2.setAltura(1.8);
		persona2.setPeso(50);
		System.out.println("¿Es mayor de edad?: " + persona2.esMayorDeEdad());
		System.out.println("Situación IMC: " + persona2.evaluarIMC());
		
		Persona persona3 = new Persona();
		persona3.setNombre("Juanito");
		persona3.setSexo('N');
		persona3.setAltura(1.60);
		persona3.setEdad(25);
		persona3.setPeso(65);
		System.out.println(persona3.toString());
		System.out.println("¿Es mayor de edad?: " + persona3.esMayorDeEdad());
		System.out.println("Situación IMC: " + persona3.evaluarIMC());
		
		
	}

}
