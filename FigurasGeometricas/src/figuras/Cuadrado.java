package figuras;

/**
 * Clase que implementa un cuadrado y sus funciones
 * 
 * @author Adrián
 */

public class Cuadrado {
	private double lado;
	
	/**
	 * Crea un cuadrado con el lado especificado en metros
	 * 
	 * @param lado
	 */
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	/**
	 * Crea un cuadrado con el lado de 1 metros
	 */
	public Cuadrado() {
		this.lado = 1;
	}
	
	/**
	 * Calcula el area de un cuadrado
	 * 
	 * @return el area del cuadrado en metros cuadrados
	 */
	public double calcularArea() {
		return this.lado*this.lado;
	}
	
	/**
	 * Calcula el perimetro de un cuadrado
	 * 
	 * @return el perimetro del cuadrado en metros
	 */
	public double calcularPerimetro() {
		return this.lado*4;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public String toString() {
		return "Cuadrado: de lado " + this.lado;
	}

}
