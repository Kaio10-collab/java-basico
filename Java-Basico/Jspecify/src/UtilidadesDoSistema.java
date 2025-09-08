import lombok.NonNull;
import org.jspecify.annotations.Nullable;

public class UtilidadesDoSistema {

    public int contarCaracteres(@NonNull String texto) {
        return texto.length();
    }

    public String criarMensagem(@Nullable String nome) {
        if (nome == null) {
            return "Olá! Bem-vindo!";
        } else {
            return "Olá, " + nome + "! Bem-vindo!";
        }
    }
}
/*
Há uma anotação @NullMarked, que ao colocar em cima do pacote do projeto, ele define por padrão que tudo dentro será NonNull
*/