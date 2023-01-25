import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args)  {

      List<String> nomes = new ArrayList<>();

      nomes.add("Juliana");
      nomes.add("Pedro");
      nomes.add("Carlos");
      nomes.add("Larissa");
      nomes.add("João");

      for (String nomeElemento: nomes){
        System.out.println(nomeElemento);
      }

      nomes.set(2, "Roberto");
      System.out.println(nomes);

      System.out.println(nomes.get(1));

      nomes.add("Antonia");

      nomes.remove(5);
      nomes.remove("João");
      System.out.println(nomes);

      int totalDeElementosDaLista = nomes.size();
      System.out.println(totalDeElementosDaLista);

      boolean temJuliano = nomes.contains("Juliano");
      System.out.println(temJuliano);
      boolean temJuliana = nomes.contains("Juliana");
      System.out.println(temJuliana);

      List<String> novosNomes = new ArrayList<>();

      novosNomes.add("Ismael");
      novosNomes.add("Rodrigo");

      nomes.addAll(novosNomes);
      System.out.println(nomes);

    Collections.sort(nomes);
    System.out.println(nomes);

    boolean verificarListaVazia = nomes.isEmpty();
    System.out.println(verificarListaVazia);


    }
}
