package hashset;

import java.util.HashSet;

public class HashSetPrincipal {

    /*
    Vamos imaginar que temos uma bolsa e vamos jogando os itens sem se preocupar com a ordem, além disso nunca poderá ter dois itens iguais.
    Se tentamos colocar um item igual, a bolsa ignora e continua com a mesma quantidade.
    Basicamente ele só armazena elementos únicos e não se preocupa com a ordem, ele vai seguindo um fluxo mais otimizado justamente por não se preocupar com a ordem.
    Aqui só poderemos verificar se o elemento existe ou iterar por todos os elementos.
    */

    public static void main(String[] args) {

        HashSet<Integer> numeros = new HashSet<>();

        HashSet<Cachorro> listaDog = new HashSet<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(10); // duplicado

        System.out.println("Os números são: " + numeros); // exibe a lista completa sem duplicar o 10
        System.out.println(numeros.remove(30)); // condição booelan, retorna true ou false se houve valor a ser removido.

        System.out.println("Os números são: " + numeros); // exibe a lista após o remove do 30
        System.out.println("Contém 20? " + numeros.contains(20)); // Verificando se contém um elemento. Saída: true

        System.out.println("Tamanho do HashSet: " + numeros.size()); // Tamanho do HashSet

        for (Integer numero : numeros) {
            System.out.println(numero);
        } // iterando

        listaDog.add(new Cachorro("Mike", 10));
        listaDog.add(new Cachorro("Mike", 10)); // duplicado
        listaDog.add(new Cachorro("Layka", 7));
        listaDog.add(new Cachorro("Layka", 7)); // duplicado

        System.out.println("Os cachorros são: " + listaDog);
        System.out.println(listaDog.remove(new Cachorro("Mike", 10)));
        System.out.println("Os cachorros são: " + listaDog);
    }
}
