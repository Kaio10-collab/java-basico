# pontos principais sobre o Abstract Factory:

## O que é? 
* É um padrão de design que nos ajuda a criar famílias de objetos relacionados sem precisar especificar as classes concretas. A analogia da fábrica de carros nos mostrou como uma "super-fábrica" pode criar fábricas de carros de diferentes estilos.

## Por que usá-lo? 
* Ele torna o seu código mais flexível e extensível. Se você precisar adicionar uma nova família de objetos (como a de carros populares), a parte do código que usa os objetos não precisa ser alterada.

## Como funciona? 
* O padrão é construído com quatro partes principais:

### Abstract Factory (Interface): 
* Define o "contrato" de como a fábrica deve criar os objetos.

### Concrete Factory (Classe): 
* Implementa a interface e sabe como criar uma família específica de objetos.

### Abstract Product (Interface): 
* Define o "contrato" para um tipo de objeto (como Carroceria).

### Concrete Product (Classe): 
* É a classe real do objeto que a fábrica produz (como CarroceriaEsportiva). 