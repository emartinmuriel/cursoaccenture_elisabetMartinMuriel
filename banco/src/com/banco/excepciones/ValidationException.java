package com.banco.excepciones;

/**
 * Esta clas excepciones lanzará excepciones personalizadas
 * 
 * @author e.a.martin.muriel
 *
 */
public class ValidationException extends RuntimeException {

	String message;

	public ValidationException() {
		this.message = "Ha ocurrido una excepción de tipo ValidationException.";

	}

	public ValidationException(String message) {
		this.message = message;

	}

	public void show() {
		System.out.println("ValidationException Error: " + this.message);
	}

}
