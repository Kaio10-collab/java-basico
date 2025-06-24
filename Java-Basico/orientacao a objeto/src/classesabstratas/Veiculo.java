package classesabstratas;

// Classe Abstrata: Veiculo
// Define o conceito geral de um veículo
abstract class Veiculo {

    // Atributo comum a todos os veículos, com protected para somente as classes que herdarem da classe Veiculo.
    protected String marca;
    protected String modelo;
    protected int ano;

    // Vamos criar um construtor da classe abstrata
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método concreto: Informações básicas do veículo
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    // Métodos abstratos: Comportamentos que cada veículo deve implementar de forma diferente
    public abstract void acelerar(); // Como acelerar é diferente para cada tipo de veículo
    public abstract void frear();    // Como frear é diferente para cada tipo de veículo
}
