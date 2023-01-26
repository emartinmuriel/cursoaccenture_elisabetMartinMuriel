package localDate.Ejemplos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class ejemplo1 {

	public static void main(String[] args) {
		
		String fecha  = "1986-11-21";    //Ok
		String fecha2  = "90-3-12";     //
		String fecha3  = "15-04-1986"; //Si
		String fecha4  = "20-Enero-20"; //no
		String fecha5  = "dd/MM/yy";
		String fecha6  = "dd/MM/yy";
		String formato1 = "yyyy-mm-dd";
		String formato2 = "dd/MM/yy";
		
		
		System.out.println(validaFormatoFecha(fecha, formato1).toString());
		//System.out.println(Optional.ofNullable(validaFormatoFecha(fecha2, formato1).toString()).orElse("No es un formato de fecha correcto"));
		
		System.out.println("".toString());

	}
	public static LocalDate validaFormatoFecha (String fecha, String formato) {
		
	
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern(formato);
		
		//return LocalDate.parse(fecha,formatoFecha);//.format(formatoFecha);//.format(formatoFecha);
		LocalDate fechaValida = LocalDate.parse(fecha,formatoFecha);
		return fechaValida;
	}
	public static LocalDate validaFormatoFecha (String  fecha) {
		return validaFormatoFecha ( fecha, "dd-mm-YYYY");
	}
}
