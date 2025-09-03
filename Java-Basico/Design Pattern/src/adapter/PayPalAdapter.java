package adapter;

// O Adapter: a ponte entre o Alvo e o Adaptee. Esta é a nossa "ponte".
public class PayPalAdapter implements ICartaoCredito {

    private ServicoPagamentoPayPal servico; // referência ao Adaptee

    public PayPalAdapter(ServicoPagamentoPayPal servico) {
        this.servico = servico;
    }

    @Override
    public void autorizarPagamento(double valor) {
        // A "tradução" da chamada de método acontece aqui
        System.out.println("Adaptando a chamada para o PayPal...");
        servico.pagarComPayPal(valor);
    }
}

/*
É nossa classe que atua como uma "ponte".
Ela implementa a interface do Alvo (ICartaoCredito) e contém uma referência ao Adaptee (ServicoPagamentoPayPal).
O trabalho do Adapter é "traduzir" as chamadas de método. Quando o cliente chama autorizarPagamento(), o Adapter pega essa chamada e a redireciona para o método pagarComPayPal() do Adaptee.
 */