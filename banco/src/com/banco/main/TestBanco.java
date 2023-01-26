package com.banco.main;

import java.time.LocalDate;

import com.banco.clases.*;
import com.banco.excepciones.ValidationException;

/**
 * Ejercicio Banco, clase TestBanco
 * 
 * @author e.a.martin.muriel
 *
 */
public class TestBanco {

	public static void main(String[] args) throws Exception {

		// Creamos una cuenta
		Cuenta miCuenta = new Cuenta("1111222233334444", "Elisabet Martin Muriel");
		miCuenta.ingresar(1200); // Voy a ingresar 1200 euros en la caja
		miCuenta.retirar(35); /*pero me olvido de que tenia que sacar 35 euros para comprar en la tienda, así
								 que lo saco pese a que el señor del banco me manda al cajero... pero no tengo tarjeta!! */

		System.out.println("EL saldo de la cuenta " + miCuenta.getNumero() + " es " + miCuenta.getSaldo() + " Euros");

		/* Como es un poco incomodo el tema de estar sacando, pido una tarjeta de debito
		 al banco para manejar mi cuenta*/
		LocalDate fechaActual = LocalDate.now();
		LocalDate fechaCaducidad = fechaActual.plusYears(5); // Creo que esto no es necesario, pero sonnar se me quejaba

		Debito miTarjeta = new Debito(fechaCaducidad, "5555666677778888", "Paquita Salas");
		miTarjeta.setCuentaAsociada(miCuenta);
		
		//Ahora ya puedo usar el cajero con mi tarjeta
		miTarjeta.ingresar(1000);
		System.out.println("EL saldo de la cuenta " + miCuenta.getNumero() + " es " + miCuenta.getSaldo() + " Euros");
		
		miTarjeta.retirar(40);
		System.out.println("EL saldo de la cuenta " + miCuenta.getNumero() + " es " + miCuenta.getSaldo() + " Euros");
		
		//Y hasta puedo pagar la cena en el bar
		miTarjeta.pagoEstablecimiento("La bodeguita de Nervion", 25);
		System.out.println("EL saldo de la cuenta " + miCuenta.getNumero() + " es " + miCuenta.getSaldo() + " Euros");
		
		
		
		//El banco me ha mandado a casa una tarjeta de crédito... vamos a activarla y fundirla!!
		Credito miTCredito = new Credito(fechaCaducidad, "2222666655558888", "Elisabet Martin", 1500);
		miTCredito.setCuentaAsociada(miCuenta);
		
		//miTCredito.ingresar(100);
		miTCredito.retirar(560);
		miTCredito.pagoEstablecimiento("Adidas", 78);
		miTCredito.pagoEstablecimiento("Carrefour", 10);
		miTCredito.pagoEstablecimiento("Carrefour", 20);
		
		//Vemos el saldo de la cuenta y de la tarjeta de credito

		System.out.println(miCuenta.toString());
		System.out.println(miTCredito.toString());
		//Ahora vamos a liquidar lo que hemos cargado
		
		//miTCredito.liquidar(1, 2023);
		
		miTCredito.liquidarStreams(1, 2023);

		System.out.println("<<< DESPUES DE LIQUIDAR TARJETA DE CRÉDITO... >>>");
		System.out.println(miCuenta.toString());
		System.out.println(miTCredito.toString());
		
		//Vamos a lanzar excepciones
		try {
			miCuenta.ingresar(-300);
		}
		catch (ValidationException e) {
			System.out.println(e.mostrar());
		}
	
		
	}

}
