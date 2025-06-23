public class Cachorro extends Animal {

    // SUGIRO QUE FAÇA A LEITURA DO ARQUIVO DENTRO DO MODULO PARA ENTENDER OS CONCEITOS ANTES DE VIR POR CÓDIGO.

    /*
    A palavra extends indica herança, ou seja, a classe Cachorro vai herdar da classe Animal.
    */

    // Atributo específico de Cachorro (além dos herdados de Animal)
    private String raca;

    // Construtor da classe Cachorro
    // Usa 'super()' para chamar o construtor da classe pai (Animal), quando utiliza herançca precisamos realizar um super, que chama os atributos da classe Animal mais da classe Cachorro
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade); // Chama o construtor de Animal com nome e idade
        this.raca = raca;
    }

    // Método específico de Cachorro: latir
    public void latir() {
        System.out.println(nome + " está latindo: Au Au!");
    }

    // Sobrescrita de método: implementa 'emitirSom()' de uma forma específica para Cachorro
    // @Override é uma anotação que indica que este método está sobrescrevendo um método da superclasse, é um caso de polimorfismo que estamos implementando aqui
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz som de cachorro: Woof Woof!");
    }

    // Getter para o atributo raça
    public String getRaca() {
        return raca;
    }

    // Setter para o atributo raça
    public void setRaca(String raca) {
        this.raca = raca;
    }
}
