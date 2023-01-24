package com.banco.clases;

import java.time.LocalDate;
import java.util.Vector;

/**
 * La clase Crédito que hereda de la clase abstracta Tarjeta
 * 
 * @author e.a.martin.muriel
 *
 */
public class Credito extends Tarjeta{

	private double credito;
	private Vector<Movimiento> movimientos;
	
	//constructor
	public Credito() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Credito(double credito, Vector<Movimiento> movimientos) {
		super();
		this.credito = credito;
		this.movimientos = movimientos;
	}

	public Credito(LocalDate fechaCaducidad, String numero, String titular) {
		super(fechaCaducidad, numero, titular);
		
	}

	//métodos abstractos implementados 
	/**
	 * El método getSaldo()
	 */
	@Override
	public double getSaldo() { 
		double saldo=0;
		double creditoConsumido=0;
		for (Movimiento movimiento : this.movimientos) {
			if (movimiento!=null) {
				creditoConsumido+= movimiento.getImporte();
			}
		}
		saldo= this.credito - creditoConsumido;
		return saldo;
	}
	
	@Override
	public void ingresar(double cantidad) {
		LocalDate fecha = LocalDate.now();
		Movimiento ingreso = new Movimiento("Ingreso", fecha, cantidad);
		this.movimientos.add(ingreso);
		
	}

	@Override
	public void retirar(double cantidad) { //la cantidad siempre viene en positivo
		if (this.getSaldo()<cantidad) {
			System.out.println("Error: Límite de crédito excedido. Crédito disponible " + this.getSaldo() + " Euros");
		}else {
			LocalDate fecha = LocalDate.now();
			Movimiento retirada = new Movimiento("Retirada", fecha, cantidad *(-1.00));
			this.movimientos.add(retirada);
		}

	}

	@Override
	public void pagoEstablecimiento(String concepto, int cantidad) {
		if (this.getSaldo()<cantidad) {
			System.out.println("Error: Límite de crédito excedido. Crédito disponible " + this.getSaldo()+ " Euros");
		}else {
			LocalDate fecha = LocalDate.now();
			Movimiento retirada = new Movimiento("Retirada", fecha, cantidad *(-1.00));
			this.movimientos.add(retirada);
		}
	}
	
	//Métodos de la clase
	/**
	 * 
	 * @param mes
	 * @param año
	 */
	public void liquidar(int mes, int anio) {
		
		double creditoConsumido=0;
		for (Movimiento movimiento : this.movimientos) {
			if (movimiento!=null) {
				creditoConsumido+= movimiento.getImporte();
			}
		}
		LocalDate fecha = LocalDate.now();
		Movimiento liquidacionTarjeta = new Movimiento ("Liquidación Tarjeta", fecha,creditoConsumido* (-1));

		super.getCuentaAsociada().addMovimiento(liquidacionTarjeta); //añade el movimiento en liquidación a la tarjeta
	} 

}
