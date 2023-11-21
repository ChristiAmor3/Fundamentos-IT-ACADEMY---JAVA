package EjercicioM804v3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	// Situamos arraylist fuera del main para que los metodos puedan acceder a ella.
	static ArrayList<Edificio> edificios = new ArrayList<>();
	
	public static void main(String[] args) {
		
		boolean seguirBucle=true;

		System.out.println("Bienvenid@ a la aplicacio de edificios.");
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
		System.out.println("1. Dar de alta un edificio.");
		System.out.println();
		System.out.println("2. Dar de baja un edificio.");
		System.out.println();
		System.out.println("3. Ver los datos de un edificio.");
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
				crearEdificio(pedirString("Introduce el tipo de edificio que deseas crear: Hotel, Hospital o Cine")); 
				break;
			case 2:
				imprimirListaEdificios();
				posicionIndice=buscarIndiceEdificio(pedirString("Introduce el nombre del edificio que deseas dar de baja"));
			bajaEdificio(posicionIndice); 
				break;
			case 3:
				imprimirListaEdificios();
				String nombreEdificio= pedirString("Introduce el nombre del edificio que deseas ver");
				posicionIndice=buscarIndiceEdificio(nombreEdificio);
			verDatosEdificio(posicionIndice);
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
	
	public static void crearEdificio(String tipoEdificio) {
		switch(tipoEdificio) {
			case "HOTEL":
				crearHotel(pedirString("Introduce el nombre del hotel"), pedirInt("Introduce el numero de plantas"), pedirDouble("Introduce la superficie del hotel"), pedirInt("Introduce el numero de habitaciones"));
				break;
			case "HOSPITAL":
				crearHospital(pedirString("Introduce el nombre del hospital"), pedirInt("Introduce el numero de plantas"), pedirDouble("Introduce la superficie del hospital"), pedirInt("Introduce el numero de enfermos"));
				break;
			case "CINE":
				crearCine(pedirString("Introduce el nombre del cine"), pedirInt("Introduce el numero de plantas"), pedirDouble("Introduce la superficie del cine"), pedirInt("Introduce el aforo maximo"));
				break;
			default:
				System.out.println("No has introducido un tipo de edificio valido");
				}
		}
	
	public static void crearHotel(String nomEdificio, int numPlantas, double supEdificio, int numHab) {
		Hotel hotel = new Hotel(nomEdificio, numPlantas, supEdificio, numHab);
		edificios.add(hotel);
		
		System.out.println("El hotel " + hotel.getNomEdificio() + " se ha creado.");
	}
	
	public static void crearHospital(String nomEdificio, int numPlantas, double supEdificio, int numEnfermos) {
		Hospital hospital = new Hospital(nomEdificio, numPlantas, supEdificio, numEnfermos);
		edificios.add(hospital);
		
		System.out.println("El hotel " + hospital.getNomEdificio() + " se ha creado.");
	}
	
	public static void crearCine(String nomEdificio, int numPlantas, double supEdificio, int aforoMaximo) {
		Cine cine = new Cine(nomEdificio, numPlantas, supEdificio, aforoMaximo);
		edificios.add(cine);
		
		System.out.println("El cine " + cine.getNomEdificio() + " se ha creado.");
	}
	
	
	public static void bajaEdificio(int posicionIndice) {
		if (posicionIndice==-1) { 
			System.out.println("El edificio no está en la lista");
		} else { 
			edificios.remove(posicionIndice);
			System.out.println("El edificio se ha eliminado correctamente");
			}	
		}	
	
	public static void verDatosEdificio(int posicionIndice) {
		if (posicionIndice==-1){ 
			System.out.println("El edificio no está en la lista");		
		} else { 
			imprimirDatosEdificio(posicionIndice);		
		}
	}	
	
	
	public static void imprimirDatosEdificio(int posicionIndice) {
		if (edificios.get(posicionIndice) instanceof Hotel) {
			Hotel hotel = (Hotel) edificios.get(posicionIndice);
			hotel.toString();
			hotel.limpieza();
			hotel.calcularCosteVigilancia();
			hotel.calcularMantenimiento();
			} else if (edificios.get(posicionIndice) instanceof Hospital) {
				Hospital hospital = (Hospital) edificios.get(posicionIndice);
				hospital.toString();
				hospital.limpieza();
				hospital.calcularCosteVigilancia();
				hospital.repartirComida();
				} else if (edificios.get(posicionIndice) instanceof Cine){
					Cine cine = (Cine) edificios.get(posicionIndice);
					cine.toString();
					cine.limpieza();
					cine.calcularCosteVigilancia();
					
					int numAsistentesFinal = cine.pedirAsistentes(pedirInt("Introduzca el numero de asistentes a la sesion"));
					if (cine.getAforoMaximo() < numAsistentesFinal) {
						System.out.println("El numero de asistentes supera el aforo");
					} else {
						cine.proyectarSesion(numAsistentesFinal,pedirInt("Introduce el precio de la entrada"));
					}
				} else {
					System.out.println("No has introducido un tipo de edificio valido.");
				}
	}
	

	
	// Metodo para imprimir la lista de edificios
			static void imprimirListaEdificios (){
				System.out.println("Este es el listado de edificios.");
				for (int i = 0; i<=edificios.size()-1; i++) { 
					System.out.println(edificios.get(i).getNomEdificio());
					}
				}
	// Metodo para buscar el nombre del edificio en la lista
			public static int buscarIndiceEdificio(String nomEdificio) {
				int posicionIndice=-1;
				int i=0;
				while (i<edificios.size() && posicionIndice==-1) { // para que se detenga en cuanto encuentra la coincidencia.
					if (nomEdificio.equalsIgnoreCase(edificios.get(i).getNomEdificio())) { 
						posicionIndice=i; 
					} 
					i++;
				}
				return posicionIndice;
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