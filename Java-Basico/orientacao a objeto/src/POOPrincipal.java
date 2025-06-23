public class POOPrincipal {

    public static void main(String[] args) {

        // SUGIRO QUE FAÇA A LEITURA DO ARQUIVO DENTRO DO MODULO PARA ENTENDER OS CONCEITOS ANTES DE VIR POR CÓDIGO.

        // Criando um objeto da classe Cachorro
        System.out.println("--- Criando um Cachorro ---");
        Cachorro meuCachorro = new Cachorro("Rex", 5, "Labrador"); // 'meuCachorro' é um objeto
        System.out.println("Nome do cachorro: " + meuCachorro.getNome()); // Acessando atributos via getter
        System.out.println("Idade do cachorro: " + meuCachorro.getIdade() + " anos");
        System.out.println("Raça do cachorro: " + meuCachorro.getRaca());

        meuCachorro.latir(); // Chamando método específico de Cachorro
        meuCachorro.emitirSom(); // Chamando método sobrescrito (polimorfismo)
        meuCachorro.comer(); // Chamando método herdado de Animal

        // Modificando um atributo via setter
        meuCachorro.setIdade(6);
        System.out.println("Nova idade do cachorro: " + meuCachorro.getIdade() + " anos\n");

        // Criando um objeto da classe Gato
        System.out.println("--- Criando um Gato ---");
        Gato meuGato = new Gato("Mimi", 3, true); // 'meuGato' é um objeto
        System.out.println("Nome do gato: " + meuGato.getNome());
        System.out.println("Idade do gato: " + meuGato.getIdade() + " anos");
        System.out.println("Tem bigodes: " + meuGato.temBigodes());

        meuGato.miar(); // Chamando método específico de Gato
        meuGato.emitirSom(); // Chamando método sobrescrito (polimorfismo)
        meuGato.comer(); // Chamando método herdado de Animal

        // Exemplo de polimorfismo com a classe pai
        System.out.println("\n--- Polimorfismo com Animal ---");
        // Uma variável do tipo Animal pode referenciar um objeto Cachorro
        Animal animalGenerico1 = new Cachorro("Bob", 8, "Vira-lata");
        System.out.println("Nome do animal genérico 1: " + animalGenerico1.getNome());
        animalGenerico1.emitirSom(); // Chama o emitirSom() do Cachorro

        // Uma variável do tipo Animal pode referenciar um objeto Gato
        Animal animalGenerico2 = new Gato("Salem", 2, false);
        System.out.println("Nome do animal genérico 2: " + animalGenerico2.getNome());
        animalGenerico2.emitirSom(); // Chama o emitirSom() do Gato
    }
}