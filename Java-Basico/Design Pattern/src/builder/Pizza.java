package builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    // Os nossos atributos que irão definir a composição
    private final String massa;
    private final String molho;
    private final List<String> ingredientes;

    // Construtor privado, acessível apenas pelo Builder possa criá-la
    private Pizza(Builder builder) {
        this.massa = builder.massa;
        this.molho = builder.molho;
        this.ingredientes = builder.ingredientes;
    }

    public void exibirPizza() {
        System.out.println("Sua pizza está pronta! Ingredientes:");
        System.out.println("  - Massa: " + massa);
        System.out.println("  - Molho: " + molho);
        for (String ingrediente : ingredientes) {
            System.out.println("  - Ingrediente: " + ingrediente);
        }
    }

    // A classe Builder interna estática, onde temos a lógica de construção próxima ao objeto que estamos criando
    public static class Builder {
        private String massa;
        private String molho;
        private final List<String> ingredientes = new ArrayList<>();

        public Builder() {
        }

        public Builder comMassa(String massa) {
            this.massa = massa;
            return this;
        }

        public Builder comMolho(String molho) {
            this.molho = molho;
            return this;
        }

        public Builder adicionarIngrediente(String ingrediente) {
            this.ingredientes.add(ingrediente);
            return this;
        }

        // O método final que constrói o objeto
        public Pizza build() {
            return new Pizza(this);
        }
    }
}

