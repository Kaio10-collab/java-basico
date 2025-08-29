package decorator;

// Aqui é o nosso Componente concreto
public class Expresso implements Cafe{

    @Override
    public double custo() {
        return 5.0; // Custo base
    }

    @Override
    public String getDescricao() {
        return "Café Expresso";
    }
}
/*
É a classe que implementa o Componente. Este é o nosso objeto base, sem nenhuma funcionalidade extra.

A classe Expresso, que implementa a nossa interface Cafe e retorna seu custo e descrição básicos.
*/