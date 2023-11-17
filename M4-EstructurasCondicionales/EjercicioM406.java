import java.util.Scanner;

public class EjercicioM406 {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el dia que naciste");
		int diaNacimiento = sc.nextInt();
		
		if (diaNacimiento>=1 && diaNacimiento<=31) {
		
			System.out.println("Introduce el mes en el que naciste. Hazlor en numero. Ejemplo: enero - 1.");
			int mesNacimiento = sc.nextInt();
		
			switch (mesNacimiento) {
			case 1:
				System.out.println("Has nacido en enero");
				if (diaNacimiento<=19) { 
					System.out.println("Eres capricornio");
				} else {
					System.out.println("Eres acuario");
				} 
				break;
			case 2:
				System.out.println("Has nacido en febrero");
				if (diaNacimiento<=18) {
					System.out.println("Eres acuario");
				} else {
					System.out.println("Eres piscis");
				}
				break;
			case 3:
				System.out.println("Has nacido en marzo");
				if (diaNacimiento<=20) {
					System.out.println("Eres piscis");
				} else {
					System.out.println("Eres aries");
				}
				break;
			case 4:
				System.out.println("Has nacido en abril");
				if (diaNacimiento<=19) {
					System.out.println("Eres aries");
				} else  {
					System.out.println("Eres tauro");
				} 
				break;
			case 5:
				System.out.println("Has nacido en mayo");
				if (diaNacimiento<=20) {
					System.out.println("Eres tauro");
				} else  {
					System.out.println("Eres géminis");
				}
				break;
			case 6:
				System.out.println("Has nacido en junio");
				if (diaNacimiento<=20) {
					System.out.println("Eres géminis");
				} else  {
					System.out.println("Eres cancer");
				} 
				break;
			case 7:
				System.out.println("Has nacido en julio");
				if (diaNacimiento<=22) {
					System.out.println("Eres cancer");
				} else  {
					System.out.println("Eres leo");
				}
				break;
			case 8:
				System.out.println("Has nacido en agosto");
				if (diaNacimiento<=22) {
					System.out.println("Eres leo");
				} else {
					System.out.println("Eres virgo");
				} 
				break;
			case 9:
				System.out.println("Has nacido en septiembre");
				if (diaNacimiento<=22) {
					System.out.println("Eres virgo");
				} else  {
					System.out.println("Eres libra");
				}
				break;
			case 10:
				System.out.println("Has nacido en octubre");
				if (diaNacimiento<=22) {
					System.out.println("Eres libra");
				} else  {
					System.out.println("Eres escorpion");
				}
				break;
			case 11:
				System.out.println("Has nacido en noviembre");
				if (diaNacimiento<=21) {
					System.out.println("Eres escorpion");
				} else {
					System.out.println("Eres sagitario");
				}
				break;
			case 12:
				System.out.println("Has nacido en diciembre");
				if (diaNacimiento<=21) {
					System.out.println("Eres sagitario");
				} else  {
					System.out.println("Eres capricornio");
				}
				break;
			default: 
				System.out.println("No has introducido un valor de mes correcto.");
			}
		} else {
			System.out.println("No has introducido un dia valido.");
		}
		
		sc.close();
	}
}	

