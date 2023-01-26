package com.banco.clases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Optional;
import java.util.Vector;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import com.banco.excepciones.ValidationException;
import com.banco.filtros.FiltrosBanco;

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
		this.movimientos = new Vector<Movimiento>();
	}

	public Cuenta(String numero, String titular) throws ValidationException {
		super();
		if (FiltrosBanco.longitudTitular(titular)) {

			this.numero = numero;
			this.titular = titular;
			this.movimientos = new Vector<Movimiento>();
		} else {
			throw new ValidationException("La longitud del campo \"Titular\" no es correcta");
		}
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
	 * 
	 * @return El saldo actual de la cuenta
	 */
	public double getSaldo() {
		double saldo = 0.0;
		/*
		 * for (Movimiento movimiento : this.movimientos) { if (movimiento != null) {
		 * saldo += movimiento.getImporte(); } }
		 */

		// Haciendolo con streams
		saldo = this.movimientos.stream().map(Movimiento::getImporte).reduce(0d,
				(subTotal, importeMov) -> subTotal + importeMov); // importeMov es cada elemento que filtra del map

		return saldo;
	}

	/**
	 * 
	 * @param cantidad
	 */
	public void ingresar(double cantidad) throws Exception {
		this.ingresar("Ingreso", cantidad);
	}

	/**
	 * 
	 * @param concepto
	 * @param cantidad
	 */
	public void ingresar(String concepto, double cantidad) throws Exception {

		FiltrosBanco.cantidadPositiva(cantidad); // Lanzará una excepción
		LocalDate fecha = LocalDate.now();
		Movimiento ingreso = new Movimiento(concepto, fecha, cantidad);
		this.addMovimiento(ingreso);
	}

	/**
	 * 
	 * @param cantidad
	 */
	public void retirar(double cantidad) throws Exception {
		this.retirar("Retirada", cantidad);
	}

	/**
	 * 
	 * @param concepto
	 * @param cantidad
	 */
	public void retirar(String concepto, double cantidad) throws Exception {
		FiltrosBanco.cantidadPositiva(cantidad); // Lanzará una excepción
		LocalDate fecha = LocalDate.now();
		Movimiento retirada = new Movimiento(concepto, fecha, cantidad * (-1.00));
		this.addMovimiento(retirada);

	}

	// Métodos toString

	@Override
	public String toString() {
		String res = "DATOS DE LA CUENTA\n_______________________________________\n Numero de Cuenta: "
				+ this.getNumero() + "\n Titular: " + this.getTitular() + "\nSaldo :" + this.getSaldo();
		res += "\n ********** Movimientos en Cuenta ********** ";

		// Metemos movimientos
		if (this.movimientos.isEmpty()) {
			res += "\n** No hay movimientos en cuenta";
		} else {
			for (Movimiento mov : this.movimientos) {
				res += "\n" + mov.toString();
			}
			res += "\n ****************************************";
		}
		return res;
	}
}
