import java.security.Key;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
         
        //Instanciando Map
        Map<String, Integer> campeoesDoMundo = new HashMap<>();

        //Adicionando os campeões
        campeoesDoMundo.put("Brasil", 5);
        campeoesDoMundo.put("Alemanha", 4);
        campeoesDoMundo.put("Itália", 4);
        campeoesDoMundo.put("Argentina", 3);
        campeoesDoMundo.put("Uruguai", 2);
        campeoesDoMundo.put("França", 2);
        campeoesDoMundo.put("Inglaterra", 1);
        campeoesDoMundo.put("Espanha", 1);
        System.out.println(campeoesDoMundo);

        //Atualizando valor para a chave "Brasil"
        campeoesDoMundo.put("Brasil", 6);
        System.out.println(campeoesDoMundo);

        //Retornando o valor da Argentina
        System.out.println(campeoesDoMundo.get("Argentina"));

        //Retornando se existe ou não a chave França
        System.out.println(campeoesDoMundo.containsKey("França"));

        //Removendo a chave França
        campeoesDoMundo.remove("França");

        //Verificando se existe França ainda
        System.out.println(campeoesDoMundo.containsKey("França"));

        //Retornando se existe alguma chave com o valor 6 (seleção hexa campeã)
        System.out.println(campeoesDoMundo.containsValue(6));

        //Retornando o tamanho do mapa
        System.out.println(campeoesDoMundo.size());

        System.out.println(campeoesDoMundo);

        //Navegando nos registros do mapa
        for (Map.Entry<String, Integer> entry : campeoesDoMundo.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (String key : campeoesDoMundo.keySet()){
            System.out.println(key + " -> " + campeoesDoMundo.get(key));
        }
        
        //TreeMap
        TreeMap<String, String> treeCapitais = new TreeMap<>();
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC","Florianópolis");
        treeCapitais.put("PR","Curitiba");
        treeCapitais.put("SP","São Paulo");
        treeCapitais.put("RJ","Rio de Janeiro");
        treeCapitais.put("MG","Belo Horizonte");
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.firstKey());

        //Retorna a última capital no final da árvore
        System.out.println(treeCapitais.lastKey());

        //Retorna a primeira capital abaixo na árvore do item do parâmetro
        System.out.println(treeCapitais.lowerKey("PR"));

        //Retorna a primeira capital acima na árvore do item do parâmetro
        System.out.println(treeCapitais.higherKey("PR"));

        // Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());

        //Retorna a última capital no final da árvore
        System.out.println(treeCapitais.lastEntry().getKey() + " -- " + treeCapitais.lastEntry().getValue());

        //Retorna e remove o primeiro e último item do mapa
        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore, removendo do map
        System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());
        
        //Retorna a primeira capital no final da árvore, removendo do map
        System.out.println(lastEntry.getKey() + " -- " + lastEntry.getValue());

        //Navega em todas as chaves 
        Iterator<String> iteratorCapitais = treeCapitais.keySet().iterator();
        while(iteratorCapitais.hasNext()){
            String key = iteratorCapitais.next();
            System.out.println(key + " - " + treeCapitais.get(key));
        }

        for (String capital: treeCapitais.keySet()){
            System.out.println(capital + " -- " + treeCapitais.get(capital));
        }

        for (Map.Entry<String, String> capitais: treeCapitais.entrySet()){
            System.out.println(capitais.getKey() + " --- " + capitais.getValue());
        }
        
        //HashTable
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);
        estudantes.put("Carol", 28);
        System.out.println(estudantes);

        estudantes.put("Pedro", 55);
        System.out.println(estudantes);

        //Remove estudante do "índice" 0:
        estudantes.remove("Carlos");
        System.out.println(estudantes);

        //Recupera um estudante no "índice" 2:
        int idadeEstudante = estudantes.get("Rafaela");
        System.out.println("A idade da Rafaela é " + idadeEstudante);
        System.out.println("Número total de itens: " + estudantes.size());

        //Navegação nos registros do mapa
        for (Map.Entry<String, Integer> entry : estudantes.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        for (String key : estudantes.keySet()){
            System.out.println(key + " -- " + estudantes.get(key));
        }
        System.out.println(estudantes);

        //Exercícios
        
        Map<String, String> estadosBr = new HashMap<>();

        estadosBr.put("SP", "São Paulo");
        estadosBr.put("AC", "Acre");
        estadosBr.put("AL", "Alagoas");
        estadosBr.put("AP", "Amapá");
        estadosBr.put("AM", "Amazonas");
        estadosBr.put("BA", "Bahia");
        estadosBr.put("CE", "Ceará");
        estadosBr.put("ES", "Espírito Santo");
        estadosBr.put("GO", "Goiás");
        estadosBr.put("MA", "Maranhão");
        estadosBr.put("MT", "Mato Grosso");
        estadosBr.put("MS", "Mato Grosso do Sul");
        estadosBr.put("MG", "Minhas Gerais");
        estadosBr.put("PA", "Pará");
        estadosBr.put("PB", "Paraíba");
        estadosBr.put("PR", "Paraná");
        estadosBr.put("PE", "Pernambuco");
        estadosBr.put("PI", "Piauí");
        estadosBr.put("RJ", "Rio de Janeiro");
        estadosBr.put("RN", "Rio Grande do Norte");
        estadosBr.put("RS", "Rio Grande do Sul");
        estadosBr.put("RO", "Rondônia");
        estadosBr.put("RR", "Roraima");
        estadosBr.put("SC", "Santa Catarina");
        estadosBr.put("SE", "Sergipe");
        estadosBr.put("TO", "Tocantins");
        System.out.println(estadosBr.size());

        estadosBr.remove("MG");
        System.out.println(estadosBr.containsKey("MG"));

        estadosBr.put("DF", "Distrito Federal");
        System.out.println(estadosBr.size());
        System.out.println(estadosBr.containsKey("DF"));

        estadosBr.remove("MS", "Mato Grosso do Sul");
        System.out.println(estadosBr.containsKey("MS"));

        for (String key: estadosBr.keySet()){
            System.out.println(estadosBr.get(key) + ": " + key);
        }

        System.out.println(estadosBr.containsKey("SC"));

        System.out.println(estadosBr.containsValue("Maranhão"));

    }
}
