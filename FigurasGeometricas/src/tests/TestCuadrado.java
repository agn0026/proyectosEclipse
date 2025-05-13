package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import figuras.Cuadrado;

class TestCuadrado {
	static Cuadrado c;
	
	@BeforeAll
	static void setup() {
		c = new Cuadrado (2);
	}
	
	@Test
	void testException() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> new Cuadrado(-1));
		String mensajeEsperado = "El lado debe ser superior a 0";
		String mensajeObtenido = exception.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}


	@Test
	void testCalcularArea() {
		//Calculamos el area que nos da el metodo
		double areaObtenida = c.calcularArea();
		//Hardcodeamos el area que sabemos que deberia dar
		double areaEsperada = 4;
		assertEquals(areaEsperada, areaObtenida); //Si es correcto saldra verde sino rojo
	}
	
	//antes se ha comentado esta otra parte del test porque sino al estar incompleta daba incorrecto
	@Test
	void testCalcularPerimetro() {
		//Calculamos el perimetro que nos da el metodo
		double perimetroObtenida = c.calcularPerimetro();
		//Hardcodeamos el perimetro que sabemos que deberia dar
		double areaEsperada = 8;
		assertEquals(areaEsperada, perimetroObtenida); //el orden es importante
	}
	
}
