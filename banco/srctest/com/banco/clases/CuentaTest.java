package com.banco.clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CuentaTest {
	String titular = "Elisabet Martin Muriel";
	String numeroCuenta = "1111222233334444";
	Cuenta cuentaTest = new Cuenta(numeroCuenta, titular);

	@Test
	void testCuentaStringString1() {

		assertNotNull(cuentaTest);
	}

	@Disabled
	@Test
	void testGetMovimientos() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testSetMovimientos() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNumero() {
		assertEquals(numeroCuenta, cuentaTest.getNumero());
	}


	@Test
	void testSetNumero() {
		String numCuenta = "0000222255557777";
		Cuenta miCuenta = new Cuenta(numCuenta,titular);
		miCuenta.setNumero(numCuenta);
		assertEquals(numCuenta, miCuenta.getNumero());
	}

	@Test
	void testGetTitular() {
		assertEquals(titular, cuentaTest.getTitular());
	}

	@Test
	void testSetTitular() {
		String tit = "0000222255557777";
		Cuenta otraCuenta = new Cuenta(numeroCuenta,tit);
		otraCuenta.setTitular(tit);
		assertEquals(tit, otraCuenta.getTitular());
	}

	@Test
	void testAddMovimiento1() {
		fail("Not yet implemented");
	}

	@Test
	void testAddMovimiento2() {
		fail("Not yet implemented");
	}
	@Test
	void testAddMovimiento3() {
		fail("Not yet implemented");
	}
	@Test
	void testGetSaldo() {
		fail("Not yet implemented");
	}

	@Test
	void testIngresarDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testIngresarStringDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testRetirarDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testRetirarStringDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
