package strategy;

/*
Implementação concreta da estratégia de cálculo de frete para uma Transportadora.
O cálculo é simplificado para fins de exemplo.
*/
public class FreteTransportadora implements CalculoFreteStrategy {

    // Foi definido duas constantes abaixo, a cosntante é definida pela palavra final antes do double
    private static final double TAXA_BASE_TRANSPORTADORA = 25.00;
    private static final double CUSTO_POR_KG = 3.00;

    @Override
    public double calcular(double peso) {
        // Lógica de cálculo de frete específica para a Transportadora, ou seja implementou o método calcular lá da classe de interface CalculoFreteStrategy
        return TAXA_BASE_TRANSPORTADORA + (peso * CUSTO_POR_KG);
    }
}