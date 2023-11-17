package EjercicioM801;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Creo un objeto de la clase ordenador siguiendo metodo constructor 1
		Ordenador ordenador1 = new Ordenador("HP", "HOLA1");
		
		
		// Accedo a los atributos del objeto ordenador1 con el metodo get.
		System.out.println("La marca de mi ordenador1 es " + ordenador1.getMarca());
		System.out.println("El modelo de mi ordenador1 es " + ordenador1.getModelo());
		
		
		// Creo un objeto de la clase ordenador siguiendo metodo constructor 2 (todos los atributos)
		Ordenador ordenador2 = new Ordenador("ACER", "HOLA2", "INTEL", 16, 500);
		
		// Accedo a los atributos del objeto ordenador2 con el metodo get.
		System.out.println("La marca de mi ordenador2 es " + ordenador2.getMarca());
		System.out.println("El modelo de mi ordenador2 es " + ordenador2.getModelo());
		System.out.println("El procesador de mi ordenador2 es " + ordenador2.getProcesador());
		System.out.println("La ram de mi ordenador2 es de " + ordenador2.getQuantRam());
		System.out.println("La capacidad del disco duro de mi ordenador2 es de " + ordenador2.getCapDiscDur());
		
		
		// Modifico los parametros de procesador, ram y disco duro de ordenador 2 con los setters:
		ordenador2.setProcesador("AMD42");
		ordenador2.setQuantRam(32);
		ordenador2.setCapDiscDur(256);
		
		// Accedo a los atributos modificados del objeto ordenador2 con el metodo get para comprobar que se han modificado correctamente.
		System.out.println("El procesador de mi ordenador2 es " + ordenador2.getProcesador());
		System.out.println("La ram de mi ordenador2 es de " + ordenador2.getQuantRam());
		System.out.println("La capacidad del disco duro de mi ordenador2 es de " + ordenador2.getCapDiscDur());
		
		// Asigno el valor de la variable String programa con el setter a partir del objeto ordenador1 y lo imprimo:
		System.out.println("En estos momentos se esta ejecutando " + ordenador1.programa("Eclipse"));
		
		// Asigno el valor de la variable String programa con el setter a partir del objeto ordenador2 y lo imprimo:
		System.out.println("En estos momentos se esta ejecutando " + ordenador2.programa("NetBeans"));

		// Llamamos al metodo toString para que nos imprima la descripción completa del ordenador.
		System.out.println(ordenador1.toString());
		System.out.println(ordenador2.toString());
		
		sc.close();
	}

	
	
	
}
