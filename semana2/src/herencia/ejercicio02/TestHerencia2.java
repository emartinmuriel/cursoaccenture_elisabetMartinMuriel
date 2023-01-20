package herencia.ejercicio02;
/**
 * La clase Pfresco. 
 * @author e.a.martin.muriel
 *
 */
public class TestHerencia2 {
/**
 * El método main
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pcaire producto1 = new Pcaire();
		PcNitro prod2 = new PcNitro("AF4", 8);
		Pcagua prod3 = new Pcagua(13);

		// Inicializar Objetos

		producto1.setFechaCaducidad("14/08/2022");
		producto1.setTempCongelacion(-35);
		producto1.setNumLote("L0000000001");
		producto1.setCo2(10);
		producto1.setH2oVapor(20.5);
		producto1.setOxigeno(15.5);
		producto1.setH2oVapor(50);
		
		prod3.setFechaCaducidad("14/11/2021");
		prod3.setTempCongelacion(-18);
		prod3.setNumLote("L0000000456");
	

		// Imprimimos productos
		producto1.mostrarInfo();  //Objeto completo
		prod2.mostrarInfo();  //Objeto incompleto, solo inicializados atributos clase hija
		prod3.mostrarInfo();	//Objeto de una subclase diferente
	}

}
