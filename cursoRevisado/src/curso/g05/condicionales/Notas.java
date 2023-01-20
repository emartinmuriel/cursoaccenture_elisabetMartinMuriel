package curso.g05.condicionales;
/**
 * Ejercicio Notas
 * @author e.a.martin.muriel
 *
 */
public class Notas {
/**
 * El metodo main
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota=6;
		
		switch (nota) {
		
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("INSUFICIENTE");
		break;
		case 5:
			System.out.println("SUFICIENTE");
		break;
		case 6:
			
		case 7:
			System.out.println("BIEN");
			break;
		case 8:
		case 9:
			System.out.println("NOTABLE");
			break;
		case 10:
			System.out.println("SOBRESALIENTE");
			break;	
		default:
		break;
		}
	}

}
