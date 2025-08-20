package builder;

public class Main {

    public static void main(String[] args) {
        Pizzaiolo pizzaiolo = new Pizzaiolo();

        System.out.println("Fazendo uma pizza de calabresa...");
        // O cliente chama o Diretor para construir a pizza
        Pizza pizzaCalabresa = pizzaiolo.prepararPizzaDeCalabresa(new Pizza.Builder());
        pizzaCalabresa.exibirPizza();

        System.out.println("\n--------------------\n");

        System.out.println("Fazendo uma pizza vegetariana...");
        // Usando o mesmo Pizzaiolo para outra receita
        Pizza pizzaVegetariana = pizzaiolo.prepararPizzaVegetariana(new Pizza.Builder());
        pizzaVegetariana.exibirPizza();
    }
}
