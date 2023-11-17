package EjercicioM803;

import java.util.ArrayList;

public class Cliente {

	private String nombreCliente;
	private String apellidoCliente;
	private ArrayList <Cuenta> cuentasCliente;
	
	public Cliente(String nombreCliente, String apellidoCliente) {
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.cuentasCliente=new ArrayList<>();
	}
	
	// Getter y Setter de ejemplo para compararlo con el añadircuenta.
	public final String getNombreCliente() {
		return nombreCliente;
	}
	
	public final String getApellidoCliente() {
		return apellidoCliente;
	}

	public final void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	// Es como un Setter. A la cuentasCliente del Cliente que yo determine, se le añadirá el objeto Cuenta.
	// El THIS me esta diciendo que ESTA arraylist que tiene el objeto cliente como parametro, ahora tendrá un objeto cuenta dentro.
	// El objeto cliente ya tiene una arraylist, pero no tiene nada. Con este metodo le digo que a SU ARRAYLIST, le añada el objeto cuenta.
	public void añadirCuentaACliente(Cuenta cuenta) {
		cuentasCliente.add(cuenta);
	}
		
	// Metodo para tener el objeto de Cuenta / Getter
	public final Cuenta getCuentaCliente(int posicionIndiceCuenta) {
		return cuentasCliente.get(posicionIndiceCuenta);
	}
		
	public int getSizeListaCuentas () {
		return this.cuentasCliente.size();
	}
	
	// Metodo para buscar el numero de la cuenta en la lista
	public static int buscarIndiceCuentaCliente(int numCuenta, int posicionIndice, ArrayList<Cliente> listaClientes) {
		int posicionIndiceCuenta=-1;
		int i=0;
			if (posicionIndice==-1) {
				System.out.println("El cliente no esta en la lista.");
			} else {
					while (i<listaClientes.get(posicionIndice).getSizeListaCuentas() && posicionIndiceCuenta==-1) { 
					if (numCuenta==listaClientes.get(posicionIndice).getCuentaCliente(i).getNumCuenta()) { // Me compara el numero de cuenta
						posicionIndiceCuenta=i; 
					} 
						i++;
					}			
			}
			return posicionIndiceCuenta;	
		}

}
