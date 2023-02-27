import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

import javax.swing.event.SwingPropertyChangeSupport;

public class App {
    public static void main(String[] args) throws Exception {
        
      /*  Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente!"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional que não está presente!");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

        Optional<String> optionalEmpty = Optional.empty();

        System.out.println("Valor opcional que não está presente!");
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

        System.out.println("***Valor inteiro opcional***");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("***Valor decimal opcional***");
        OptionalDouble.of(15.33).ifPresent(System.out::println);

        System.out.println("***Valor longo opcional***");
        OptionalLong.of(23L).ifPresent(System.out::println);

        Optional<String> optionalString = Optional.of("Valor opcional!");
        System.out.println(optionalString.isPresent());
        System.out.println(optionalString.isEmpty());

        optionalString.ifPresent(System.out::println);

        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Valor não presente"));

        if (optionalString.isPresent()){
            String valor = optionalString.get();

            System.out.println(valor);
        }

        optionalString.map((valor) -> valor.concat("***")).ifPresent(System.out::println);

        System.out.println(optionalString.orElseThrow(IllegalStateException::new)); */ 

        //Exercícios

        Optional<String> estadoVazio = Optional.empty();
        Optional<String> estadoPresente = Optional.of("Valor ok");
        Optional<String> estadoNull = Optional.ofNullable(null);

        if (estadoVazio.isPresent()){
            System.out.println("Optional vazio!");
        } else {
            System.out.println("Lógica dando certo!");
        }

        estadoPresente.map((texto) -> texto.concat(" trans: adicionando mais texto")).ifPresent(System.out::println);

        if(estadoPresente.isPresent()){
            String valor = estadoPresente.get();
            System.out.println(valor);
        }

        estadoPresente.ifPresentOrElse(System.out::println, () -> System.out.println("Valor vazio"));

        estadoNull.ifPresentOrElse(System.out::println, () -> System.out.println("Valor vazio"));

        estadoVazio.ifPresentOrElse(System.out::println, () -> estadoVazio.orElseThrow(IllegalStateException::new));
        

        
    }
}
