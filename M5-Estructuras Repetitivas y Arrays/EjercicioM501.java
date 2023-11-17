import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioM501 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		ArrayList<String> palabras = new ArrayList<>(); 
		
		System.out.println("Marca el numero de palabras que quieras introducir");
		int numPalabras = sc.nextInt();
		
		sc.nextLine(); // Limpiamos el buffer
		
		for (int i = 1; i <= numPalabras; i++) { // Se repite el bucle tantas veces como palabras indique el usuario. | Podria poner 0 y solo <.
			System.out.println("Introduce una palabra");
			String palabraUsuario = sc.nextLine();
			palabras.add(sc.nextLine()); // añadimos el valor de la variable palabraUsuario a la ArrayList tantas veces como palabras haya indicado el usuario
		}
		
		System.out.println(palabras); // Imprimimos ArrayList palabras.
		
		sc.close();
	}

}
