package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		//Criar uma lista de numeros inteiros 
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
		
		//Usar o Consumer com expressão lambda para imprimir numeros pares
		Consumer<Integer> imprimirNumeroPar = numero -> {
			if(numero % 2 == 0) {
				System.out.println(numero);
			}
		};
		
		//Usar o Consumer para imprimir numeros pares no Strem 
		//podemos usar o dentro do forEach o Consumer ImprimirNumeroPar ou a função lambda
		numeros.forEach(n -> {
			if(n % 2 == 0) {
				System.out.println(n);
			}
			});
	}
}
