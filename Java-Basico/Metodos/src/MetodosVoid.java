public class MetodosVoid {

     /*
     Métodos sem retorno (void):
     Usam a palavra-chave void antes do nome do método.
     Executam uma ação, mas não retornam nenhum valor para quem chamou o método.
     Sua principal função é causar efeitos colaterais, como imprimir na tela, modificar variáveis externas ou interagir com algum outro componente.
     */

    public static void main(String[] args) {

        MetodosVoid obj = new MetodosVoid();

        obj.imprimirSoma(5,6);

        int resultadoSoma = obj.soma(5,6);
        System.out.println("O resultado da soma é: " + resultadoSoma);


    }

    // método void - Sem retorno
    public void imprimirSoma(int a, int b) {
        int soma = a + b;
        System.out.println("O resultado da soma é: " + soma);
    }

    // método com retorno do tipo int
    public int soma(int a, int b) {
        return  a + b;
    }

}
