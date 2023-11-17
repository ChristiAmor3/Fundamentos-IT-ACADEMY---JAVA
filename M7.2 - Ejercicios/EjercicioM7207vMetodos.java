
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioM7207vMetodos {
	
			public static void main (String[]args) {
				
					int año = pedirAño("Introduce un año para saber si es de traspaso o no:");
					System.out.println("El año " + año + calcularAñoTraspaso(año));
				
				
}	
	// Metodo para saber si es bisiesto o no
	static String calcularAñoTraspaso(int año) {
			String mensaje="";
		if (año%4==0 && año%100!=0 || año%400==0 )  { 
				mensaje=" es bisiesto";
			} else {
				mensaje=" NO es bisiesto";			
			}
			return mensaje;
		}
		
	// Metodo para pedir numero
		static int pedirAño(String mensaje) {
			Scanner sc = new Scanner(System.in);
			imprimirMensaje(mensaje);
			return sc.nextInt();
		}	
	// Metodo para imprimir mensaje
		static void imprimirMensaje(String mensaje) {
			System.out.println(mensaje);
		}
}