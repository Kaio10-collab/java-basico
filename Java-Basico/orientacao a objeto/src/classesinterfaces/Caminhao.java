package classesinterfaces;

// Implementa a interface Transporte e também a interface Ligavel.
public class Caminhao implements Transporte, Ligavel {

    /*
    Se as classes abstratas, que vimos anterioramente, são como "projetos incompletos", as interfaces são como "contratos puros".
    Elas definem um conjunto de métodos que uma classe deve implementar, mas não fornecem nenhuma implementação para esses métodos (antes do Java 8).
    Pense nelas como uma lista de tarefas que qualquer classe que "assinar" esse contrato deve cumprir.
    */

    private String placa;
    private int capacidadeCargaKg;
    private int cargaAtualKg;
    private boolean estaLigado;

    // Constructor criado
    public Caminhao(String placa, int capacidadeCargaKg) {
        this.placa = placa;
        this.capacidadeCargaKg = capacidadeCargaKg;
        this.cargaAtualKg = 0;
        this.estaLigado = false;
    }

    // métodos que puxamos da interface Transporte
    @Override
    public void carregar(int peso) {
        if (cargaAtualKg + peso <= capacidadeCargaKg) {
            cargaAtualKg += peso;
            System.out.println("Caminhão " + placa + " carregou " + peso + " kg. Carga atual: " + cargaAtualKg + " kg.");
        } else {
            System.out.println("Caminhão " + placa + ": Capacidade máxima excedida ao tentar carregar " + peso + " kg.");
        }
    }

    @Override
    public void descarregar(int peso) {
        if (cargaAtualKg - peso >= 0) {
            cargaAtualKg -= peso;
            System.out.println("Caminhão " + placa + " descarregou " + peso + " kg. Carga atual: " + cargaAtualKg + " kg.");
        } else {
            System.out.println("Caminhão " + placa + ": Não há carga suficiente para descarregar " + peso + " kg.");
        }
    }

    @Override
    public void definirRota(String destino) {
        System.out.println("Caminhão " + placa + " definindo rota para: " + destino);
    }

    // Métodos que puxamos da interface Ligavel
    @Override
    public void ligar() {
        if (!estaLigado) {
            estaLigado = true;
            System.out.println("Caminhão " + placa + " ligado.");
        } else {
            System.out.println("Caminhão " + placa + " já está ligado.");
        }
    }

    @Override
    public void desligar() {
        if (estaLigado) {
            estaLigado = false;
            System.out.println("Caminhão " + placa + " desligado.");
        } else {
            System.out.println("Caminhão " + placa + " já está desligado.");
        }
    }

    // Exemplo de como sobrescrever um método default da interface Ligavel
    @Override
    public void statusLigado() {
        System.out.println("Status do Caminhão " + placa + ": " + (estaLigado ? "Ligado" : "Desligado") + ".");
    }
}
