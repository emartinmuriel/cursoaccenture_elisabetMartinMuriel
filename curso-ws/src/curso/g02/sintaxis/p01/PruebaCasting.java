package curso.g02.sintaxis.p01;

public class PruebaCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =123;
		double numDouble= num; //Casting implícito
		float numFloat= num; //Casting implícito
		char numChar= (char)num;  //Casting explícito 
		short numShort=(short)num; //Casting explícito 
		byte numByte=(byte)num; //Casting explícito 
		
		String nombre;
		nombre ="Aurora";

		
		System.out.println(numChar);
	}

}
