public class CalculoEstatico {

     /*
    São métodos que pertencem à própria classe e não a um objeto específico da classe.
    Isso significa que você pode chamá-los diretamente usando o nome da classe, sem precisar criar uma instância da classe.
    */

    public static void main(String[] args) {

        int resultadoSoma = Calculo.somar(); // Exemplo de estatico
        System.out.println("A soma é: " + resultadoSoma);

        int resultadoSubtrair = Calculo.subtrair(); // Exemplo de estatico
        System.out.println("A subtração é: " + resultadoSubtrair);

        Calculo objInstancia = new Calculo(); // Aqui foi feito a instância do objeto para a classe Calculo para chamar o método, para comparar a instância entre os objetos.
        objInstancia.imprimirMensagem();
    }

    /*
    Diferenças entre métodos estáticos e métodos de instância:
    Métodos estáticos: Não operam em um objeto específico; eles não têm acesso a atributos (instance variables) da classe; São úteis para funções utilitárias, que não dependem do estado de um objeto.
    Métodos de instância: Operam sobre um objeto específico da classe; podem acessar e modificar atributos (instance variables) do objeto.
    */

}
