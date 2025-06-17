public class MetodosPrivados {

    /*
    São métodos que só podem ser acessados de dentro da própria classe onde são definidos.
    Eles encapsulam a implementação interna de uma classe, escondendo detalhes de como ela funciona no mundo exterior
    */

    public static void main(String[] args) {

        MetodosPrivados meuCarro = new MetodosPrivados();

        meuCarro.acelerar(100);
        meuCarro.acelerar(50);
        meuCarro.frear(20);
        meuCarro.frear(100);
    }

    private int velocidade;

    public MetodosPrivados() {
        this.velocidade = 0;
    }

    public void acelerar(int quantidade) {
        velocidade += quantidade;

        System.out.println("Acelerando... Velocidade atual: " + this.velocidade + " km/h");

        //Exemplo de uso de método privado dentro de um método público
        verificarVelocidade();

    }

    public void frear(int quantidade) {

        velocidade -= quantidade;

        if (velocidade < 0) {
            velocidade = 0;
        }

        System.out.println("Freando... Velocidade atual: " + this.velocidade + " km/h");

        //Exemplo de uso de método privado dentro de um método público
        verificarVelocidade();
    }

    // método privado, portanto não conseguimos enxergar verificarVelocidade fora da classe
    private void verificarVelocidade() {

        if (velocidade > 120) {
            System.out.println("Velocidade acima do limite!");
        } else if (velocidade ==0){
            System.out.println("Veículo parado!");
        }
    }
}