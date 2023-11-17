import java.util.Scanner;

public class EjercicioM405v2 {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un numero");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce otro numero");
		int num2 = sc.nextInt();
		
		sc.nextLine(); 
		
		System.out.println("Selecciona un operador. Pulsa + para sumar, pulsa - para restar, pulsa * para multiplicar, pulsa / para dividir");
		String operador = sc.nextLine();
		
		if (operador.equals("+")) {
			System.out.println("La suma de los dos numeros es " + (num1+num2));
		} else if (operador.equals("-")) {
			System.out.println("La resta de los dos numeros es " + (num1-num2));
		} else if (operador.equals("*")) {
			System.out.println("La multiplicacion de los dos numeros es " + (num1*num2));
		} else if (operador.equals("/")) {
			System.out.println("La division de los dos numeros es " + ((double) num1/num2));
		} else {
				System.out.println("No has introducido un operador valido");
			}
		
		sc.close();
	}
}	

