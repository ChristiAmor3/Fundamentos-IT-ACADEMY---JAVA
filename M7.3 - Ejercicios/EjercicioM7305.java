
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioM7305 {
		
		public static void main (String[]args) {
			
			String frase =pedirString("Introduce una frase");
			comprobarMayusMinus(frase);

}		
		
		// Metodo para pedir TEXTO
		static String pedirString(String mensaje) {
			Scanner sc = new Scanner(System.in);
			System.out.println(mensaje);
			return sc.nextLine();
			}
		
		// Metodo para comprobar
		static void comprobarMayusMinus(String frase) {
			if (frase.equals(frase.toUpperCase())) { // el equalsIgnoreCase no diferencia entre mayus y minus.
				System.out.println("Esta todo en mayusculas");
			} else if (frase.equals(frase.toLowerCase())){
				System.out.println("Esta todo en minusculas");
			} else {
				System.out.println("Hay mayusculas y minusculas");
			}
		}
}