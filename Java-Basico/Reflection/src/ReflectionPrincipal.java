import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionPrincipal {

    public static void main(String[] args) {
        System.out.println("--- Exemplo de Reflection ---");

        // Obtendo a classe Pessoa em tempo de execução
        Class<?> classePessoa = null;

        try {
            //  Temos duas formas de obter a classe:
            // classePessoa = Pessoa.class; // Se a classe já for conhecida
            classePessoa = Class.forName("Pessoa"); // Se a classe for conhecida apenas pelo nome (String), é o ponto de partida do Reflection, obtemos um objeto class que representa a classe Pessoa
            System.out.println("\nClasse obtida: " + classePessoa.getName());
        } catch (ClassNotFoundException e) {
            System.err.println("Classe não encontrada: " + e.getMessage()); // Lança expection se não encontrar a classe
            return;
        }

        // Criando uma instância de Pessoa dinamicamente
        Pessoa pessoa = null;
        try {
            // Obtendo o construtor que aceita String e int
            Constructor<?> construtor = classePessoa.getConstructor(String.class, int.class); // como o nome diz, é um constructor que aceita 2 paramÊtros, String e int.
            // Criando uma nova instância usando o construtor
            pessoa = (Pessoa) construtor.newInstance(" Maria", 30); // invocamos o constructor que definimos e em seguida cria uma instância da classe Pessoa com os valores que declaramos, no caso Maria e 30.
            System.out.println("Pessoa criada dinamicamente: " + pessoa);
        } catch (Exception e) {
            System.err.println("Erro ao criar instância: " + e.getMessage());
        }

        // Acessando e modificando campos (mesmo privados)
        if (pessoa != null) {
            try {
                // Obtendo o campo 'nome'
                Field campoNome = classePessoa.getDeclaredField("nome");

                // Tornando o campo acessível (necessário para campos privados)
                campoNome.setAccessible(true);

                // Obtendo o valor do campo 'nome'
                var nomeAtual = (String) campoNome.get(pessoa);
                System.out.println("Nome atual (via Reflection): " + nomeAtual);

                // Modificando o valor do campo 'nome'
                campoNome.set(pessoa, "Pedro");
                System.out.println("Nome após modificação (via Reflection): " + pessoa.getNome()); // Usando o getter para confirmar se vem Pedro
            } catch (Exception e) {
                System.err.println("Erro ao acessar/modificar campo: " + e.getMessage());
            }

            // Invocando métodos (mesmo privados)
            try {
                // Obtendo o método 'getNome'
                Method metodoGetNome = classePessoa.getMethod("getNome"); // busca por método publico, poderia ser setNome,setIdade,getIdade.

                // Invocando o método 'getNome'
                var nomeViaMetodo = (String) metodoGetNome.invoke(pessoa);
                System.out.println("Nome via método getNome() (via Reflection): " + nomeViaMetodo);

                // Obtendo o método privado 'saudacaoPrivada'
                Method metodoPrivado = classePessoa.getDeclaredMethod("saudacaoPrivada");

                // Tornando o método acessível (necessário para métodos privados)
                metodoPrivado.setAccessible(true);

                // Invocando o método privado
                var saudacao = (String) metodoPrivado.invoke(pessoa);
                System.out.println("Saudação privada (via Reflection): " + saudacao);

            } catch (Exception e) {
                System.err.println("Erro ao invocar método: " + e.getMessage());
            }
        }
        System.out.println("\n--- Fim do Exemplo ---");
    }
}