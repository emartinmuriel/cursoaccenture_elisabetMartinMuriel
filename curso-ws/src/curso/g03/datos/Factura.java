package curso.g03.datos;

public class Factura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cantidad=30;
		int unidades=15;
		double precio=15.99;
		double importe;
		float iva;
		int total;
		
		
		importe = cantidad*unidades*precio;
		iva= (float) (importe * 0.21);
		total = (int)(importe * 1.21);
		
		System.out.println("Cantidad:\t"+ cantidad +"\nUnidades:\t"+ unidades + "\nPrecio:\t"+ precio + "\nImporte:\t"+ importe + "\nIVA:\t" + iva + "\nTOTAL:\t"+total);

	}

}
