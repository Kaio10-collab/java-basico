package builder;

public class Pizzaiolo {

    // Aqui é o nosso "Diretor", Aquele que conhece as receitas para construir diferentes tipos de pizzas e utiliza o Builder para esse trabalho.
    public Pizza prepararPizzaDeCalabresa(Pizza.Builder builder) {
        return builder.comMassa("Massa Fina")
                .comMolho("Molho de Tomate")
                .adicionarIngrediente("Queijo Mussarela")
                .adicionarIngrediente("Calabresa Fatiada")
                .build();
    }

    public Pizza prepararPizzaVegetariana(Pizza.Builder builder) {
        return builder.comMassa("Massa Integral")
                .comMolho("Molho Pesto")
                .adicionarIngrediente("Queijo Ricota")
                .adicionarIngrediente("Tomate Seco")
                .adicionarIngrediente("Rúcula")
                .build();
    }
}
