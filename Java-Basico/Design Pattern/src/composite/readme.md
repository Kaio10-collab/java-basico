# Composite

## O que é:
é um design pattern estrutural que permite que você trate objetos individuais e grupos de objetos de forma uniforme, construindo estruturas hierárquicas do tipo árvore. A ideia principal é que objetos "folha" (ou componentes individuais) e objetos "compostos" (que contêm outros objetos) compartilhem uma interface comum, tornando possível manipular elementos complexos de uma árvore como se fossem um único objeto.

Imagine que temos uma empresa e precisamos organizar os nossos funcionários. Alguns são indivíduos (um único Desenvolvedor), mas outros são grupos (como o time de Marketing ou a equipe de Vendas). A grande sacada é que queremos ser capaz de tratar tanto o indivíduo quanto o grupo da mesma forma. Se a  gente quiser dar um bônus para a "equipe de Vendas", todos os membros da equipe (e qualquer sub-equipe dentro dela) deveriam receber o bônus, certo?

O Padrão Composite serve exatamente para isso. Ele permite que a gente possa compor objetos em estruturas de árvore para representar hierarquias de "parte-todo". A ideia é que possamos tratar objetos individuais (folhas) e composições de objetos (componentes) de maneira uniforme.

No nosso exemplo da empresa, o Composite nos permitiria:

Tratar um Desenvolvedor (a "folha") da mesma forma que um Gerente ou uma Equipe (o "componente").
Ter uma Equipe de Vendas que, por sua vez, contém Vendedores (folhas) e talvez até uma sub-equipe de "Suporte ao Cliente" (outro componente).
A grande vantagem é que você pode criar estruturas complexas e aninhadas e, ainda assim, a lógica para interagir com elas (darBônus(), por exemplo) continua a mesma, seja para um único funcionário ou para uma equipe inteira. Isso simplifica muito o seu código e evita a criação de lógica condicional (como if/else) para tratar de cada tipo de objeto.

## Como funciona:
 * Interface Comum (Component):
   Tanto os componentes individuais (folhas) quanto os contêineres (compostos) implementam uma interface ou classe base comum. Essa interface define operações que podem ser realizadas em qualquer objeto.

 * Objetos Compostos (Composite):
   Estes são os objetos que podem conter outros objetos, sejam eles folhas ou outros compostos. Eles possuem métodos para adicionar, remover e obter os componentes filhos. 

 * Objetos Folha (Leaf):
   São os componentes individuais que não possuem filhos e não são contêineres de outros objetos. 

 * Recursividade:
   Quando uma operação é chamada em um objeto composto, ele delega a tarefa aos seus filhos. Se um filho for outro composto, o processo se repete recursivamente pela estrutura.


## Benefícios:
* Uniformidade:
O código cliente não precisa saber se está lidando com um objeto individual ou com uma estrutura complexa, pois pode chamar os mesmos métodos em ambos.

* Flexibilidade:
Facilita a criação e manipulação de estruturas de árvore complexas sem criar um código cheio de ifs e elses.

* Manutenibilidade:
Simplifica a adição de novos tipos de componentes, tanto folhas quanto compostos, pois a estrutura se adapta para acomodá-los. 