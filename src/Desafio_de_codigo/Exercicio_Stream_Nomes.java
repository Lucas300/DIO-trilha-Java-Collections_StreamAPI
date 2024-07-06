package Desafio_de_codigo;

import java.util.Arrays;
import java.util.List;

public class Exercicio_Stream_Nomes {
    public static void main(String[] args) {
        // Lista de nomes
        List<String> names = Arrays.asList("Ana", "Bruno", "Carlos", "Daniela", "Eduardo", "Fernanda", "Gabriel", "Heloísa", "Isabela", "João");

        // Usando Stream API para filtrar nomes com mais de 5 letras
        names.stream()
             .filter(name -> name.length() > 5) // Filtra nomes com mais de 5 letras
             .forEach(System.out::println);    // Imprime cada nome que atende ao critério
    }
}