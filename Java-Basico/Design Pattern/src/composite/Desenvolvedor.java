package composite;

public class Desenvolvedor implements Funcionario {

    private String nome;

    public Desenvolvedor(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("  - Desenvolvedor: " + nome);
    }
}
/*
Essa classe representa os objetos individuais, ou seja, as partes mais básicas da árvore que não contêm outros objetos.
É uma classe que implementa a interface Componente(Funcionario).

vamos criar a nossa "folha", o objeto individual.
O Desenvolvedor implementa a interface Funcionario e faz a sua própria lógica.
 */