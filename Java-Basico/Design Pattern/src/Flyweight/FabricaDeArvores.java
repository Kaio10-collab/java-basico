package Flyweight;

import java.util.HashMap;
import java.util.Map;

// O Flyweight Factory, nossa fábrica, onde garantimos que os objetos sejam compartilhados.
public class FabricaDeArvores {

    private static final Map<String, Arvore> arvoreTipos = new HashMap<>();

    public Arvore getArvore(String tipo) {
        Arvore arvore = arvoreTipos.get(tipo);

        if (arvore == null) {
            arvore = switch (tipo.toLowerCase()) {
                case "pinheiro" -> new Pinheiro();
                case "carvalho" -> new Carvalho();
                default -> throw new IllegalArgumentException("Tipo de árvore inválido.");
            };
            arvoreTipos.put(tipo, arvore);
        }
        return arvore;
    }
}
/*
Esta é a "fábrica" que gerencia e reutiliza os objetos Flyweight.
Ela tem uma lista (geralmente um HashMap ou Map) para armazenar as instâncias dos ConcreteFlyweights que já foram criados.
Quando um cliente pede um objeto, a fábrica primeiro verifica se já existe uma instância com o mesmo estado intrínseco. Se sim, ela retorna o objeto existente. Se não, ela cria um novo objeto, o armazena e o retorna.
Isso garante que nunca teremos mais de uma instância para cada tipo de árvore.
 */