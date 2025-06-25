import java.io.IOException;

// Onde chamamos os métodos da classe ManipuladorArquivo
public class ManipuladorArquivoPrincipal {

    public static void main(String args[]) throws IOException {

        var path = "C:\\Users\\exemplo\\pasta/teste.txt"; // o caminho de onde esta o arquivo

        ManipuladorArquivo.escritor(path);
        ManipuladorArquivo.leitor(path);
    }
}