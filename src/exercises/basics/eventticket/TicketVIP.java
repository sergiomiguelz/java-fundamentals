package exercises.basics.eventticket;

final public class TicketVIP extends EventTicket{

    // Constructor for VIP ticket
    public TicketVIP(String nameEvent) {
        super(nameEvent, "VIP", 240, 89701223);
    }
}
