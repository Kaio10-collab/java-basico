public class Animal {

    // SUGIRO QUE FAÇA A LEITURA DO ARQUIVO DENTRO DO MODULO PARA ENTENDER OS CONCEITOS ANTES DE VIR POR CÓDIGO.
    // Aqui será a classe base, com todos os atributos que um animal pode ter, além de métodos genéricos.

    // Atributos (características) do animal
    // Usaremos o 'protected' para que as classes filhas(Cachorro e Gato) possam acessá-los diretamente e ao mesmo tempo manter um certo nível de encapsulamento perante o mundo exterior. Para que ninguém possa acessar.
    protected String nome;
    protected int idade;

    // Construtor: Um método especial para criar (inicializar) objetos da classe Animal
    // Ele é chamado quando você utilizo o 'new Animal(...)'.
    public Animal(String nome, int idade) {
        this.nome = nome; // 'this.nome' refere-se ao atributo da classe, 'nome' refere-se ao parâmetro do construtor
        this.idade = idade;
    }

    // Método genérico (comportamento): Permite o animal emitir um som
    public void emitirSom() {
        System.out.println("O animal faz um som genérico.");
    }

    // Método genérico: Permite o animal comer
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    // PODERIA UTILIZAR O LOMBOK PARA DIMINUIR A QUANTIDADE DO CÓDIGO, PORÉM O FOCO AQUI É ENTENDEMOS O ENCAPSULAMENTO.

    // Métodos Getters (Acessores): Permitem recuperar os valores dos atributos
    // Isso é parte do encapsulamento. Em vez de acessar nome diretamente, você usa getNome().
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Métodos Setters (Modificadores): Permitem alterar os valores dos atributos
    // Também faz parte do encapsulamento.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}