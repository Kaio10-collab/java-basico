package linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapPrincipal {

    /*
    Também trabalha com chave e valor igual o hashMap, porém com o diferencial de que ele mantém a ordem que os itens foram inseridos.
    Continua sendo uma opção rapída ao realizar uma busca pelo valor através da chave, também possui a mesma flexibilidade de inserir, remover e atualizar.
    Não permite chave duplicadas, mas permite inserir um valor diferente para a mesma chave, sendo substituído o valor antigo pelo atual. Porém a ordem não seria alterada.
    */

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adicionando elementos ao LinkedHashMap
        linkedHashMap.put("Abacaxi", 1);
        linkedHashMap.put("Banana", 4);
        linkedHashMap.put("Maçã", 2);
        linkedHashMap.put("Laranja", 3);

        // Acessando elementos
        System.out.println("Valor associado à chave 'Maçã': " + linkedHashMap.get("Maçã"));
        System.out.println(linkedHashMap.remove("Laranja"));
        System.out.println("Contém 'Maçã'? " + linkedHashMap.containsKey("Maçã"));

        // Exibindo todos os elementos
        System.out.println("Todos os elementos no LinkedHashMap:");
        for (String chave : linkedHashMap.keySet()) {
            System.out.println(chave + ": " + linkedHashMap.get(chave));
        }
    }
}
