package composite;

interface Funcionario {

    void exibirDetalhes();
}
/*
Aqui é a interface que vai ter o nosso comportamento que queremos e que as folhas e compostos terão em comum.
Ela vai ser o nosso "Componente", para garantimos que tanto o funcionário individual quanto a equipe tenham o mesmo método.
*/