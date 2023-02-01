package multitarea.ejerciciosclase01;

/**
 * Ejemplo del Slide 6. Multitarea
 * 
 * @author e.a.martin.muriel
 *
 */
public class EjemploThread01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mensaje m1 = new Mensaje();
		Mensaje m2 = new Mensaje();

		m1.setMensaje("mensaje desde 1");
		m2.setMensaje("mensaje desde 2");
		m1.start(); // con start. Se lanza el run, y el main sigue ejecutándose
		m2.start(); // Este el el tercer hilo. el sistema operativo se encarga de manejarlos e ir
					// asignando los tiempos de cada hilo.
		try {
			Thread.sleep(5000);
			m2.setMensaje("+++++++++++++++++++");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
