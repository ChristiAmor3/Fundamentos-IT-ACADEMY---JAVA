import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioM701vMetodos {

	public static void main(String[] args) {
		
		
		validarMedia(calculoMedia(numeros(crearArrayList()))); 
		// validarMedia necesita un parametro double para funcionar, y el valor que devuelve calculoMediaNotas(notas) 
		// es double, por eso puedo añadirlo como parametro.
		// Al mismo tiempo, calculoMediaNotas recibe una arraylist como parametro, asi que yo puedo añadir directamente
		// el metodo notas ya que me retorna una arraylist.
		// Y al mismo tiempo, notas recibe un parametro arraylist, asi que se lo puedo añadir directamente.
		
				
		
}
	// Metodo para crear ArrayList
	static ArrayList<Integer> crearArrayList(){
		ArrayList <Integer> arrayList = new ArrayList<>();
		return arrayList;
	}
	
	// Metodo para almacenar las notas en una arraylist
		static ArrayList<Integer> numeros(ArrayList<Integer> arrayList){
			Scanner sc = new Scanner(System.in);
			ArrayList <Integer> numeros = crearArrayList(); // 1. Creo la arraylist
			for (int i = 1; i<=3; i++) { 
				imprimirMensaje("Introduce la nota " + i);
				numeros.add(sc.nextInt()); // 2. Almaceno las notas en la arraylist notas.
			}
			return numeros; // Retorno la arraylist notas.
		}
		
	// Metodo para calcular la Media de edades. // Con parametro y con retorno
		static double calculoMedia(ArrayList <Integer> notas) { 
			double sumaNumeros=0;
			for (int i = 0; i<notas.size();i++) {
				sumaNumeros+=notas.get(i);
			}
			return sumaNumeros/3;
		}
	// Metodo para validar media de notas
		static void validarMedia(double mediaNumeros) { // mediaNotas es un nombre X de una variable tipo double.
			imprimirMensaje("La media es " + mediaNumeros);
			if (mediaNumeros>=0 && mediaNumeros<5) {
				imprimirMensaje("No has superado el curso. Tienes que recuperar.");
			} else if (mediaNumeros<7) {
				imprimirMensaje("Has aprobado. Pero tienes que seguir practicando.");
			} else {
				imprimirMensaje("Has superado el curso. Pasa ya al siguiente nivel.");
			}
		}
		
	// Metodo para imprimir mensaje
		static void imprimirMensaje(String mensaje) {
			System.out.println(mensaje);
		}
}
