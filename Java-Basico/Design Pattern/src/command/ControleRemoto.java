package command;

// Classe Invoker (o solicitante)
public class ControleRemoto {

    private Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void pressionarBotao() {
        comando.executar();
    }
}
/*
É a nossa classe que solicita a ação, ela sabe que tem um Comando para executar, sem se importar com a Luz.
É a classe que solicita a execução do comando. Ela tem uma referência a um objeto Command e, em algum momento, chama o seu método executar().
O Invoker não sabe qual ConcreteCommand ele está usando; ele só sabe que pode chamar o método executar(). Pense em um botão de "clicar" genérico, que só sabe que, ao ser clicado, deve executar um comando.
*/