package chainofresponsability;

// Aqui a classe de interface onde teremos os métodos
public interface SuporteHandler {

    void setNext(SuporteHandler next); // contrato para encadear o proximo manipulador
    void handleRequest(Ticket ticket); // para processar a requisição, no caso um objeto da classe Ticket

}
