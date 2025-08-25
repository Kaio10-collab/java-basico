package command;

public class PrincipalLuz {

    // Aqui vamos conectar todas as partes que criamos para a aplicação do design patterns command.
    public static void main(String[] args) {
        // O Receiver
        Luz luzDaSala = new Luz("Sala");

        // Os ConcreteCommands
        Comando ligarLuz = new ComandoLigarLuz(luzDaSala);
        Comando desligarLuz = new ComandoDesligarLuz(luzDaSala);

        // O Invoker
        ControleRemoto controle = new ControleRemoto();

        // Usando o controle para ligar a luz
        controle.setComando(ligarLuz);
        controle.pressionarBotao();

        // Usando o controle para desligar a luz
        controle.setComando(desligarLuz);
        controle.pressionarBotao();
    }
}
