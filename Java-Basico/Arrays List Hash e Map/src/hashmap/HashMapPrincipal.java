package hashmap;

import java.util.HashMap;

public class HashMapPrincipal {

    /*
    Quando utilizamos o hashmap, estamos armazenando informções em pares, ou seja, um par terá uma chave e valor.
    Chave (Key): É o "nome" ou o "rótulo" único que você usa para encontrar um item. Imagina um catálogo telefônico, a chave seria o nome da pessoa (por exemplo, "João Silva").
    Valor (Value): É a informação associada àquela chave. No exemplo, o valor seria o número de telefone do João Silva.
    */

    public static void main(String[] args) {

        /*
        Aqui tem uma parte comentada e a outra parte descomentada. Para testar uma parte, deve manter o padrão de deixar uma comentada e outra descomentada.
        Ou seja, deve ir alterando entre deixar comentado e descomentado para rodar a api. Pode deixar tudo descomentado e rodar, mas vai ficar um pouco confuso.
        Mas se presta atenção são dois exemplos, um da classe Pessoa e outra de String.
        */

//        HashMap<Pessoa, String> mapPessoa = new HashMap<>();
//
//        Pessoa p1 = new Pessoa("Alice", 30);
//        Pessoa p2 = new Pessoa("Bob", 25);
//        Pessoa p3 = new Pessoa("Charlie", 35);
//
//        mapPessoa.put(p1, " Engenheira");
//        mapPessoa.put(p2, " Médico");
//        mapPessoa.put(p3, " Professor");
//
//        System.out.println("Idades: " + mapPessoa);
//
//        // Acessando um valor
//        System.out.println("Idade de Bob: " + mapPessoa.get("Bob"));
//
//        // Removendo um elemento
//        mapPessoa.remove("Charlie");
//        System.out.println("Após remoção de Charlie: " + mapPessoa);
//
//        // Verificando se uma chave existe
//        System.out.println("Contém Alice? " + mapPessoa.containsKey("Alice")); // Saída: true
//
//        // Tamanho do HashMap
//        System.out.println("Tamanho do HashMap: " + mapPessoa.size());
//
//        System.out.println("Profissões:");
//        for (Pessoa pessoa : mapPessoa.keySet()) {
//            System.out.println(pessoa + " - " + mapPessoa.get(pessoa));
//        }

        HashMap<String, Integer> idadeMap = new HashMap<>();

        // Adicionando pares chave-valor
        idadeMap.put("Alice", 30);
        idadeMap.put("Bob", 25);
        idadeMap.put("Charlie", 35);
        idadeMap.put("Alice", 31); // Atualiza o valor para a chave "Alice", substitui a idade inicial de 30 para 31

        // Imprimindo o HashMap
        System.out.println("Idades: " + idadeMap);

        // Acessando um valor
        System.out.println("Idade de Bob: " + idadeMap.get("Bob"));

        // Removendo um elemento
        idadeMap.remove("Charlie");
        System.out.println("Após remoção de Charlie: " + idadeMap);

        // Verificando se uma chave existe
        System.out.println("Contém Alice? " + idadeMap.containsKey("Alice")); // Saída: true

        // Tamanho do HashMap
        System.out.println("Tamanho do HashMap: " + idadeMap.size());

        // Iterando sobre as entradas
        System.out.println("Entradas no HashMap:");
        for (String nome : idadeMap.keySet()) {
            System.out.println(nome + ": " + idadeMap.get(nome));
        }
    }
}
