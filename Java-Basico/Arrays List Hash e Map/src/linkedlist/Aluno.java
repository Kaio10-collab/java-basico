package linkedlist;

import java.util.LinkedList;

public class Aluno {

    private final LinkedList<String> nomes = new LinkedList<>();

    public void insere(String nome) {

        nomes.add(nome);
    }

    public String remove() {

        return nomes.remove(nomes.size()-1); // a lista tem 3 nomes na classe LinkedListPrincipal, portanto 3-1 = 2, posição 2 será chamado
//        return nomes.remove(0); // a lista tem 3 posições, posição 0 será chamado para ser removido, sempre que remove um, o próximo da sequência substitui a posição 0
    }

    public Boolean vazia() {

        return nomes.isEmpty();
    }

    @Override
    public String toString() {
        return nomes.toString();
    }
}
