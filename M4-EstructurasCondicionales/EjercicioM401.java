import java.util.Scanner;

public class EjercicioM401 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido al programa");
		System.out.println("Introduce tu nombre");
		String nombreUsuario = sc.nextLine();
		
		System.out.println("Ahora introduce tu apellido");
		String apellidoUsuario = sc.nextLine();
		
		System.out.println("Por último, introduce tu edad");
		int edadUsuario = sc.nextInt();
		
		if (edadUsuario>=18) {
			System.out.println(nombreUsuario + " " + apellidoUsuario + ", eres MAYOR de edad");
		} else {
			System.out.println("No has introducido un valor correcto");
		}
		
		sc.close();
	}

}
