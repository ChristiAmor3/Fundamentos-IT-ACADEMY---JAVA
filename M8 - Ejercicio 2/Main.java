package EjercicioM802vMetodos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	// Situamos arraylist fuera del main para que los metodos puedan acceder a ella.
	static ArrayList<Hotel> hoteles = new ArrayList<>();
	
	public static void main(String[] args) {
		
		boolean seguirBucle=true;

		System.out.println("Bienvenid@ a la aplicacio de hoteles.");
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
		System.out.println("1. Dar de alta un hotel.");
		System.out.println();
		System.out.println("2. Dar de baja un hotel.");
		System.out.println();
		System.out.println("3. Ver los datos de un hotel.");
		System.out.println();
		System.out.println("4. Modificar un hotel.");
		System.out.println();
		System.out.println("0. Salir de la aplicacion");
		System.out.println();
		return scanner.nextInt();
	}
	
	// Metodo para acceder a cada una de las opciones de la aplicacion
	public static boolean menuOpciones(int numEleccion, boolean seguirBucle) {
		int posicionIndice;
		switch (numEleccion) {
			case 1:
				crearHotel(pedirString("Introduce el nombre del hotel"),pedirInt("Introduce el numero de habitaciones"),pedirInt("Introduce el numero de plantas"), pedirDouble("Introduce la superficie del hotel")); 
				break;
			case 2:
					imprimirListaHoteles();
					posicionIndice=buscarIndiceHotel(pedirString("Introduce el nombre del hotel que deseas dar de baja"));
				bajaHotel(posicionIndice); 
				break;
			case 3:
					imprimirListaHoteles();
					posicionIndice=buscarIndiceHotel(pedirString("Introduce el nombre del hotel que deseas ver"));
				verDatosHotel(posicionIndice);
				break;
			case 4:
					imprimirListaHoteles();
					posicionIndice=buscarIndiceHotel(pedirString("Introduce el nombre del hotel que deseas modificar"));
				modificarHotel(posicionIndice); 
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
	
	public static void crearHotel(String nomHotel, int numHab, int numPlantas, double supHotel) {
		
		Hotel hotel = new Hotel(nomHotel, numHab, numPlantas, supHotel);
		hoteles.add(hotel);
		
		System.out.println("El hotel " + hotel.getNomHotel() + " se ha creado.");
		}
	
	public static void bajaHotel(int posicionIndice) {
			if (posicionIndice==-1) { 
				System.out.println("El hotel no está en la lista");
			} else { 
				hoteles.remove(posicionIndice);
				System.out.println("El hotel se ha eliminado correctamente");
				}	
			}		
	
	public static void verDatosHotel(int posicionIndice) {
		if (posicionIndice==-1){ 
			System.out.println("El hotel no está en la lista");		
		} else { 
			imprimirDatosHotel(posicionIndice);		
		}
	}	
	
	public static void modificarHotel(int posicionIndice) {
		if (posicionIndice==-1) { 
			System.out.println("El hotel no está en la lista.");
		} else {
			int eleccion= imprimirParamHotel(posicionIndice);
			menuOpcionesModParamHotel(eleccion,posicionIndice);
		}
	}
	
	// Metodo para imprimir datos de un hotel
	public static void imprimirDatosHotel(int posicionIndice) {
		System.out.println("El nombre del hotel es " + hoteles.get(posicionIndice).getNomHotel()); 
		System.out.println("El numero de habitaciones es " + hoteles.get(posicionIndice).getNumHab()); 
		System.out.println("El numero de plantas es " + hoteles.get(posicionIndice).getNumPlantas()); 
		System.out.println("la superficie es " + hoteles.get(posicionIndice).getSupHotel()); 
		System.out.println(hoteles.get(posicionIndice).calcularMantenimiento());
	}
	
	// Metodo para buscar  el nombre del hotel en la lista
		public static int buscarIndiceHotel(String nomHotel) {
			int posicionIndice=-1;
			int i=0;
			while (i<hoteles.size() && posicionIndice==-1) { // para que se detenga en cuanto encuentra la coincidencia.
				if (nomHotel.equalsIgnoreCase(hoteles.get(i).getNomHotel())) { 
					posicionIndice=i; 
				} 
				i++;
			}
			return posicionIndice;
		}	
	
	public static int imprimirParamHotel(int posicionIndice) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique el parametro que desea modificar del hotel " + hoteles.get(posicionIndice).getNomHotel());
		System.out.println();
		System.out.println("1. Numero de habitaciones.");
		System.out.println();
		System.out.println("2. Numero de plantas");
		System.out.println();
		System.out.println("3. Superficie total del hotel.");
		return sc.nextInt();
	}
	
	//Metodo para imprimir los parametros modificados del hotel
	public static void menuOpcionesModParamHotel(int eleccion, int posicionIndice) {
		switch (eleccion) { 
		case 1: 
			cambiarNumHabitaciones(posicionIndice,hoteles);
			break;
		case 2: 
			cambiarNumPlantas(posicionIndice,hoteles);
			break;
		case 3: 
			cambiarSupHotel(posicionIndice,hoteles);
			break;
		default:
			System.out.println("No has introducido una opcion valida.");
			break;
			}
		}
		
	// Metodo para cambiar numero de habitaciones
		static void cambiarNumHabitaciones(int posicionIndice, ArrayList <Hotel> hoteles) {
			System.out.println("El numero de habitaciones es de " + hoteles.get(posicionIndice).getNumHab()); // Imprimimos con el getter.
			System.out.println();
			hoteles.get(posicionIndice).setNumHab(pedirInt("Indica el nuevo numero de habitaciones")); // Guardamos el nuevo numero de hab usando el metodo "setNumHab".
			System.out.println("El nuevo numero de habitaciones ahora es de " + hoteles.get(posicionIndice).getNumHab());
		}
	// Metodo para cambiar numero de plantas
		static void cambiarNumPlantas(int posicionIndice, ArrayList <Hotel> hoteles) {
			System.out.println("El numero de plantas es de " + hoteles.get(posicionIndice).getNumPlantas());
			System.out.println();
			hoteles.get(posicionIndice).setNumPlantas(pedirInt("Indica el nuevo numero de plantas")); // Guardamos el nuevo numero de plantas usando el metodo setter
			System.out.println("El nuevo numero de plantas es de " + hoteles.get(posicionIndice).getNumPlantas()); // Imprimimos con el getter.
			}	
	// Metodo para cambiar superficie del hotel
		static void cambiarSupHotel(int posicionIndice, ArrayList <Hotel> hoteles) {
			System.out.println("El valor de la superficie es de " + hoteles.get(posicionIndice).getSupHotel());
			System.out.println();
			hoteles.get(posicionIndice).setSupHotel(pedirDouble("Indica el nuevo valor de superficie")); // Guardamos el nuevo numero de superficie usando el metodo setter
			System.out.println("El nuevo valor de la superficie es de " + hoteles.get(posicionIndice).getSupHotel()); // Imprimimos con el getter.
			}	
		
	// Metodo para imprimir la lista de hoteles
		static void imprimirListaHoteles (){
			System.out.println("Este es el listado de nombres de hoteles.");
			for (int i = 0; i<=hoteles.size()-1; i++) { 
				System.out.println(hoteles.get(i).getNomHotel());
				}
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
	