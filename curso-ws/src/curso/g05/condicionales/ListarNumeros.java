package curso.g05.condicionales;
/**
 * Ejercicio 6. Listar numeros de 1-100 de 23 en 23
 * @author e.a.martin.muriel
 *
 */
public class ListarNumeros { 
	/**
	 * El método main
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100; i>=1;i-=23) { 	//Decrementa el contador de 23 en 23
			System.out.println(i + ", ");
		}
	}

}
