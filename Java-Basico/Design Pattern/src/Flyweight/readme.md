# Flyweight

É um design pattern estrutural que visa otimizar o consumo de memória, permitindo que um grande número de objetos finos seja suportado de forma eficiente, ao compartilhar partes comuns de estado entre múltiplos objetos em vez de criar cópias para cada um. A ideia é separar o estado intrínseco (que é partilhado, como a cor de uma forma) do estado extrínseco (que é único para cada instância, como a posição de uma forma na tela), e reutilizar os objetos que possuem o mesmo estado intrínseco.
Como funciona:
1. Estado Intrínseco e Extrínseco:
   * O estado partilhado é o intrínseco, enquanto o estado único e contextual é o extrínseco. Ou seja, o intrínseco é a parte do estado que é compartilhada entre vários objetos. O extrínseco é a parte do estado que é única para cada objeto individual e que não pode ser compartilhada.
2. Compartilhamento de Objetos:
   * Em vez de criar um novo objeto para cada instância que precisa de certas características, o padrão Flyweight as armazena em cache e as reutiliza.
3. Entrega de Estado Extrínseco:
   * O estado extrínseco é passado para o objeto Flyweight no momento da chamada, de forma que ele possa operar corretamente sem precisar armazená-lo.
   
## Quando usar:
   1. Quando uma aplicação precisa criar um grande número de objetos que são semelhantes por essência.
   2. Quando a maior parte do estado de objetos pode ser movida para fora, para ser compartilhada entre múltiplos objetos.
   3. Quando a redução no consumo de memória é uma prioridade, como em sistemas embarcados ou aplicações móveis. 

Imagine que você está criando um jogo de árvores em uma floresta virtual. Para simular a floresta, você precisa de centenas de milhares de objetos Arvore. Cada objeto teria atributos como tipo, cor, textura, etc. Criar um objeto Arvore completo para cada árvore na floresta consumiria uma quantidade enorme de memória, possivelmente tornando o jogo lento ou até travando.

O Padrão Flyweight (que significa "peso-pena") resolve exatamente esse problema. Ele te permite compartilhar objetos para suportar um grande número de objetos de "peso-leve".

O Flyweight então cria uma "fábrica" que gerencia e reutiliza esses objetos de estado intrínseco. Quando você precisa de uma Arvore, a fábrica verifica se já existe um Pinheiro criado. Se sim, ela te retorna o objeto Pinheiro existente e você só precisa passar a informação de posição (o estado extrínseco) para ele. Isso economiza uma quantidade gigantesca de memória, já que você só tem uma instância de cada tipo de árvore, não milhares.