package lvl_intermediary.training.event_ticket;

/**
 * Challenge:
 * Build a simple event ticket system using inheritance and final keyword.
 */

public class Main {
    public static void main(String[] args) {

        // Creating a basic ticket
        EventTicket Ticket1 = new TicketBasic("Show do Alok");
        Ticket1.displayDataTicket();

        System.out.println(" ");

        // Creating a VIP ticket
        EventTicket Ticket2 = new TicketVIP("Show do Alok");
        Ticket2.displayDataTicket();
    }
}
