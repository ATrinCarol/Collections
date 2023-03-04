import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        //criando coleção de estudantes
        List <String> estudantes = new ArrayList<>();

        //adicionando estudantes na coleção list
        estudantes.add("Perle");
        estudantes.add("Theyse");
        estudantes.add("Peulo");
        estudantes.add("Cerile");
        estudantes.add("Josefe");
        estudantes.add("Medelene");
        estudantes.add("Merine");
        estudantes.add("Rihenne");

        //retornando a contagem de elementos do stream
        System.out.println("Contagem: " + estudantes.stream().count());

        //retornando o elemento com maior número de letras
        System.out.println("\nMaior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        //retornando o elemento com menor número de letras
        System.out.println("\nMenor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //retornando elemetos com a letra 'R'
        System.out.println("\nContém a letra ''R'' no nome: " + estudantes.stream().filter((estudante) ->
        estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //retorna uma nova coleção, com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("\nRetornando uma nova coleção com o nome e a quantidade de letras do mesmo: " + estudantes.stream().map(estudante ->
        estudante.concat(" - Número de letras: ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //retorna somente os 3 primeiros elementos da coleção
        System.out.println("\nRetornando os 3 primeiros itens da lista: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        System.out.println("Exibindo cada dado...:");
        //exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println("...e retornando os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //exibe cada elemento no console sem retornar outra coleção
        System.out.println("\nSomente exibe cada elemento sem retornar outra coleção: ");
        estudantes.stream().forEach(System.out::println);

        //retorna true se TODOS elementos possuem determinada letra
        System.out.println("\nTodos elementos com a letra 'a' no nome? " + estudantes.stream().allMatch((elemento) ->
        elemento.contains("a")));

        //retorna true se ALGUM dos elementos possuem determinada letra minuscula no nome
        System.out.println("Tem algum elemento com 'a' minúscula nome? " + estudantes.stream().anyMatch((elemento) ->
        elemento.contains("a")));

        //retorna true se NENHUM elemento possui determinada letra minúscula na palavra
        System.out.println("Não tem nenhum elemento com a letra 'a' minuscula? " + estudantes.stream().noneMatch((elemento) -> 
        elemento.contains("a")) + "\n");

        //retorna o primeiro elemento da coleção, se existir exibe no console
        System.out.println("Retornando o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //exemplo de operaação encadeada
        System.out.println("\nOperação encadeada: \n");
        System.out.println(estudantes.stream()
        .peek(System.out::println)
        .map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length())))
        .peek(System.out::println)
        .filter((estudante) ->
                estudante.toLowerCase().contains("r"))
        .collect(Collectors.toList()));
        //.collect(Collectors.joining(", ")));
        //.collect(Collectors.toSet()));
        //.collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));
    }
}
