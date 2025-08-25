package facade;

import facade.subsystem.DVDPlayer;
import facade.subsystem.SistemaDeSom;
import facade.subsystem.TV;

public class PrincipalFacade {

    public static void main(String[] args) {
        // Criando as classes do subsistema
        TV tv = new TV();
        DVDPlayer dvd = new DVDPlayer();
        SistemaDeSom som = new SistemaDeSom();

        // Criando a fachada e passando as classes do subsistema para ela
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, dvd, som);

        // Usando a fachada com comandos simples
        homeTheater.assistirFilme("O Senhor dos Anéis");
        homeTheater.pararFilme();
    }
}
