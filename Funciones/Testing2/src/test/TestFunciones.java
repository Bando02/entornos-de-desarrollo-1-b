package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Funciones;

class TestFunciones {

	/**
	 * Comprueba que el sumatorio de 0 es 0
	 */
	@Test
	void testSumatorio() {
		int esperado = 0;
		int obtenido = Funciones.sumatorio(0);
		assertEquals(esperado,obtenido);
	}
	
	/**
	 * Comprueba que el sumatorio de un numero valido cualquier es correcto
	 */
	@Test
	void TestSumatorio3(){
		int esperado = 6;
		int obtenido = Funciones.sumatorio(3);
		assertEquals(esperado,obtenido);
	}
	
	/**
	 * Comprueba que el sumatorio de un numero negativo lanza la excepcion
	 * esperada
	 */
	@Test
	void testSumatorioError() {
		Exception exception = assertThrows(IllegalArgumentException.class,
				() -> Funciones.sumatorio(-1));
		
		String esperado = "El numero debe ser mayor o igual a 0";
		String obtenido = exception.getMessage();
		assertEquals(esperado,obtenido);
	}

}
