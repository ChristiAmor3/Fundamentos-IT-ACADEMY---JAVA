import java.util.Scanner;

public class EjercicioM7302 {
	
			public static void main (String[]args) {
				
			//	String palabra = pedirString("Introduce una palabra");
				invertirChar(pedirString("Introduce una palabra"));
				
}
			
		// Metodo para pedir numero
		static String pedirString(String mensaje) {
			Scanner sc = new Scanner(System.in);
			System.out.println(mensaje);
			return sc.nextLine();
			}
		
		// Metodo para invertir los char de una palabra
		static void invertirChar(String palabra) {
			for (int i=palabra.length()-1; i >= 0 ; i--) { // C H R I S T I A N
														   // 0 1 2 3 4 5 6 7 8 = indice
														   // 1 2 3 4 5 6 7 8 9 = lenght
			System.out.print(palabra.charAt(i));	
}
}
}