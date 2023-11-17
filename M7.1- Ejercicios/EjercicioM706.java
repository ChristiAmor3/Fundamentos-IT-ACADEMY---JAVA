import java.util.Scanner;

public class EjercicioM706 {

	public static void main (String[]args) {
		
		imprimeTablaMultiplicar(pedirNum("Introduce un numero del 1 al 10."));
		// Como no retorna nada, solo imprime, lo llamo tal cual.
		// El metodo tablaMultiplicar recibe una variable tipo int como parametro para funcionar, 
		// asi que puedo introducir directamente el metodo pedirNum ya que retorna un int.
		
	}
	
	// Metodo para imprimir tabla multiplicar
	static void imprimeTablaMultiplicar(int num) {
		if (comprobacion(num)) {
			for (int i=1; i<=10; i++) {
				imprimirMensaje(num + " * " + i + " = " + (num*i));
			}
		} else {
			imprimirMensaje("No has introducido un numero dentro del margen.");
		}
	}
	
	// Metodo para comprobar que el numero introducido este entre 1 y 10.
	static boolean comprobacion(int num){
		boolean comprobacion=false;
		if (num>=1 && num<=10) {
			comprobacion=true;
		}
		return comprobacion;
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
}	
		
		


