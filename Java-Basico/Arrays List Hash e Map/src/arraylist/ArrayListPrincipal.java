package arraylist;

import java.util.ArrayList;

public class ArrayListPrincipal {

    /*
    Vamos pensar que um ArrayList como uma lista flexível ou uma gaveta mágica que pode se expandir e encolher conforme você coloca ou tira itens dela.
    Diferente de uma "gaveta comum" (que seria um array tradicional, com um tamanho fixo), o ArrayList não tem um limite pré-definido de quantos itens ele pode guardar.
    A melhor caractéristica dele é a flexibilidade, pois um arrayList não tem um tamanho fixo. Se você precisar adicionar mais itens do que o espaço inicial que ele tem, ele automaticamente se expandirá para acomodá-los.
    Da mesma forma, se você remover muitos itens, ele pode diminuir seu tamanho para economizar espaço. Temos muitas opções de trabalhar dentro de uma coleção de arrayList.
    Vou passar um exemplo abaixo de alguns casos:
    */

    public static void main(String[] args) {

        ArrayList<Integer> listaDeNumeros = getIntegerArrayList(); // chamada ao método onde temos um novo arrayList

        System.out.println("OS números são: " + listaDeNumeros);

        System.out.println("O número é: " + listaDeNumeros.get(0)); // no caso definimos qual posição que queremos que pegue
        // outro ponto, podemos utilizar o getFirst, caso for somente a primeira posição

        System.out.println("Numero que foi removido: " + listaDeNumeros.remove(1)); // remove a primeira posição

        System.out.println("Tamanho do ArrayList: " + listaDeNumeros.size()); // exibe quantas posições estão preenchidas

        System.out.println("Possui o número 30? " + listaDeNumeros.contains(30)); // condição boolean para avaliar se é true ou false se tem o número na lista

        System.out.println("Iterar sobre os números: ");
        for (Integer numero : listaDeNumeros) {
            System.out.println(numero);
        }

    }

    private static ArrayList<Integer> getIntegerArrayList() {

        ArrayList<Integer> listaDeNumeros = new ArrayList<>(); // criamos uma lista de arrayList do tipo Integer

        /*
        List<Integer> listaDeNumeros = new ArrayList<>();
        Quando especificamos List, estamos utilizando a interface List, que permite que possamos alterar
        do ArrayList por LinkedList, por exemplo, isso permite uma maior flexibilidade.
        */

        // adiciona os numeros na lista
        listaDeNumeros.add(10); // posição 0
        listaDeNumeros.add(20); // posição 1
        listaDeNumeros.add(30); // posição 2
        return listaDeNumeros;
    }
}
