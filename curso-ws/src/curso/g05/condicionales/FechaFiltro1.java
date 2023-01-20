package curso.g05.condicionales;
/**
 * Ejercicio para comparar fechas
 * @author e.a.martin.muriel
 *
 */
public class FechaFiltro1 {
/**
 * El metodo main
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d =20;
		int m= 8;
		int a= 2015;
		
		boolean fechaCorrecta= fechaFiltro1(d ,m ,a );
		System.out.println("La fecha "+ d +"/" + m + "/" + a +" es valida?? >>" + fechaCorrecta);
		
	}
/**
 * metodo fechaFiltro1
 * @param dia
 * @param mes
 * @param anio
 * @return correcto(booleano)
 */
	public static boolean fechaFiltro1(int dia, int mes, int anio) {
		boolean correcto=true;
		
		if (mes<0 || mes>12) {  //Validar mes
			correcto=false;
		}
		if (dia<0 && dia>30) { 	//Validar dia
			correcto=false;
		}
		if (anio==0) {			//Validar año
			correcto=false;
		}
		return correcto;
	}

}
