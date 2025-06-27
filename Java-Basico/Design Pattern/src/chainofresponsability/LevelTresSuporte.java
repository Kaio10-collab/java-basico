package chainofresponsability;

public class LevelTresSuporte implements SuporteHandler{

    private SuporteHandler next;

    @Override
    public void setNext(SuporteHandler next) {

    }

    @Override
    public void handleRequest(Ticket ticket) {

        if (ticket.getSeveridade() >= 3) {
            System.out.println("Somente quem é Level 3 pode resolver o problema: " + ticket.getProblema());
        } else if (next != null) { // caso a condição anterior não seja atendida, é repassado a requisição para o proximo manipulador.
            next.handleRequest(ticket);
        }
    }
}
