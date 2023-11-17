import java.util.Scanner;

public class EjercicioM7202vMetodos {

	public static void main (String[]args) {
		
	      
		//int numLineas = pedirNum("Introduce el número de líneas: ");
		imprimirResultado(pedirNum("Introduce el número de líneas: "));
		// imprimirResultado necesita un parametro de tipo int, por lo que puedo introducir directamente el metodo
		// pedirNum, ya que me devuelve un int.
		// Como no tiene retorno, lo imprimo tal cual.
		
	    }
	
	// Metodo para pedir num
			static int pedirNum(String mensaje) {
				Scanner sc = new Scanner(System.in);
				imprimirMensaje(mensaje);
				return sc.nextInt();
			}
	// Metodo para imprimir mensaje
			static void imprimirMensaje(String mensaje) {
				System.out.println(mensaje);
			}
	// Metodo para imprimir resultadp
			static void imprimirResultado(int num) {
				for (int i = num; i >= 1; i--) {
		            for (int j = 1; j <= i; j++) { // este bucle se va a repetir tantas veces como indique "num".
		                System.out.print("* ");
		                // De nuevo, me va a imprimir tantos * como numero de linea sea.
		                // Si estoy en la 5, imprimirá 5 *, después restare un valor a 5 para que imprima un * menos
		                // en la siguiente linea, y asi pasar de 5 a 1.
		            }
		            System.out.println(); // Salto de línea para la siguiente fila
		        }
			}
	}
		
		
		


