public class ExcecaoPrincipal {

    public static void main(String[] args) {

        try {
            verificarIdade(15);
        } catch (ExcecaoMensagem e) {
            System.out.println("Erro: " + e.getMessage()); // como capturamos a exceção lá no método verificarIdade, ele irá exibir a mensagem de erro.
        }
    }

    public static void verificarIdade(int idade) throws ExcecaoMensagem {

        // Um calcúlo simples para verificar a idade.
        if (idade < 18) {
            throw new ExcecaoMensagem("A idade deve ser igual ou maior de 18."); // a idade é 15, logo é inferior a 18 anos, então ele vai capturar a exceção que criamos.
        }
        System.out.println("Idade válida : " + idade);
    }
}
