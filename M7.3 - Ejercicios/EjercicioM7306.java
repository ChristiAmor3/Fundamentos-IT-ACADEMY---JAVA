
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioM7306 {
		
		public static void main (String[]args) {
			
			ArrayList<Integer> conNumeros = conNumeros(pedirInt("Introduce el numero de numeros que quieres introducir"));
			System.out.println(conNumeros);
			sinDuplicados(conNumeros);

}		
		
		// Metodo para introducir numeros en una arraylist.
		static ArrayList<Integer> conNumeros (int numVeces){
			ArrayList<Integer> conNumeros = new ArrayList<>();
			for (int i =0; i<numVeces; i++) {
				int numero =pedirInt("Introduce un numero");
				conNumeros.add(numero);
		}
			return conNumeros;
		}
		
		// Metodo para pedir numeros
		static int pedirInt(String mensaje) {
			Scanner sc = new Scanner(System.in);
			System.out.println(mensaje);
			return sc.nextInt();
			}
		
		// Metodo para comprobar 
		static void sinDuplicados(ArrayList<Integer> conNumeros) {
			int contador=0;
			int a = 0;
			while (a<conNumeros.size()) { // a= quiere decir que habremos pasado por todos los indices.
				int b = a+1; // +1 por que asi cogemos al de después de a. Si estoy en el ind 0, lo compara con el ind 1.
				while(b<conNumeros.size()) { // Asi me recorre todos los numeros.
					if (conNumeros.get(a).equals(conNumeros.get(b))) {
						conNumeros.remove(b);
						b--;
						contador++;
						}	
					b++;
					}
				a++;	
			}
			System.out.println(conNumeros);
			System.out.println("El numero de numeros duplicados era de " + contador);
	}
		
}