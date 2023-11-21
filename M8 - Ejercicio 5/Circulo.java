package EjercicioM805;


public class Circulo {
	
	private Punto centro;
	private int radio;
	
	public Circulo(Punto centro, int radio) {
		this.centro = centro;
		this.radio = radio;
	}
	
	
	public final Punto getCentro() {
		return centro;
	}

	public final int getRadio() {
		return radio;
	}

	public double valorDistanciaCentros(Circulo circulo) {
		return centro.distanciaCentres(circulo);
	}
	
	public boolean equals(Circulo circulo) {
		return (centro.getPosicioX()==circulo.getCentro().getPosicioX() && centro.getPosicioY()==circulo.getCentro().getPosicioY()) && radio==circulo.getRadio();
		}
	
	public boolean sonConcentrics(Circulo circulo) {
		return centro.getPosicioX()==circulo.getCentro().getPosicioX() && centro.getPosicioY()==circulo.getCentro().getPosicioY();
		}
	
	public boolean tenenIgualRadi(Circulo circulo) {
		return radio==circulo.getRadio();
		}
	
	public boolean sonTangents(Circulo circulo) {
		return valorDistanciaCentros(circulo)==(double)(radio+circulo.getRadio())||valorDistanciaCentros(circulo)==(double)(radio-circulo.getRadio());	
		}
	
	public boolean sonSecants(Circulo circulo) {
		return valorDistanciaCentros(circulo)==(double)(radio+circulo.getRadio());
		}
	
	public boolean noEsToquen(Circulo circulo) {
		return valorDistanciaCentros(circulo)>(double)(radio+circulo.getRadio());
		}
	
	
	
	
}

	