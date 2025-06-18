public class ConstrutorPrincipal {

    /*
    Um construtor é, nada menos que um método especial em que é chamado automaticamente quando você cria uma nova instância de uma classe (ou seja, um novo objeto).
    O principal objetivo de um construtor é inicializar o estado do objeto, garantindo que ele comece com valores válidos e prontos para uso.
    */

    public static void main(String[] args) {

        System.out.println("--- Testando Construtores de Livro ---");

        // --- Usando o Construtor Padrão ---
        // Cria um objeto Livro usando o construtor sem argumentos.
        // Os atributos serão inicializados com os valores padrão definidos no construtor.
        System.out.println("\nCriando Livro com Construtor Padrão:");
        Livro livro1 = new Livro(); // criei a instancia com o constructor
        livro1.exibirDetalhes(); // Exibe os detalhes do livro1

        // --- Usando o Construtor com Título e Autor ---
        // Cria um objeto Livro fornecendo apenas o título e o autor.
        // O anoPublicacao será 0, conforme definido no construtor.
        System.out.println("\nCriando Livro com Título e Autor:");
        Livro livro2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
        livro2.exibirDetalhes(); // Exibe os detalhes do livro2

        // --- Usando o Construtor Completo ---
        // Cria um objeto Livro fornecendo todos os atributos.
        System.out.println("\nCriando Livro com Todos os Detalhes:");
        Livro livro3 = new Livro("1984", "George Orwell", 1949);
        livro3.exibirDetalhes(); // Exibe os detalhes do livro3

        // Você também poderia criar um objeto Livro e depois definir seus atributos
        // (mas isso não usa o construtor para a inicialização principal).
        System.out.println("\nCriando Livro e Definindo Atributos Manualmente (sem construtor):");
        Livro livro4 = new Livro(); // Usa o construtor padrão
        livro4.titulo = "A Metamorfose";
        livro4.autor = "Franz Kafka";
        livro4.anoPublicacao = 1915;
        livro4.exibirDetalhes(); // Exibe os detalhes do livro4

        System.out.println("\n--- Fim do Exemplo ---");
    }
}