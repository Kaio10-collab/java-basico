package bridge;

public class Aplicacao {

    public static void main(String[] args) {

        System.out.println("Testando o controle remoto básico com a TV.");
        Dispositivo tv = new Tv();
        ControleRemotoBasico controleBasico = new ControleRemotoBasico(tv);

        controleBasico.ligar();
        controleBasico.desligar();

        System.out.println("\n--------------------\n");

        System.out.println("Testando o controle remoto avançado com a mesma TV.");
        ControleRemotoAvancado controleAvancado = new ControleRemotoAvancado(tv);

        controleAvancado.ligar();
        controleAvancado.mutar();
        controleAvancado.desligar();
        controleAvancado.ligar();
        controleAvancado.aumentar();
    }
}
