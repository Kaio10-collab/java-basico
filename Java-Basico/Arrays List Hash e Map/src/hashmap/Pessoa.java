package hashmap;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class Pessoa {

    private String nome;
    private int idade;

    @Override
    public String toString() {
        return nome + ", idade = " + idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

}
