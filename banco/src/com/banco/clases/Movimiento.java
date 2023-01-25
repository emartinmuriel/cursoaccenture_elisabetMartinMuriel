package com.banco.clases;

import java.time.LocalDate;
/**
 * La clase Movimiento. Ejercicio banco
 * @author e.a.martin.muriel
 *
 */
public class Movimiento {
	private String concepto;
	private LocalDate fecha;
	private double importe;

	// COnstructores
	public Movimiento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movimiento(String concepto, LocalDate fecha, double importe) {
		super();
		this.concepto = concepto;
		this.fecha = fecha;
		this.importe = importe;
	}

	// GEtters & Setters
	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	@Override 
	public String toString() {
		return "Fecha: " + this.getFecha() + " , Concepto: "+ this.getConcepto() + " , Importe : " + this.getImporte();
		 
	}

}
