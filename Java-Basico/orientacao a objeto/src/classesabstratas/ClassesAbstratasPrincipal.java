package classesabstratas;

// Classe Principal para Testamos
public class ClassesAbstratasPrincipal {

    /*
    Vamos imaginar que estamos criando um programa para gerenciar diferentes tipos de veículos, como carros, motos e caminhões.
    Todos eles são veículos, certo? E todos têm algumas características em comum, como a capacidade de acelerar e frear.
    No entanto, a forma como um carro acelera pode ser diferente da forma como uma moto acelera.
    É aí que entram as classes abstratas. Elas são como "modelos" ou "projetos" incompletos.
    Uma classe abstrata é uma classe que não pode ser instanciada diretamente, ou seja, você não pode criar um objeto dela usando new.
    O propósito principal de uma classe abstrata é ser estendida (herdada) por outras classes.
    */

    public static void main(String[] args) {
        // Não podemos fazer isso: Veiculo meuVeiculo = new Veiculo("Genérica", "Modelo", 2023); conforme expliquei, pois o Veiculo é uma classe abstrata!

        // Então fazemos pelas classes que herdaram do Veiculo, no caso Carro e Moto.
        Carro meuCarro = new Carro("Fiat", "Pulse", 2024, 4);
        Moto minhaMoto = new Moto("Honda", "CB 500", 2023, true);

        System.out.println("--- Informações do Carro ---");
        meuCarro.exibirInformacoes(); // Método concreto da classe Veiculo
        meuCarro.acelerar();         // Método implementado no Carro
        meuCarro.frear();            // Método implementado no Carro
        meuCarro.ligarLimpadorDeParabrisa(); // Método específico de Carro
        System.out.println("\n");

        System.out.println("--- Informações da Moto ---");
        minhaMoto.exibirInformacoes(); // Método concreto da classe Veiculo
        minhaMoto.acelerar();          // Método implementado na Moto
        minhaMoto.frear();             // Método implementado na Moto
        minhaMoto.empinar();           // Método específico de Moto
    }
}
