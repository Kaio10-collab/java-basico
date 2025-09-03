package Flyweight;

// nossa interface base, o flyweight
public interface Arvore {

    void desenhar(int x, int y, int z);
}
/*
Esta é a interface ou classe abstrata que vai definir os métodos que o cliente usará.
Ela precisa ter um método que receba o estado extrínseco como parâmetro.
 */