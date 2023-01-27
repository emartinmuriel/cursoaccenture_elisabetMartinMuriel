package es.rf.tienda.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class ValidatorTest {

	final String ALFANUMERICO_TRUE = "dfkdfkj2323232323";
	final String ALFANUMERICO_FALSE = "\"dfkdfkj2232323-$\"";
	final String STRING_VACIO_TRUE = "";
	final String STRING_VACIO_TRUE_NULL= null;
	final String STRING_VACIO_FALSE = "Esta cadena no está vacia";
	final String TELEFONO_VALIDO1 = "616 11 11 170";
	final String TELEFONO_VALIDO2 = "6161111170";
	final String TELEFONO_VALIDO3 = "616 11 11 17345";
	final String TELEFONO_ERR_NODIGITOS = "1234467ejm8910";
	final String TELEFONO_ERR_CORTO = "123446789";
	final String TELEFONO_ERR_CORTO2 = "1 2 3 4 5 6 7 8   ";
	final String TELEFONO_ERR_LARGO = "1234467891012345678901234567890";
	final String EMAIL_VALIDO1 = "foo@goo.com";
	final String EMAIL_VALIDO2 = "foo.es@foo.es";
	final String EMAIL_ERR1= "foo.esfoo.es";
	final String EMAIL_ERR2= "@foo.es";
	final String EMAIL_ERR3= "foo.es@";
	final String EMAIL_ERR4= "@";
	final String EMAIL_ERR5_NOPUNTO = "foo@goo";
	final String EMAIL_ERR6_PUNTO = "foo@goo.";
	final int INT_1= 1;
	final int INT_3= 3;
	final int INT_9= 9;
	final double DOUBLE_3= 3.5;


	@Test
	void testIsAlfanumeric1() {

		assertTrue(Validator.isAlfanumeric(ALFANUMERICO_TRUE));
	}

	@Test
	void testIsAlfanumeric2() {
		assertFalse(Validator.isAlfanumeric(ALFANUMERICO_FALSE));
	}

	@Test
	void testIsVacio() {
		assertTrue(Validator.isVacio(STRING_VACIO_TRUE));
	}

	@Test
	void testIsVacio2() {
		assertTrue(Validator.isVacio(STRING_VACIO_TRUE_NULL));
	}
	@Test
	void testIsVacio3() {
		assertFalse(Validator.isVacio(STRING_VACIO_FALSE));
	}

	@Test
	void testCumplePhoneNumber1() {
		assertTrue(Validator.cumplePhoneNumber(TELEFONO_VALIDO1));
	}

	@Test
	void testCumplePhoneNumber2() {
		assertTrue(Validator.cumplePhoneNumber(TELEFONO_VALIDO2));
	}

	@Test
	void testCumplePhoneNumber3() {
		assertTrue(Validator.cumplePhoneNumber(TELEFONO_VALIDO3));
	}

	@Test
	void testCumplePhoneNumber4() {

		assertFalse(Validator.cumplePhoneNumber(TELEFONO_ERR_NODIGITOS));
	}
	@Test
	void testCumplePhoneNumber5() {

		assertFalse(Validator.cumplePhoneNumber(TELEFONO_ERR_CORTO));
	}
	@Test
	void testCumplePhoneNumber6() {

		assertFalse(Validator.cumplePhoneNumber(TELEFONO_ERR_CORTO2));
	}

	@Test
	void testIsEmailValido_1() {
		assertTrue(Validator.isEmailValido(EMAIL_VALIDO1));
	}
	@Test
	void testIsEmailValido_2() {
		assertTrue(Validator.isEmailValido(EMAIL_VALIDO2));
	}
	@Test
	void testIsEmailValido_3() {
		assertFalse(Validator.isEmailValido(EMAIL_ERR1));
	}
	@Test
	void testIsEmailValido_4() {
		assertFalse(Validator.isEmailValido(EMAIL_ERR2));
	}
	@Test
	void testIsEmailValido_5() {
		assertFalse(Validator.isEmailValido(EMAIL_ERR3));
	}
	
	@Test
	void testIsEmailValido_6() {
		assertFalse(Validator.isEmailValido(EMAIL_ERR4));
	}
	@Test
	void testIsEmailValido_7() {
		assertFalse(Validator.isEmailValido(EMAIL_ERR5_NOPUNTO));
	}
	@Test
	void testIsEmailValido_8() {
		assertFalse(Validator.isEmailValido(EMAIL_ERR6_PUNTO));
	}
	
	
	@Disabled
	@Test
	void testCumpleDNI() {
		fail("Not yet implemented");
	}

	
	@Test
	void testCumpleRangoIntIntInt_1() {
		assertTrue(Validator.cumpleRango(INT_3, INT_1,INT_9));
	}
	@Test
	void testCumpleRangoIntIntInt_2() {
		assertTrue(Validator.cumpleRango(INT_3, INT_3,INT_3));
	}
	@Test
	void testCumpleRangoIntIntInt_3() {
		assertFalse(Validator.cumpleRango(INT_1, INT_3,INT_9));
	}
	@Test
	void testCumpleRangoIntIntInt_4() {
		assertFalse(Validator.cumpleRango(INT_9, INT_1,INT_3));
	}

	@Disabled
	@Test
	void testCumpleRangoDoubleIntInt() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testCumpleLongitudMin() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testCumpleLongitudMax() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testCumpleLongitud() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testValDateMin() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testValDateMax() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testEsFechaValida() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testEsPasswordValida() {
		fail("Not yet implemented");
	}

}
