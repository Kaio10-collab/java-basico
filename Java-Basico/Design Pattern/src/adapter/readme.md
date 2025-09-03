# Adapter

É um padrão de design estrutural que permite que objetos com interfaces incompatíveis trabalhem juntos, atuando como uma ponte ou "tradutor" entre eles. Ele é útil para integrar sistemas legados, bibliotecas de terceiros ou qualquer situação em que duas classes precisem colaborar, mas não se comuniquem diretamente devido a interfaces distintas.

## Como funciona:

1. Incompatibilidade de Interfaces:
   O problema surge quando uma classe (o "adaptado") tem uma funcionalidade necessária para um cliente, mas a sua interface não é a esperada pelo cliente.
2. Classe Adaptadora:
   Uma nova classe, o "adaptador", é criada.
3. Ponte entre Classes:
   O adaptador implementa a interface que o cliente espera e, internamente, encapsula a instância da classe adaptada.
4. Conversão da Chamada:
   Quando o cliente chama um método na interface do adaptador, o adaptador "traduz" essa chamada para um formato que o objeto adaptado entenda, executando o trabalho necessário.
5. Integração Transparente:
   O cliente não precisa conhecer os detalhes da classe adaptada; ele interage apenas com o adaptador, que oculta a complexidade da conversão.

## Principais usos:

### Sistemas Legados: 
* Permite que o código mais antigo se integre a novas aplicações.

### Bibliotecas de Terceiros: 
* Facilita o uso de bibliotecas externas que possuem interfaces diferentes das do projeto.

### Aprimoramento da Reutilização: 
* Torna o código mais flexível e reutilizável, permitindo a integração de novos componentes sem modificar as classes existentes.

## Benefícios:

* Flexibilidade:
Adiciona novos formatos de conexão sem quebrar o código existente do cliente.

* Reutilização de Código:
Permite que componentes incompatíveis colaborem, aumentando a reutilização.

* Manutenibilidade:
Separa a lógica de conversão da lógica de negócios principal do programa. 

Imagine que você está viajando para outro país e comprou um aparelho eletrônico novo. Ao chegar no hotel, você percebe que a tomada do seu quarto tem um formato diferente do plugue do seu aparelho. O que você faz? Você compra um adaptador de tomada.

O adaptador não muda o seu aparelho nem a tomada; ele simplesmente converte a interface do seu aparelho para que ela seja compatível com a tomada.

O Padrão Adapter funciona exatamente assim. Ele converte a interface de uma classe para outra interface que o cliente espera. Ele permite que classes com interfaces incompatíveis trabalhem juntas.

A grande vantagem de usar o Adapter é a reutilização de código. Você não precisa reescrever uma classe inteira que já funciona só porque a interface dela é diferente. Em vez disso, você cria um adaptador que "traduz" as chamadas de método de uma interface para outra.

Existem dois tipos principais de Adapter:

1. Adapter de Objetos:
* o mais comum, onde o adaptador contém uma instância do objeto "incompatível" e delega as chamadas de método para ele.

2. Adapter de Classes: 
* o adaptador herda da classe "incompatível" e da interface "esperada".