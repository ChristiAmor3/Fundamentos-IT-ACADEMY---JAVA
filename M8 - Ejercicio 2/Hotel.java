package EjercicioM802vMetodos;

public class Hotel {

	// Creamos los atributos.
	private String nomHotel;
	private int numHab;
	private	int numPlantas;
	private double supHotel;
	
	// Creamos un constructor para poder crear objetos/hoteles en el main
	public Hotel(String nomHotel, int numHab, int numPlantas, double supHotel) {
		this.nomHotel = nomHotel;
		this.numHab = numHab;
		this.numPlantas = numPlantas;
		this.supHotel = supHotel;
	}
	
	// Creamos los getters y setters de los atributos.
	public String getNomHotel() {
		return nomHotel;
	}
	
	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}
	public int getNumHab() {
		return numHab;
	}
	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}
	public int getNumPlantas() {
		return numPlantas;
	}
	public void setNumPlantas(int numPlantas) {
		this.numPlantas = numPlantas;
	}
	public double getSupHotel() {
		return supHotel;
	}
	public void setSupHotel(double supHotel) {
		this.supHotel = supHotel;
	}
	
	// Creamos el metodo calcularManteniment.
	
	public String calcularMantenimiento() {
		int personasNecesarias = numHab/20;
		double costeTotal = personasNecesarias * 1500;
		return "Las personas necesarias para atender " + numHab + " habitaciones son " + personasNecesarias + " personas, y el coste total de mantenimiento es de " + costeTotal + " €";
	}
	
	
	
	
}
