public class TryCatchPrincipal {

    /*
    Para entedemos um pouco sobre o try catch e finally
    */

    public static void main(String[] args) {

        String frase = null; // se vira String ele passa, mas se deixa como null, vai capturar a exceção
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e) { //CAPTURA DA POSSÍVEL exceção.
            //TRATAMENTO DA exceção
            System.out.println("O frase inicial está nula, para solucionamos o problema, foi lhe atribuido um valor default.");
            frase = "Frase vazia";
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);

        try {
            int resultado = divisao(10, 0); // para vemos a exceção. o b precisa ser declarado como 0
            System.out.println("Resultado: " + resultado); // Aqui vai estourar, pois estamos dividindo 10 por 0
        } catch (ArithmeticException e) { // utilizamos o ArithmeticException que já que a finalidade é testar números
            System.out.println("Erro: " + e.getMessage()); // Aqui captura e trata a exceção feita no bloco try
        } finally {
            System.out.println("Bloco finally executado."); // Vai sempre ocorrer independente da exceção ter ocorrida ou não
        }
    }

    public static int divisao(int a, int b) {
        return a / b; // Pode lançar ArithmeticException se b for zero
    }
}
