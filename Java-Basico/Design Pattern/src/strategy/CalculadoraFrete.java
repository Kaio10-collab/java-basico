package strategy;

import lombok.Setter;

/*
Classe de contexto que utiliza uma estratégia de cálculo de frete.
Ela mantém uma referência para um objeto CalculoFreteStrategy e delega a ele a tarefa de calcular o frete.
*/
@Setter
public class CalculadoraFrete {

    /*
    Define uma nova estratégia de cálculo de frete em tempo de execução.
    A nova estratégia de cálculo de frete a ser utilizada.
    */
    private CalculoFreteStrategy strategy;

    /*
    Construtor que permite definir a estratégia de cálculo de frete.
    A estratégia de cálculo de frete a ser utilizada.
    */
    public CalculadoraFrete(CalculoFreteStrategy strategy) {
        this.strategy = strategy;
    }

    /*
    Executa o cálculo do frete utilizando a estratégia configurada.
    peso do produto para o cálculo do frete.
    valor do frete calculado pela estratégia atual.
    @throws IllegalStateException Se nenhuma estratégia for definida.
    */
    public double calcularFrete(double peso) {
        if (strategy == null) {
            throw new IllegalStateException("Nenhuma estratégia de cálculo de frete definida.");
        }
        return strategy.calcular(peso);
    }
}
