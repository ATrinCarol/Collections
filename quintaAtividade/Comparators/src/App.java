import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

       /*List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19 ));
        estudantes.add(new Estudante("Carlos", 23 ));
        estudantes.add(new Estudante("Mariana", 21 ));
        estudantes.add(new Estudante("João", 18 ));
        estudantes.add(new Estudante("Thiago", 20 ));
        estudantes.add(new Estudante("George", 22 ));
        estudantes.add(new Estudante("Larissa", 21 ));

        System.out.println("¨¨¨¨Ordem de inserção¨¨¨¨");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("¨¨¨¨Ordem natural (crescente) das idades - com lambda¨¨¨¨");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println("¨¨¨¨Ordem reversa (decrescente) das idades - com lambda¨¨¨¨\n" + estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("---Ordem natural das idades - com comparator (method reference)---\n" + estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("---Ordem reversa das idades - com comparator (method reference)---\n" + estudantes);
        

        Collections.sort(estudantes);
        System.out.println("Ordem natural com interface Comparable\n" + estudantes);

        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
        System.out.println("Ordem reversa com interface Comparable\n" + estudantes);
        
        Tentando sozinha
        estudantes.sort(Comparator.comparing(Estudante::getNome));
        System.out.println("\nVerificando com nomes\n" + estudantes);

        if (estudantes.size() == 7){
            System.out.println("Deu certo");
        }
        else {System.out.println("O que eu to fazendo?");}
        */

        //Exercícios

        List<Torcidas> torcida = new ArrayList<>();

        torcida.add(new Torcidas("Pavilhão Nove", 100000));
        torcida.add(new Torcidas("Fiel Macabra", 15000));
        torcida.add(new Torcidas("Camisa 12", 150000));
        torcida.add(new Torcidas("Estopim da Fiel", 19000));
        torcida.add(new Torcidas("Coringão Chopp", 10000));
        torcida.add(new Torcidas("Gaviões da Fiel", 201000));

        System.out.println("*Ordem de inserção*\n" + torcida);

        torcida.sort(Comparator.comparingInt(Torcidas::getTotalComponentes));
        System.out.println("*Ordem crescente - interface Comparator*\n" + torcida);

        torcida.sort(Comparator.comparingInt(Torcidas::getTotalComponentes).reversed());
        System.out.println("*Ordem decrescente - interface Comparator*\n" + torcida);

        Collections.sort(torcida);
        System.out.println("*Ordem natural com interface Comparable*\n" + torcida);
        
        Collections.sort(torcida, new TorcidasOrdemComponentesReversaComparator());
        System.out.println("*Ordem reversa com interface Comparable*\n" + torcida);

        torcida.sort((primeiro, segundo) -> segundo.getTotalComponentes() - primeiro.getTotalComponentes());
        System.out.println("*Ordem reversa - com lambda*\n" + torcida);

        torcida.sort((primeiro, segundo) -> primeiro.getTotalComponentes() - segundo.getTotalComponentes());
        System.out.println("*Ordem natural - com lambda*\n" + torcida);

        


    }
        
}
