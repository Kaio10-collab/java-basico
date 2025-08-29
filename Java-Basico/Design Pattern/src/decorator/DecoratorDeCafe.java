package decorator;

// Aqui é a classe Decorator abstrato
abstract class DecoratorDeCafe implements Cafe {

    protected Cafe cafeDecorado;

    public DecoratorDeCafe(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    @Override
    public double custo() {
        return cafeDecorado.custo();
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao();
    }
}
/*
É uma classe abstrata que também implementa a interface Componente, no caso a classe Cafe.
A principal característica dela é que ela contém uma referência a um objeto Componente. É essa referência que permite que ela "envolva" outros objetos.
Ela serve como a classe-mãe para todos os decoradores concretos.
Basicamente, ela é a nossa "ponte" que permite que os decoradores envolvam outros objetos.
*/