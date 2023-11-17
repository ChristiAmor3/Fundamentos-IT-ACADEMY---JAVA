import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioM704 {

public static void main(String[] args) {
		
		//ArrayList<Integer> numeros = introduccionNum(); // Como retorna una arraylist, tengo que almacenar el retorno en una arraylist.
		mensajeFinal(introduccionNum()); // Como no tiene retorno, puedo llamarlo tal cual. 
	
	}
	
	// Metodo para introducir los numeros
		static ArrayList<Integer> introduccionNum() { // Retorna una arraylist.
			Scanner sc = new Scanner (System.in);
			ArrayList<Integer> numeros = new ArrayList<>(); // Creo una arraylist de tipo int
			for (int i=1;i<=2;i++) { // Creo un bucle para ir pidiendo todos los numeros e introducirlos en la arraylist.
				imprimirMensaje("Introduce un numero");
				numeros.add(sc.nextInt());
				}
			return numeros; // Me devuelve la arraylist.
		}
	
	// Metodo comprobacion negativo
	static boolean saberNegativo(ArrayList<Integer> numeros) {
		boolean resultado=false;
		if (numeros.get(0)<0 && numeros.get(1)>0 || numeros.get(0)>0 && numeros.get(1)<0) {
			resultado=true;
		}
			return resultado;
	}
	
	
	// Metodo para saber si es multiplo o no. Con parametro y sin retorno.
	public static void mensajeFinal (ArrayList<Integer> numeros) {
		if (saberNegativo(numeros)==true) {
			imprimirMensaje("Uno de los dos numeros es negativo");
		} else {
			imprimirMensaje("Los dos numeros pueden ser positivos o negativos");
			}
	}

	// Metodo para imprimir mensaje
	static void imprimirMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}

	
	
		


