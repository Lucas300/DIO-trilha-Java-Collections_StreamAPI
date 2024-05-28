package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        // Criar uma lista de Strings
        List<String> listaDeFrutas = new ArrayList<>();

        // Adicionar elementos à lista
        listaDeFrutas.add("Maçã");
        listaDeFrutas.add("Banana");
        listaDeFrutas.add("Laranja");
        listaDeFrutas.add("Manga");

        // Acessar elementos na lista
        System.out.println("Primeira fruta: z" + listaDeFrutas.get(0));
        System.out.println("Segunda fruta: " + listaDeFrutas.get(1));

        // Remover um elemento da lista
        listaDeFrutas.remove("Laranja"); // Remover pelo valor
        listaDeFrutas.remove(2); // Remover pelo índice

        // Iterar sobre a lista usando um loop for-each
        System.out.println("Frutas na lista:");
        for (String fruta : listaDeFrutas) {
            System.out.println(fruta);
        }

        // Iterar sobre a lista usando um loop for tradicional
        System.out.println("Frutas na lista (usando loop for):");
        for (int i = 0; i < listaDeFrutas.size(); i++) {
            System.out.println(listaDeFrutas.get(i));
        }
    }
}

