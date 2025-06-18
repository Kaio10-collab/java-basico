public class Livro {

    // Atributos (variáveis de instância) da classe Livro
    String titulo;
    String autor;
    int anoPublicacao;

    // --- 1. Construtor Padrão (sem argumentos) ---
    // É chamado quando você cria um Livro sem fornecer nenhum detalhe.
    // Ele inicializa os atributos com valores padrão ou vazios.
    public Livro() {
        this.titulo = "Título Desconhecido";
        this.autor = "Autor Desconhecido";
        this.anoPublicacao = 0; // 0 pode indicar ano desconhecido ou não aplicável
        System.out.println("Construtor padrão de Livro chamado: Criado livro com valores padrão.");
    }

    // --- 2. Construtor Parametrizado (com título e autor) ---
    // É chamado quando você cria um Livro fornecendo o título e o autor.
    // 'this.titulo' refere-se ao atributo da classe, e 'titulo' sem 'this'
    // refere-se ao parâmetro do construtor.
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 0; // Define um valor padrão para o ano
        System.out.println("Construtor de Livro com Título e Autor chamado: " + titulo + " por " + autor);
    }

    // --- 3. Construtor Mais Completo (com todos os atributos) ---
    // É chamado quando você cria um Livro fornecendo todos os detalhes.
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        System.out.println("Construtor de Livro Completo chamado: " + titulo + " (" + anoPublicacao + ")");
    }

    // Método para exibir os detalhes do livro
    public void exibirDetalhes() {
        System.out.println("\nDetalhes do Livro:");
        System.out.println("  Título: " + this.titulo);
        System.out.println("  Autor: " + this.autor);
        System.out.println("  Ano de Publicação: " + (this.anoPublicacao == 0 ? "Não informado" : this.anoPublicacao));
    }
}
