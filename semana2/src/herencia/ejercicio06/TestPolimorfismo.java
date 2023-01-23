package herencia.ejercicio06;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPolimorfismo {

	public static void main(String[] args) {
		String[] asignaturasIniciales = { "Biología", "Ciencias de la Tierra", "Matemáticas", "Química", "Física",
				"Laboratorio" };
		Alumno persona1 = new Alumno(2, (ArrayList<String>) Arrays.asList(asignaturasIniciales));
		Profesor persona2 = new Profesor((float) 3450.5, "22/12/2021");

		// Mostrar por pantalla
		persona1.mostrar();
		persona2.mostrar();
	}

}
