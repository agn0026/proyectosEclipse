package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import figuras.Cuadrado;

class TestCuadrado {

	@Test
	void testCalcularArea() {
		Cuadrado c = new Cuadrado (2);
		//Calculamos el area que nos da el metodo
		double areaObtenida = c.calcularArea();
		//Hardcodeamos el area que sabemos que deberia dar
		double areaEsperada = 4;
		assertEquals(areaEsperada, areaObtenida); //Si es correcto saldra verde sino rojo
	}
	
	//antes se ha comentado esta otra parte del test porque sino al estar incompleta daba incorrecto
	@Test
	void testCalcularPerimetro() {
		Cuadrado c = new Cuadrado (2);
		//Calculamos el perimetro que nos da el metodo
		double perimetroObtenida = c.calcularPerimetro();
		//Hardcodeamos el perimetro que sabemos que deberia dar
		double areaEsperada = 8;
		assertEquals(areaEsperada, perimetroObtenida); //el orden es importante
	}
	
}
