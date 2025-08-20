package bridge;

// Aqui temos o nosso primeiro implementador concreto, que é a TV
public class Tv implements Dispositivo {

    private boolean ligado = false;
    private int volume = 30;

    @Override
    public boolean estaLigado() {
        return ligado;
    }

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("TV ligada.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("TV desligada.");
    }

    @Override
    public void setVolume(int percentagem) {
        if (estaLigado()) {
            this.volume = percentagem;
            System.out.println("Volume da TV ajustado para " + volume + "%.");
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
