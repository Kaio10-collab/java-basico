package command;

// Classe ConcreteCommand para desligar a luz
public class ComandoDesligarLuz implements Comando {
    private Luz luz;

    public ComandoDesligarLuz(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.desligar();
    }
}
// Segue a mesma lógica que expliquei na classe ComandoLigarLuz