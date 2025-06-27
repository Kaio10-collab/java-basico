package strategy;

 // Classe principal para demonstrar o uso do padrão Strategy
 // para cálculo de frete.
public class StrategyPrincipal {

    /*
    O padrão Strategy é um padrão de projeto comportamental que te permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis.
    Isso significa que você pode selecionar um algoritmo dentre vários em tempo de execução.
    A ideia principal é que a classe que usa o algoritmo não precisa saber os detalhes de como ele é implementado, apenas que ele executa uma ação.
    */

     public static void main(String[] args) {

         // Peso do produto para o cálculo
         double pesoProduto = 10.0;

         System.out.println("--- Calculando frete com Correios ---");
         // Cria uma calculadora com a estratégia dos Correios
         CalculadoraFrete calculadoraCorreios = new CalculadoraFrete(new FreteCorreios());
         var freteCorreios = calculadoraCorreios.calcularFrete(pesoProduto);
         System.out.printf("Frete Correios para %.2f kg: R$ %.2f%n", pesoProduto, freteCorreios);

         System.out.println("\n--- Calculando frete com Transportadora ---");
         // Muda a estratégia da calculadora para Transportadora
         CalculadoraFrete calculadoraTransportadora = new CalculadoraFrete(new FreteTransportadora());
         double freteTransportadora = calculadoraTransportadora.calcularFrete(pesoProduto);
         System.out.printf("Frete Transportadora para %.2f kg: R$ %.2f%n", pesoProduto, freteTransportadora);

         System.out.println("\n--- Calculando frete com Retirada na Loja ---");
         // Muda a estratégia da calculadora para Retirada na Loja
         CalculadoraFrete calculadoraRetirada = new CalculadoraFrete(new FreteRetiradaLoja());
         double freteRetirada = calculadoraRetirada.calcularFrete(pesoProduto);
         System.out.printf("Frete Retirada na Loja para %.2f kg: R$ %.2f%n", pesoProduto, freteRetirada);

         System.out.println("\n--- Demonstrando mudança de estratégia em tempo de execução ---");
         CalculadoraFrete calculadoraDinamica = new CalculadoraFrete(new FreteCorreios());
         System.out.printf("Frete inicial (Correios) para %.2f kg: R$ %.2f%n", pesoProduto, calculadoraDinamica.calcularFrete(pesoProduto));

         // Altera a estratégia para Transportadora
         calculadoraDinamica.setStrategy(new FreteTransportadora());
         System.out.printf("Frete após mudança (Transportadora) para %.2f kg: R$ %.2f%n", pesoProduto, calculadoraDinamica.calcularFrete(pesoProduto));
     }
}
