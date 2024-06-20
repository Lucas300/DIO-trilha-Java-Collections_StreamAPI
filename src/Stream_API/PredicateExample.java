package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		List<String> palavras = Arrays.asList("Java","Javascript","kotlin","python","C","GO","Ruby");
		
		Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() < 5;
		
		palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);
		
	}
}
