package arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

//Lombok adicionado para facilitar
@Getter
@AllArgsConstructor
public class Aluno {

    private String nome;

    @Override
    public boolean equals(Object obj) { // Aqui comparamos os dois objetos, no caso alunos.
        Aluno outro = (Aluno) obj;
        return outro.getNome().equals(this.nome);
    }

    @Override
    public String toString() { // É feito um casting do object para aluno. O toString retorna o nome do aluno
        return nome;
    }
}
