package command;

//Classe Receiver(o receptor)
public class Luz {

    private String localizacao;

    public Luz(String localizacao) {
        this.localizacao = localizacao;
    }

    public void ligar() {
        System.out.println(localizacao + " da luz está ligada.");
    }

    public void desligar() {
        System.out.println(localizacao + " da luz está desligada.");
    }
}
// Aqui será a classe que realmente executa a ação. Ela sabe como realizar as operações que será ligada ou desligada.