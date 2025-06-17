//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        /*
        Tipos primitivos
        Esses tamanhos em bytes referem-se à quantidade de memória que cada tipo primitivo utiliza quando declarado em um programa Java.
        Isso é importante para a eficiência da memória, especialmente em aplicações que manipulam grandes quantidades de dados.
        */

        int numero = 10; // utilizado para armazenar números inteiros como 10, -5. Ocupa 4 bytes na memória
        byte b = 100; // armazena valores de -128 a 127, útil para economizar memórias em grandes arrays de números
        short s = 1000; // ocupa 2 bytes e armazena valores de -32.768 a 32.767
        long l = 100000L; // armazena números inteiros muitos longos, o l no final é para indicar que é long
        float f = 10.5f; // armazena números decimais, ocupa 4 bytes. O f no final é para indicar que é float
        double d = 20.5; // armazena números decimais com maior precisão, ocupra 8 bytes. É o padrão em java
        char c = 'A'; // armazena um único caractere, ocupa 2 bytes, formato unicode
        boolean isTrue = true; // armazena valores de verdade ou falso, ocupa 1 byte

        /*
        Estruturas de Controle em Java
        */

        if (numero > 0) {
            for (int i = 0; i < 5; i++) {
                System.out.println("O número é positivo.");
                System.out.println("Número " + i);
            }
        } else {
            System.out.println("O número é negativo ou zero");
        }
    }
}