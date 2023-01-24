package com.banco.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

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
	public void ingresar(double cantidad) {
		LocalDate fecha = LocalDate.now();
		Movimiento ingreso = new Movimiento("Ingreso", fecha, cantidad);
		this.movimientos.add(ingreso);

	}

	@Override
	public void retirar(double cantidad) { // la cantidad siempre viene en positivo

		double comision = cantidad * 0.03;
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
	public void pagoEstablecimiento(String concepto, double cantidad) {
		if (this.getSaldo() < cantidad) {
			System.out.println("Error: Límite de crédito excedido. Crédito disponible " + this.getSaldo() + " Euros");
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

		for (int i = 0; i < this.movimientos.size(); i++) {
			Movimiento movimiento = this.movimientos.elementAt(i);
			if (movimiento != null && movimiento.getFecha().getMonthValue() == mes
					&& movimiento.getFecha().getYear() == anio) {
				creditoConsumido += movimiento.getImporte(); // Añado al crédito consumido

				// Ahora elimina el movimiento del vector
				this.movimientos.remove(i);
			}
		}

		LocalDate fecha = LocalDate.now();
		Movimiento liquidacionTarjeta = new Movimiento("Liquidación Tarjeta", fecha, creditoConsumido);

		super.getCuentaAsociada().addMovimiento(liquidacionTarjeta); // añade el movimiento en liquidación a la tarjeta}
	}

}
