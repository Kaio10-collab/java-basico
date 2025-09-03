package Flyweight;

// nossa classe de "peso-pena". Ela contêm o estado intrínseco e o método para desenhar a árvore.
public class Carvalho implements Arvore {

    private final String tipo;
    private final String cor;
    private final String textura;

    public Carvalho() {
        this.tipo = "Carvalho";
        this.cor = "Marrom";
        this.textura = "Casca enrugada";
        System.out.println("Criando um Carvalho (Flyweight).");
    }

    @Override
    public void desenhar(int x, int y, int z) {
        System.out.println("Desenhando Carvalho em (" + x + ", " + y + ", " + z + ") - Cor: " + cor + ", Textura: " + textura);
    }
}
/*
É a nossa classe ConcreteFlyweight, onde implementamos o Flyweight.
Ela armazena e compartilha o estado intrínseco (o tipo, a cor e a textura).
Seu método desenhar() usará o estado intrínseco que ela armazena e o estado extrínseco (a posição x, y, z) que ela recebe como parâmetro.
Um único objeto Pinheiro será usado por centenas de árvores na floresta.
O mesmo vale para a classe Carvalho.
 */