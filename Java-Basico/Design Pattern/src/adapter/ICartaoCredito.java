package adapter;

// O Alvo: a interface que nosso sistema espera
public interface ICartaoCredito {

    void autorizarPagamento(double valor);
}

/*
Ela vai definir a forma como o nosso sistema interage com outros objetos.
No nosso exemplo, seria a interface ICartaoCredito, com um método autorizarPagamento(double valor).
*/