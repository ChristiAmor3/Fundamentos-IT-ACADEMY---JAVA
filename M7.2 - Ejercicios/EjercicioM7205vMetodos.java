import java.util.Scanner;

public class EjercicioM7205vMetodos {

		public static void main (String[]args) {
				
				// int num = pedirNum("Introduce un numero:");
				primoONo(pedirNum("Introduce un numero para saber si es primo o no:"));
			        	
			        }
		// Metodo para saber si es primo o no
		// Un numero primo es aquel que SOLO se puede dividir entre 1 y el mismo, y que por lo tanto, no puede dividirise entre 2.
		// 8 entre 1 es 8, 8 entre 8 es 1, y 8/2 es 0, por lo que 8 no es primo.
		// 5 entre 1 es 5, 5 entre 5 es 1, y 5/2 es diferente de 0, por lo que es primo.
		static void primoONo(int num) {
				if (num%1==0 && num%num==0 && num%2!=0 || num==2) { // Se puede dividir entre 1, entre él mismo, y entre dos no puede dar 0.
					imprimirMensaje("El numero " + num + " es un numero primo.");
				} else {
					imprimirMensaje("El numero " + num + " no es un numero primo.");
				}
			}
		
		// Metodo para pedir numero
			static int pedirNum(String mensaje) {
				Scanner sc = new Scanner(System.in);
				imprimirMensaje(mensaje);
				return sc.nextInt();
			}	
		// Metodo para imprimir mensaje
			static void imprimirMensaje(String mensaje) {
				System.out.println(mensaje);
			}
			
	}	