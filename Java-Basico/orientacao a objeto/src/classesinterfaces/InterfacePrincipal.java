package classesinterfaces;

// Classe Principal para Testamos
public class InterfacePrincipal {

    public static void main(String[] args) {

        Caminhao caminhao1 = new Caminhao("ABC-1234", 10000);

        System.out.println("--- Operações com Caminhão ---");
        caminhao1.ligar();
        caminhao1.statusLigado(); // Chama o método default sobrescrito
        caminhao1.carregar(5000);
        caminhao1.definirRota("São Paulo");
        caminhao1.descarregar(2000);
        caminhao1.desligar();
        caminhao1.statusLigado();

        System.out.println("\n--- Polimorfismo com Interfaces ---");
        // Uma interface pode ser usada como tipo de referência (polimorfismo)
        Transporte transportadorGenerico = caminhao1;
        transportadorGenerico.carregar(1000); // Podemos chamar métodos de Transporte
        // transportadorGenerico.ligar(); // vai dar um ERRO, pois o transportadorGenerico não "sabe" que é Ligavel

        Ligavel aparelhoGenerico = caminhao1;
        aparelhoGenerico.ligar(); // Podemos chamar métodos de Ligavel
        aparelhoGenerico.statusLigado();
    }
}
