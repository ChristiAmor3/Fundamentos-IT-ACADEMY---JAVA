import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioM705vMetodos {

	public static void main(String[] args) {
		
		ArrayList <String> tareas = tareas(); 
		boolean juego=true; // chivato
		
		while (juego==true) {
			String funcion = pedirString("Introduce la funcion que desea realizar: añadir, mostrar, eliminar, salir,");
			juego=metodoSwitch(funcion, tareas, juego);
			// Si escribo añadir, mostrar o eliminar, al salir del caso siempre me devuelve una variable tipo boolean 
			// (juego) pero en true, cuando escribo salir, en cambio, aplicamos el valor de false a la variable boolean juego, 
			// y cuando salgo del caso, me retorna el boolean juego, ahora en false, por lo que al almacenar 
			// ese false que me devuelve el metodoSwitch en la variable ya existente de boolean juego, 
			// se deja de cumplir la condicion del bucle while.
			
	}
}
	// Metodo para imprimir el switch. Con retorno de boolean para poder cambiar el valor de juego a false.
	static boolean metodoSwitch(String funcion, ArrayList<String> tareas, boolean juego) {
		switch (funcion) {
		case "AÑADIR":
			introducirTareas(tareas, "Introduce la tarea que desea añadir a la lista.");
			break;
		case "MOSTRAR":
			mostrarTareas(tareas);
			break;
		case "ELIMINAR":
			eliminarTareas(tareas, "Introduce el numero de la tarea que deseas eliminar de la lista.");
			break;
		case "SALIR":
			juego=salirMenu(juego, "Acabas de salir de la aplicación.");
			break;
		default:
			imprimirMensaje("No has introducido una opcion funcional.");
}
		return juego; // devuelve la variable juego, que es false, y le aplica el false a juego en el main
		// lo que hace que deje de ejecutarse el bucle.
		// Si retornara un false directamente, el programa se acabaria después de cada funcion.
	}
	
	// Metodo para crear ArrayList
	static ArrayList<String> tareas() {
		ArrayList<String> tareas = new ArrayList<>();
		return tareas;
		}  

	
	// Metodo para añadir tareas a la arraylist.
	static void introducirTareas(ArrayList<String> tareas, String mensaje){
		String tarea = pedirString(mensaje); // este metodo me retorna un string, asi que tengo que almacenarlo.
		tareas.add(tarea);
	}
	
	// Metodo para mostrar tareas
	static void mostrarTareas(ArrayList<String> tareas){
		if (comprobacion(tareas)==true) {
			for (int i = 0; i<tareas.size();i++) {
				System.out.println((0+i) + ". " + tareas.get(i));
			}
		} else {
			imprimirMensaje("La lista no tiene elementos");
			}
	}
	
	// Metodo para eliminar tareas
	static void eliminarTareas(ArrayList<String> tareas, String mensaje){
		if (comprobacion(tareas)==true) {
			Scanner sc = new Scanner(System.in);
			int tarea = pedirNum(mensaje);
			tareas.remove(tarea);
		} else {
			imprimirMensaje("La lista no tiene elementos");
		}
	}
	
	// Metodo para salir del menu
	static boolean salirMenu(boolean juego, String mensaje) {
		imprimirMensaje(mensaje);
		return false; // Me devuelve una variable de tipo boolean que es false
	}
	
	// Metodo para pedir String / Tarea
	static String pedirString(String mensaje) { 
		Scanner sc = new Scanner(System.in);
		imprimirMensaje(mensaje);
		return sc.nextLine().toUpperCase();
	}
	
	// Metodo para pedir numero
	static int pedirNum(String mensaje) {
		Scanner sc = new Scanner(System.in);
		imprimirMensaje(mensaje);
		return sc.nextInt();
		}
	
	// Metodo para imprimir mensaje
	static void imprimirMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	// Metodo comprobacio de datos
	static boolean comprobacion(ArrayList<String> tareas) {
		boolean comprobacion=true;
		if (tareas.size()==0) {
			comprobacion=false;
		}
		return comprobacion;
	}
}
	
		
		


