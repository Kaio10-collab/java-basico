package strategy;

/*
Implementação concreta da estratégia de cálculo de frete para os Correios.
O cálculo é simplificado para fins de exemplo.
*/
public class FreteCorreios implements CalculoFreteStrategy{

    // Foi definido duas constantes abaixo, a cosntante é definida pela palavra final antes do double
    private static final double TAXA_BASE_CORREIOS = 15.00;
    private static final double CUSTO_POR_KG = 2.50;

    @Override
    public double calcular(double peso) {
        // Aplicamos uma Lógica de cálculo de frete específica para os Correios, ou seja implementou o método calcular lá da classe de interface CalculoFreteStrategy
        return TAXA_BASE_CORREIOS + (peso * CUSTO_POR_KG);
    }
}