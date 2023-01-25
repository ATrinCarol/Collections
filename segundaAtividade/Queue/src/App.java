import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");
        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);

        //filaBanco.clear();
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);

        for (String client: filaBanco){
            System.out.println(client);
        }

        filaBanco.add("Carol");
        int tamanhoFila = filaBanco.size();
        System.out.println(tamanhoFila);

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()) {
            System.out.println("-> " + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.isEmpty());

        Queue<String> outraFila = new LinkedList<>();

        outraFila.add("Juliana");
        outraFila.add("Pedro");
        outraFila.add("Carlos");
        outraFila.add("Larissa");
        outraFila.add("Carol");
        System.out.println(outraFila);

        Iterator<String> iteratorOutraFila = outraFila.iterator();
        while (iteratorOutraFila.hasNext()){
            System.out.println(">> " + iteratorOutraFila.next());
        }

        System.out.println(outraFila.peek());
        System.out.println(outraFila.poll());
        System.out.println(outraFila);

        outraFila.add("Daniel");
        System.out.println(outraFila);

        System.out.println(outraFila.size());
        System.out.println(outraFila.isEmpty());
        System.out.println(outraFila.contains("Carlos"));
    }
}
