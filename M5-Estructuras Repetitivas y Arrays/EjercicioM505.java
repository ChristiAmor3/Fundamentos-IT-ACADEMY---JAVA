import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioM505 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nombreAlumnos = new ArrayList<>();
		
		System.out.println("Bienvenido al programa de becas. Vamos a asignar 5 becas");
		int numBecas = 0;
	
		while (numBecas<5) {
			
			System.out.println("Indica tu nombre");
			String nombre = sc.nextLine();
			
			System.out.println("Indica tu edad");
			int edad = sc.nextInt();
			
			sc.nextLine(); // Me saltaba la linea.
			
			System.out.println("¿Tienes titulo universitario? SI / NO");
			String tituloUni= sc.nextLine();
			
			System.out.println("¿Estas en el paro? SI / NO");
			String paro= sc.nextLine();
			
			if ((edad>=18 && tituloUni.equalsIgnoreCase("SI")) || paro.equalsIgnoreCase("SI")) {
				System.out.println("TIENES DERECHO A BECA");
				numBecas++;
				nombreAlumnos.add(nombre); // Si esto lo pongo al principio, tendré nombres en la lista incluso aunque no tengan beca.
			} else {
				System.out.println("NO TIENES DERECHO A BECA");
			}
			
	}
		System.out.println("Se han acabado el numero de becas a dar.");

		System.out.println("Los alumnos que reciben la beca son " + nombreAlumnos);
		sc.close();
	}
}

