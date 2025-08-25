package command;
// nossa classe ConcreteCommand para ligar a luz
public class ComandoLigarLuz implements Comando {
    private Luz luz;

    public ComandoLigarLuz(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.ligar();
    }
}
// Aqui os comando que vamos implementar com a interface. Cada um deles empacota uma ação e uma referência para o Receiver(Classe Luz)