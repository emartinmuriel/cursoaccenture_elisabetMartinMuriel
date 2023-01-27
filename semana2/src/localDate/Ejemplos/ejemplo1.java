package localDate.Ejemplos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Optional;

public class ejemplo1 {

	public static void main(String[] args) {

		String fecha = "1986-11-21"; // Ok
		String fecha2 = "90-3-12"; //
		String fecha3 = "15-04-1986"; // Si
		String fecha4 = "20-Enero-20"; // no
		String formato1 = "yyyy-mm-dd";
		String formato2 = "dd/MM/yy";

		LocalDate f1 = validaFormatoFecha(fecha, formato1);
		LocalDate f2 = validaFormatoFecha(fecha3);
		

//		System.out.println(validaFormatoFecha(fecha, formato1));
//		System.out.println(validaFormatoFecha(fecha3).toString());
		// System.out.println(validaFormatoFecha(fecha2, formato1));
//		System.out.println(validaFormatoFecha(fecha, formato1).toString());
//		System.out.println(validaFormatoFecha(fecha, formato1).toString());

	}

	public static LocalDate validaFormatoFecha(String fecha, String formato) {
		// Optional<LocalDate> fechaValida = Optional.empty(); //Solucion con Optional

		try {
			DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern(formato);
			LocalDate fechaNueva = LocalDate.parse(fecha, formatoFecha);
			System.out.println(fechaNueva.toString());
			return fechaNueva;
		} catch (DateTimeParseException e) {
			
		}
		return null;
	}

	public static LocalDate validaFormatoFecha(String fecha) {
		return validaFormatoFecha(fecha, "dd-mm-YYYY");
	}
}
