package decorator;

// Classe decorator concreto
public class Chantilly extends DecoratorDeCafe {

    public Chantilly(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public double custo() {
        return super.custo() + 2.0; // Adiciona o custo do chantilly
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Chantilly"; // Adiciona a descrição
    }
}
/*
São as classes que estendem o Decorator Abstrato.
Cada uma delas adiciona uma nova funcionalidade ao objeto.
Elas interceptam as chamadas aos métodos (getDescricao() e custo()) e adicionam seu próprio comportamento antes ou depois de chamar o método do objeto que elas estão "envolvendo".

Por exemplo, a classe Chantilly adicionaria "+ Chantilly" à descrição e +2.0 ao custo total.
*/