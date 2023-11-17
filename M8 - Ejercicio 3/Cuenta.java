package EjercicioM803;

public class Cuenta {

	private int numCuenta;
	private int saldoCuenta;
	
	private Cliente titular;
	
	
	// Metodo constructor para crear cuentas
	public Cuenta(int numCuenta) {
		this.numCuenta = numCuenta;
		saldoCuenta = 0;
	}

	
	
	public final int getNumCuenta() {
		return numCuenta;
	}



	public final int getSaldoCuenta() {
		return saldoCuenta;
	}



	public final void setSaldoCuenta(int saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}



	// Metodo constructor para ingresar dinero
	public int ingresarSaldo (int cantidadDinero) {
		saldoCuenta += cantidadDinero;
		return saldoCuenta;
	}

	// Metodo constructor para retirar dinero
	public int retirarSaldo (int cantidadDinero) {
		saldoCuenta -= cantidadDinero;
		return saldoCuenta;
	}
	
}
