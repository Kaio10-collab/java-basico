import entidade.Produto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class OutroCasoDeArquivo {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US); // Aqui foi definido o local para Estados Unidos (US)
        Scanner sc = new Scanner(System.in); // Foi criado um scanner para ler a entrada do usuário

        List<Produto> list = new ArrayList<>(); // uma lista criada da classe de entidade

        System.out.println("Enter file path: ");
        var sourceFileStr = sc.nextLine(); // vamos ler a linha digitada, que seria o caminho do arquivo que queremos

        File sourceFile = new File(sourceFileStr); // Criamos um objeto File a partir do caminho do arquivo que que foi digitado no scanner
        var sourceFolderStr = sourceFile.getParent(); // recuperamos o caminho da pasta aonde esta o arquivo

        boolean success = new File(sourceFolderStr + "/out").mkdir(); // vamos criar uma posta chamado out, verificamos se contém a posta ou não, vai retornar true caso a pasta seja criada ou false se já houver.
        System.out.println("Pasta 'out' criada ou já existe: " + success);

        var targetFileStr = sourceFolderStr + "/out/summary.csv"; // Aqui será criado um arquivo dentro da pasta out
        System.out.println("Arquivo de saída será em: " + targetFileStr);

        // Bloco try-with-resources para garantimos que o BufferedReader seja fechado automaticamente
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

            var itemCsv = br.readLine(); // Lê a primeira linha do arquivo CSV
            while (itemCsv != null) { // Continua lendo enquanto houver linhas no arquivo
                // System.out.println(itemCsv); // Comentamos esta linha, pois vamos processar o CSV

                // Divide a linha do CSV usando a vírgula como delimitador, esperamos que o CSV esteja no formato: nome,preço,quantidade
                String[] fields = itemCsv.split(",");
                var name = fields[0]; // Primeiro campo é o nome
                double price = Double.parseDouble(fields[1]); // Segundo campo é o preço (convertido para Double)
                int quantity = Integer.parseInt(fields[2]); // Terceiro campo é a quantidade (convertido para Integer)

                // Cria um novo objeto Produto com os dados extraídos
                Produto produto = new Produto(name, price, quantity);

                // Adiciona o produto à lista
                list.add(produto);

                itemCsv = br.readLine(); // Lê a próxima linha
            }

            // Após ler todas as linhas e preencher a lista, podemos exibir os produtos e seus totais
            System.out.println("\nProdutos lidos do arquivo:");
            for (Produto p : list) {
                System.out.println("Nome: " + p.getName() + ", Preço: " + String.format("%.2f", p.getPrice()) +
                        ", Quantidade: " + p.getQuantity() + ", Total: " + String.format("%.2f", p.total()));
            }

        } catch (IOException e) {
            // Captura e imprime mensagens de erro de I/O (ex: arquivo não encontrado)
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Captura erro se uma linha do CSV não tiver 3 campos (nome, preço, quantidade)
            System.out.println("Erro de formato na linha CSV (campos insuficientes): " + e.getMessage());
        } catch (NumberFormatException e) {
            // Captura erro se preço ou a quantidade não forem números válidos
            System.out.println("Erro de formato nos dados numéricos do CSV: " + e.getMessage());
        } finally {
            sc.close(); // aqui fechamos o objeto scanner
        }
    }
}
