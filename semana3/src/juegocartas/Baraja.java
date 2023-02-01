package juegocartas;

import java.util.HashSet;
import java.util.Set;

/**
 * La clase Baraja. Guarda en una lista desordenada un mazo de cartas
 * 
 * @author e.a.martin.muriel
 *
 */
public class Baraja {
	static String[] palos = { "ORO", "COPAS", "ESPADAS", "BASTOS" };
	Set<Carta> mazo = new HashSet<Carta>();

	/**
	 * El Método barajarMazo. Inicializa el mazo de cartas de forma aleatoria
	 */
	public void barajarMazo() {
		
		for (int i = 0; i < 4; i++)
			for (int n = 1; n <= 12; n++) {
				Carta carta = new Carta();
				carta.setNum(n);
				carta.setPalo(palos[i]);

				this.mazo.add(carta);
			}
	}
}
