import java.util.Scanner;

public class EjercicioM707 {

	public static void main (String[]args) {
		
		imprimirCuadrado(pedirNum("Introduce un numero"), pedirChar("Introduce un caracter")); 
		// Como no retorna nada, solo imprime, lo llamo tal cual.
		// Como el metodo imprimirCuadrado recibe una variable tipo int y una tipo char para funcionar, 
		// puedo introducir directamente los metodos que me retornan ese tipo de varible, 
		// ya que pedirNum retorna un int y pedirChar retorna un char.
	
}
	
	// Metodo para imprimir cuadrado
	static void imprimirCuadrado(int num, char caracter) {
		for (int j = 0; j < num; j++) {
			for (int i = 0; i < num; i++) {
				imprimirMensaje(caracter + " ");
			}
			System.out.println();
		}
	}
	// Metodo para pedir char
		static char pedirChar(String mensaje) {
			Scanner sc = new Scanner(System.in);
			imprimirMensaje(mensaje);
			return sc.nextLine().charAt(0);
		}
		
	// Metodo para pedir num
		static int pedirNum(String mensaje) {
			Scanner sc = new Scanner(System.in);
			imprimirMensaje(mensaje);
			return sc.nextInt();
		}
	// Metodo para imprimir mensaje
		static void imprimirMensaje(String mensaje) {
			System.out.print(mensaje);
		}
}
	


