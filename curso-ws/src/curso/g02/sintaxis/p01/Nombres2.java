package curso.g02.sintaxis.p01;

public class Nombres2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int $nombre;
		 int PasaDo;  //Esto no es un error de sintaxis, aunque no es practica recomendable empezar variable por mayuscula.
		 int alcance; // faltaba ;
		 
		 int _contador;
		 _contador=25;
		 
		 $nombre=_contador;
		 PasaDo=_contador; // la variable está mal escrita, lo sé, pero es un error de mala praxis no de sintaxis.

		 System.out.println($nombre + " / " + _contador);
	}
}
