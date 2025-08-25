package facade.subsystem;

// Subsistema Classe(classe complexa) 1 - Lembrando que essa classe não faz a menor ideia  de que a fachada existe.
public class TV {

    public void ligar() {
        System.out.println("TV ligada.");
    }
    public void selecionarEntrada(String entrada) {
        System.out.println("Entrada '" + entrada + "' selecionada.");
    }
    public void desligar() {
        System.out.println("TV desligada.");
    }
}
/*
Esta é a coleção de classes que compõem o sistema complexo.
Elas fazem todo o trabalho duro, como processar pagamentos, verificar estoque, etc.
As classes do subsistema não têm a menor ideia de que existe uma fachada. Elas não precisam saber sobre ela, e isso é o que as torna desacopladas da fachada.

É uma única classe que combina as funcionalidades do subsistema.
Ela tem referências para os objetos das classes do subsistema.
Ela provê uma interface simplificada e de alto nível para o cliente, escondendo a complexidade do subsistema.
É o Facade que sabe a ordem correta para chamar os métodos das classes do subsistema para realizar uma tarefa.
A mágica do Facade é que ele serve como um "controlador" que encapsula toda a complexidade, permitindo que o cliente chame apenas um método simples para realizar uma tarefa que, na verdade, envolve várias etapas. Isso melhora a legibilidade e a manutenção do código.
*/