package curso.g03.datos;
/**
 * Ejercicios Arrays. 
 * @author e.a.martin.muriel
 *
 */
public class DatosArray {
/**
 * El método main
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= new int[5][7];
		int cont=1;
		
		/*
		 * Actualización: Inicializar Array con secuencia de 1-31 con un bucle
		 */
		for (int i=0; i<arr.length && cont<=31 ; i++) {
			for (int j=0; j<arr[0].length && cont<=31;j++,cont++) {
				arr[i][j]=cont;
				System.out.println(arr[i][j]);
			
			}
		}
		
	}

}
