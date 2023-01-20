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
		int [] diasAnio = {31,28,31,30,31,30,31,31,30,31,30,31};
		int [][] arr= new int[5][7];
		int cont=1;
		
		/*arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[0][3]=4;
		arr[0][4]=5;
		arr[0][5]=6;
		arr[0][6]=7;
		arr[0][7]=8;
		arr[0][8]=9;
		arr[0][9]=10;
		arr[1][0]=11;
		arr[1][1]=12;
		arr[1][2]=13;*/
		
		/*
		 * Actualización: Inicializar Array con secuencia de 1-31 con un bucle
		 */
		for (int i=0; i<arr.length && cont<=31 ; i++) {
			for (int j=0; j<arr[0].length && cont<=31;j++) {
				arr[i][j]=cont;
				System.out.println(arr[i][j]);
				cont++;
			}
		}
		
	}

}
