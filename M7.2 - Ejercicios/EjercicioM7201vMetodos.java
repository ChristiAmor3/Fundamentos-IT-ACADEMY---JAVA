import java.util.Scanner;

public class EjercicioM7201vMetodos {

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
		 for (int i = 1; i <= num; i++) {
			    for (int j = 1; j <= i; j++) { // me imprimira tantos * como numero de lineas haya
			           System.out.print("* "); // Cuando este en la primera linea, solo imprimirá 1, cuando este en la 
			           // segunda, imprimira 2, y asi siempre.
			           // pongo print en vez de prinln para que no me haga un salto de linea y me lo imprima al lado
			           }
			           System.out.println(); // Salto de línea para la siguiente fila
			        }
			}
	}
		
		
		


