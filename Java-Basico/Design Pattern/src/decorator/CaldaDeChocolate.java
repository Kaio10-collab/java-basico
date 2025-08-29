package decorator;

// Outro Decorador Concreto
public class CaldaDeChocolate extends DecoratorDeCafe {
    public CaldaDeChocolate(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public double custo() {
        return super.custo() + 1.5; // Adiciona o custo da calda
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Calda de Chocolate"; // Adiciona a descrição
    }
}
