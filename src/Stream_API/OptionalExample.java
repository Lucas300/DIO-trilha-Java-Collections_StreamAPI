package Stream_API;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        OptionalExample example = new OptionalExample();
        
        // Caso onde o nome está presente
        Optional<String> nameOptional = example.getName(true);
        nameOptional.ifPresentOrElse(
            name -> System.out.println("Nome: " + name),
            () -> System.out.println("Nome não está presente")
        );
        
        // Caso onde o nome está ausente (null)
        nameOptional = example.getName(false);
        nameOptional.ifPresentOrElse(
            name -> System.out.println("Nome: " + name),
            () -> System.out.println("Nome não está presente")
        );
    }

    // Método que pode retornar um nome ou null
    public Optional<String> getName(boolean returnName) {
        if (returnName) {
            return Optional.of("Lucas"); // Retorna um Optional contendo o nome
        } else {
            return Optional.empty(); // Retorna um Optional vazio
        }
    }
}

