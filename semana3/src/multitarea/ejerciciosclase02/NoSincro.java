package multitarea.ejerciciosclase02;

public class NoSincro implements Runnable {

	static Integer n = 1; // Este objeto estático se compartirá con todas las instancias de la clase
							// NoSincro
	private String mensaje;
	
	public void setMensaje(String mensaje) {
		this.mensaje=mensaje;
	}
	
	public void run () {
		for (int i=0; i<10; i++) {
			System.out.println(this.mensaje + " " + n );
			n++;
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
