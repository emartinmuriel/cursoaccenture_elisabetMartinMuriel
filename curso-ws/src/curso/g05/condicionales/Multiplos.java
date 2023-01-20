package curso.g05.condicionales;
/**
 * Ejercicio múltiplos
 * @author e.a.martin.muriel
 *
 */
public class Multiplos {
/**
 * El metodo main
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		boolean multiplo = esMultiplo(0, 2);
		System.out.println(multiplo);

	}
	/**
	 * El metodo esMultiplo
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static boolean esMultiplo (int num1, int num2) {
		boolean esMult =false;
		
		if (num1!=0 && num2!=0) {
			//Consideramos los múltiplos negativos
			if (num1<0) {
				num1=num1*(-1);
			}else if (num2<0) {
				num2=num2*(-1);
			}
			//Validamos los múltiplos
			if ((num1>num2 && num1%num2==0) || (num2>num1 && num2%num1==0)) {
				esMult =true;
			}
		}else {
			esMult =true;
		}
				
		return esMult;
	}

}
