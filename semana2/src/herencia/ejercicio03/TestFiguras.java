package herencia.ejercicio03;
/**
 * Ejercicio 3: Herencia 
 * 
 * @author e.a.martin.muriel
 *
 */
public class TestFiguras {

	public static void main(String[] args) {
		Triangulo tri =new Triangulo(4,5);
		Circulo cir = new Circulo(12);
		Cuadrado cua = new Cuadrado(12);
		
		//Inicializando punto de origen de alguna de las figuras
		cua.setPuntoOrigen(new Punto(3,4));
		cua.setInfoFigura(new Metadato("Cuadrado", "Ejemplo de cuadrado"));
		System.out.println("Las coordenas del punto son: x: "+ cua.getPuntoOrigen().getCoordenadaX() + " , y: "+cua.getPuntoOrigen().getCoordenadaY());
		
		
		//Calcular las areas
		
		tri.calcularArea();
		cir.calcularArea();
		cua.calcularArea();
		
		tri.dibujar();
		cir.dibujar();
		cua.dibujar();

	}

}
