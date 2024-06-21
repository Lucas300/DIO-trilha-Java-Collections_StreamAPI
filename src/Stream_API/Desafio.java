package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Desafio {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		BinaryOperator<Integer> somar = Integer::sum;
		
		int soma = numeros.stream().reduce(0, Integer::sum);
		
		
		List<Integer> crescente = numeros.stream().sorted().collect(Collectors.toList());
		
		int somarPares =numeros.stream().filter(num -> num % 2 == 0).reduce(0, Integer::sum);
		
		
		System.out.println("A soma dos números é: "+soma);
		System.out.println("A ordem crescente dos números é: "+crescente);
		System.out.println("A soma dos números pares é: "+somarPares);

	}

}
