import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MetodosPublicos {

    /*
    São métodos que podem ser acessados de qualquer parte do seu programa, tanto dentro como fora da classe onde estão definidos.
    Eles definem como outras partes do seu código irão usar e interagir com seus objetos, garantindo uma forma controlada e organizada de acessar e manipular seus dados.
    O uso de getters e setters é uma prática comum que combina encapsulação com o acesso conveniente aos dados.
    Além disso, implementei o Lombok para facilitar o código.
    */

    public static void main(String[] args) {

        MetodosPublicos meuCachorro = new MetodosPublicos("Max", "Pastor Alemão", 3);

        System.out.println("Nome: " + meuCachorro.getNome());
        System.out.println("Raça: " + meuCachorro.getRaca());
        System.out.println("Idade: " + meuCachorro.getIdade());

        meuCachorro.latir();

        meuCachorro.setNome("Bolt"); // Modificando o nome usando o setter
        System.out.println("Novo nome: " + meuCachorro.getNome());

    }

    private String nome;
    private String raca;
    private int idade;

    // construtor da classe, e ele também é público, permitindo que você crie novas instâncias (objetos) da classe metodosPublicos em qualquer lugar do seu programa.
    public MetodosPublicos(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    // Método público que realiza uma ação
    public void latir() {
        System.out.println("Au au!");
    }

}
