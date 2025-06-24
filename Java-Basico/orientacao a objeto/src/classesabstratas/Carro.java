package classesabstratas;

// Classe Concreta: Carro
// Estende Veiculo e implementa os métodos abstratos
public class Carro extends  Veiculo {

    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano); // Chama o construtor da classe pai (Veiculo)
        this.numeroPortas = numeroPortas;
    }

    @Override // Anotação opcional, mas para respeitamos boas práticas, vamos sobrescrever um método
    public void acelerar() {
        System.out.println("O carro " + modelo + " está acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("O carro " + modelo + " está freando.");
    }

    public void ligarLimpadorDeParabrisa() {
        System.out.println("Limpador de para-brisa do carro " + modelo + " esta ligado.");
    }
}
