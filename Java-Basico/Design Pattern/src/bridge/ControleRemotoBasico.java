package bridge;

// Agora, vamos criar a nossa abstração, que é a classe que contém a referência para a Implementação
public class ControleRemotoBasico {

   /*
   Lembrando que essa classe não sabe o que é uma TV, ele vai apenas ter uma referência genérica a um "Dispositivo".
   */

    protected Dispositivo dispositivo;

    public ControleRemotoBasico(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void ligar() {
        System.out.println("Controle Remoto: comando de ligar.");
        dispositivo.ligar();
    }

    public void desligar() {
        System.out.println("Controle Remoto: comando de desligar.");
        dispositivo.desligar();
    }
}
