import java.util.Scanner;

public class EjercicioM302 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce otro numero entero");
		int num2 = sc.nextInt();		
		
		System.out.println("El resultado de la suma es: " + (num1+num2));
		System.out.println("El resultado de la resta es: " + (num1-num2));
		System.out.println("El resultado de la multiplicación es: " + (num1*num2));
		System.out.println("El resultado de la división es: " + ((double) num1/num2)); 
		
		// double division = (double) num1/num2; // Si divido simplemente dos numeros enteros, me dara un numero entero y perderé los decimales.
	      										 // Necesito pasar al menos uno a double, para que el resultado sea double/decimal.
												 // Lo estoy convirtiendo MANUALMENTE.
		
		// Necesito pasar al menos una variable de tipo int a double antes de hacer la division.
		// Si no, me dara el resultado de la division en forma de decimal : 1.0, y perderé los decimales.
		// En la impresión podria hacerse directamente así: ((double) num1/num2)); o ((double)num1/(double)num2));
	
		sc.close();
		
	}
}
