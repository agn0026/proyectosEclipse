package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import figuras.Circulo;
import figuras.Cuadrado;

class testCirculo {
	static Circulo c1;
	
	@BeforeAll
	static void setup() {
		c1 = new Circulo (2);
	}

	@Test
	void testCalcularArea() {
		double areaObtenida = Math.round(c1.calcularArea()*100)/100;
		double areaEsperada = Math.round(12.56*100)/100;
		assertEquals(areaEsperada, areaObtenida);
	}
	
	@Test
	void testCalcularPerimetro() {
		double perimetroObtenido = Math.round(c1.calcularPerimetro()*100)/100;
		double areaEsperada = Math.round(12.56*100)/100;
		assertEquals(areaEsperada, perimetroObtenido);
	}

}
