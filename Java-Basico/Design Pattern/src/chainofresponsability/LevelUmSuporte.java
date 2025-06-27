package chainofresponsability;

public class LevelUmSuporte implements SuporteHandler{

    private SuporteHandler next;

    @Override
    public void setNext(SuporteHandler next) {

    }

    @Override
    public void handleRequest(Ticket ticket) {

        if (ticket.getSeveridade() == 1) {
            System.out.println("somente quem é Level 1 pode resolver o problema: " + ticket.getProblema());
        } else if (next != null) { // caso a condição anterior não seja atendida, é repassado a requisição para o proximo manipulador.
            next.handleRequest(ticket);
        }
    }
}
