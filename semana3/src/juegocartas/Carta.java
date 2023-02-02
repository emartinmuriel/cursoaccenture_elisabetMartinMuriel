package juegocartas;

public class Carta {
	private String palo;
	private int num;

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void pintaCarta() {
		System.out.println("  ___________________");
//		System.out.println(" |                   |");
		if (this.num < 10) {
			System.out.println(" |   " + this.num + "  " + this.palo + "    |");
		} else {
			System.out.println(" |  " + this.num + "  " + this.palo + "    |");
		}

//		System.out.println(" |                   |");
		System.out.println("  ___________________");

	}

	@Override
	public String toString() {
		return "Carta: " + this.num + " de " + this.palo;
	}
}
