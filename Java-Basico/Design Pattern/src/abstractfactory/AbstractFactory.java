package abstractfactory;

import abstractfactory.esportivo.FabricaCarrosEsportivos;
import abstractfactory.interfaces.Carroceria;
import abstractfactory.interfaces.FabricaDeCarros;
import abstractfactory.interfaces.Motor;
import abstractfactory.luxo.FabricaCarrosDeLuxo;
import abstractfactory.popular.FabricaDeCarrosPopulares;

public class AbstractFactory {

    public static void main(String[] args) {
        AbstractFactory app = new AbstractFactory();

        // Criando um carro esportivo
        System.out.println("--- Montando um Carro Esportivo ---");
        FabricaDeCarros fabricaEsportiva = new FabricaCarrosEsportivos();
        app.montarCarro(fabricaEsportiva);

        System.out.println("--------------------");

        // Criando um carro de luxo, apenas mudando a fábrica!
        System.out.println("--- Montando um Carro de Luxo ---");
        FabricaDeCarros fabricaDeLuxo = new FabricaCarrosDeLuxo();
        app.montarCarro(fabricaDeLuxo);

        System.out.println("--------------------");

        // Criando um carro de popular, apenas mudando a fábrica!
        System.out.println("--- Montando um Carro Popular ---");
        FabricaDeCarros fabricaPopular = new FabricaDeCarrosPopulares();
        app.montarCarro(fabricaPopular);
    }

    public void montarCarro(FabricaDeCarros fabrica) {
        Carroceria carroceria = fabrica.criarCarroceria();
        Motor motor = fabrica.criarMotor();

        System.out.println("Montando um carro com " + carroceria.getTipo() + " e " + motor.getPotencia() + ".");
    }
}
/*
Vamos pensar no seguinte: imagine que a gente está construindo uma fábrica de carros. Dentro dela, precisaremos de diferentes tipos de peças (rodas, motores, carrocerias).
Agora, imagine que queremos quer fabricar tanto carros esportivos quanto carros de luxo. As peças para cada tipo de carro são diferentes, certo?
Você não vai usar as mesmas rodas de um carro de corrida em um carro de luxo.

O Abstract Factory é como uma "super-fábrica" que cria outras fábricas. Ele nós permite criar famílias de objetos relacionados sem precisar especificar a "classe" exata desses objetos.
No nosso exemplo, o Abstract Factory seria a "fábrica geral de carros", que pode produzir a "fábrica de carros esportivos" ou a "fábrica de carros de luxo".
Cada uma dessas fábricas menores (as "fábricas concretas") saberá como criar as peças corretas para o seu tipo de carro.

A grande vantagem disso é que podemos trocar uma fábrica por outra facilmente, mudando o "estilo" de objetos que estamos criando sem alterar o código que os utiliza.
É como mudar a linha de produção de carros de luxo para carros esportivos, simplesmente trocando a fábrica, sem precisar redesenhar toda a montadora. Isso torna seu código mais flexível e fácil de manter.
*/
