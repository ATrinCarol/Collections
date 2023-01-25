import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.sound.sampled.spi.FormatConversionProvider;

public class App {
    public static void main(String[] args) throws Exception {
       /* 
        //HashSet
        Set<Double> notasAlunos = new HashSet<>();

        //Adicionando as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);
        System.out.println(notasAlunos);

        //Removendo uma nota do set
        notasAlunos.remove(3.8);
        System.out.println(notasAlunos);

        //Retornando a quantidade total de itens
        System.out.println(notasAlunos.size());

        //Navegando em todos os itens do iterator
        Iterator<Double> iteratorNotas = notasAlunos.iterator();
        while (iteratorNotas.hasNext()){
            System.out.println("-> " + iteratorNotas.next());
        }

        for (Double forNotas: notasAlunos){
            System.out.println("--> " + forNotas);
        }

        //Limpando o set
        notasAlunos.clear();

        //Retornando se o set está vazio ou não
        System.out.println(notasAlunos.isEmpty());
        

        //LinkedHashSet
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);
        System.out.println(sequenciaNumerica);

        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        System.out.println(sequenciaNumerica.size());

        for (Integer navegaSequenciaNumerica: sequenciaNumerica){
            System.out.println(navegaSequenciaNumerica);
        }

        System.out.println(sequenciaNumerica.isEmpty());
        

        //TreeSet - árvore binária
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        //Retorna a última capital no final da árvore
        System.out.println(treeCapitais.last());

        //Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        //Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        //Retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        //Retorna a primeira capital no final da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais.size());

        System.out.println(treeCapitais);

        Iterator<String> iteratorCapitais = treeCapitais.iterator();
        while(iteratorCapitais.hasNext()){
            System.out.println("-> " + iteratorCapitais.next());
        }

        for (String forCapitais: treeCapitais){
            System.out.println("--> " + forCapitais);
        }
        */

        TreeSet<Integer> outroSet = new TreeSet<>();
        outroSet.add(3);
        outroSet.add(88);
        outroSet.add(20);
        outroSet.add(44);
        outroSet.add(3);
        System.out.println(outroSet);

        Iterator<Integer> iteratorOutroSet = outroSet.iterator();
        while(iteratorOutroSet.hasNext()){
            System.out.println(iteratorOutroSet.next());
        }

        System.out.println(outroSet.pollFirst());
        System.out.println(outroSet);

        outroSet.add(23);
        System.out.println(outroSet);

        System.out.println(outroSet.size());

        System.out.println(outroSet.isEmpty());
    }
}
