package EjercicioM803;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	// Situamos arraylist fuera del main para que los metodos puedan acceder a ella.
	static ArrayList<Cliente> listaClientes = new ArrayList<>();
	
	public static void main(String[] args) {
		
		boolean seguirBucle=true;

		System.out.println("Bienvenid@ a la aplicacion.");
		System.out.println();
		
		while (seguirBucle) { 
			seguirBucle= menuOpciones(imprimirOpciones(),seguirBucle);
			}
		}
	
	
	// Metodo para imprimir las opciones a realizar en la aplicacion
	public static int imprimirOpciones() {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Indica cual de estas funciones deseas realizar");
		System.out.println();
		System.out.println("1. Dar de alta un cliente.");
		System.out.println();
		System.out.println("2. Dar de baja un cliente.");
		System.out.println();
		System.out.println("3. Crear cuenta de un cliente.");
		System.out.println();
		System.out.println("4. Ingresar dinero en la cuenta.");
		System.out.println();
		System.out.println("5. Retirar dinero de la cuenta.");
		System.out.println();
		System.out.println("0. Salir de la aplicacion");
		System.out.println();
		return scanner.nextInt();
	}
	
	// Metodo para acceder a cada una de las opciones de la aplicacion
	public static boolean menuOpciones(int numEleccion, boolean seguirBucle) {
		int posicionIndice;
		int posicionIndiceCuenta;
		switch (numEleccion) {
			case 1:
				darAltaCliente(pedirString("Introduce el nombre del cliente que deseas dar de alta."), pedirString("Introduce el apellido del cliente que deseas dar de alta."));
				break;
			case 2:
				imprimirListaClientes();
				posicionIndice=buscarIndiceCliente(pedirString("Introduce el nombre del cliente que deseas dar de baja."), pedirString("Introduce el apellido del cliente que deseas dar de baja."));
			darBajaCliente(posicionIndice); 
				break;
			case 3:
				imprimirListaClientes();
				posicionIndice=buscarIndiceCliente(pedirString("Introduce el nombre del cliente al que desear crear la cuenta"), pedirString("Introduce el apellido del cliente al que deseas crear la cuenta."));
			crearCuentaCliente(posicionIndice);
				break;
			case 4:
				imprimirListaClientes();
				posicionIndice=buscarIndiceCliente(pedirString("Introduce el nombre del cliente al que deseas ingresar dinero."),pedirString("Introduce el apellido del cliente al que deseas ingresar dinero."));
				imprimirListaCuentas (posicionIndice);
				posicionIndiceCuenta=listaClientes.get(posicionIndice).buscarIndiceCuentaCliente(pedirInt("Introduce el numero de cuenta"), posicionIndice, listaClientes);
			ingresarDinero(posicionIndice, posicionIndiceCuenta);
				break;
			case 5:
				imprimirListaClientes();
				posicionIndice=buscarIndiceCliente(pedirString("Introduce el nombre del cliente al que deseas retirar dinero."),pedirString("Introduce el apellido del cliente al que deseas retirar dinero."));
				imprimirListaCuentas (posicionIndice);
				posicionIndiceCuenta=listaClientes.get(posicionIndice).buscarIndiceCuentaCliente(pedirInt("Introduce el numero de cuenta"), posicionIndice, listaClientes);
			retirarDinero(posicionIndice,posicionIndiceCuenta);
				break;
			case 0: 
				System.out.println("Has decidido salir de la aplicacion. ¡Hasta pronto!");
				seguirBucle=false; 
				break;
			default:
				System.out.println("No has seleccionado una opcion disponible.");
				break;
				}
		return seguirBucle;
		}	
	
	// Metodo para dar de alta a un cliente
			static void darAltaCliente(String nombreCliente, String apellidoCliente) {
				Cliente cliente = new Cliente(nombreCliente, apellidoCliente);
				listaClientes.add(cliente);
				
				System.out.println("El cliente " + cliente.getNombreCliente() + " " + cliente.getApellidoCliente() + " se ha dado de alta.");
			}
	
	// Metodo para dar de alta a un cliente
			static void darBajaCliente(int posicionIndice) {
				if (posicionIndice==-1) { 
					System.out.println("El cliente no está en la lista");
				} else { 
					listaClientes.remove(posicionIndice);
					System.out.println("El cliente se ha eliminado correctamente.");
					}	
				}	
	// Metodo para dar de alta a un cliente
			static void crearCuentaCliente(int posicionIndice) {
				if (posicionIndice==-1) { 
					System.out.println("El cliente no está en la lista");
				} else {
					int numCuenta=pedirInt("Introduce el numero de cuenta");
					int validacionNumCuenta=listaClientes.get(posicionIndice).buscarIndiceCuentaCliente(numCuenta, posicionIndice, listaClientes);
					if (validacionNumCuenta!=-1) {
						System.out.println("Este numero de cuenta ya existe para este cliente");
					} else {
						Cuenta cuenta = new Cuenta(numCuenta);
						listaClientes.get(posicionIndice).añadirCuentaACliente(cuenta);
						// El objeto cliente tiene en su clase un metodo que le permite añadir objetos de cuenta a la arraylist de objetos Cuenta.
										
						System.out.println("Se ha creado la cuenta a nombre de " + listaClientes.get(posicionIndice).getNombreCliente() + " " + listaClientes.get(posicionIndice).getApellidoCliente() + " correctamente.");
						}
					}
				}
	
	// Metodo para ingresar dinero a la cuenta de un cliente
			static void ingresarDinero(int posicionIndice, int posicionIndiceCuenta) {
			if (posicionIndice==-1) {
				System.out.println("El cliente no está en la lista");
			} else if (posicionIndiceCuenta==-1){
				System.out.println("El numero de cuenta no existe");
			} else {
				listaClientes.get(posicionIndice).getCuentaCliente(posicionIndiceCuenta).ingresarSaldo(pedirInt("Introduce la cantidad de dinero a ingresar"));
				System.out.println("Se ha añadido la cantidad ingresada. Ahora la cuenta " + listaClientes.get(posicionIndice).getCuentaCliente(posicionIndiceCuenta).getNumCuenta() + " dispone de " + listaClientes.get(posicionIndice).getCuentaCliente(posicionIndiceCuenta).getSaldoCuenta() + " €");
			}
			}
	
	// Metodo para ingresar dinero a la cuenta de un cliente
			static void retirarDinero(int posicionIndice, int posicionIndiceCuenta) {
				if (posicionIndice==-1) {
					System.out.println("El cliente no está en la lista");
				} else if (posicionIndiceCuenta==-1){
					System.out.println("El numero de cuenta no existe");
				} else {
					if (listaClientes.get(posicionIndice).getCuentaCliente(posicionIndiceCuenta).getSaldoCuenta()==0) {
					System.out.println("Este cliente no dispone de saldo en su cuenta");
					} else {
						System.out.println("El saldo de la cuenta actual es de " + listaClientes.get(posicionIndice).getCuentaCliente(posicionIndiceCuenta).getSaldoCuenta() + " €");
						listaClientes.get(posicionIndice).getCuentaCliente(posicionIndiceCuenta).retirarSaldo(pedirInt("Introduce la cantidad de dinero a retirar"));
						System.out.println("Se ha retirado la cantidad ingresada. Ahora la cuenta " + listaClientes.get(posicionIndice).getCuentaCliente(posicionIndiceCuenta).getNumCuenta() + " dispone de " + listaClientes.get(posicionIndice).getCuentaCliente(posicionIndiceCuenta).getSaldoCuenta() + " €");
					}
				}
			}
			
	// Metodo para imprimir la lista de edificios
			static void imprimirListaClientes (){
				if (listaClientes.size()==0) {
					System.out.println("No hay ningun cliente en la lista para poder crearle una cuenta");
				
				} else { 
					System.out.println("Este es el listado de clientes.");
						for (int i = 0; i<=listaClientes.size()-1; i++) { 
						System.out.print(listaClientes.get(i).getNombreCliente() + " ");
						System.out.println(listaClientes.get(i).getApellidoCliente());
					}
				}
				}
	// Metodo para imprimir la lista de edificios
			static void imprimirListaCuentas (int posicionIndice){
				if (posicionIndice==-1) {
					System.out.println("El cliente no esta en la lista");
				} else if (listaClientes.get(posicionIndice).getSizeListaCuentas()==0) {
					System.out.println("No hay ninguna cuenta en la lista del cliente.");
							
				} else { 
					System.out.println("Este es el listado de cuentas del cliente.");
						for (int i = 0; i<=listaClientes.get(posicionIndice).getSizeListaCuentas()-1; i++) { 
							System.out.println(listaClientes.get(posicionIndice).getCuentaCliente(i).getNumCuenta());
								}
							}
							}
		
	// Metodo para buscar el nombre del edificio en la lista
			public static int buscarIndiceCliente(String nombreCliente, String apellidoCliente) {
				int posicionIndice=-1;
				int i=0;
				while (i<listaClientes.size() && posicionIndice==-1) { // para que se detenga en cuanto encuentra la coincidencia.
					if (nombreCliente.equalsIgnoreCase(listaClientes.get(i).getNombreCliente()) && apellidoCliente.equalsIgnoreCase(listaClientes.get(i).getApellidoCliente())) { 
						posicionIndice=i; 
					} 
					i++;
				}
				return posicionIndice;
			}	
	
	// Metodo para encontrar cliente
			public final Cliente getCliente(int posicionIndice) {
				return listaClientes.get(posicionIndice);
			}			
	
	// Metodo para pedir String 
			static String pedirString(String mensaje) { 
				Scanner sc = new Scanner(System.in);
				System.out.println(mensaje);
				return sc.nextLine().toUpperCase();
				}
		// Metodo para pedir numero
			static int pedirInt(String mensaje) {
				Scanner sc = new Scanner(System.in);
				System.out.println(mensaje);
				return sc.nextInt();
				}
		// Metodo para pedir numero
			static double pedirDouble(String mensaje) {
				Scanner sc = new Scanner(System.in);
				System.out.println(mensaje);
				return sc.nextDouble();
				}
}