package curso.g04.operadores;

public class Contadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  valor=0;
		valor=23;
		valor+=10;
		
		System.out.println("a vale: " + --valor); //32
		System.out.println("b vale: " + ++valor); //33
		System.out.println("c vale: " +  valor++); //33
		System.out.println("d vale: " + valor--); //34
		System.out.println("e vale: " + valor); //33
		
	}

}
