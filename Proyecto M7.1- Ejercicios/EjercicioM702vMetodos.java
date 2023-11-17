import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioM702vMetodos {

	public static void main(String[] args) {
	
		int numNotas = pedirNumero("Introduce el numero de notas que desea introducir");
		// ArrayList<Integer> notas = introduccionNotas(crearArrayList(),numNotas);
		// double notaMedia = calculoMedia(numNotas, notas);
		// validarMedia(notaMedia);
		validarMedia(calculoMedia(introduccionNotas(crearArrayList(),numNotas)));
		
		// --------------
		// validarMedia(calculoMedia(pedirNumero("Introduce el numero de notas que desea introducir"), notas), introduccionNotas(pedirNumero("Introduce el numero de notas que desea introducir"))));
		// --------------
		// validarMedia necesita un parametro double, asi que yo puedo introducir directamente 
		// el metodo calculoMedia ya que este me retorna una variable tipo double.
		// A su vez, el metodo calculoMedia, necesita un parametro de tipo int y uno de arraylist,
		// (que a su vez, el parametro int necesita de un String y la arraylist de un int),
		// y yo lo puedo añadir directamente incorporando pedirnumero e introduccionNotas, que retornan un int y una arraylist
		// respectivamente.

	}
	
	// Metodo para pedir numero de personas
		static int pedirNumero(String mensaje) {
			Scanner sc = new Scanner (System.in);
			System.out.println(mensaje);
			return sc.nextInt();
			}
	// Metodo para crear ArrayList
		static ArrayList<Integer> crearArrayList(){
			ArrayList <Integer> arrayList = new ArrayList<>();
			return arrayList;
		}
		
	// Metodo para almacenar las notas en una arraylist
		static ArrayList<Integer> introduccionNotas(ArrayList<Integer> arrayList, int numNotas){
			Scanner sc = new Scanner(System.in);
			ArrayList <Integer> notas = crearArrayList(); // 1. Creo la arraylist
			for (int i = 1; i<=numNotas; i++) { // Con el bucle pido las notas.
				imprimirMensaje("Introduce la nota " + i);
				notas.add(sc.nextInt()); // 2. Almaceno las notas en la arraylist notas.
			}
			return notas; // Retorno la arraylist notas.
		}			
	
	// Metodo para sumar las notas y calcular la media
		static double calculoMedia(ArrayList<Integer> notas) { // Necesito la array list por que es donde se almacenan las notas.
			double sumaNotas=0; 
			for (int i=0;i<notas.size();i++) { // Creo un bucle para sumar todas las notas de la arraylist a la variable sumaNotas.
				sumaNotas+= notas.get(i);
			}
				return sumaNotas/notas.size(); // Me retorna la media dividiendo la suma de notas entre el numero de notas.
			}	
			
	// Metodo para validar media de notas
		static void validarMedia(double notaMedia) {
			imprimirMensaje("La media es " + notaMedia);
			if (notaMedia<5) {
				imprimirMensaje("La nota media de la clase está suspendida. Los alumnos/as deberían preguntar sus dudas y trabajar más.");
			} else if (notaMedia<7) {
				imprimirMensaje("La nota media de la clase es buena, pero los alumnos/as deberían mejorar el trabajo personal.");
			} else {
				imprimirMensaje("¡Enhorabuena! La nota media de la clase se corresponde con el esfuerzo realizado.");
			}
		}
			
	// Metodo para imprimir mensaje
		static void imprimirMensaje(String mensaje) {
			System.out.println(mensaje);
		}

}
