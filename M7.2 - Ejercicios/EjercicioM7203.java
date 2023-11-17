import java.util.Scanner;

public class EjercicioM7203 {

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
				 for (int i = num-1; i >= 1; i--) { // pongo num-1, para que no se repita la primera linea de este bucle, que valdria igual que la ultima del anterior.
			         for (int j = 1; j <= i; j++) { // este bucle se va a repetir tantas veces como indique "num".
			             System.out.print("* ");
			                // De nuevo, me va a imprimir tantos * como numero de linea sea.
			                // Si estoy en la 5, imprimirá 5 *, después restare un valor a 5 para que imprima un * menos
			                // en la siguiente linea, y asi pasar de 5 a 1 de uno en uno
			         }
			         System.out.println(); // Salto de línea para la siguiente fila
			        }
			}
	}
		
		
		


