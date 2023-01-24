package com.banco.clases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Vector;

/**
 * La clase Cuenta
 * 
 * @author e.a.martin.muriel
 *
 */
public class Cuenta {
	private Vector<Movimiento> movimientos;
	private String numero;
	private String titular;

	// constructores
	public Cuenta() {
		super();

	}

	public Cuenta(String numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}

	// Getters &Setters
	public Vector getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(Movimiento movimiento) {
		movimientos.add(movimiento);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	// Métodos de la clase
	/**
	 * 
	 * @param movimiento
	 */
	public void addMovimiento(Movimiento movimiento) {
		this.movimientos.add(movimiento);
	}

	/**
	 * EL método getSaldo
	 * @return El saldo actual de la cuenta
	 */
	public double getSaldo() {
		double saldo = 0;
		for (Movimiento movimiento : this.movimientos) {
			if (movimiento!=null) {
				saldo+= movimiento.getImporte();
			}
		}
		return saldo;
	}

	/**
	 * 
	 * @param cantidad
	 */
	public void ingresar(double cantidad) {
		LocalDate fecha = LocalDate.now();
		Movimiento ingreso = new Movimiento("Ingreso", fecha, cantidad);

		this.addMovimiento(ingreso);
	}

	/**
	 * 
	 * @param concepto
	 * @param cantidad
	 */
	public void ingresar(String concepto, double cantidad) {
		LocalDate fecha = LocalDate.now();
		Movimiento ingreso = new Movimiento(concepto, fecha, cantidad);

		this.addMovimiento(ingreso);
	}

	/**
	 * 
	 * @param cantidad
	 */
	public void retirar(double cantidad) {
		LocalDate fecha = LocalDate.now();
		Movimiento retirada = new Movimiento("Retirada", fecha, cantidad);

		this.addMovimiento(retirada);
	}

	/**
	 * 
	 * @param concepto
	 * @param cantidad
	 */
	public void retirar(String concepto, double cantidad) {
		LocalDate fecha = LocalDate.now();
		Movimiento retirada = new Movimiento(concepto, fecha, cantidad);

		this.addMovimiento(retirada);
	}
}
