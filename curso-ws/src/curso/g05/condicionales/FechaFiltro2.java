package curso.g05.condicionales;
/**
 * 
 * @author e.a.martin.muriel
 *
 */
public class FechaFiltro2 {
	/**
	 * El metodo main
	 * @param args
	 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int d =20;
			int m= 8;
			int a= 2015;
			
			boolean fechaCorrecta= fechaFiltro2(d ,m ,a );
			System.out.println("La fecha "+ d +"/" + m + "/" + a +" es valida?? >>" + fechaCorrecta);
			
		}
	/**
	 * metodo fechaFiltro2
	 * @param dia
	 * @param mes
	 * @param anio
	 * @return correcto(booleano)
	 */
		public static boolean fechaFiltro2(int dia, int mes, int anio) {
			boolean correcto=true;
			if (anio==0) {			//Validar año
				correcto=false;
			}else { 				//Validar mes/dia
				switch (mes) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
						if (dia<0 && dia>31) { 	
							correcto=false;
						}
					break;
					case 2:
						if (dia<0 && dia>28) { 	
							correcto=false;
						}
					break;

					case 4:
					case 6:
					case 9:
					case 11:
						if (dia<0 && dia>30) { 	
							correcto=false;
						}
					break;
					default:
						correcto=false;
					break;
				}
			}
			return correcto;
		}
}
