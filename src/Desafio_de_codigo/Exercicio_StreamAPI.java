package Desafio_de_codigo;

import java.util.Arrays;
import java.util.List;

public class Exercicio_StreamAPI {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)      // Filtra os números pares
                .mapToInt(n -> n * 2)         // Multiplica cada número por 2
                .sum();                       // Soma todos os valores resultantes

        System.out.println("A soma dos números pares multiplicados por 2 é: " + sum);
    }
}
