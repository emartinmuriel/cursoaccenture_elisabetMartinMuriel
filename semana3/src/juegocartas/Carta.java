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
	
	@Override
	public String toString() {
		return "Carta: " + this.num + " de " + this.palo;
	}
}
