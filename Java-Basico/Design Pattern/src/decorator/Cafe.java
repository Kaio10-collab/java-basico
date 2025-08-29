package decorator;

// Nossa interface que será a base de tudo, tanto para os objetos simples quanto para os decoradores.
public interface Cafe {
    double custo();
    String getDescricao();
}