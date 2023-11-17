import java.util.Scanner;

public class EjercicioM402 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido al programa");
		
		System.out.println("Introduce tu edad");
		int edadUsuario = sc.nextInt();
		
		if (edadUsuario<=5) {
			System.out.println("PREESCOLAR");
		} else if (edadUsuario<=11){            // edadUsuario == 6 && edadUsuario <=11
			System.out.println("PRIMARIA");
		} else if (edadUsuario<=15){			//edadUsuario == 12 && edadUsuario <=15
			System.out.println("ESO");
		} else if (edadUsuario<=17){			// edadUsuario == 16 && edadUsuario <=17
			System.out.println("BACHILLERATO");
		} else {
			System.out.println("FP o UNIVERSIDAD");
		}
		sc.close();
	}

}
