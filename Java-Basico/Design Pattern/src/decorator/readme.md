# Decorator

É um padrão de design estrutural que permite adicionar funcionalidades a um objeto de forma dinâmica e flexível, sem modificar o código original da classe. Conhecido também como "Wrapper", ele envolve um objeto dentro de outros objetos (os decoradores), que adicionam comportamentos extras, seguindo a mesma interface para permitir o empilhamento e a combinação de várias funcionalidades.

## Como funciona:

1. Definição de uma interface comum:
   Tanto o objeto original quanto os decoradores implementam a mesma interface, o que permite que eles possam ser substituídos.
2. Criação de classes decoradoras:
   Cada decorador é uma classe que recebe um objeto (que pode ser um outro decorador ou o objeto original) como parâmetro no seu construtor.
3. Adição de comportamento:
   O decorador pode executar ações antes e/ou depois de chamar um método do objeto que ele está "decorando" ou envolto.
4. Composição recursiva:
   Decoradores podem ser empilhados, ou seja, um decorador pode envolver outro decorador, que por sua vez pode envolver o objeto original.

## Benefícios e vantagens
   
### Flexibilidade e modularidade:
* Permite adicionar ou remover funcionalidades a objetos em tempo de execução, tornando o sistema mais flexível.

### Princípio Aberto/Fechado (Open Closed Principle):
* As classes ficam abertas para extensão, mas fechadas para modificação, o que evita a introdução de bugs em objetos já existentes.

### Alternativa à herança:
* Evita a criação de um número muito grande de subclasses para cada combinação de funcionalidades, como seria necessário com a herança.

### Composição:
* Utiliza composição em vez de herança para extender funcionalidades, o que é mais flexível. 

Imagine que você está em uma cafeteria e pede um café simples. Mas depois você pensa: "quero chantilly". E depois: "queria também uma calda de chocolate". Em vez de pedir um novo café a cada adição, a cafeteira simplesmente adiciona os novos ingredientes ao seu café original. No final, o objeto que você tem é "Café com Chantilly e Calda de Chocolate".

A mágica do Decorator acontece porque todas as partes compartilham a mesma interface (Componente). Isso permite que você combine os objetos de forma flexível. O código do cliente não precisa saber se está lidando com um Expresso simples ou com um Expresso envolvido por um Chantilly e uma CaldaDeChocolate.

O Padrão Decorator funciona exatamente assim. Ele permite que você adicione novas funcionalidades a um objeto existente dinamicamente, sem precisar alterar a sua estrutura. Ele "embrulha" o objeto original com um "decorador" que adiciona o novo comportamento.

A grande vantagem disso é a flexibilidade. Quando podemos combinar os decoradores como quisemos. É como se cada nova funcionalidade fosse um "pacote" que pode ser adicionado em cima do outro. Isso evita a explosão de classes que aconteceria se usassemos herança para cada combinação de funcionalidades.

O Decorator é uma ótima alternativa à herança quando o nosso objetivo for adicionar responsabilidades a objetos individuais.

