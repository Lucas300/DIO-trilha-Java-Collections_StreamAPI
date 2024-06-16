package Stream_API;

import java.util.ArrayList;
import java.util.List;


public class Consumer {
	public class Main {
	    public static void main(String[] args) {
	        // Criação de uma lista de strings
	        List<String> frutas = new ArrayList<>();
	        frutas.add("Maçã");
	        frutas.add("Banana");
	        frutas.add("Laranja");
	        frutas.add("Morango");

	        // Definição de um Consumer que imprime cada elemento em maiúsculas
	        java.util.function.Consumer<String> printInUpperCase = s -> System.out.println(s.toUpperCase());

	        // Usando o Consumer com forEach para imprimir cada fruta em maiúsculas
	        frutas.forEach(printInUpperCase);
	    }
	}
}
