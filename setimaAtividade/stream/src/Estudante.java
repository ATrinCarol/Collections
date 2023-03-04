import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Estudante {
    public static void main(String[] args) throws Exception {
        //criando coleção de estudantes
        List <String> estudantes = new ArrayList<>();

        //adicionando estudantes na coleção list
        estudantes.add("Caroline, 27");
        estudantes.add("Cauã, 04");
        estudantes.add("Wellton, 32");
        estudantes.add("Denise, 52");
        estudantes.add("Alexandre, 47");
        estudantes.add("Maria, 67");
        estudantes.add("Karin, 24");
        estudantes.add("Igor, 30");

        //Exercícios
        //A
        System.out.println(estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //B 
        System.out.println(estudantes.stream().count());

        //C
        System.out.println(estudantes.stream().filter((estudante) ->
        estudante.contains("27")).collect(Collectors.toList()));

        //D
        System.out.println(estudantes);

        //E
        System.out.println(estudantes.stream()
        .filter((estudante) ->
        estudante.contains("B")).collect(Collectors.toList()));

        //F
        System.out.println(estudantes.stream().filter((estudante) ->
        estudante.toLowerCase().contains("d")).collect(Collectors.toList()));
        
        //G
        System.out.println(estudantes.stream().filter((estudante) ->
        estudante.contains("67")).collect(Collectors.toList()));
        System.out.println(estudantes.stream().filter((estudante) ->
        estudante.contains("04")).collect(Collectors.toList()));
    }
}
