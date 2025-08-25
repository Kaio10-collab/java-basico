# Facade

é um padrão de design estrutural que simplifica a interação com um sistema complexo, fornecendo uma interface unificada e de alto nível para um conjunto de interfaces dentro de um subsistema. Em vez de o cliente interagir diretamente com várias classes complexas, ele interage com o Facade, que age como um ponto de entrada simplificado, escondendo a complexidade interna e gerenciando as chamadas para os componentes do subsistema.

## Quando usar o Facade:

* Sistemas complexos:
Quando um sistema é muito complexo para entender ou usar facilmente devido a um grande número de classes interligadas.

* Camadas de sistema:
Em arquiteturas em camadas, o Facade pode ser usado para fornecer um ponto de entrada para cada camada, simplificando a comunicação entre elas.

* Simplificar a interface do utilizador:
Para criar uma interface mais simples e uniforme para funcionalidades complexas de um subsistema.

## Como funciona:
1. Criação do Facade:
   Uma única classe (o Facade) é criada para envolver e gerenciar os componentes de um subsistema.
2. Interface Simplificada:
   O Facade oferece métodos que representam as tarefas que o cliente precisa executar, sem expor os detalhes internos.
3. Interação:
   O cliente interage apenas com o Facade, que delega as chamadas aos objetos do subsistema necessários para completar a tarefa.
4. Encapsulamento da Complexidade:
   As interdependências e o fluxo de chamadas entre os componentes do subsistema são ocultados dentro do Facade. 

Imagine que você está em casa, pronto para assistir a um filme. Para fazer isso, você precisa de um sistema de home theater: ligar a TV, ligar o aparelho de DVD, ligar o sistema de som, selecionar a entrada correta na TV, e talvez até apagar as luzes. É uma sequência de passos complexa, certo?
O Padrão Facade (que significa "fachada" em francês) resolve esse tipo de problema. 

Cria uma interface unificada e simplificada para um conjunto de interfaces em um subsistema complexo. Em vez de você ter que interagir com cada componente do home theater separadamente, o Facade te dá um único objeto com um método simples como assistirFilme().

A grande sacada é que o Facade esconde a complexidade. Ele funciona como um "controlador mestre" que sabe como coordenar todas as classes e objetos do subsistema para que a ação desejada seja executada. Ele não adiciona novas funcionalidades, ele apenas organiza e simplifica a forma como você interage com o sistema.

A principal vantagem de usar o Facade é o desacoplamento. O código que usa a FachadaHomeTheater não tem a menor ideia de como a TV, o DVD e o som funcionam por dentro. Ele só se comunica com a fachada, o que torna o código mais simples, mais legível e menos propenso a erros.