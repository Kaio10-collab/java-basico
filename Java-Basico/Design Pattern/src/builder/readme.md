# Builder

* o Builder é um padrão de design que ajuda a gente a construir objetos complexos passo a passo, de uma forma limpa e organizada.

## Vamos imaginar o seguinte:
Que estamos em uma lanchonete de "monte seu hambúrguer". E temos a opção de escolher o tipo de pão, o tipo de carne, queijo, salada, molhos e muito mais. Se a gente fosse pedir tudo de uma vez, a nossa ordem ficaria gigantesca, confusa e cheia de opções que talvez nem quisessemos.

* A nossa ideia principal é separamos a construção do objeto da nossa representação final. Em vez de termos um construtor gigante com 10 ou mais parâmetros, a gente usa um "construtor" especial (Builder) que permite adicionamos as partes do objeto uma de cada vez.

## Como é a estrutura de um builder?
### O Produto (a Pizza:
É o objeto que queremos construir, a nossa Pizza completa.
Ele geralmente não tem um construtor público para forçar que a sua criação seja feita apenas pelo Builder.
Tem os atributos que definem suas partes (massa, molho, queijo, etc.).

### O Builder Abstrato (o PizzaBuilder):
É uma interface que define os métodos para a construção de cada parte do objeto.
Por exemplo, adicionarMassa(), adicionarMolho(), adicionarQueijo().
Também possui um método final para "pegar" o produto construído, como getPizza().

### O Builder Concreto (o PizzaDeCalabresaBuilder):
É a classe que implementa o Builder Abstrato.
É aqui que a lógica de construção de cada parte é implementada.
Ela sabe como criar cada parte do produto e adicioná-la a uma instância do Produto.

### O Diretor (o Pizzaiolo):
É a classe que usa o Builder para construir o objeto.
Ele sabe a "receita" para montar diferentes tipos de produtos.
Ele não sabe os detalhes da construção, apenas quais métodos do Builder chamar e em qual ordem. Por exemplo, ele pode ter um método montarPizzaDeCalabresa(Builder builder) que chama builder.adicionarMassa().adicionarMolho().adicionarQueijo().adicionarCalabresa().

A grande vantagem é que o Diretor e o Builder estão separados. O Diretor sabe a receita, mas delega a execução para o Builder. Você pode ter diferentes Diretores (um para pizzas, outro para hambúrgueres) e diferentes Builders para cada tipo de produto, todos seguindo o mesmo padrão.