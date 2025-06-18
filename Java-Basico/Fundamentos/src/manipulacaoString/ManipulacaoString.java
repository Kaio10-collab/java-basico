package manipulacaoString;

import java.util.Arrays;

public class ManipulacaoString {

    /*
     O String, é nada mais, que uma classe Wrapper do tipo primitivo chat, podemos referenciar várias coisas com a String.
    */

    public static void main(String[] args) {

        String text = "Hello World";

        var comprimento = text.length(); // vai imprimir o total de contagem do primeiro caracter até o último, o espaço também conta.
        System.out.println(comprimento);

        var primeiroCaractere = text.charAt(6); // vai exibir o caracter na posição, sempre inicia no 0, espaço vazio não conta
        System.out.println(primeiroCaractere);

        var subText = text.substring(0,6); // extração de uma parte da string
        System.out.println(subText);

        var substituirCaractere = text.replace("Hello", "Olá"); // substitui a string antiga pela nova
        System.out.println(substituirCaractere);

        var conversaoStringMinusculo = text.toLowerCase(); // deixa tudo minusculo
        var conversaoStringMaiusculo = text.toUpperCase(); // deixa tudo maiusculo
        System.out.println(conversaoStringMinusculo);
        System.out.println(conversaoStringMaiusculo);

        var string1 = "Java";
        var string2 = "Java";
        var saoIguais = string1.equals(string2); // compara se as strings são iguais e retorna true ou false
        System.out.println(saoIguais);
        var compare = string1.compareTo("Javal"); // aqui compara as strings e retorna o valor que seria diferente, no caso Java, vai vir 0 mas se qualquer string for diferente, ele vai contabilizar.
        System.out.println(compare);
        System.out.println(string1.compareToIgnoreCase("JAVA") == 0); // ignora diferença entre minusculo e maiusculo, compara apena se os caracteres são iguais e retorna true ou false

        var divisaoStrig = "cachorro, gato, cobra, sapo";
        String[] listaDividida = divisaoStrig.split(","); // separamos cada string e retornamos uma por uma.
        for (String divisao : listaDividida) {
            System.out.println("Lista: " + divisao);
        }
        System.out.println(Arrays.toString(listaDividida)); // retorna uma lista com as string

        var valor = "DEVMEDIA - JAVA";
        System.out.println(valor.codePointAt(0)); // Retorna o valor em UNICODE do caractere especificado no index do parâmetro
        // Note que a codificação da letra 'D' correspondente a posição 0 na nossa String é igual a 68, considerando a codificação UNICODE.

        System.out.println(valor.endsWith("Java")); // verifica se a string final termina com o mesmo valor
        System.out.println(valor.startsWith("DEV")); // verifica se a string no começo termina com o mesmo valor
        System.out.println(valor.startsWith("ME", 3)); // verifica a partir do ponto fixado(3)
        System.out.println(valor.trim()); // remove espaços em branco no inicial e no final da string.

        for(char c : valor.toCharArray()){ // convertemos a string em um array de char, vai ser impresso cada caracter
            System.out.println("Char: "+c);
        }

        boolean myBoolean = true;
        System.out.println(myBoolean); // o valueOf converte em String qualquer tipo

        float myFloat = -10;
        System.out.println(myFloat); // o valueOf converte em String qualquer tipo

        int myInt = 9;
        System.out.println(myInt); // o valueOf converte em String qualquer tipo

        double myDouble = 10.30;
        System.out.println(myDouble); // o valueOf converte em String qualquer tipo

        CharSequence str1 = "Olá, Mundo!";
        printCharSequence(str1);

        StringBuilder str2 = new StringBuilder("Programando em Java");
        printCharSequence(str2);

        StringBuffer str3 = new StringBuffer("Concorrência em Java");
        printCharSequence(str3);

    }

    public static void printCharSequence(CharSequence cs) {
        System.out.println("Tamanho: " + cs.length());
        System.out.println("Primeiro caractere: " + cs.charAt(0));
        System.out.println("Subsequência (0, 5): " + cs.subSequence(0, 5));
    }

}
