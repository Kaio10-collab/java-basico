public class Gato extends Animal {

    // SUGIRO QUE FAÇA A LEITURA DO ARQUIVO DENTRO DO MODULO PARA ENTENDER OS CONCEITOS ANTES DE VIR POR CÓDIGO.

    /*
    A palavra extends indica herança, ou seja, a classe Gato vai herdar da classe Animal.
    */

    // Atributo específico de Gato
    private boolean temBigodes;

    // Construtor da classe Gato + Animal
    public Gato(String nome, int idade, boolean temBigodes) {
        super(nome, idade); // Chama o construtor de Animal
        this.temBigodes = temBigodes;
    }

    // Método específico de Gato: miar
    public void miar() {
        System.out.println(nome + " está miando: Miau!");
    }

    // Sobrescrita de método para emitirSom()
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz som de gato: Purrrr!");
    }

    // Getter para o atributo temBigodes
    public boolean temBigodes() {
        return temBigodes;
    }

    // Setter para o atributo temBigodes
    public void setTemBigodes(boolean temBigodes) {
        this.temBigodes = temBigodes;
    }
}
