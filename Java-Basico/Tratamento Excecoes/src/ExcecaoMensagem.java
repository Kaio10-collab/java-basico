// Aqui vamos extends a classe Exception
public class ExcecaoMensagem extends Exception{

    /*
    Vamos criar uma classe de exception customizada.
    */
    public ExcecaoMensagem(String mensagem) {
        super(mensagem);
    }
}