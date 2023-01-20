package curso.g02.sintaxis.p01;

public class Nombres3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int $nombre;
		 int pasado;  //Esto no era un error de sintaxis, pero no es practica recomendable empezar variable por mayuscula.
		 int alcance; // faltaba ;
		 
		 int _contador;
		 _contador=25;
		 
		 $nombre=_contador;
		 pasado=_contador; // la variable está mal escrita, lo sé, pero es un error de mala praxis no de sintaxis.

		 System.out.println($nombre + " / " + _contador + "\nEn \"Java\" puede \n que tengamos que utilizar\n caracteres especiales");
	}

}
