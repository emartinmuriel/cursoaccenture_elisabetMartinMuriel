package curso.g01.cust;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		char c='A';
		double precio = 23.4;
		double iva = 0.16;
		double importeTotal;
		
		importeTotal=precio*iva+precio;
		
		System.out.println("Hola mundo!!");
		System.out.println("Pruebas de tipaje:");
		
		System.out.println("caracter:" + c);
		System.out.println("Equiv. unicode:" + (int)c);
		System.out.println("Importe total="+importeTotal);
		System.out.println("Lun\tMar\tMie");
		
		
		
		
	}

}
