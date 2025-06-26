
public final class GerenciadorDeLog {

    /*
     O Singleton visa garantir que uma classe tenha apenas uma instância de si mesma e que forneça um ponto global de acesso a ela.
     Ou seja, uma classe gerencia a própria instância dela além de evitar que qualquer outra classe crie uma instância dela.
     Para criar a instancia tem-se que passar pela classe obrigatoriamente, nenhuma outra classe pode instanciar ela.
     O Padrão Singleton também oferece um ponto global de acesso a sua instância.
     A própria classe sempre vai oferecer a própria instância dela e caso não tenha ainda uma instância, então ela mesma cria e retorna essa nova instância criada.
    */

    // Instância estática e privada da própria classe
    // A palavra-chave 'volatile' garante que a variável seja lida da memória principal e não de um cache local do processador, útil para ambientes multi-thread.
    private static volatile GerenciadorDeLog instancia;

    // Construtor privado para evitar instâncias externas
    private GerenciadorDeLog() {
        // Inicializações do log (poderia abrir um arquivo, configurar um serviço, etc.)
        System.out.println("Gerenciador de Log inicializado (primeira e única vez).");
    }

    // Método estático público para obter a única instância
    public static GerenciadorDeLog getInstancia() {
        // Verificação dupla para garantir thread-safety e performance
        if (instancia == null) {
            // Bloco sincronizado para garantir que apenas uma thread crie a instância
            synchronized (GerenciadorDeLog.class) {
                if (instancia == null) {
                    instancia = new GerenciadorDeLog();
                }
            }
        }
        return instancia;
    }

    // Método para registrar mensagens
    public void registrarMensagem(String mensagem) {

        // Aqui a lógica para escrever a mensagem em um arquivo, console, banco de dados, etc.
        System.out.println("Log: " + mensagem);
    }

    public static void main(String[] args) {

        // Obtém a primeira instância do Gerenciador de Log
        GerenciadorDeLog log1 = GerenciadorDeLog.getInstancia();
        log1.registrarMensagem("Aplicação iniciada.");

        // Tenta obter outra instância (na verdade, seria a mesma)
        GerenciadorDeLog log2 = GerenciadorDeLog.getInstancia();
        log2.registrarMensagem("Nova funcionalidade ativada.");

        // Verificamos se as duas referências vão apontar para o mesmo objeto
        if (log1 == log2) {
            System.out.println("Ambas as variáveis referenciam a mesma instância do Gerenciador de Log.");
        } else {
            System.out.println("Instâncias diferentes do Gerenciador de Log foram criadas.");
        }

        GerenciadorDeLog log3 = GerenciadorDeLog.getInstancia();
        log3.registrarMensagem("Erro crítico detectado!");
    }
} // há um link com artigo para estudo: https://www.devmedia.com.br/padrao-de-projeto-singleton-em-java/26392