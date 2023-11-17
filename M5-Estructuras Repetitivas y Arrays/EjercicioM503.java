import java.util.Scanner;

public class EjercicioM503 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double numRandom = Math.ceil((Math.random() * 10));
		boolean juego = true;
		int numUsuario;
		
		System.out.println("El programa ha generado un numero aleatorio");
		System.out.println();
		
		while (juego==true) {
			
			System.out.println("Introduce un numero para adivinar el numero aleatorio");
			numUsuario = sc.nextInt();
			
			if (numUsuario==numRandom) {
				System.out.println("Enhorabuena, el numero era " + (int) numRandom);
				juego=false;
				System.out.println("El juego ha finalizado");
			} else {
				System.out.println("Prueba otra vez");
			}
		
		}
	}
}

	


