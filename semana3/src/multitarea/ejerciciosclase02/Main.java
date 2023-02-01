package multitarea.ejerciciosclase02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoSincro s1 = new NoSincro();
		s1.setMensaje("Desde s1 ->");
		Thread hilo1 = new Thread(s1);

		NoSincro s2 = new NoSincro();
		s2.setMensaje("Desde s2 ->");

		Thread hilo2 = new Thread(s2);

		// Aquí empieza correr los neuvo s hilos
		hilo1.start();
		hilo2.start();

	}

}
