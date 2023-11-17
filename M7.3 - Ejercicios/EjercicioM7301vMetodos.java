
import java.util.Scanner;

public class EjercicioM7301vMetodos {
	
			public static void main (String[]args) {
				
				boolean seguirBucle=true;
					
				while (seguirBucle) {
					imprimirMenu ();
					int numFigura = pedirNum("Introduzca el numero de la opcion que desee realizar: ");
					seguirBucle = menu (numFigura, seguirBucle); 

}	
			}
			
		
			//Metodo pedir numero
			static int pedirNum(String mensaje) {
				Scanner sc = new Scanner(System.in);
				imprimirMensaje(mensaje);
				return sc.nextInt();
				}
			//Metodo pedir numero double
			static double pedirNumDouble(String mensaje) {
				Scanner sc = new Scanner(System.in);
				imprimirMensaje(mensaje);
				return sc.nextDouble();
				}
			//Metodo para imprimir mensaje
			static void imprimirMensaje(String mensaje) {
				System.out.println(mensaje);
			}
			// Meto para pedir double
			static double pedirDouble(String mensaje) {
				Scanner sc = new Scanner(System.in);
				imprimirMensaje(mensaje);
				return sc.nextDouble();
				}
			// Metodo para imprimir menu
			static void imprimirMenu () {
				System.out.println();
				System.out.println("Bienvenido al programa de cálculo de áreas.");
				System.out.println();
				System.out.println("Aquí tiene todas las opciones:");
				System.out.println();
				System.out.println("1. Cuadrado");
				System.out.println();
				System.out.println("2. Triangulo");
				System.out.println();
				System.out.println("3. Rectangulo");
				System.out.println();
				System.out.println("4. Circulo");
				System.out.println();
				System.out.println("0. Salir del programa");
				System.out.println();
			}
			
			// Metodo para  menu
			static boolean menu (int numFigura, boolean seguirBucle) {
			
				switch (numFigura) {
					case 1:
						double areaCuadrado = areaCuadrado (pedirNumDouble("Introduce el valor del lado" ));
						System.out.println("El area del cuadrado es "  + areaCuadrado);
						break;
					case 2:
						double areaTriangulo = areaTriangulo (pedirNumDouble("Introduzca el valor de la base del triangulo: "), pedirNumDouble ("Introduzca el valor de la altura del triangulo: "));
						System.out.println("El area del triangulo es "  + areaTriangulo);
						break;
					case 3:
						double areaRectangulo = areaRectangulo (pedirNumDouble("Introduzca el valor del largo del rectangulo: "), pedirNumDouble("Introduzca el valor del ancho del rectangulo: "));
						System.out.println("El area del rectangulo es "  + areaRectangulo);
						break;
					case 4:
						double areaCirculo = areaCirculo (pedirNumDouble("Introduzca el valor del radio del circulo: "));
						System.out.println("El area del circulo es "  + areaCirculo);
						break;
					case 0:
						System.out.println("Ha seleccionado salir del programa.");
						seguirBucle=false;
						break;
			}	
			return seguirBucle;
		}
			
				// Metodo para calcular area cuadrado
				static double areaCuadrado (double lado) {
					return lado*lado; // Area
				}
		
				// Metodo para calcular area trinagulo
				static double areaTriangulo (double base, double altura) {
					return (base*altura)/2;
				}
				// Metodo para calcular area rectanchulo
				static double areaRectangulo (double largo, double ancho) {
					return largo*ancho;
				}
				// Metodo para calcular area circulo
				static double areaCirculo (double radio) {
					return Math.PI*Math.pow(radio, 2);
				}
}
		