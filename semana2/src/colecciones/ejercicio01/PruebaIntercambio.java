package colecciones.ejercicio01;
/**
 * Ejercicio 1. Clase Prueba es un conductor con metotodo main para probar la clase Intercambio
 * @author e.a.martin.muriel
 *
 */
public class PruebaIntercambio {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad = "Esto es una cadena";
		Integer numero = 3;
		
		Intercambio obIntercambio = new Intercambio( cad, numero);	//Construir un objeto con dos objetos de tipo distinto
		
		
		System.out.println("Antes de intercambiar ******");
		System.out.println(obIntercambio.getObj1());
		System.out.println(obIntercambio.getObj2());
		
		obIntercambio.intercambia();								//Llama al método intercambia, que usando genéricos intercambia						
		
		System.out.println("Despues de intercambiar ******");
		System.out.println(obIntercambio.getObj1());
		System.out.println(obIntercambio.getObj2());

	}

}
