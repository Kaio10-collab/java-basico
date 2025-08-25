# Command

## O que é:
é um padrão de design comportamental que encapsula uma solicitação como um objeto, permitindo desacoplar o objeto que invoca a solicitação (o Invoker) do objeto que executa a ação (o Receiver). Isso facilita a parametrização de clientes com diferentes solicitações, enfileiramento, registro e, notavelmente, a implementação de operações de desfazer/refazer.

## Conceitos Principais:
1. Comando (Command):
   Uma interface ou classe abstrata que declara um método, geralmente execute(), para realizar a ação.
2. Comando Concreto (Concrete Command):
   Implementações da interface Command, que encapsulam uma solicitação e delegam a tarefa ao Receiver.
3. Receptor (Receiver):
   A classe que contém a lógica de negócios a ser executada. O Command Concrete chama os métodos do Receiver.
4. Invocador (Invoker):
   Mantém uma referência a um objeto Command e o chama para executar a ação, sem saber detalhes sobre o Receiver.
5. Cliente (Client):
   Cria os Command Concretos, associa-os aos seus Receivers e os envia para o Invoker.
   Como Funciona
   Encapsulamento:
   Detalhes da solicitação (como qual método chamar e em qual objeto) são encapsulados dentro de um objeto Command.
   Desacoplamento:
   O Invoker, que pode ser um botão de GUI ou um elemento de interface, não precisa conhecer os detalhes de como a solicitação é executada. Ele apenas chama o método execute() do objeto Command.
   Flexibilidade:
   Novos comandos podem ser adicionados facilmente sem modificar o Invoker.
   Operações de Desfazer/Refazer:
   Os Commands podem armazenar seu estado para permitir a reversão de suas ações.
   
## Exemplos de Uso:
Imagine um restaurante. O garçom anota o seu pedido em um bloco. Ele não prepara a comida; ele simplesmente empacota o seu pedido (Pedido de Bife, Pedido de Salada) e o entrega para a cozinha. A cozinha, por sua vez, sabe exatamente como executar cada pedido, sem se importar com quem o fez.

O Padrão Command funciona de maneira muito parecida. Ele transforma uma solicitação (como ligar uma luz, salvar um arquivo ou, no nosso caso, fazer um bife) em um objeto. Esse objeto (Comando) contém toda a informação necessária para executar a ação, como a operação a ser realizada e os parâmetros que ela precisa.

A grande vantagem disso é que você pode:

1. Agendar a execução: Você pode empacotar um comando e executá-lo mais tarde. Pense em um sistema de undo/redo (desfazer/refazer), onde cada ação (salvar, digitar, etc.) é um comando que pode ser desfeito.

2. Encapsular a ação: A classe que pede a execução do comando (o garçom) não precisa saber os detalhes de como a ação será realizada. Ela apenas sabe que pode chamar o método executar() no objeto Comando.

3. Decouplar o solicitante do receptor: O "garçom" (a classe que solicita o comando) não tem ligação direta com a "cozinha" (a classe que executa a ação). Eles se comunicam através do objeto Comando, o que torna o sistema mais flexível.

* Em resumo, o Command é um objeto que empacota uma ação e todos os seus parâmetros, permitindo que a solicitação e a execução sejam desacopladas.