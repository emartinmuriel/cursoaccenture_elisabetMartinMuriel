package TimeEjercicio02;

import java.time.LocalTime;

/**
 * Ejericio de clase.
 * @author e.a.martin.muriel
 *
 */
public class Cronometro {

	public static void main(String[] args) {
		LocalTime crono= LocalTime.of(0,0,0,0);
		try {
		for (int h=0; h<24;h++) {
			for(int m=0; m<60;m++) {
				for(int s=0;s<60;s++) {
					
					System.out.println(crono.toString());
					Thread.sleep(1000);
					crono=crono.plusSeconds(1);
				}
			}
		}
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
}
