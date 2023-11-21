package EjercicioM804v3;

import java.util.ArrayList;

public abstract class Edificio {

	// Creamos los atributos.
	protected String nomEdificio;
	protected int numPlantas;
	protected double supEdificio;
	
	
	// Creamos un constructor para poder crear objetos en el main
	public Edificio(String nomEdificio,int numPlantas, double supEdificio) {
		this.nomEdificio = nomEdificio;
		this.numPlantas = numPlantas;
		this.supEdificio = supEdificio;
	}
	
	// Creamos los getters y setters de los atributos.
	public String getNomEdificio() {
		return nomEdificio;
	}
	
	public void setNomEdificio(String nomHotel) {
		this.nomEdificio = nomHotel;
	}
	public int getNumPlantas() {
		return numPlantas;
	}
	public double getSupEdificio() {
		return supEdificio;
	}
	
	// Creamos el metodo de limpieza
	public void limpieza() {
		double minutosPlanta = (supEdificio*1)/5;
		double tiempoEntrePlantas= 0.50 * numPlantas;
		double totalMinutos = minutosPlanta + tiempoEntrePlantas;
		System.out.println("El tiempo que se ha tardado en limpiar el edificio es de "+ totalMinutos + "minutos.");
		double costeDiario = totalMinutos * 1;
		double costeMensual= costeDiario * 30;
		System.out.println("El coste mensual de limpieza es de "  + costeMensual + " €");
	}
	
	// Creamos el metodo calcularCosteVigilancia.
	public void calcularCosteVigilancia() {
		double numVigilantes = supEdificio/1000;
		double costeVigilancia = (numVigilantes*1300);
		System.out.println("El coste de vigilancia del hotel es de " + costeVigilancia + " €");
	}

	@Override
	public String toString() {
		return "Edificio [nomEdificio=" + nomEdificio + ", numPlantas=" + numPlantas + ", supEdificio=" + supEdificio
				+ "]";
	}

	
	
	
	
}
