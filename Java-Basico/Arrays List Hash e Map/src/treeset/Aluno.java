package treeset;

public class Aluno {

    public static void main(String[] args) {

        GerenciarAlunos gerenciamento = new GerenciarAlunos();

        gerenciamento.adicionarAluno("Maria");
        gerenciamento.adicionarAluno("João");
        gerenciamento.adicionarAluno("Ana");
        gerenciamento.adicionarAluno("Lucas");
        gerenciamento.adicionarAluno("João"); // Teste de duplicata

        gerenciamento.listarAlunos();

        gerenciamento.removerAluno("Ana");

        gerenciamento.listarAlunos();

        gerenciamento.listarAlunosEmOrdemAlfabetica();
    }
}
