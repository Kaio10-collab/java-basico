package treeset;

import java.util.HashSet;
import java.util.TreeSet;

public class GerenciarAlunos {

    /*
    Problema: Gerenciamento de Alunos
    Você é responsável por gerenciar a lista de alunos de uma turma e suas notas. A tarefa é a seguinte:

    Adicionar Alunos: Crie um método para adicionar alunos à lista. Cada aluno deve ter um nome único.
    Remover Alunos: Crie um método para remover alunos da lista.
    Listar Alunos: Crie um método que exiba a lista de alunos.
    Listar Alunos em Ordem: Crie um método que exiba a lista de alunos em ordem alfabética.
    Verificar Duplicatas: Ao adicionar um aluno, verifique se o nome já está presente na lista. Se sim, imprima uma mensagem informando que o aluno já existe.
    */

    private final HashSet<String> alunosSet; // lista criada com hashSet, portanto não teria ordem alfabética

    public GerenciarAlunos() {
        alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome) {
        if (alunosSet.add(nome)) {
            System.out.println("Aluno " + nome + " adicionado com sucesso!");
        } else  {
            System.out.println("Aluno " + nome + " já existe");
        }
    }

    public void removerAluno(String nome) {
        if (alunosSet.remove(nome)) {
            System.out.println("Aluno " + nome + " foi removido com sucesso!");
        } else {
            System.out.println("O aluno " + nome + " não foi encontrado");
        }
    }

    public void listarAlunos() {
        System.out.println("Alunos:");
        for (String aluno : alunosSet) {
            System.out.println(aluno);
        }
    }

    public void listarAlunosEmOrdemAlfabetica() {
        TreeSet<String> alunosOrdenados = new TreeSet<>(alunosSet);
        // como a lista foi criada com hashSet, que não tem ordem, então eu fiz uma conversão para o treeSet para poder organizar em ordem alfabética
        System.out.println("Alunos em ordem alfabética:");
        for(String aluno : alunosOrdenados) {
            System.out.println(aluno);
        }
    }
}
