import java.util.Scanner;

public class EjercicioM504v2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double numRandom = Math.ceil((Math.random() * 10));
		boolean juego = true;
		int numUsuario;
		int intentos=0; 
		
		System.out.println("El programa ha generado un numero aleatorio.");
		System.out.println();
		System.out.println("Trata de adivinarlo. Tienes un máximo de 5 intentos.");
		System.out.println();
		
		while (juego==true) {
			
			System.out.println("Introduce un numero.");
			numUsuario = sc.nextInt();
			intentos++;
			
			if (numUsuario==numRandom) {
				System.out.println("Felicidades, el numero aleatorio es " + (int) numRandom + " y lo has acertado en tu intento numero " + intentos +".");
				juego = false;
			} else if (intentos==5){
				System.out.println("Se te han acabado los intentos.");
				juego = false;
			} else {
				System.out.println("Prueba otra vez. Tienes " + (5-intentos) + " intentos.");
		} 
		}
		sc.close();
		}
	}

