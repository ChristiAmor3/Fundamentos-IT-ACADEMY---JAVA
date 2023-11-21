package EjercicioM804v3;

public class Hotel extends Edificio{

	private int numHab;
	
	public Hotel(String nomEdificio, int numPlantas, double supEdificio, int numHab) {
		super(nomEdificio, numPlantas, supEdificio);
		this.numHab=numHab;
	}


	@Override
	public void calcularCosteVigilancia() {
		double numVigilantes = supEdificio/1000;
		double costeVigilancia = (numVigilantes*1300) + 500;
		System.out.println("El coste de vigilancia del hotel es de " + costeVigilancia + " €");
		
	}
	
	public String calcularMantenimiento() {
		int personasNecesarias = numHab/20;
		double costeTotal = personasNecesarias * 1000;
		return "Las personas necesarias para atender " + numHab + " habitaciones son " + personasNecesarias + " personas, y el coste total de mantenimiento es de " + costeTotal + " €";
	}


	@Override
	public String toString() {
		return super.toString() + " y el numero de habitaciones es de " + numHab;
		
	}


	



	
	
	
	
}
