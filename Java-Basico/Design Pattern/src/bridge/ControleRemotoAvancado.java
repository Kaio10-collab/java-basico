package bridge;

// Aqui é uma Abstração Refinada (uma variação do controle remoto)
public class ControleRemotoAvancado extends ControleRemotoBasico {

    public ControleRemotoAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void mutar() {
        System.out.println("Controle Remoto Avancado: comando de mudo.");
        dispositivo.setVolume(0);
    }
    public void aumentar() {
        System.out.println("Controle Remoto Avancado: comando de som.");
        dispositivo.setVolume(30);
    }
}
