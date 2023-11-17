import java.util.Scanner;

public class EjercicioM502 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int suma=0; // Creamos variable suma para ir acumulando los valores de int i en el bucle for.
		// int numAux; // Creamos una variable auxiliar para cambiar los valores de num1 y num2 en caso de ser mayor num1 a num2.
		
		System.out.println("Dame un numero entero");
		int num1 = sc.nextInt();
		
		System.out.println("Dame otro numero entero");
		int num2 = sc.nextInt();
		
		/*if (num1>num2) { // creamos este if para reconvertir la asignacio de variables en caso de que num1 sea mayor que num2.
		numAux=num1; // numAux pasa a tener el valor de num1
		num1=num2; // num 1 pasa a tener el valor de num2
		num2=numAux; // num 2 pasa a tener el valor de numAux, que era el de num1. Pasamos el valor de num1 a num2, en caso de ser mayor.
		} else {} */
		
		sc.nextLine();
		
		if (num1<num2) {
			for (int i = num1; i <= num2; i++) { // contador empieza desde donde empiezo a sumar, en este caso, num1, y acaba cuando supera a num2.
				suma += i;
			}
		} else {
			for (int i = num2; i <= num1; i++) { // contador empieza desde donde empiezo a sumar, en este caso, num2 y acaba cuando supera a num1.
					suma += i;
			}
		}
		
		System.out.println("El valor de la suma de todos los numeros entre " + num1 + " y " + num2 + " = " + suma);
		
		sc.close();
	}

}

