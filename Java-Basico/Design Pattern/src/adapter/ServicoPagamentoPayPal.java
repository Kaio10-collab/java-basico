package adapter;

// O Adaptee: a classe que precisa ser adaptada
public class ServicoPagamentoPayPal {

    public void pagarComPayPal(double quantia) {
        System.out.println("Pagamento de R$" + quantia + " processado via PayPal.");
    }
}
/*
É a nossa classe existente (geralmente de um terceiro) que tem a interface "incompatível".
Ela é a classe que você não pode ou não quer modificar.
No nosso exemplo, seria a classe ServicoPagamentoPayPal com seu método pagarComPayPal(double quantia).
 */