package figuras;

public class Circulo {
	private double radio;
	
	/**
	 * Crea un circulo con el radio especificado en metros
	 * 
	 * @param radio
	 */
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	/**
	 * Crea un circulo con el radio de 1 metros
	 */
	public Circulo() {
		this.radio = 1;
	}
	
	/**
	 * Calcula el area de un circulo
	 * 
	 * @return el area del circulo en metros cuadrados
	 */
	public double calcularArea() {
		return Math.PI*(this.radio*this.radio);
	}
	
	/**
	 * Calcula el perimetro de un circulo
	 * 
	 * @return el perimetro del circulo en metros
	 */
	public double calcularPerimetro() {
		return 2*Math.PI*this.radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public String toString() {
		return "Circulo: de radio " + this.radio;
	}

}
