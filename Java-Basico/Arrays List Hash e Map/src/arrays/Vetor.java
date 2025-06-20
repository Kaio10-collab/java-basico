package arrays;

import java.util.Arrays;

public class Vetor {

    private final Aluno[] alunos = new Aluno[10]; // Definimos um array com 10 posições.
    private int totalDeAlunos = 0;

    //métodos dos comportamentos do nosso array

    public void adiciona(int posicao, Aluno aluno) {

        if(!posicaoValida(posicao)) {
            throw new IllegalArgumentException("posicao invalida");
        }
        for(int i = totalDeAlunos - 1; i >= posicao; i-=1) {
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        totalDeAlunos++; // adiciona um aluno a uma posição
    }

    public Aluno pega(int posicao) {
        //recebe uma posição e devolve o aluno
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("posição inválida");
        }
        return alunos[posicao]; // recupera um aluno de uma posição
    }

    public void remove(int posicao) {
        //remove pela posição
        for(int i = posicao; i < this.totalDeAlunos; i++) {
            this.alunos[i] = this.alunos[i+1];
        }
        totalDeAlunos--; // remove um aluno de uma posição
    }

    public boolean contem(Aluno aluno) {
        //descobre se o aluno está ou não na lista
        for (int i = 0; i < totalDeAlunos; i++) {
            if (aluno.equals(alunos[i])) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        //devolve a quantidade de alunos
        return totalDeAlunos;
    }

    public String toString() {
        //facilitará na impressão
        return Arrays.toString(alunos);
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeAlunos;
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= totalDeAlunos;
    }
}
