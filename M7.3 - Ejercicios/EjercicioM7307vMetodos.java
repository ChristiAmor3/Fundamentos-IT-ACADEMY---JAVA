import java.util.Scanner;

public class EjercicioM7307vMetodos {
		
		public static void main (String[]args) {
			
			boolean seguirBucle=true;
			
			System.out.println("¡Bienvenid@ a la mejor tienda de surf!");
			System.out.println();
			System.out.println("Antes de empezar, necesitamos saber algunas cosas.");
			System.out.println();
			String respExperiencia = pedirString("¿Tienes experiencia surfeando? SI / NO");
			
			boolean experiencia = experiencia(respExperiencia);
			int tipoTabla = tipoTabla(respExperiencia);
			
			int alturaOlas = pedirNum("¿Cual es la altura de las olas en metros?");
			
			int tiempoReserva = pedirNum("¿De cuanto tiempo quiere hacer la reserva? En minutos");
			
			while (seguirBucle) {
				menuImpri ();
				int eleccion = pedirNum("Introduce el numero de la operacion que deseas realizar");
				seguirBucle = menu(eleccion,seguirBucle, experiencia, alturaOlas, tiempoReserva, tipoTabla);
			}
}
		// Metodo menu
		static boolean menu(int eleccion, boolean seguirBucle, boolean experiencia, int alturaOlas, int tiempoReserva, int tipoTabla) {
			switch (eleccion) {
				case 1: 
					System.out.println("Dada tu experiencia, la tabla que te recomendamos es " + calcularMaterialTabla(experiencia));
					break;
				case 2:
					System.out.println("El mar hoy tendrá " + imprimirForecast(alturaOlas));
					break;
				case 3:
					System.out.println("El coste de la reserva será de " + costReserva(tiempoReserva,tipoTabla));
					break;
				case 4:
					System.out.println("Has decidido salir del programa. ¡Gracias!");
					seguirBucle=false;
					break;
					}
			return seguirBucle;
		}
		
		// Metodo imprimir menu
		static void menuImpri () {
			System.out.println();
			System.out.println("---------¿Que operacion desea realizar?---------");
			System.out.println();
			System.out.println("1. Calcular el material de la tabla");
			System.out.println();
			System.out.println("2. Imprimir el forecast");
			System.out.println();
			System.out.println("3. Calcular el coste por reserva");
			System.out.println();
			System.out.println("4. Salir del programa");
		}
		
		// Metodo para pedir numero
		static int pedirNum(String mensaje) {
			Scanner sc = new Scanner(System.in);
			System.out.println(mensaje);
			return sc.nextInt();
			}
		// Metodo para pedir numero
		static String pedirString(String mensaje) {
			Scanner sc = new Scanner(System.in);
			System.out.println(mensaje);
			return sc.nextLine().toUpperCase();
			}
		
		// Metodo comprobacion experiencia  boolean
		static boolean experiencia(String respExperiencia) {
			boolean experiencia=false;
			if (respExperiencia.equalsIgnoreCase("SI")) {
				experiencia=true;
			} else {}
			return experiencia;
	}
		// Metodo comprobacion experiencia tabla
		static int tipoTabla(String respExperiencia) {
			int tipoTabla=2;
			if (respExperiencia.equalsIgnoreCase("SI")) {
				tipoTabla=1;
			} else {
	
			}
			return tipoTabla;
		}
		
		public static String calcularMaterialTabla(boolean experiencia) {
			String mensaje1="";
			if (experiencia==true) {
				mensaje1="Tabla de fibra";
			} else {
				mensaje1="Tabla de espuma";
			}
			return mensaje1;
		}
		
		public static String imprimirForecast(int alturaOlas) {
			String mensaje2="";
			if (alturaOlas>2) {
				mensaje2="Olas grandes";
			} else {
				mensaje2="Olas pequeñas";
			}
			return mensaje2;
		}
		
		public static double costReserva(int tiempoReserva, int tipoTabla) {
		double coste=0;
			
			switch (tipoTabla) {
			case 1:
					coste = (((double) tiempoReserva*35)/60);
					break;
			case 2:
					coste = (((double) tiempoReserva*20)/60);
					break;
					}
			return coste;
}
}