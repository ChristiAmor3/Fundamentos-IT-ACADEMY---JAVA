
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioM7303 {
	
			public static void main (String[]args) {
				
				
				String palabra = pedirString("Introduce una palabra para comprobar si es un palindromo o no");
				comprobacionPalindromo (palabra);
				
		
}
			// Metodo para pedir texto
			static String pedirString(String mensaje) {
				Scanner sc = new Scanner(System.in);
				System.out.println(mensaje);
				return sc.nextLine();
				}
			
			// Metodo para invertir la palabra
			public static String palabraReves(String palabra) {
				String palabra2 ="";
				for (int i=palabra.length()-1; i >= 0 ; i--) { 
					palabra2 +=palabra.charAt(i);
			}
				return palabra2;
			}
			
			// Metodo para comprobar palindromo
			static void comprobacionPalindromo (String palabra) {
				if (palabra.equalsIgnoreCase(palabraReves(palabra))) {
					System.out.println(palabraReves(palabra));
					System.out.println("Es un palindromo");
				} else {
					System.out.println(palabraReves(palabra));
					System.out.println("No es un palindromo");
				}
			}
			
}