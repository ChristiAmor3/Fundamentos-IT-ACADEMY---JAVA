import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioM7204vMetodos {

	public static void main (String[]args) {
		
		//ArrayList<Integer> listaNumerosLlena = arrayListLlena(); // me devuelve una arraylist con 4 valores, asi que tengo que almacenarla en otra arraylist.
		imprimirArrayList(arrayListLlena()); // imprimo la arraylist para que se vea en pantalla
		
		//ArrayList<Integer> listaVacia = arrayListVacia(); // creo una arraylist vacia, y como me devuelve una arraylist tengo que almacenarla en otra arraylist.
		
		//ArrayList<Integer> listaNumerosInvertidos = numerosInvertidos(listaNumerosLlena, arrayListVacia());
		// Creo una arraylist a la que le he añadido los numeros de la arraylits llena, pero en orden inverso.
		// Como me devuelve una arraylist, tengo que almacenarla en otra arraylist.
		imprimirArrayList(numerosInvertidos(arrayListLlena(), arrayListVacia())); // imprimo la arraylist para que se vea en pantalla
		
	    }
	
	// Metodo para crear ArrayList llena de numeros enteros.
	static ArrayList<Integer> arrayListLlena() {
		ArrayList<Integer> numeros = new ArrayList<>(); // Creo una arraylist y le añado valores.
		numeros.add(1); // i=0
		numeros.add(2); // i=1
		numeros.add(3); // i=2
		numeros.add(4); // i=3
		return numeros; // retorna la arraylist.
			}  
	
	// Metodo para crear ArrayList vacia en la que poder almacenar los numeros en orden inverso
	static ArrayList<Integer> arrayListVacia() {
		ArrayList<Integer> vacia = new ArrayList<>(); // Creo una arraylist y la retorno.
		return vacia;
	}  
	
	
	// Metodo para invertir los valores de la arraylist llena y almacenarlos en la arraylist vacia.
	static ArrayList<Integer> numerosInvertidos(ArrayList<Integer> arrayListLlena, ArrayList<Integer> numerosVacia){
		
		for (int i = arrayListLlena.size()-1; i >= 0; i--) { // Se repite tantas veces como valores tenga la arraylist llena.
															 // Empieza por el último valor, indice (size-1)
			numerosVacia.add(arrayListLlena.get(i));  
		    }
		return numerosVacia;
	}
	
	// Metodo para imprimir arraylist
	static void imprimirArrayList(ArrayList<Integer> arrayListLlena) {
		System.out.println(arrayListLlena);
		}
	}
		

