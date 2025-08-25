package facade;

import facade.subsystem.DVDPlayer;
import facade.subsystem.SistemaDeSom;
import facade.subsystem.TV;

// Nossa classe facade(fachada), que vai simplificar a vida do cliente, ao coordenar todas as chamadas para as classes do subsistema
public class HomeTheaterFacade {

    private TV tv;
    private DVDPlayer dvd;
    private SistemaDeSom som;

    public HomeTheaterFacade(TV tv, DVDPlayer dvd, SistemaDeSom som) {
        this.tv = tv;
        this.dvd = dvd;
        this.som = som;
    }

    public void assistirFilme(String filme) {
        System.out.println("\nPreparando para assistir a um filme...");
        tv.ligar();
        tv.selecionarEntrada("DVD");
        dvd.ligar();
        som.ligar();
        som.ajustarVolume(50);
        dvd.reproduzirFilme(filme);
    }

    public void pararFilme() {
        System.out.println("\nDesligando o home theater...");
        dvd.parar();
        dvd.desligar();
        som.desligar();
        tv.desligar();
    }
}
// Vamos observar como a lógica é complexa ao ligamos todos os aparelhos e ajustamos as configurações ao encapsular dentro dos métodos assistirFilme e pararFilme