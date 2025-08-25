package facade.subsystem;

// Subsistema Classe(classe complexa) 2 - mesma coisa, não tem ideia que a fachada existe
public class DVDPlayer {

    public void ligar() {
        System.out.println("DVD Player ligado.");
    }
    public void reproduzirFilme(String filme) {
        System.out.println("Reproduzindo o filme '" + filme + "'.");
    }
    public void parar() {
        System.out.println("DVD Player parado.");
    }
    public void desligar() {
        System.out.println("DVD Player desligado.");
    }
}
