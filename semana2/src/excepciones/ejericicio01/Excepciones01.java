package excepciones.ejericicio01;
/**
 * Ejericicios clase: Excepciones01
 * @author e.a.martin.muriel
 *
 */
public class Excepciones01 {

	public static void main(String[] args) {// throws MiExepcion { //HAy que crear la clase MiExcepcion, que heredará de JavaRunTimeException, ya que se mandará directamente a la JVM
		// TODO Auto-generated method stub
		int a=0;
		int b=300;
		
		try {
			calcular(a,b);
		}catch(ArithmeticException e){
			//throw new Exception("Este error lo lanza una excepcion propia"); //Lanzando la excepcion para tratarla a un nivel superior
			//System.err.println("Excepcion message desde main: " + e);
			
		}finally {
			System.err.println("Programa cerrado desde main");
		}
	}
	
	
	public static void calcular(int a, int b) throws ArithmeticException {
		int resultado;
		try {
			resultado = b/a;
	
		}
		catch(ArithmeticException e) {
			throw new ArithmeticException(); //Lanzando la excepcion para tratarla a un nivel superior
			//System.err.println("Excepcion message:"+e);
		}
		finally{
			System.out.println("Programa cerrado");
		}
		
		
	}
}
