package interfaces.ejercicio07;

public interface InterFuncional {

	public int suma(int a, int b);

	public default int multiplicacion(int a, int b) {
		return a * b;
	}

	public default void saluda() {
		System.out.println("Hola que ase");
	}
}
