import java.util.Scanner;

public class EjercicioM404 {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un mes del año mediante un numero. Ejemplo: enero = 1");
		int numMes = sc.nextInt();
		
		switch(numMes) {
			case 1:
				System.out.println("El mes de enero tiene 31 días");
				break;
			case 2:
				System.out.println("El mes de febrero tiene 29 días");
				break;
			case 3:
				System.out.println("El mes de marzo tiene 31 días");
				break;
			case 4:
				System.out.println("El mes de abril tiene 30 días");
				break;
			case 5:
				System.out.println("El mes de mayo tiene 31 días");
				break;
			case 6:
				System.out.println("El mes de junio tiene 30 días");
				break;
			case 7:
				System.out.println("El mes de julio tiene 31 días");
				break;
			case 8:
				System.out.println("El mes de agosto tiene 31 días");
				break;
			case 9:
				System.out.println("El mes de setiembre tiene 30 días");
				break;
			case 10:
				System.out.println("El mes de octubre tiene 31 días");
				break;
			case 11:
				System.out.println("El mes de noviembre tiene 30 días");
				break;
			case 12:
				System.out.println("El mes de diciembre tiene 31 días");
				break;
			default:
				System.out.println("El numero que has introducido no corresponde a ningun mes");
			} 
		sc.close();
}
}
