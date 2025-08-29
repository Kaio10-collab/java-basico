package decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        // Criando um Expresso simples
        Cafe meuCafe = new Expresso();
        System.out.println("Pedido: " + meuCafe.getDescricao());
        System.out.println("Custo: R$" + meuCafe.custo());

        System.out.println("--------------------");

        // Decorando o café com chantilly
        meuCafe = new Chantilly(meuCafe);
        System.out.println("Pedido: " + meuCafe.getDescricao());
        System.out.println("Custo: R$" + meuCafe.custo());

        System.out.println("--------------------");

        // Adicionando calda de chocolate ao café com chantilly
        meuCafe = new CaldaDeChocolate(meuCafe);
        System.out.println("Pedido: " + meuCafe.getDescricao());
        System.out.println("Custo: R$" + meuCafe.custo());
    }
}
/*
Viu como, sem precisar de novas classes para cada combinação, aqui conseguimos adicionar funcionalidades dinamicamente.
O objeto meuCafe muda de "tipo" em tempo de execução, e o código do cliente continua o mesmo. Isso é a flexibilidade do Padrão Decorator em ação.
*/