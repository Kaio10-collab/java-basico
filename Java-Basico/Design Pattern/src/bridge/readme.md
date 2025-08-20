# BRIDGE

## O que é o padrão Bridge?
* Vamos imaginar que estamos construindo um controle remoto universal. Precisamos que ele funcione com TVs de diferentes marcas (Sony, LG, Samsung) e que também execute diferentes funções (ligar/desligar, mudar de canal, aumentar/diminuir o volume).

* Vamos criar um controle remoto para cada marca, como ControleRemotoSony, ControleRemotoLG e assim por diante. Mas e se a gente precisar adicionar uma nova função, como "gravar"? teriamos que adicionar o método de gravação em cada uma dessas classes de controle, o que pode se tornar um trabalho repetitivo e bagunçar o código.
O Padrão Bridge resolve exatamente esse problema! Ele sugere que a gente separe as coisas que "variam" no nosso sistema. No nosso exemplo, temos duas variações:

A abstração, que é o tipo de controle remoto (o ControleRemotoUniversal).

A implementação, que são as marcas das TVs (Sony, LG, Samsung).

* O Bridge cria uma ponte entre a abstração e a implementação, permitindo que elas evoluam de forma independente. O ControleRemotoUniversal não precisa saber como a TV LG executa a função de ligar/desligar. Ele apenas chama o método ligar(), e a TV LG se encarrega do resto.

Em resumo, o Bridge é como uma "ponte" que conecta uma hierarquia de classes de abstração a uma hierarquia de classes de implementação. Essa conexão permite que você mude a TV (implementação) sem alterar o controle remoto (abstração), e vice-versa.

## A estrutura do Bridge?
* A nossa estrutura de padrão é composta por duas hierarquias de classes que se comunicam através da nossa "ponte".

### 1. A Hierarquia de Abstração
Esta hierarquia é sobre a funcionalidade principal. Ela tem duas partes:

* Abstração (classe abstrata ou interface): Pense nela como a "classe-mãe" que define o comportamento do objeto principal. No nosso exemplo do controle remoto, seria a classe ControleRemoto. Ela tem um campo que referencia a Implementação (a TV).

* Abstrações Refinadas (classes concretas): São as diferentes variações da funcionalidade principal. Por exemplo, um ControleRemotoAvancado que, além de ligar e desligar, também tem um botão de "mudo".

### 2. A Hierarquia de Implementação
Esta hierarquia é sobre como a funcionalidade é realmente executada. Ela também tem duas partes:

* Implementador (interface ou classe abstrata): É o "contrato" que as classes de implementação precisam seguir. No nosso exemplo, seria a interface Dispositivo, com métodos como ligar(), desligar() e mudarCanal().

* Implementadores Concretos (classes concretas): São as classes que realmente fazem o trabalho. Elas implementam o Implementador. No nosso exemplo, teríamos as classes TV, Radio, etc.

A mágica do Bridge acontece porque a Abstração tem uma referência para a Implementação. A ControleRemoto não se importa se a TV é da marca Sony ou LG, ela simplesmente chama o método ligar() da interface Dispositivo que está referenciada. É essa referência que serve de "ponte".

Para resumir:

A Abstração tem um objeto da Implementação.

A Abstração delega o trabalho para esse objeto.

A Abstração e a Implementação podem ser estendidas de forma independente, sem afetar uma a outra.