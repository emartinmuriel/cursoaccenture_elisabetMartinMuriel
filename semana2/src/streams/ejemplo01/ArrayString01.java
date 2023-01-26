package streams.ejemplo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class ArrayString01 {

	public static void main(String[] args) {

		List<Integer> entrada = new ArrayList<Integer> (Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		Long max = entrada
				.stream() //Aqui crea un stream con el array list
				.mapToLong(x->x)
				.max().orElseThrow(NoSuchElementException::new);
		
		Long min = entrada
				.stream()
				.mapToLong(x->x)
				.min().orElseThrow(NoSuchElementException::new);
		
		

		
	}

}
