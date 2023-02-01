package multitarea.ejercicios03;

public class Buffer {
	private boolean disponible;
	private int num;

	public boolean esDisponible() {
		return this.disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = false;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
