package lvl_intermediary.training.event_ticket;

public abstract class EventTicket {

    // imutable ticket details
    final String nameEvent;
    final String classTicket;
    final double price;
    final int code;

    // Constructor to initialize immutable ticket data
    public EventTicket(String nameEvent, String classTicket, double price, int code) {
        this.nameEvent = nameEvent;
        this.classTicket = classTicket;
        this.price = price;
        this.code = code;
    }

    // Final method: cannot be overridden
    final public void displayDataTicket(){
        System.out.println("Ingresso para o Evento: " + nameEvent );
        System.out.println("Classe do Ticket: " + classTicket + " | Preço: R$" + price + " | Code: " + code );
    }
}
