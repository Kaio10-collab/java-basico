package adapter;

public class AdapterMain {

    public static void main(String[] args) {
        // Criando a instância do Adaptee
        ServicoPagamentoPayPal servicoPayPal = new ServicoPagamentoPayPal();

        // Criando o Adapter e passando o Adaptee para ele
        ICartaoCredito adapter = new PayPalAdapter(servicoPayPal);
        // podemos usar a nova classe PayPalAdapter como se ela fosse um objeto ICartaoCredito normal, sem precisar de nenhuma alteração.

        // O nosso sistema agora pode usar o PayPal normalmente!
        System.out.println("Realizando um pagamento no nosso sistema...");
        adapter.autorizarPagamento(100.0);
    }
}
/*
Viu como a gente, sem precisar alterar a nossa classe ServicoPagamentoPayPal, conseguimos integrá-la ao nosso sistema?
O Padrão Adapter permitiu que o nosso código continuasse usando a interface(ICartaoCredito), que ele já conhecia, enquanto o adapter lidou com a incompatibilidade por trás das câmeras.
 */