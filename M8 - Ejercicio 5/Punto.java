package EjercicioM805;

public class Punto {

	private int posicioX;
	private int posicioY;
	
	public Punto(int posicioX, int posicioY) {
		this.posicioX = posicioX;
		this.posicioY = posicioY;
	}

	public final int getPosicioX() {
		return posicioX;
	}

	public final int getPosicioY() {
		return posicioY;
	}
	
	public double distanciaCentres(Circulo circulo) {
		return Math.sqrt(Math.pow(circulo.getCentro().getPosicioX() - posicioX, 2) + Math.pow(circulo.getCentro().getPosicioY() - posicioY, 2));
	}
	
}
	