package juegocartas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Partida partida= new Partida();
		
		Baraja mano = new Baraja();
		
		mano.barajarMazo();
		int i = 0;
		for (Carta carta : mano.mazo) {
			i++;
			System.out.println(i + ">> " + carta.toString());
		}
	}

}
