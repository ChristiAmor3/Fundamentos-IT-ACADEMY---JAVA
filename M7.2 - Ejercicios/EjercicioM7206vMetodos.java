
import java.util.Scanner;

public class EjercicioM7206vMetodos {
	
			public static void main (String[]args) {
				
				boolean seguirBucle=true; // chivato
				
				while (seguirBucle) {
					int num = pedirNum("Introduce un numero:");
					seguirBucle=primoONo(num, seguirBucle);	
					}
				}
			
			// Metodo para saber si es primo o no
			// Un numero primo es aquel que SOLO se puede dividir entre 1 y el mismo, y que por lo tanto, no puede dividirise entre 2.
			// 8 entre 1 es 8, 8 entre 8 es 1, y 8/2 es 0, por lo que 8 no es primo.
			// 5 entre 1 es 5, 5 entre 5 es 1, y 5/2 es diferente de 0, por lo que es primo.
			static boolean primoONo(int num, boolean seguirBucle) {
				if (num%1==0 && num%num==0 && num%2!=0 || num==2) { // Se puede dividir entre 1, entre él mismo, y entre dos no puede dar 0.
					imprimirMensaje("Exacto, el numero " + num + " es primo.");
					imprimirMensaje("Ha finalizado el juego"); 
					seguirBucle=false; // Cuando escriba un num primo, cambiaremos el valor de juego a false para que termine el bucle.
				} else {
					imprimirMensaje("El numero " + num + " no es un numero primo.");
					imprimirMensaje("Prueba otra vez."); // No cambiamos el valor de juego por lo que sigue siendo true y el bucle sigue.
				} 	
				return seguirBucle; // Me retorna la variable juego, que puede ser True o False en funcion del if.
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
				
