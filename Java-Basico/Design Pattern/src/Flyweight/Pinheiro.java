package Flyweight;

// nossa classe de "peso-pena". Ela contêm o estado intrínseco e o método para desenhar a árvore.
public class Pinheiro implements Arvore {

    private final String tipo;
    private final String cor;
    private final String textura;

    public Pinheiro() {
        this.tipo = "Pinheiro";
        this.cor = "Verde-escuro";
        this.textura = "Casca áspera";
        System.out.println("Criando um Pinheiro (Flyweight).");
    }

    @Override
    public void desenhar(int x, int y, int z) {
        System.out.println("Desenhando Pinheiro em (" + x + ", " + y + ", " + z + ") - Cor: " + cor + ", Textura: " + textura);
    }
}
