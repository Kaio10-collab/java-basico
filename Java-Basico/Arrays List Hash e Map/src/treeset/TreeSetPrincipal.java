package treeset;

import java.util.TreeSet;

public class TreeSetPrincipal {

    /*

    */

    public static void main(String[] args) {
        // Declaração e inicialização de um TreeSet de Strings
        TreeSet<String> frutas = new TreeSet<>();

        // Adicionando elementos
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Abacaxi");
        frutas.add("Laranja");
        frutas.add("Morango");
        frutas.add("Maçã");
        frutas.add("Maçã"); // Duplicado, então não será adicionado

        // Imprimindo o TreeSet
        System.out.println("Frutas (em ordem): " + frutas);

        // Removendo um elemento
        frutas.remove("Banana");
        System.out.println("Após remoção de Banana: " + frutas);

        // Verificando se contém um elemento
        System.out.println("Contém Laranja? " + frutas.contains("Laranja")); // Saída: true

        // Tamanho do TreeSet
        System.out.println("Tamanho do TreeSet: " + frutas.size()); // 4

        // Iterando sobre o TreeSet
        System.out.println("Iterando sobre as frutas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println("Primeira fruta: " + frutas.first()); // primeira fruta na ordem
        System.out.println("Última fruta: " + frutas.last()); // última fruta na ordem
        System.out.println("Fruta imediatamente maior que 'Laranja': " + frutas.higher("Laranja")); // Saída: Maçã, pois ela captura o próximo valor depois de Laranja.
    }
}
