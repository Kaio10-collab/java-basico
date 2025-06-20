package arrays;

public class PrincipalArrays {

    /*
    Quando falamos de arrays, estamos definindo uma condição fixa e imutável, então aqui a gente defini o tipo e o tamanho,
    afinal ele segue a mesma lógica do arrayList, de imaginar que é uma gaveta e vai armazenando os espaços.
    */

    public static void main(String[] args) {

        // define 3 alunos novos
        Aluno aluno1 = new Aluno("Fulano"); // posição 0
        Aluno aluno2 = new Aluno("Fulana"); // posição 1
        Aluno aluno3 = new Aluno("Ronaldo"); // posição 2

        // cria a instância da classe Vetor, onde tem o array com 10 posições
        Vetor lista = new Vetor();

        System.out.println(lista.tamanho()); // apenas retorna 0, serve para fins educativos

        // adiciona os três alunos na lista
        lista.adiciona(0, aluno1);
        System.out.println(lista.tamanho());

        lista.adiciona(1, aluno2);
        System.out.println(lista.tamanho());

        lista.adiciona(2, aluno3);
        System.out.println(lista.tamanho());

        lista.remove(1); // remove o aluno2
        System.out.println(lista); // retorna a lista sem o Fulana

        System.out.println(lista.contem(aluno1)); // possui Fulano na lista?
        System.out.println(lista.contem(aluno3)); // Possui o Ronaldo na lista?

        System.out.println(lista.pega(1)); // Como Fulana era a posição 1 que foi removido, o Ronaldo que era da posição 2 passa a ser da posição 1
    }
}
