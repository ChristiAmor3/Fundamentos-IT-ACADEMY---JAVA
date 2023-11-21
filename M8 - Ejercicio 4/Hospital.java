package EjercicioM804v3;

public class Hospital extends Edificio {

	private int numEnfermos;
	
	public Hospital(String nomEdificio, int numPlantas, double supEdificio, int numEnfermos) {
		super(nomEdificio, numPlantas, supEdificio);
		this.numEnfermos=numEnfermos;
	}


	public void repartirComida() {
		int numRaciones = numEnfermos*3;
		System.out.println("Se estan repartiendo " + numRaciones + " raciones de comida");
	}


	@Override
	public String toString() {
		return super.toString() + " y el numero de enfermos es de " + numEnfermos;
	}



	
	
}
