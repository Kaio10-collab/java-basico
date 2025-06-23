package linkedlist;

public class LinkedListPrincipal {

    /*
    Ele armazena uma coleção de itens, mas cada item que contém o dado é ligado a uma referência para o próximo item na sequência.
    */

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.insere("Fulgore"); // posição 0
        aluno.insere("Fulano"); // posição 1
        aluno.insere("Fulanaaa"); // posição 2

        System.out.println(aluno.vazia()); // testa se a lista esta vazia ou não.
        System.out.println(aluno);

        var r1 = aluno.remove(); // remove posição 2
        System.out.println(r1); // como dentro do método estamos subtraindo -1, ele faz o cálculo da quantidade da lista, no caso temos 3 nomes, 3-1

        var r2 = aluno.remove(); // remove posição 1
        System.out.println(r2); // como já foi removido um nome na lista, o cálculo fica 2-1

//        var r3 = pilha.remove(); // para testar a condição vazia no metodo
//        System.out.println(r3);

        System.out.println(aluno);
        System.out.println(aluno.vazia()); // vem true se descomentar a String r3, pois a lista não esta vazia, portanto vem false.

    }
}
