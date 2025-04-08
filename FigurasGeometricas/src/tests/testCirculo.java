package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import figuras.Circulo;
import figuras.Cuadrado;

class testCirculo {

	@Test
	void testCalcularArea() {
		Circulo c1 = new Circulo (2);
		double areaObtenida = Math.round(c1.calcularArea()*100)/100;
		double areaEsperada = Math.round(12.56*100)/100;
		assertEquals(areaEsperada, areaObtenida);
	}
	
	/*@Test
	void testCalcularPerimetro() {
		Circulo c1 = new Circulo (2);
		double perimetroObtenida = c1.calcularPerimetro();
		double areaEsperada = 8;
		assertEquals(areaEsperada, perimetroObtenida);
	}*/

}
