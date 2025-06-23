package hashset;

public record Cachorro (String nome, int idade) {
    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", idade=" + idade;
    }
}
/*
Aqui implementei uma funcionalidade nova do java 14, que é a classe Record. O que ela faz?
Basicamente ela é imutável, além de possuir uma sintaxe mais curta e coesa.
Também permite criar constructor, getter, equals, hashcode e tostring
*/