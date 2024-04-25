package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelos.Persona;
class TestPersona {

	
	@Test
	void testEdad0() {
		Persona p0 = new Persona("Fernando","Valbuena",0);
		String esperado = "Menor de edad";
		String obtenido = p0.MostrarEdad(p0);
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testEdad17() {
		Persona p17 = new Persona("Fernando","Valbuena",17);
		String esperado = "Menor de edad";
		String obtenido = p17.MostrarEdad(p17);
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testEdad18() {
		Persona p18 = new Persona("Fernando","Valbuena",18);
		String esperado = "Mayor de edad";
		String obtenido = p18.MostrarEdad(p18);
		assertEquals(esperado,obtenido);
	}
}
