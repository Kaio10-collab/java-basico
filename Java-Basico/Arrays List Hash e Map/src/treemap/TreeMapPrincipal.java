package treemap;

import java.util.TreeMap;

public class TreeMapPrincipal {

    /*
    Aqui trabalhamos com chave e valor novamente, mas aqui as chaves são ordenadas por ordem, seja alfabética, numérica ou qualquer ordem que definimos.
    Aqui quando não permite duplicar chaves, mas apenas substituir o valor antigo pelo atual;
    */

    public static void main(String[] args) {

        // chave é string e valor Integer
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adicionando elementos ao TreeMap
        treeMap.put("Banana", 1);
        treeMap.put("Mamão", 5);
        treeMap.put("Mamão", 8); // para verificar o valor atual ao exibir a lista
        treeMap.put("Maçã", 2);
        treeMap.put("Laranja", 3);
        treeMap.put("Abacaxi", 4);

        // Acessando elementos
        System.out.println("Valor associado à chave 'Maçã': " + treeMap.get("Maçã"));
        System.out.println("Contém Banana? " + treeMap.containsKey("Banana"));
        System.out.println(treeMap.remove("Maçã"));

        // Exibindo todos os elementos em ordem alfabética pela chave
        System.out.println("Todos os elementos no TreeMap:");
        for (String chave : treeMap.keySet()) {
            System.out.println(chave + ": " + treeMap.get(chave));
        }
    }

}
