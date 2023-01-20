package curso.g05.condicionales;
/**
 * 
 * @author e.a.martin.muriel
 *
 */
public class FechaFiltro3 {
	/**
	 * El metodo main
	 * @param args
	 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int d =20;
			int m= 8;
			int a= 2015;
			
			boolean fechaCorrecta= fechaFiltro3(d ,m ,a );
			System.out.println("La fecha "+ d +"/" + m + "/" + a +" es valida?? >>" + fechaCorrecta);
			
		}
	/**
	 * metodo fechaFiltro2
	 * @param dia
	 * @param mes
	 * @param anio
	 * @return correcto(booleano)
	 */
		public static boolean fechaFiltro3(int dia, int mes, int anio) {
			int [] arrDiasMeses = {31,28,31,30,31,30,31,31,30,31,30,31};
			boolean correcto=true;
			if (anio==0) {			//Validar año
				correcto=false;
			}else { 				//Validar mes/dia
				
				if (dia<0 || dia>arrDiasMeses[mes-1]) {
					correcto=false;
				}
			}
			return correcto;
		}

}
