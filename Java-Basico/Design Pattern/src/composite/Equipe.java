package composite;

import java.util.ArrayList;
import java.util.List;

public class Equipe implements Funcionario{

    private String nome;
    private List<Funcionario> membros = new ArrayList<>();

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void adicionarMembro(Funcionario funcionario) {
        membros.add(funcionario);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Setor: " + nome);
        for (Funcionario membro : membros) {
            membro.exibirDetalhes();
        }
    }
}
/*
Aqui é o nosso Composto onde implementa a interface Funcionario, mas tem uma lista de outros Funcionarios (podendo ser Desenvolvedores ou até outras Equipes).
no método exibirDetalhes(), a Equipe delega a chamada para cada um dos seus membros. Ela não precisa saber se o membro é um Desenvolvedor ou outra Equipe, pois todos implementam a mesma interface Funcionario.

Representa os objetos que podem conter outros Componentes (sejam eles Folhas ou outros Compostos). É uma classe que também implementa a interface Componente.
Além disso, ela tem uma lista de Componentes filhos e delega o trabalho para eles.
*/