package curso.g05.condicionales;

public class FechaFiltro4 {
	/**
	 * El metodo main
	 * @param args
	 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int d =30;
			int m= 2;
			int a= 2005;
			
			boolean fechaCorrecta= fechaFiltro4(d ,m ,a );
			System.out.println("La fecha "+ d +"/" + m + "/" + a +" es valida?? >>" + fechaCorrecta);
			
		}
	/**
	 * metodo fechaFiltro2
	 * @param dia
	 * @param mes
	 * @param anio
	 * @return correcto(booleano)
	 */
		public static boolean fechaFiltro4(int dia, int mes, int anio) {
			int [] arrDiasMeses = {31,28,31,30,31,30,31,31,30,31,30,31};
			boolean correcto=true;
			if (anio==0) {			//Validar año
				correcto=false;
			}else { //Validar mes/dia
				
				if (mes==2) { //Comprobar bisiesto
					if ((anio%4==0&&anio%100!=0) && (dia<0 || dia>29)) { // si el año es bisiesto
						correcto=false;
					}else {
						if((anio%4!=0)&& (dia<0 || dia>28)) {  //si no lo es
							correcto=false;
						}
					}
					
				}else { 
					if (dia<0 || dia>arrDiasMeses[mes-1]) {
						correcto=false;
					}
				}
			}
			return correcto;
		}

}
