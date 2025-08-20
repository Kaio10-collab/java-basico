package bridge;

public interface Dispositivo {
    /*
    O Implementador (a interface em que definimos o nosso contrato para os dispositivos).
    vamos definir a interface para o que a "ponte" vai se conectar: os dispositivos. Essa é a nossa hierarquia de Implementação.
    */

    boolean estaLigado();
    void ligar();
    void desligar();
    void setVolume(int percentagem);
    int getVolume();
}
