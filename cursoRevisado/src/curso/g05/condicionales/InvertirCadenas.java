package curso.g05.condicionales;
/**
 * Ejercicio para invertir un array de strings
 * @author e.a.martin.muriel
 *
 */
public class InvertirCadenas {
/**
 * el método main
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String salida="";
		String invertida="";
		//Recoge los argumentos de entrada en una cadena
		for (String palabra : args) {
			salida= salida + palabra + " ";
		}

		//Invertir palabras
		String[]palabras= salida.split(" ");
		int tamanio= palabras.length;
		for (int i=tamanio-1; i>=0;i--) {
			invertida+=palabras[i]+ " ";
		}
		

		
		//Invertir caracteres en string
		int tamCadena= salida.length();
		String invertida2="";
		for (int i=tamCadena-1; i>=0; i--) {
			invertida2+= salida.charAt(i);
		}
		
		//Invertir carateres en string sustituyendo 
		String invertida3="";
		for (int i=tamCadena-1; i>=0; i--) {
			
			switch (salida.charAt(i)) {
			case 'a':
			case 'A':
				invertida3+= "1";
			break;
			
			case 'e':
			case 'B':
				invertida3+= "2";
				break;
			
			case 'i':
			case 'I':
				invertida3+= "3";
				break;
				
			case 'o':
			case 'O':
				invertida3+= "4";
				break;
			case 'u':
			case 'U':
				invertida3+= "5";
				break;
			default:
				invertida3+= salida.charAt(i);
				break;
			}		
		}
		
		//Lo mismo pero sin usar leng
		int tam;
		String frase ="&Esto es una frasesita&";
		char delimitador = frase.charAt(0);
		String invertida4="";
		
		for (tam=1;frase.charAt(tam)!=delimitador;tam++) {
			
			invertida4=frase.charAt(tam)+invertida4;
			
		}
		
		
		//Lo mismo pero sin usar leng ni delimitador
		int tam2;
		String frase2 ="Esto es una frasesita sin limites";
		frase2+=(char)0;
		String invertida5="";
		
		for (tam2=1;frase2.charAt(tam2)!=(char)0;tam2++) {
			
			invertida5=frase2.charAt(tam2)+invertida5;	
		}
		
		//Imprimir todas las respuestas 
		
		System.out.println("Frase recogida de los argumentos de entrada de metodo main\t" +salida);
		System.out.println("1. Frase con palabras invertidas \t\t" +invertida);
		System.out.println("2. Frase con caracteres invertidos\t\t" +invertida2);
		System.out.println("3. Frase invertida y sustituida\t\t" +invertida3);
		System.out.println("4. Frase invertida con delimitador\t\t" +invertida4);
		System.out.println("5. Frase invertida sin delimitador\t\t" + invertida5);
		
		
		
	}

}
