import java.util.Scanner;

public class EjercicioM303v2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una primera nota");
		int nota1 = sc.nextInt();
		
		System.out.println("Introduce una segunda nota");
		int nota2 = sc.nextInt();
		
		System.out.println("Introduce una tercera nota");
		int nota3 = sc.nextInt();
		
		int sumaNotas = nota1+nota2+nota3; 		
		double sumaNotasDecimal = sumaNotas;
		double mediaNotas = sumaNotasDecimal/3;
		
		System.out.println("La media de las tres notas introducidas es: " + mediaNotas);
		
		if (mediaNotas<5) {
			System.out.println("No has superado el curso. Tienes que recuperar");
		} else if (mediaNotas>=5 && mediaNotas <=7) {
			System.out.println("¡Enhorabuena! Has aprobado, pero deberías seguir practicando");
		} else if (mediaNotas>7) {
			System.out.println("¡Enhorabuena! ¡Has superado el curso! ¡Pasa ya al siguiente nivel!");
			
		}
		
		
		
		sc.close();
}
}
