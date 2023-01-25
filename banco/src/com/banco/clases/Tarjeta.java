package com.banco.clases;

import java.time.LocalDate;

/**
 * La clase abstracta Tarjeta
 * @author e.a.martin.muriel
 *
 */
public abstract class Tarjeta {
	protected Cuenta cuentaAsociada;
	protected LocalDate fechaCaducidad;
	protected String numero;
	protected String titular;
	//Constructores 
	protected Tarjeta() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected Tarjeta(LocalDate fechaCaducidad, String numero, String titular) {
		super();
		this.fechaCaducidad = fechaCaducidad;
		this.numero = numero;
		this.titular = titular;
	}
	
	//Getters & Setters
	public Cuenta getCuentaAsociada() {
		return cuentaAsociada;
	}
	public void setCuentaAsociada(Cuenta cuentaAsociada) {
		this.cuentaAsociada = cuentaAsociada;
	}

	
	//Métodos abstractos 
	public abstract double getSaldo();
	public abstract void ingresar(double cantidad);
	public abstract void retirar (double cantidad);
	public abstract void pagoEstablecimiento(String concepto,double cantidad);

}
