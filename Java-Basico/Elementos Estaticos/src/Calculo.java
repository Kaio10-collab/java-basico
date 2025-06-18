public class Calculo {

    // Utilizei paramêtro Varargs nos métodos abaixo, que chama quantas vezes quiser o valor para int, ele é feito através dos ... após o tipo.

    public static int somar(int ... a) {
        return 5 + 8 + 9;
    }

    public static int subtrair(int ... a) {
        return 500 - 8 - 7 - 9;
    }

    // Método de instância (não estático), onde vamos criar uma instância para a classe CalculoEstatico
    public void imprimirMensagem() {
        System.out.println("Olá, este é um método de instância!");
    }

}
