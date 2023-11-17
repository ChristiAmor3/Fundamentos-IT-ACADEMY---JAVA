import java.util.Scanner;

public class EjercicioM301 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido al programa");
		System.out.println("Introduce tu nombre");
		String nombreUsuario = sc.nextLine();
		
		System.out.println("Ahora introduce tu apellido");
		String apellidoUsuario = sc.nextLine();
		
		System.out.println("Por último, introduce tu edad");
		int edadUsuario = sc.nextInt();
		
		System.out.println("Tu nombre es " + nombreUsuario + " " + apellidoUsuario + " y tienes " + edadUsuario + " años.");
		
		sc.close();
	}

}
