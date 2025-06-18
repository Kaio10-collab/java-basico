import java.util.ArrayList;

public class TiposWrappers {

    /*
    Há dois grupos principais de tipos de dados: os tipos primitivos (como int, double, boolean, char), como vimos na classe TiposPrimitivos e os tipos de referência (objetos).
    Os tipos primitivos são leves e eficientes para armazenar valores simples, mas eles não são objetos.
    Isso significa que eles não podem ser usados em coleções (como ArrayList ou HashMap), em métodos que esperam objetos (como Object como parâmetro) ou
    para representar a ausência de valor (nulo). É aí que entram os tipos wrappers (ou classes invólucro).
    Para cada tipo primitivo, existe uma classe wrapper correspondente que irei mostrar abaixo com o código.
    O Wrapper tem suas vantagens de trabalhar, pois permite conversões de tipos, manipulações de string(tem um classe só disso, a ManipulacaoString), etc...
    Eles podem ser null, já que os primitivos não podem ser null, além disso conseguimos utilizar em coleções como ArrayList, HashMap, HashSet, etc...
    */

    public static void main(String[] args) {

        // --- 1. Declaração e Inicialização ---

        // Declarando um tipo primitivo 'int'
        int numeroPrimitivo = 100;
        System.out.println("1. Valor do int primitivo: " + numeroPrimitivo);

        // Declarando um tipo wrapper 'Integer'
        // Autoboxing: o Java converte automaticamente '100' (int) para 'Integer'
        Integer numeroWrapper = 200;
        System.out.println("   Valor do Integer wrapper: " + numeroWrapper);

        // Também podemos criar um Integer a partir de um int primitivo via autoboxing
        Integer numeroWrapperDoPrimitivo = numeroPrimitivo;
        System.out.println("   Integer wrapper criado de um int primitivo (autoboxing): " + numeroWrapperDoPrimitivo);

        System.out.println("---");

        // --- 2. Usando Tipos Wrappers com Coleções (ArrayList) ---

        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        // Aqui não poderia ser ArrayList<int>, pois os primitivos não podem trabalhar com as coleções.
        // Mas a gente pode realizar conversões do int para o Integer e criar uma lista abaixo:

        // Autoboxing em ação: Adicionando int primitivos na lista de Integer, se entrar no método add, poderemos vê que é um int que é convertido para Integer
        listaDeNumeros.add(50);   // 50 (int) é convertido automaticamente para new Integer(50)
        listaDeNumeros.add(75);   // 75 (int) é convertido automaticamente para new Integer(75)
        listaDeNumeros.add(numeroPrimitivo); // numeroPrimitivo (int) é convertido automaticamente

        System.out.println("2. Lista de números (ArrayList<Integer>): " + listaDeNumeros);

        System.out.println("---");

        // --- 3. Unboxing: Convertendo Wrapper de volta para Primitivo ---

        // Unboxing: o Java converte automaticamente 'numeroWrapper' (Integer) para 'int'
        int numeroExtraido = numeroWrapper;
        System.out.println("3. int extraído de Integer wrapper (unboxing): " + numeroExtraido);

        // Acessando um elemento da lista e realizando unboxing
        int primeiroNumeroDaLista = listaDeNumeros.getFirst(); // get(0) retorna um Integer(no caso o 50), que é unboxed para int
        System.out.println("   Primeiro número da lista (unboxing): " + primeiroNumeroDaLista);

        System.out.println("---");

        // --- 4. Métodos Utilitários das Classes Wrapper ---

        // Convertendo String para int usando Integer.parseInt()
        String textoNumero = "12345";
        int numeroConvertido = Integer.parseInt(textoNumero); // como mencionei antes, aqui conseguimos trabalhar com conversões de tipos, no caso de String para int
        System.out.println("4. String '" + textoNumero + "' convertida para int: " + numeroConvertido);

        // Convertendo int para String usando Integer.toString()
        String numeroParaTexto = Integer.toString(54321); // aqui foi o inverso da conversão de antes, do int para string.
        System.out.println("   int '54321' convertido para String: " + numeroParaTexto);

        // Obtendo o valor máximo de um Integer
        System.out.println("   Valor máximo que um Integer pode armazenar: " + Integer.MAX_VALUE);

        // Obtendo o valor mínimo de um Integer
        System.out.println("   Valor mínimo que um Integer pode armazenar: " + Integer.MIN_VALUE);

        System.out.println("---");

        // --- 5. Nullabilidade dos Tipos Wrappers ---

        // Um Integer pode ser null
        Integer numeroNulo = null;
        System.out.println("5. Integer wrapper pode ser null: " + numeroNulo);

        // Um int primitivo NÃO pode ser null (isso resultaria em erro de compilação)
        // int outroNumeroPrimitivo = null; Isso geraria um erro de compilação

        System.out.println("---");

        // Exemplo de erro comum ao tentar unbox um wrapper nulo para um primitivo
        try {
            Integer possivelNumeroNulo = null;
            // int valorNulo = possivelNumeroNulo; // Isso causaria um NullPointerException
            System.out.println("Tentando atribuir um Integer null a um int primitivo (comentado para evitar erro):");
            System.out.println("   Comentado: int valorNulo = possivelNumeroNulo; Causaria NullPointerException");
        } catch (NullPointerException e) {
            System.out.println("   Erro capturado: " + e.getMessage() + " (NullPointerException ao unboxar null)");
        }
    }
}
