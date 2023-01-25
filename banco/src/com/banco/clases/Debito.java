package com.banco.clases;

import java.time.LocalDate;

import com.banco.excepciones.ValidationException;
import com.banco.filtros.FiltrosBanco;

/**
 * La clase Débito que hereda de la clase abstracta Tarjeta
 * 
 * @author e.a.martin.muriel
 *
 */
public class Debito extends Tarjeta {

	// Constructor

	public Debito() {
		super();
	}

	public Debito(LocalDate fechaCaducidad, String numero, String titular) {
		super(fechaCaducidad, numero, titular);
	}

	@Override
	public double getSaldo() { // Utiliza los movimientos de la cuenta asociada.
		return super.getCuentaAsociada().getSaldo();

	}

	@Override
	public void ingresar(double cantidad) {
		LocalDate fecha = LocalDate.now();
		Movimiento ingreso = new Movimiento("Ingreso", fecha, cantidad);
		super.getCuentaAsociada().addMovimiento(ingreso);
	}

	@Override
	public void retirar(double cantidad) throws ValidationException {
		FiltrosBanco.cantidadPositiva(cantidad); // Lanzará una excepción
		LocalDate fecha = LocalDate.now();
		Movimiento retirada = new Movimiento("Retirada", fecha, cantidad * (-1.00));

		super.getCuentaAsociada().addMovimiento(retirada);
	}

	@Override
	public void pagoEstablecimiento(String concepto, double cantidad) throws ValidationException {
		FiltrosBanco.cantidadPositiva(cantidad); // Lanzará una excepción
		if (this.cuentaAsociada.getSaldo() < cantidad) {
			throw new ValidationException(
					"Límite de crédito excedido. Crédito disponible " + this.getSaldo() + " Euros");
		} else {
			LocalDate fecha = LocalDate.now();
			Movimiento pago = new Movimiento("Pago Establecimiento", fecha, cantidad * (-1.00));

			super.getCuentaAsociada().addMovimiento(pago);
		}
	}

}
