package classesabstratas;

// Classe Concreta: Moto
// Estende Veiculo e implementa os métodos abstratos
public class Moto extends Veiculo{

    private boolean temBau;

    public Moto(String marca, String modelo, int ano, boolean temBau) {
        super(marca, modelo, ano);
        this.temBau = temBau;
    }

    @Override
    public void acelerar() {
        System.out.println("A moto " + modelo + " está acelerando forte!");
    }

    @Override
    public void frear() {
        System.out.println("A moto " + modelo + " está freando usando os freios dianteiro e traseiro.");
    }

    public void empinar() {
        System.out.println("A moto " + modelo + " está empinando!");
    }
}
