		
import java.util.Scanner;

public class EjercicioM708 {

	public static void main (String[]args) {
		
		double gradosC = tempC("Introduce una temperatura en ºC.");
		imprimirMensaje("La conversion de " + gradosC + " ºC a Fahrenheit es " + calcularFahrenheit(gradosC));
}
	
	// Metodo para introducir temperatura en Celsius
	static double tempC(String mensaje) {
		Scanner sc = new Scanner (System.in);
		System.out.println(mensaje);
		return sc.nextDouble(); // Este metodo me retorna una variable tipo double
	}
	
	// Metodo para calcular Fahreinheit
	static double calcularFahrenheit(double gradosC) {
		return (gradosC * 9/5)  + 32;
		
	}
	
	// Metodo para imprimir mensaje
	static void imprimirMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}
			
		
		
		


