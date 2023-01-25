package com.banco.filtros;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class FiltroTest {
	String cadPrueba = "Esto es una cadena de chorricientos carateres para pasar test";
	LocalDate fActual = LocalDate.now();
	LocalDate fAnterior = LocalDate.of(2022, 11, 23);
	LocalDate fPosterior = LocalDate.of(2024, 11, 23);

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

		assertTrue(Filtro.fechaMaxima(fActual, fPosterior));
	}

	@Test
	void testFechaMaxima2() {

		assertFalse(Filtro.fechaMaxima(fActual, fAnterior));
	}

	@Test
	void testFechaValida1() {

		assertTrue(Filtro.fechaValida(fActual, fAnterior, fPosterior));
	}

	@Test
	void testFechaValida2() {

		assertTrue(Filtro.fechaValida(fActual, fActual, fPosterior));
	}

	@Test
	void testFechaValida3() {

		assertTrue(Filtro.fechaValida(fActual, fAnterior, fActual));
	}

	@Test
	void testFechaValida4() {

		assertTrue(Filtro.fechaValida(fActual, fActual, fActual));
	}

	@Test
	void testFechaValida5() {

		assertFalse(Filtro.fechaValida(fAnterior, fActual, fPosterior));
	}

	@Test
	void testlongitudValida1() {

		assertTrue(Filtro.longitudValida(cadPrueba, 10, 100));
	}

	@Test
	void testlongitudValida2() {

		assertFalse(Filtro.longitudValida(cadPrueba, 10, 15));
	}

}
