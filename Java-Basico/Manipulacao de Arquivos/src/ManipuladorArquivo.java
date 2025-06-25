import java.io.*;
import java.util.Scanner;

public class ManipuladorArquivo {

    /*
    Classe que tem como função manipular (leitura e escrita) o arquivo txt.
    */

    public static void leitor(String path) throws IOException {

        /*
        O método leitor tem como parâmetro de entrada o path (url/caminho) do arquivo que será lido, como pode ser visto na assinatura do método.
        O BufferedReader que nada mais é que a classe responsável por gera o buffer que será utilizado para realizar a leitura do arquivo.txt
        */
        BufferedReader buffRead = new BufferedReader(new FileReader(path));

        var linha = "";

        while (true) { //  obter o valor de uma linha
            if (linha != null) {
                System.out.println(linha);

            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
        // necessário fechar os arquivos quando o método termina de utilizar os mesmos, para isso basta utilizar o método close contido na classe de leitura ou escrita de arquivos.
    }

    public static void escritor(String path) throws IOException {

        /*
        O método escritor tem como parâmetro de entrada o path (url/caminho) do arquivo que será escrito, como pode ser visto na assinatura do método.
        O objeto interno o BufferedWriter,é nada mais a classe responsável por gerar o bufferque que será utilizado para realizar a escrita no arquivo.txt
        */
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));

        var linha = "";

        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
        // novamente será necessário fechar os arquivos quando o método termina de utilizar os mesmos, para isso basta utilizar o método close contido na classe de leitura ou escrita de arquivos.
    }
}
