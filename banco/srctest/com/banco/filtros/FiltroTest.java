package com.banco.filtros;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class FiltroTest {
	String cadPrueba = "Esto es una cadena de chorricientos carateres para pasar test";
	LocalDate fActual = LocalDate.now();
	LocalDate fAnterior= LocalDate.of(2022, 11, 23); 
	LocalDate fPosterior= LocalDate.of(2024, 11, 23);
	@Test
	void testminLength1() {

		assertTrue(Filtro.minLength("1234", 4));
	}

	@Test
	void testminLength2() {

		assertTrue(Filtro.minLength("1234", 2));
	}
	@Test
	void testminLength3() {

		assertFalse(Filtro.minLength("1234", 10));
	}
	
	@Test
	void testMaxLength1() {

		assertTrue(Filtro.maxLength("1234", 10));
	}
	
	@Test
	void testMaxLength2() {

		assertFalse(Filtro.maxLength("12345783", 4));
	}
	
	@Test
	void testFechaMaxima1() {
		
		assertTrue(Filtro.fechaMaxima(fActual,fPosterior));
	}
	@Test
	void testFechaMaxima2() {

		assertFalse(Filtro.fechaMaxima(fActual, fAnterior));
	}


	
}
