Entendendo a Orientação a Objetos (POO)
A Orientação a Objetos é um paradigma de programação que organiza o software em torno de objetos em vez de apenas funções e lógica. Pense nela como uma forma de modelar o mundo real dentro do seu código.

Imagine que você está construindo um jogo ou um sistema de cadastro. Em vez de pensar em "o que o sistema faz?", você pensa em "quais são as entidades envolvidas?".

Por exemplo, em um sistema de cadastro de carros, você teria "Carro", "Motor", "Rodas". Cada um desses seria um objeto no seu programa, com suas próprias características e comportamentos.

Os principais pilares da POO são:

Classe: Uma classe é como um "molde" ou "planta" para criar objetos. Ela define as características (atributos) e os comportamentos (métodos) que os objetos daquela classe terão. Pense na classe Carro como a planta de um carro, que especifica que todo carro tem cor, marca e pode acelerar ou frear.

Objeto: Um objeto é uma instância (uma criação) de uma classe. É a "materialização" daquele molde. Se Carro é a classe, então "meu carro azul da marca X" é um objeto da classe Carro. Você pode ter vários objetos da mesma classe, cada um com seus próprios valores para as características.

Atributos: São as características ou propriedades de um objeto. Eles descrevem o estado do objeto. Em uma classe Carro, exemplos de atributos seriam cor, marca, modelo, velocidadeAtual.

Métodos: São os comportamentos ou ações que um objeto pode realizar. Eles definem o que o objeto "faz". Em uma classe Carro, exemplos de métodos seriam acelerar(), frear(), ligar(), desligar().

Encapsulamento: É o princípio de "esconder" os detalhes internos de um objeto e expor apenas o que é necessário para interagir com ele. Isso significa que os dados (atributos) de um objeto são geralmente privados e só podem ser acessados ou modificados através de métodos públicos. É como se o motor do carro estivesse encapsulado, você só interage com ele através do pedal do acelerador, por exemplo. Isso ajuda a manter o código organizado e seguro.

Herança: Permite que uma nova classe (subclasse ou classe filha) herde características e comportamentos de uma classe existente (superclasse ou classe pai). Isso promove a reutilização de código. Por exemplo, você pode ter uma classe Veiculo com atributos e métodos comuns, e depois criar classes Carro e Moto que herdam de Veiculo, adicionando suas particularidades.

Polimorfismo: Significa "muitas formas". Permite que objetos de diferentes classes sejam tratados de forma uniforme. Com herança, classes filhas podem ter implementações diferentes para métodos que herdaram da classe pai, mas ainda podem ser referenciadas como se fossem do tipo da classe pai. Por exemplo, você pode ter um método mover() em Veiculo, e Carro e Moto implementam mover() de suas próprias maneiras, mas ambos podem ser chamados como veiculo.mover().