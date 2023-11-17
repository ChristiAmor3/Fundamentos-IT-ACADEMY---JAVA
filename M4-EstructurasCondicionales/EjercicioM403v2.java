import java.util.Scanner;

public class EjercicioM403v2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido al programa de becas");
		
		System.out.println("Indica tu edad");
		int edad = sc.nextInt();
		
		sc.nextLine(); // Me saltaba la linea.
		
		System.out.println("¿Tienes titulo universitario? SI / NO");
		String tituloUni= sc.nextLine();
		
		System.out.println("¿Estas en el paro? SI / NO");
		String paro= sc.nextLine();
				
		if ((edad>=18 && tituloUni.equals("SI")))  {
		 	System.out.println("TIENES DERECHO A BECA");
		 } else if (paro.equals("SI")) {
	 	System.out.println("TIENES DERECHO A BECA");
		 } else {
		 	System.out.println("NO TIENES DERECHO A BECA");
		 }
		sc.close();
	}

}
