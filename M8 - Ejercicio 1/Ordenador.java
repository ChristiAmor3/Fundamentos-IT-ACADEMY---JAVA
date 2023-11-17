package EjercicioM801;

public class Ordenador {

	private String marca;
	private String modelo;
	private String procesador;
	private int quantRam;
	private int capDiscDur;
	
	// Creo un metodo constructor 1 con solo dos atributos.
	public Ordenador(String marca, String modelo) { 
	    this.marca = marca;
	    this.modelo = modelo;
	    procesador = "NVIDIA";
	    quantRam = 32;
	    capDiscDur = 1000;
	}

	// Creo un metodo constructor 2 con todos los atributos.
	public Ordenador(String marca, String modelo, String procesador, int quantRam, int capDiscDur) { 
	    this.marca = marca;
	    this.modelo = modelo;
	    this.procesador = procesador;
	    this.quantRam = quantRam;
	    this.capDiscDur = capDiscDur;
	}

	
	// Creo los getters para acceder a todos los atributos:
	
	public String getMarca(){ // Creo el metodo para consultar la marca
		return marca;
	}
	
	public String getModelo(){ // Creo el metodo para consultar el modelo
		return modelo;
	}
	
	public String getProcesador() { // Creo el metodo para consultar el procesador
		return procesador;
	}

	public int getQuantRam() { // Creo el metodo para consultar la ram
		return quantRam;
	}

	public int getCapDiscDur() { // Creo el metodo para consultar el disco duro
		return capDiscDur;
	}
	
	
	// Creo los setter para modificar el procesador, la ram y el disco duro:
	
	public void setProcesador(String procesador) { // Creo el metodo para modificar el procesador
		this.procesador = procesador;
	}

	public void setQuantRam(int quantRam) { // Creo el metodo para modificar la ram
		this.quantRam = quantRam;
	}

	public void setCapDiscDur(int capDiscDur) { // Creo el metodo para modificar el disco duro
		this.capDiscDur = capDiscDur;
	}

	
	// Creo el metodo de clase programa que recibe un String programa para que podamos imprimirla.
	
	public String programa(String programa) {
		return programa;

	}
	
	// Creamos el metodo de clase toString substituyendo/anulando el metodo orignal toString para tener información más util.
	public String toString() {
		return "Este es un ordenador " + getMarca() + " " + getModelo() + " que cuenta con un procesador " + getProcesador() + " , una memoria ram de " + getQuantRam() + " GB,"
				+ " y una capacidad de disco duro de " + getCapDiscDur() + " GB";
		
	}

}
