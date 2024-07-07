package Desafio_de_codigo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiComecandoComALetra {
    public static void main(String[] args) {
        // Criação de uma lista de nomes
        List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Charles", "Amanda", "Brian");
        
        // Uso da Stream API com lambda expressions
        List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("A"))      // Filtra os nomes que começam com "A"
            .map(String::toUpperCase)                  // Converte cada nome para maiúsculas
            .collect(Collectors.toList());             // Coleta os resultados em uma nova lista
        
        // Impressão dos resultados
        System.out.println(filteredNames);
    }
}

