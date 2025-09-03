package Flyweight;

import java.util.Random;

public class FlyweightMain {

    //  vamos simular a criação de uma floresta. Perceba que, mesmo criando muitas árvores, o número de objetos Pinheiro e Carvalho criados é muito pequeno.
    public static void main(String[] args) {
        FabricaDeArvores fabrica = new FabricaDeArvores();
        Random random = new Random();

        // Criando uma floresta com 10 árvores
        for (int i = 0; i < 10; i++) {
            String tipo = (random.nextBoolean()) ? "Pinheiro" : "Carvalho";

            // A fábrica retorna o objeto compartilhado
            Arvore arvore = fabrica.getArvore(tipo);

            // Cada árvore tem um estado extrínseco (posição) diferente
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            int z = random.nextInt(100);

            arvore.desenhar(x, y, z);
        }
    }
}
/*
Perceba que a mensagem "Criando um Pinheiro..." e "Criando um Carvalho..." aparece apenas uma vez cada, independentemente de quantas árvores sejam criadas.
Isso prova que estamos reutilizando os objetos, economizando memória. O estado extrínseco (a posição) é o único que muda a cada iteração.
 */