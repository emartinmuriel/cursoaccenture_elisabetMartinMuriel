package com.banco.clases;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MovimientoTest {
	String concepto = "Nuevo movimiento";
	LocalDate fecha = LocalDate.now();
	Double cantidad = 23.00;
	Movimiento mov = new Movimiento(concepto, fecha, cantidad);

	@Test
	void testMovimientoStringLocalDateDouble() {

		assertNotNull(mov);
	}

	@Test
	void testGetConcepto() {
		assertEquals(concepto, mov.getConcepto());
	}

	@Disabled
	@Test
	void testSetConcepto() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testGetFecha() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testSetFecha() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testGetImporte() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testSetImporte() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
