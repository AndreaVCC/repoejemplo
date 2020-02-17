package EjercicioC;
import java.util.Scanner;

/**
 * 
 * Esta es la clase que desencadena las acciones. En ella se declaran las instancias de las clases
 * y se prueban sus métodos 
 * @author: Jacob Vega T.
 * @version: 15/02/2020
 * @see <a href="https://github.com/jacobvegatoro/repoejemplo/tree/master/Clase17">Versión en Github</a>
 *
 */

public class Principal {
	
	/**
	 * Método main de la clase
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		//Creación de clases
		Secretario secre1 = new Secretario("Juan","Perez","1111-2","Calle Uno #123",23436332,400000,"5-A",453255);
		Secretario secre2 = new Secretario("Joaquin","Tapia","3333-4","Calle Dos #456",26784464,450000,"5-B",7547854);

		Coche auto1 = new Coche("ZN3903","Kia","Morning");
		Coche auto2 = new Coche("GYTC19","Mazda","3");
		Coche auto3 = new Coche("HCXX80","Suzuki","Jimny");
		Coche auto4 = new Coche("GSYP14","Kia","Rio 4");
		
		Cliente cliente1 = new Cliente("1-9","Rodrigo","Palacios");
		Cliente cliente2 = new Cliente("2-7","Marcela","Paz");
		Cliente cliente3 = new Cliente("3-5","Cleotilde","Aravena");
		Cliente cliente4 = new Cliente("4-3","Samuel","Camara");
		Cliente cliente5 = new Cliente("5-1","Ramon","Farias");
		Cliente cliente6 = new Cliente("6-8","Florcita","Motuda");

		Vendedor vendedor1 = new Vendedor("Walter","White","9999-0","Calle Cinco #1122",23432674,600000,9356446,"Oeste",10);
		Vendedor vendedor2 = new Vendedor("Jesse","Pinkman","1122-3","Calle Seis #3344",27666553,650000,9676575,"Norte",13);
		Vendedor vendedor3 = new Vendedor("Gustavo","Fring","2233-4","Calle Siete #4455",25453454,700000,92144556,"Sur",15);
		Vendedor vendedor4 = new Vendedor("Saul","Goodman","3344-5","Calle Ocho #5566",23454356,900000,96543534,"Este",20);
		
		vendedor1.cambiarCoche(auto1);
		vendedor2.cambiarCoche(auto1);
		vendedor3.cambiarCoche(auto3);
		vendedor4.cambiarCoche(auto3);

		vendedor1.altaCliente(cliente1);
		vendedor1.altaCliente(cliente2);
		vendedor2.altaCliente(cliente3);
		vendedor3.altaCliente(cliente4);
		vendedor4.altaCliente(cliente5);
		vendedor4.altaCliente(cliente6);
		
		JefeDeZona jefe1 = new JefeDeZona("Pablo","Marmol","5555-6","Calle Tres #789",256774456,800000,"2-L");
		JefeDeZona jefe2 = new JefeDeZona("Pedro","Picapierdra","7777-8","Calle Cuatro #001",25656445,900000,"2-M");

		jefe1.setSecre(secre1);
		jefe1.setCocheJefe(auto2);
		secre1.cambiarSupervisor(jefe1);
		jefe1.altaVendedor(vendedor1);
		
		jefe2.setSecre(secre2);
		jefe2.setCocheJefe(auto4);
		secre2.cambiarSupervisor(jefe2);
		jefe2.altaVendedor(vendedor2);
		jefe2.altaVendedor(vendedor3);
		jefe2.altaVendedor(vendedor4);
		
		vendedor1.cambiarSupervisor(jefe2);
		vendedor3.cambiarSupervisor(jefe2);
		vendedor2.cambiarSupervisor(jefe1);
		vendedor4.cambiarSupervisor(jefe1);
		
		
		//Mostrando datos ...
		
		System.out.println("Secretario 1");
		secre1.imprimir();
		System.out.println("Supervisor: " + secre1.getSupervisor().toString());
		secre1.incrementarSalario();
		System.out.println("Salario después de incremento: " + secre1.getSalario());
		System.out.println("");
		
		System.out.println("Secretario 2");
		secre2.imprimir();
		System.out.println("Supervisor: " + secre2.getSupervisor().toString());
		secre2.incrementarSalario();
		System.out.println("Salario después de incremento: " + secre2.getSalario());
		System.out.println("");
		
		System.out.println("Vendedor 1");
		vendedor1.imprimir();
		System.out.println("Coche: " + vendedor1.getCocheEmpresa().toString());
		System.out.println("Clientes: ");
		vendedor1.mostrarClientes();
		System.out.println("Supervisor: " + vendedor1.getSupervisor().toString());
		vendedor1.incrementarSalario();
		System.out.println("Salario después de incremento: " + vendedor1.getSalario());
		System.out.println("");
		
		System.out.println("Vendedor 2");
		vendedor2.imprimir();
		System.out.println("Coche: " + vendedor2.getCocheEmpresa().toString());
		System.out.println("Clientes: ");
		vendedor2.mostrarClientes();
		System.out.println("Supervisor: " + vendedor2.getSupervisor().toString());
		vendedor2.incrementarSalario();
		System.out.println("Salario después de incremento: " + vendedor2.getSalario());
		System.out.println("");

		System.out.println("Vendedor 3");
		vendedor3.imprimir();
		System.out.println("Coche: " + vendedor3.getCocheEmpresa().toString());
		System.out.println("Clientes: ");
		vendedor3.mostrarClientes();
		System.out.println("Supervisor: " + vendedor3.getSupervisor().toString());
		vendedor3.incrementarSalario();
		System.out.println("Salario después de incremento: " + vendedor3.getSalario());
		System.out.println("");

		System.out.println("Vendedor 4");
		vendedor4.imprimir();
		System.out.println("Coche: " + vendedor4.getCocheEmpresa().toString());
		System.out.println("Clientes: ");
		vendedor4.mostrarClientes();
		System.out.println("Supervisor: " + vendedor4.getSupervisor().toString());
		vendedor4.incrementarSalario();
		System.out.println("Salario después de incremento: " + vendedor4.getSalario());
		System.out.println("");

		System.out.println("Jefe 1");
		jefe1.imprimir();
		System.out.println("Scretario: " + jefe1.getSecre().toString());
		System.out.println("Coche: " + jefe1.getCocheJefe().toString());
		System.out.println("Vendedores: ");
		jefe1.mostrarVendedores();
		jefe1.incrementarSalario();
		System.out.println("Salario después de incremento: " + jefe1.getSalario());
		System.out.println("");
		
		System.out.println("Jefe 2");
		jefe2.imprimir();
		System.out.println("Scretario: " + jefe2.getSecre().toString());
		System.out.println("Coche: " + jefe2.getCocheJefe().toString());
		System.out.println("Vendedores: ");
		jefe2.mostrarVendedores();
		jefe2.incrementarSalario();
		System.out.println("Salario después de incremento: " + jefe2.getSalario());
		System.out.println("");

		//Eliminar cliente de vendedor 1 (primera vez)
		
		System.out.println("Ingrese RUN de cliente a eliminar: ");
		String run = scanner.next();
		boolean eliminar = vendedor1.eliminarCliente(run);
		
		if (eliminar) {
			System.out.println("El cliente con RUN " + run + " ha sido eliminado exitosamente de la lista del vendedor 1");
		}
		else {
			System.out.println("El cliente con RUN " + run + " no está en la lista del vendedor 1");			
		}

		System.out.println("Listado de clientes del vendedor 1 después de la eliminación");
		vendedor1.mostrarClientes();

		//Eliminar cliente de vendedor 2 (segunda vez)
		
		System.out.println("Ingrese RUN de cliente a eliminar: ");
		String run2 = scanner.next();
		boolean eliminar2 = vendedor2.eliminarCliente(run2);
		
		if (eliminar2) {
			System.out.println("El cliente con RUN " + run2 + " ha sido eliminado exitosamente de la lista del vendedor 2");
		}
		else {
			System.out.println("El cliente con RUN " + run2 + " no está en la lista del vendedor 2");
		}
		
		System.out.println("Listado de clientes del vendedor 2 después de la eliminación");
		vendedor2.mostrarClientes();
		
		scanner.close();
	}//Cierre del método

}//Cierre de la clase
