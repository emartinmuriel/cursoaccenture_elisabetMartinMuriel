package curso.g04.operadores;
/**
 * Ejercicio para calcular area y longitud
 * @author e.a.martin.muriel
 * 
 */
public class Circunferencia {
	
	
/**
 * el método main
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radio=35;
		double area;
		double l;
	
		
		area= Math.PI * (radio*radio); //Cálculos
		l= 2 * Math.PI * radio;
		
		System.out.println("El radio de la circunferencia es : " + radio);
		System.out.println("La longitud de la circunferencia es : " + l);
		System.out.println("El área del circulo es : " + area);	
	}

}
