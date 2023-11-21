package EjercicioM805;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenid@ a la aplicacion de circulos");
		System.out.println("");
		
		boolean seguirBucle=true;
		while(seguirBucle) {
			
			System.out.println("Vamos a crear el primer circulo");
			Circulo circulo1=crearCirculo();
			System.out.println("");
			System.out.println("Vamos a crear el segundo circulo");
			Circulo circulo2=crearCirculo();
			System.out.println("");
			
			imprimirMetodos(circulo1, circulo2);
			
			seguirBucle=continuarCreacion(seguirBucle);		
		}
	}	
	
	public static Circulo crearCirculo() {
		
		Scanner sc = new Scanner(System.in);
	
		Punto punto1 = new Punto(Teclado.leerInt("Introduce el valor de la posicion X"),Teclado.leerInt("Introduce el valor de la posicion Y"));
		
		Circulo circulo = new Circulo(punto1, Teclado.leerInt("Introduce el radio de un circulo"));
		
		return circulo;
	}
	
	public static void imprimirEquals(Circulo circulo1, Circulo circulo2) {
		if (circulo1.equals(circulo2)) {
			System.out.println("Los circulos tienen el mismo centro y el mismo radio");
		} else {
			System.out.println("Los circulos NO tienen el mismo centro y el mismo radio");
		}
	}
	
	public static void imprimirConcentrics(Circulo circulo1, Circulo circulo2) {
		if (circulo1.sonConcentrics(circulo2)) {
			System.out.println("Los circulos son concentricos");
		} else {
			System.out.println("Los circulos NO son concentricos");
		}
	}
	
	public static void imprimirIgualRadi(Circulo circulo1, Circulo circulo2) {
		if (circulo1.tenenIgualRadi(circulo2)) {
			System.out.println("Los circulos tienen el mismo radio");
		} else {
			System.out.println("Los circulos NO tienen el mismo radio");
		}
	}
	
	public static void imprimirTangentes(Circulo circulo1, Circulo circulo2) {
		if (circulo1.sonTangents(circulo2)) {
			System.out.println("Los circulos son tangentes");
		} else {
			System.out.println("Los circulos NO son tangentes");
		}
	}
	
	public static void imprimirSecantes(Circulo circulo1, Circulo circulo2) {
		if (circulo1.sonSecants(circulo2)) {
			System.out.println("Los circulos son secantes");
		} else {
			System.out.println("Los circulos NO son secantes");
		}
	}
	
	public static void imprimirSeTocan(Circulo circulo1, Circulo circulo2) {
		if (circulo1.noEsToquen(circulo2)) {
			System.out.println("Los circulos se tocan");
		} else {
			System.out.println("Los circulos NO se tocan");
		}
	}
	
	public static boolean continuarCreacion(boolean seguirBucle) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quieres crear otro circulo? SI / NO");
		
		if (sc.nextLine().toUpperCase().equals("SI")) {
			seguirBucle=true;
		} else {
			System.out.println("!Hasta pronto!");
			seguirBucle=false;
		}
		return seguirBucle;
	}
	
	public static void imprimirMetodos(Circulo circulo1, Circulo circulo2) {
		System.out.println(circulo1.valorDistanciaCentros(circulo2));
		System.out.println("");
		System.out.println(circulo1.equals(circulo2));
		imprimirEquals(circulo1, circulo2);
		System.out.println(circulo1.sonConcentrics(circulo2));
		imprimirConcentrics(circulo1, circulo2);
		System.out.println(circulo1.tenenIgualRadi(circulo2));
		imprimirIgualRadi(circulo1, circulo2);
		System.out.println(circulo1.sonTangents(circulo2));
		imprimirTangentes(circulo1, circulo2);
		System.out.println(circulo1.sonSecants(circulo2));
		imprimirSecantes(circulo1, circulo2);
		System.out.println(circulo1.noEsToquen(circulo2));
		imprimirSeTocan(circulo1, circulo2);
		System.out.println("");
	}
	
}