import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioM703 {

	public static void main(String[] args) {
		
		saberMultiplo(introduccionNum()); 
		// Como no tiene retorno, puedo llamarlo tal cual. 
		// Como este metodo recibe como parametro una arraylist, yo puedo introducir directamente el metodo
		// de introduccionNum como parametro ya que retorna una arraylist.
	
	}
	
	// Metodo para introducir las notas
		static ArrayList<Integer> introduccionNum() { // Retorna una arraylist.
			Scanner sc = new Scanner (System.in);
			ArrayList<Integer> numeros = new ArrayList<>(); // Creo una arraylist de tipo int
			for (int i=1;i<=2;i++) { // Creo un bucle para ir pidiendo todos los numeros e introducirlos en la arraylist.
				imprimirMensaje("Introduce un numero");
				numeros.add(sc.nextInt());
				}
			return numeros; // Me devuelve la arraylist.
		}
	
	// Metodo para comprobar
	static boolean comprobacion(ArrayList<Integer> numeros) {
		boolean resultado = false;
		if (numeros.get(0)%numeros.get(1)==0) {
			resultado = true;
		}
		return resultado;
	}
		
		
		// Metodo para saber si es multiplo o no. Con parametro y sin retorno.
	public static void saberMultiplo (ArrayList<Integer> numeros) {
		if (comprobacion(numeros)==true) {
			imprimirMensaje("El " + numeros.get(0) + " es multiplo de " + numeros.get(1));
		} else {
			imprimirMensaje("El " + numeros.get(0) + " NO es multiplo de " + numeros.get(1));
		}
	}

	// Metodo para imprimir mensaje
	static void imprimirMensaje(String mensaje) {
		System.out.println(mensaje);
	}

}
	
		
		


