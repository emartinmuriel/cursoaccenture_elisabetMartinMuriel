package com.banco.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.banco.constans.*;
import com.banco.excepciones.ValidationException;
import com.banco.filtros.FiltrosBanco;

/**
 * La clase Crédito que hereda de la clase abstracta Tarjeta
 * 
 * @author e.a.martin.muriel
 *
 */
public class Credito extends Tarjeta {

	private double credito;
	private Vector<Movimiento> movimientos;

	// constructor
	public Credito() {
		super();
		this.movimientos = new Vector<Movimiento>();
	}

	public Credito(double credito) {
		super();
		this.credito = credito;
		this.movimientos = new Vector<Movimiento>();
	}

	public Credito(LocalDate fechaCaducidad, String numero, String titular) {
		super(fechaCaducidad, numero, titular);
		this.movimientos = new Vector<Movimiento>();

	}

	public Credito(LocalDate fechaCaducidad, String numero, String titular, double credito) {
		super(fechaCaducidad, numero, titular);
		this.credito = credito;
		this.movimientos = new Vector<Movimiento>();
	}

	// métodos abstractos implementados
	/**
	 * El método getSaldo()
	 */
	@Override
	public double getSaldo() {
		double saldo = 0;
		double creditoConsumido = 0;
		for (Movimiento movimiento : this.movimientos) {
			if (movimiento != null) {
				creditoConsumido += movimiento.getImporte();
			}
		}
		saldo = this.credito + creditoConsumido;
		return saldo;
	}

	@Override
	public void ingresar(double cantidad) throws ValidationException {
		FiltrosBanco.cantidadPositiva(cantidad); // Lanzará una excepción
		LocalDate fecha = LocalDate.now();
		Movimiento ingreso = new Movimiento("Ingreso", fecha, cantidad);
		this.movimientos.add(ingreso);

	}

	@Override
	public void retirar(double cantidad) throws ValidationException { // la cantidad siempre viene en positivo

		FiltrosBanco.cantidadPositiva(cantidad); // Lanzará una excepción

		double porcentajeInteres = Constans.INTERES_TIPO_5 / 100;
		double comision = cantidad * porcentajeInteres;
		if (comision < 3.00) {
			comision = 3.00;
		}
		if (this.getSaldo() < (cantidad + comision)) {
			System.out.println("Error: Límite de crédito excedido. Crédito disponible " + this.getSaldo() + " Euros");
		} else {

			LocalDate fecha = LocalDate.now();
			Movimiento retirada = new Movimiento("Retirada En cuenta asociada (cajero automático)", fecha,
					(cantidad + comision) * (-1.00));
			this.movimientos.add(retirada);
		}

	}

	@Override
	public void pagoEstablecimiento(String concepto, double cantidad) throws ValidationException {
		FiltrosBanco.cantidadPositiva(cantidad); // Lanzará una excepción

		if (this.getSaldo() < cantidad) {
			throw new ValidationException(
					"Límite de crédito excedido. Crédito disponible " + this.getSaldo() + " Euros");
		} else {
			LocalDate fecha = LocalDate.now();
			Movimiento retirada = new Movimiento("Compra a Crédito en " + concepto, fecha, cantidad * (-1.00));
			this.movimientos.add(retirada);
		}
	}

	// Métodos de la clase
	/**
	 * 
	 * @param mes
	 * @param año
	 */
	public void liquidar(int mes, int anio) {

		double creditoConsumido = 0;
		// Esto siguiente se puede hacer con iterator
		Iterator<Movimiento> it = this.movimientos.iterator();
		while (it.hasNext()) {

			Movimiento movimiento = it.next();
			if (movimiento != null && movimiento.getFecha().getMonthValue() == mes
					&& movimiento.getFecha().getYear() == anio) {
				creditoConsumido += movimiento.getImporte(); // Añado al crédito consumido

				// Ahora elimina el movimiento del vector
				it.remove();
			}

		}

		LocalDate fecha = LocalDate.now();
		Movimiento liquidacionTarjeta = new Movimiento("Liquidación Tarjeta", fecha, creditoConsumido);

		super.getCuentaAsociada().addMovimiento(liquidacionTarjeta); // añade el movimiento en liquidación a la tarjeta}
	}

	/**
	 * Método liquidarStreams. Hace los mismo que liquidar pero implementando el uso
	 * de Streams
	 * 
	 * @param mes
	 * @param anio
	 */
	public void liquidarStreams(int mes, int anio) {
		double creditoConsumido = 0.0;

		// Haciendolo con streams
		creditoConsumido = this.movimientos.stream()
				.filter(e -> e.getFecha().getYear() == anio && e.getFecha().getYear() == mes) // primero filtro los
																								// movimientos de la
																								// fecha
				.map(Movimiento::getImporte) // tomo el importe de cada uno
				.reduce(0d, (subTotal, importeMov) -> subTotal + importeMov); // importeMov es cada elemento que filtra
																				// del map

		// Recuperar los vectores a Eliminar
		List<Movimiento> listMovAEliminar = this.movimientos.stream()
				.filter(e -> e.getFecha().getYear() == anio && e.getFecha().getYear() == mes) // primero filtro los
																								// movimientos de la
																								// fecha
				.collect(Collectors.toList());

		// Agregar la nueva lista de vectores
		Vector<Movimiento> vecMovEliminar = new Vector<Movimiento>(listMovAEliminar);
		this.movimientos.removeAll(vecMovEliminar);

		LocalDate fecha = LocalDate.now();
		Movimiento liquidacionTarjeta = new Movimiento("Liquidación Tarjeta", fecha, creditoConsumido);

		super.getCuentaAsociada().addMovimiento(liquidacionTarjeta);
	}

	@Override
	public String toString() {
		String res = "DATOS DE LA TARJETA DE CREDITO\n_______________________________________\n Numero de tarjeta: "
				+ super.numero + "\n Titular de la tarjeta: " + super.titular + "\nCuenta Asociada :"
				+ super.cuentaAsociada.getNumero() + "\nFecha de caducidad: " + super.fechaCaducidad
				+ "\nLimite de Crédito:" + this.credito + "\nCredito disponible: " + this.getSaldo();
		res += "\n ********** Movimientos Pendientes de Liquidación ********** ";

		// Metemos movimientos
		if (this.movimientos.isEmpty()) {
			res += "\n** No hay movimientos pendientes";
		} else {
			for (Movimiento mov : this.movimientos) {
				res += "\n" + mov.toString();
			}
			res += "\n ****************************************";
		}
		return res;
	}

}
