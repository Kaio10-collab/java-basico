package strategy;

/*
Interface que define o contrato para as estratégias de cálculo de frete.
Todas as classes que implementam esta interface devem fornecer sua própria lógica para calcular o frete.
*/
public interface CalculoFreteStrategy {

     /*
     Define o método abstrato calcular que deve ser implementado pelas classes concretas. Ele recebe o peso do produto e retorna o valor do frete.
     */
     double calcular(double peso);
}