package facade.subsystem;

// Subsistema Classe(classe complexa) 3 - mesma coisa, não tem ideia que a fachada existe
public class SistemaDeSom {

    public void ligar() {
        System.out.println("Sistema de som ligado.");
    }
    public void ajustarVolume(int volume) {
        System.out.println("Volume do som ajustado para " + volume + ".");
    }
    public void desligar() {
        System.out.println("Sistema de som desligado.");
    }
}
