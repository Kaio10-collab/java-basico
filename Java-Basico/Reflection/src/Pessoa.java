
public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    // Método privado para demonstração
    private String saudacaoPrivada() {
        return "Olá de forma privada, eu sou " + nome + "!";
    }

    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', idade=" + idade + '}';
    }
}
