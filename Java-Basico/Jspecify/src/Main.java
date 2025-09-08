public class Main {
    public static void main(String[] args) {

        UtilidadesDoSistema util = new UtilidadesDoSistema();
        var textoNulo =  "teste"; // se fosse null teria uma expection.
        int resultado = util.contarCaracteres(textoNulo); // Tentando passar um valor 'null'
        System.out.println(resultado);

        UtilidadesDoSistema utilMensagem = new UtilidadesDoSistema();
        // Quando é nullable, então dizendo que podemos aceitar null ou não
        var resultadoMsg = utilMensagem.criarMensagem(null);
        System.out.println(resultadoMsg);
    }

}