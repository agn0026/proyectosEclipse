package figuras;

public class Rectangulo {
	private double ladoAncho;
	private double ladoAltura;
	
	/**
	 * Crea un rectangulo con el ladoAncho y ladoAltura especificado en metros
	 * 
	 * @param lado
	 */
	public Rectangulo(double ladoAncho, double ladoAltura) {
		this.ladoAncho = ladoAncho;
		this.ladoAltura = ladoAltura;
	}
	
	/**
	 * Crea un rectangulo con el ladoAncho de 2 metros y el ladoAltura de 1 metros
	 */
	public Rectangulo() {
		this.ladoAncho = 2;
		this.ladoAltura = 1;
	}
	
	/**
	 * Calcula el area de un rectangulo
	 * 
	 * @return el area del rectangulo en metros cuadrados
	 */
	public double calcularArea() {
		return this.ladoAltura*this.ladoAncho;
	}
	
	/**
	 * Calcula el perimetro de un rectangulo
	 * 
	 * @return el perimetro del rectangulo en metros
	 */
	public double calcularPerimetro() {
		return this.ladoAltura+this.ladoAncho+this.ladoAltura+this.ladoAncho;
	}
	
	public void setLados(double ladoAncho, double ladoAltura) {
		this.ladoAncho = ladoAncho;
		this.ladoAltura = ladoAltura;
	}
	
	public double getLadoAncho() {
		return this.ladoAncho;
	}
	
	public double getLadoAltura() {
		return this.ladoAltura;
	}
	
	public String toString() {
		return "Rectangulo: de lado Ancho " + this.ladoAncho + " y de lado Altura " + this.ladoAltura;
	}

}
