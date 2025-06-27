package strategy;

/*
Implementação concreta da estratégia de cálculo de frete para retirada na loja.
O frete é gratuito neste caso.
*/
public class FreteRetiradaLoja implements CalculoFreteStrategy {

    @Override
    public double calcular(double peso) {
        // Lógica de cálculo de frete específica para retirada na loja (grátis)
        System.out.println("Produto será retirado na loja. Frete grátis!");
        return 0.0;
    }
}