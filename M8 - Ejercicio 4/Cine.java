package EjercicioM804v3;

import java.util.Scanner;

public class Cine extends Edificio{

	private int aforoMaximo;
	
	public Cine(String nomEdificio, int numPlantas, double supEdificio, int aforoMaximo) {
		super(nomEdificio, numPlantas, supEdificio);
		this.aforoMaximo=aforoMaximo;
	}


	
	public final int getAforoMaximo() {
		return aforoMaximo;
	}


	public void proyectarSesion(int numAsistentesFinal, int precioEntrada) {
				int numRecaudacion = precioEntrada*numAsistentesFinal;
				System.out.println("Se han recaudado " + numRecaudacion + " €");
		
	}
	
	public int pedirAsistentes(int numAsistentes) {
		Scanner sc = new Scanner(System.in);
		boolean bucle = true;
		int numAsistentesFinal=aforoMaximo+1;
		while (bucle) {
				if (numAsistentes<=aforoMaximo) {
					bucle=false;
					numAsistentesFinal=numAsistentes;
				} else {
					bucle=false;
				}
			}
		return numAsistentesFinal;
		
		}
	

	@Override
	public String toString() {
	
		return super.toString() + " y el aforo maximo es de " + aforoMaximo;
	}



				// Metodo para pedir numero
				static int pedirInt(String mensaje) {
					Scanner sc = new Scanner(System.in);
					System.out.println(mensaje);
					return sc.nextInt();
					}
}